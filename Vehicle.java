
public  abstract class Vehicle{
    private int noOfTires;
    public Vehicle(int noOfTires){
        this.noOfTires=noOfTires;
    }
    public int getNoOfTires(){
        return noOfTires;
    }
    public void setNoOfTires(int noOfTires){
        this.noOfTires=noOfTires;
    }

    public abstract void makeStartSound();
    public void commute(){
        System.out.println("going");
    }
} 
