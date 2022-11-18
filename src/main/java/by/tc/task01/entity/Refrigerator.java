package by.tc.task01.entity;

public class Refrigerator extends Appliance {
    private int POWER_CONSUMPTION;
    private int WEIGHT;
    private int FREEZER_CAPACITY;
    private int OVERALL_CAPACITY;
    private double HEIGHT;
    private double WIDTH;
    private int CAPACITY;

    public Refrigerator(int POWER_CONSUMPTION, int WEIGHT, int CAPACITY, int FREEZER_CAPACITY,int OVERALL_CAPACITY, double HEIGHT, double WIDTH) {
        this.CAPACITY = CAPACITY;
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
        this.WEIGHT = WEIGHT;
        this.FREEZER_CAPACITY = FREEZER_CAPACITY;
        this.HEIGHT = HEIGHT;
        this.WIDTH = WIDTH;
        this.OVERALL_CAPACITY = OVERALL_CAPACITY;
    }

    public Refrigerator() {
    }

    public int getPOWER_CONSUMPTION() {
        return POWER_CONSUMPTION;
    }

    public void setPOWER_CONSUMPTION(int POWER_CONSUMPTION) {
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
    }

    public int getWEIGHT() {
        return WEIGHT;
    }

    public void setWEIGHT(int WEIGHT) {
        this.WEIGHT = WEIGHT;
    }

    public int getCAPACITY() {
        return CAPACITY;
    }

    public void setCAPACITY(int CAPACITY) {
        this.CAPACITY = CAPACITY;
    }

    public int getFREEZER_CAPACITY() {
        return FREEZER_CAPACITY;
    }

    public void setFREEZER_CAPACITY(int FREEZER_CAPACITY) {
        this.FREEZER_CAPACITY = FREEZER_CAPACITY;
    }
    public int getOVERALL_CAPACITY() {
        return OVERALL_CAPACITY;
    }

    public void setOVERALL_CAPACITY(int OVERALL_CAPACITY) {
        this.OVERALL_CAPACITY = OVERALL_CAPACITY;
    }

    public double getHEIGHT() {
        return HEIGHT;
    }

    public void setHEIGHT(double HEIGHT) {
        this.HEIGHT = HEIGHT;
    }

    public double getWIDTH() {
        return WIDTH;
    }

    public void setWIDTH(double WIDTH) {
        this.WIDTH = WIDTH;
    }

    @Override
    public String toString() {
        String result = "Type: " + this.getClass().getSimpleName() + "\n";
        result += "POWER_CONSUMPTION: " + this.POWER_CONSUMPTION + "\n";
        result += "WEIGHT: " + this.WEIGHT + "\n";
        result += "CAPACITY: " + this.CAPACITY + "\n";
        result += "FREEZER_CAPACITY: " + this.FREEZER_CAPACITY + "\n";
        result += "HEIGHT: " + this.WIDTH + "\n";
        result += "WIDTH: " + this.WIDTH + "\n";

        return result;
    }
}
