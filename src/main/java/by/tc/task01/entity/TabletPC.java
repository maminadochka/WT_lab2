package by.tc.task01.entity;

public class TabletPC extends Appliance{
    private int BATTERY_CAPACITY;
    private int DISPLAY_INCHES;
    private int MEMORY_ROM;
    private int FLASH_MEMORY_CAPACITY;
    private String COLOR;
    private int CAPACITY;
    public TabletPC(int BATTERY_CAPACITY,int DISPLAY_INCHES,int MEMORY_ROM,int FLASH_MEMORY_CAPACITY,String COLOR, int CAPACITY	) {
        this.CAPACITY = CAPACITY;
        this.BATTERY_CAPACITY = BATTERY_CAPACITY;
        this.DISPLAY_INCHES = DISPLAY_INCHES;
        this.MEMORY_ROM = MEMORY_ROM;
        this.FLASH_MEMORY_CAPACITY = FLASH_MEMORY_CAPACITY;
        this.COLOR = COLOR;
    }

    public TabletPC(){}
    public int getBATTERY_CAPACITY() {return BATTERY_CAPACITY;}

    public void setBATTERY_CAPACITY(int BATTERY_CAPACITY) {
        this.BATTERY_CAPACITY = BATTERY_CAPACITY;
    }
    public int getDISPLAY_INCHES() {return DISPLAY_INCHES;}

    public void setDISPLAY_INCHES(int DISPLAY_INCHES) {
        this.DISPLAY_INCHES = DISPLAY_INCHES;
    }
    public int getCAPACITY() {return CAPACITY;}

    public void setCAPACITY(int CAPACITY) {
        this.CAPACITY = CAPACITY;
    }
    public int getMEMORY_ROM() {return MEMORY_ROM;}

    public void setMEMORY_ROM(int MEMORY_ROM) {this.MEMORY_ROM = MEMORY_ROM;}
    public int getFLASH_MEMORY_CAPACITY() {return FLASH_MEMORY_CAPACITY;}

    public void setFLASH_MEMORY_CAPACITY(int FLASH_MEMORY_CAPACITY) {this.FLASH_MEMORY_CAPACITY = FLASH_MEMORY_CAPACITY;}
    public String getCOLOR() {return COLOR;}

    public void setCOLOR(String COLOR) {this.COLOR = COLOR;}


    @Override
    public String toString(){
        String result = "Type: "+this.getClass().getSimpleName()+"\n";
        result+="BATTERY_CAPACITY: "+this.BATTERY_CAPACITY+"\n";
        result+="DISPLAY_INCHES: "+this.DISPLAY_INCHES+"\n";
        result+="CAPACITY: "+this.CAPACITY+"\n";
        result+="MEMORY_ROM: "+this.MEMORY_ROM+"\n";
        result+="FLASH_MEMORY_CAPACITY: "+this.FLASH_MEMORY_CAPACITY+"\n";
        result+="COLOR: "+this.COLOR+"\n";

        return result;
    }

}
