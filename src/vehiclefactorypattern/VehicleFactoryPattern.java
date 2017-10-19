package vehiclefactorypattern;

import vehicle.*;

public class VehicleFactoryPattern {

    public static void main(String[] args) {
        VehicleTest();
    }
    
    public static void VehicleTest(){
        System.out.println("Test: Lorry");
        Lorry lorryTest1 = new Lorry();
        lorryTest1.startYear(2001);
        lorryTest1.endYear(2009);
        System.out.println(lorryTest1.getRoadTax());
        
        System.out.println("Test: Car");
        Car carTest1 = new Car();
        carTest1.startYear(2001);
        carTest1.endYear(2009);
        System.out.println(carTest1.getRoadTax());
        
        System.out.println("Test: MotorCycle");
        Motorocycle motorCycTest1 = new Motorocycle();
        motorCycTest1.startYear(2001);
        motorCycTest1.endYear(2009);
        System.out.println(motorCycTest1.getRoadTax());
    }
    
}
