package FactoryVehicles;

public abstract class VehicleFactory implements Interface {
    protected int startYear;
    protected int endYear;
    protected double roadTax;     
    
    public VehicleFactory(){
        this.startYear = 0;
        this.endYear = 0;
        this.roadTax = 0.0;        
    }    
    
    @Override
    public abstract int getStartYear(int start);
    
    @Override
    public abstract int getEndYear(int finish);
    
    @Override
    public double getRoadTax(){
        roadTax = (int)Math.round((endYear - startYear) * roadTax);
        return roadTax;
    }
}
