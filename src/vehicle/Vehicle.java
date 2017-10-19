package vehicle;

public abstract class Vehicle {
    protected int startYear;
    protected int endYear;
    protected double roadTax;     
    
    public Vehicle(){
        this.startYear = 0;
        this.endYear = 0;
        this.roadTax = 0.0;        
    }
    
    public int getTaxStart(){ 
        return startYear;
    }
        
    public int getTaxEnd(){
        return endYear;
    }
    
    public double getRoadTax(){
        roadTax = roadTax*(endYear - startYear);
        return roadTax;
    }
}
