package by.tc.task01.entity;

public class Oven extends Appliance{
    private int POWER_CONSUMPTION;
    private int WEIGHT;
    private int DEPTH;
    private double HEIGHT;
    private double WIDTH;
    private int CAPACITY;
    public Oven(int POWER_CONSUMPTION, int WEIGHT, int CAPACITY, int DEPTH, double HEIGHT, double WIDTH) {
        this.CAPACITY = CAPACITY;
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
        this.WEIGHT = WEIGHT;
        this.DEPTH = DEPTH;
        this.HEIGHT = HEIGHT;
        this.WIDTH = WIDTH;
    }

    public Oven(){}
    public int getPOWER_CONSUMPTION() {return POWER_CONSUMPTION;}

    public void setPOWER_CONSUMPTION(int POWER_CONSUMPTION) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
    }
    public int getWEIGHT() {return WEIGHT;}

    public void setWEIGHT(int WEIGHT) {
        this.WEIGHT = WEIGHT;
    }
    public int getCAPACITY() {return CAPACITY;}

    public void setCAPACITY(int CAPACITY) {
        this.CAPACITY = CAPACITY;
    }
    public int getDEPTH() {return DEPTH;}

    public void setDEPTH(int DEPTH) {
        this.DEPTH = DEPTH;
    }
    public double getHEIGHT() {return HEIGHT;}

    public void setHEIGHT(double HEIGHT) {
        this.HEIGHT = HEIGHT;
    }
    public double getWIDTH() {return WIDTH;}

    public void setWIDTH(double WIDTH) {
        this.WIDTH = WIDTH;
    }

    @Override
    public String toString(){
        String result = "Type: "+this.getClass().getSimpleName()+"\n";
        result+="POWER_CONSUMPTION: "+this.POWER_CONSUMPTION+"\n";
        result+="WEIGHT: "+this.WEIGHT+"\n";
        result+="CAPACITY: "+this.CAPACITY+"\n";
        result+="DEPTH: "+this.DEPTH+"\n";
        result+="HEIGHT: "+this.WIDTH+"\n";
        result+="WIDTH: "+this.WIDTH+"\n";

        return result;
    }

}
