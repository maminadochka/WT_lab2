package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.beans.ExceptionListener;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO{
	@Override
	public List<Appliance> find(Criteria criteria)throws IOException {
		List<Appliance> list = new ArrayList<Appliance>();
		list = deserializeFromXML("data.xml");
		list = findGroupSearchName(list,criteria);

		return list;
	}

	@Override
	public List<Appliance> find() throws IOException {
		List<Appliance> list = new ArrayList<Appliance>();
		list = deserializeFromXML("data.xml");
		return list;
	}

	private List<Appliance> findGroupSearchName(List<Appliance> appliances,Criteria criteria){
		Iterator<Appliance> it = appliances.iterator();
		List<Appliance> actualList = new ArrayList<Appliance>();
		while (it.hasNext()) {
			Appliance currApp = it.next();
			String str = currApp.getClass().getSimpleName();
			if (str.equals(criteria.getGroupSearchName())) {
				actualList.add(currApp);
			}

		}
		return actualList;
	}

	private List<Appliance> deserializeFromXML(String filePath) throws IOException
	{
		FileInputStream fos = new FileInputStream(filePath);
		XMLDecoder decoder = new XMLDecoder(fos);

		List<Appliance> list = (List<Appliance>)decoder.readObject();
		decoder.close();
		return list;
	}

}
