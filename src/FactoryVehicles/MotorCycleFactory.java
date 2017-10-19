package FactoryVehicles;

public class MotorCycleFactory extends VehicleFactory{        
    @Override
    public double getRoadTax(){
        roadTax = motorcycleTax;
        return roadTax;
    }
    
    @Override
    public int getStartYear(int start){
        startYear = start;
        return startYear;
    }
    
    @Override
    public int getEndYear(int finish){
        endYear = finish;
        return endYear;
    }
}
