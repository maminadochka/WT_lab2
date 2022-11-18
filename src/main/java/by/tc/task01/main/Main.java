package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Appliance appliance;
		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"
		var list = service.find(criteriaOven);
		PrintApplianceInfo.printList(list);

		//////////////////////////////////////////////////////////////////

		var min = service.findTheCheapest();
		PrintApplianceInfo.print(min);

	}

}
