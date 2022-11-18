package by.tc.task01.entity;

public class Laptop extends Appliance{
    private double BATTERY_CAPACITY;
    private String OS;
    private int MEMORY_ROM;
    private int SYSTEM_MEMORY;
    private double CPU;
    private int DISPLAY_INCHS;
    private int CAPACITY;
    public Laptop(double BATTERY_CAPACITY,String OS,int MEMORY_ROM,int SYSTEM_MEMORY,double CPU,int DISPLAY_INCHS, int CAPACITY) {
        this.CAPACITY = CAPACITY;
        this.BATTERY_CAPACITY = BATTERY_CAPACITY;
        this.OS = OS;
        this.MEMORY_ROM = MEMORY_ROM;
        this.SYSTEM_MEMORY = SYSTEM_MEMORY;
        this.CPU = CPU;
        this.DISPLAY_INCHS = DISPLAY_INCHS;
    }

    public Laptop(){}
    public double getBATTERY_CAPACITY() {return BATTERY_CAPACITY;}

    public void setBATTERY_CAPACITY(double BATTERY_CAPACITY) {
        this.BATTERY_CAPACITY = BATTERY_CAPACITY;
    }
    public String getOS() {return OS;}

    public void setOS(String OS) {
        this.OS = OS;
    }
    public int getCAPACITY() {return CAPACITY;}

    public void setCAPACITY(int CAPACITY) {
        this.CAPACITY = CAPACITY;
    }
    public int getMEMORY_ROM() {return MEMORY_ROM;}

    public void setMEMORY_ROM(int MEMORY_ROM) {
        this.MEMORY_ROM = MEMORY_ROM;
    }
    public int getSYSTEM_MEMORY() {return SYSTEM_MEMORY;}

    public void setSYSTEM_MEMORY(int SYSTEM_MEMORY) {
        this.SYSTEM_MEMORY = SYSTEM_MEMORY;
    }
    public double getCPU() {return CPU;}

    public void setCPU(double CPU) {
        this.CPU = CPU;
    }
    public int getDISPLAY_INCHS() {return DISPLAY_INCHS;}

    public void setDISPLAY_INCHS(int DISPLAY_INCHS) {
        this.DISPLAY_INCHS = DISPLAY_INCHS;
    }

    @Override
    public String toString(){
        String result = "Type: "+this.getClass().getSimpleName()+"\n";
        result+="BATTERY_CAPACITY: "+this.BATTERY_CAPACITY+"\n";
        result+="OS: "+this.OS+"\n";
        result+="CAPACITY: "+this.CAPACITY+"\n";
        result+="MEMORY_ROM: "+this.MEMORY_ROM+"\n";
        result+="SYSTEM_MEMORY: "+this.SYSTEM_MEMORY+"\n";
        result+="CPU: "+this.CPU+"\n";
        result+="DISPLAY_INCHS: "+this.DISPLAY_INCHS+"\n";

        return result;
    }
}
