package vehicle;

public abstract class Vehicle {
    protected int startYear;
    protected int endYear;
    protected int taxYears = endYear - startYear;
    protected double roadTax;     
    
    public Vehicle(){
        this.startYear = 0;
        this.endYear = 0;
        this.roadTax = 0.0;        
    }
    
    public double getRoadTax(){
        return roadTax;
    }
}
