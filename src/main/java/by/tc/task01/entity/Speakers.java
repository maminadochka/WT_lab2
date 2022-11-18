package by.tc.task01.entity;

public class Speakers extends Appliance{
    private int POWER_CONSUMPTION;
    private int NUMBER_OF_SPEAKERS;
    private String FREQUENCY_RANGE;

    private int CORD_LENGTH;

    private int CAPACITY;


    public Speakers(int POWER_CONSUMPTION,int NUMBER_OF_SPEAKERS,String FREQUENCY_RANGE,int CORD_LENGTH,int CAPACITY) {
        this.CAPACITY = CAPACITY;
        this.POWER_CONSUMPTION = POWER_CONSUMPTION;
        this.NUMBER_OF_SPEAKERS = NUMBER_OF_SPEAKERS;
        this.FREQUENCY_RANGE = FREQUENCY_RANGE;
        this.CORD_LENGTH = CORD_LENGTH;
    }

    public Speakers(){}
    public int getPOWER_CONSUMPTION() {return POWER_CONSUMPTION;}
    public void setPOWER_CONSUMPTION(int POWER_CONSUMPTION) {this.POWER_CONSUMPTION = POWER_CONSUMPTION;}
    public int getNUMBER_OF_SPEAKERS() {return NUMBER_OF_SPEAKERS;}
    public void setNUMBER_OF_SPEAKERS(int NUMBER_OF_SPEAKERS) {this.NUMBER_OF_SPEAKERS = NUMBER_OF_SPEAKERS;}
    public int getCORD_LENGTH() {return CORD_LENGTH;}
    public void setCORD_LENGTH(int CORD_LENGTH) {this.CORD_LENGTH = CORD_LENGTH;}
    public int getCAPACITY() {return CAPACITY;}
    public void setCAPACITY(int CAPACITY) {
        this.CAPACITY = CAPACITY;
    }
    public String getFREQUENCY_RANGE() {return FREQUENCY_RANGE;}
    public void setFREQUENCY_RANGE(String FREQUENCY_RANGE) {this.FREQUENCY_RANGE = FREQUENCY_RANGE;}


    @Override
    public String toString(){
        String result = "Type: "+this.getClass().getSimpleName()+"\n";
        result+="POWER_CONSUMPTION: "+this.POWER_CONSUMPTION+"\n";
        result+="NUMBER_OF_SPEAKERS: "+this.NUMBER_OF_SPEAKERS+"\n";
        result+="CORD_LENGTH: "+this.CORD_LENGTH+"\n";
        result+="CAPACITY: "+this.CAPACITY+"\n";
        result+="FREQUENCY_RANGE: "+this.FREQUENCY_RANGE+"\n";
        return result;
    }
}
