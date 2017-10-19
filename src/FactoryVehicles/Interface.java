package FactoryVehicles;

public interface Interface {
    int motorcycleTax = 200;
    int carTax = 500;
    int lorryTax = 7000;
    
    abstract int getStartYear(int start);
    abstract int getEndYear(int finish);
    
    double getRoadTax();
}
