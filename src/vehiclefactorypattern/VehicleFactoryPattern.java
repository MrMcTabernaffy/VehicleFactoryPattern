package vehiclefactorypattern;

import vehicle.*;
import FactoryVehicles.*;

public class VehicleFactoryPattern {

    public static void main(String[] args) {
        VehicleTest();
        FactoryTest();
    }
    
    public static void VehicleTest(){
        System.out.println("\nTest: Lorry");
        Lorry lorryTest1 = new Lorry();
        lorryTest1.taxStart(2001);
        lorryTest1.taxEnd(2009);
        System.out.println("Starting Tax Year: "+lorryTest1.getTaxStart());
        System.out.println("Ending Tax Year: "+lorryTest1.getTaxEnd());
        System.out.println("Total Tax: £"+lorryTest1.getRoadTax());
                
        System.out.println("\nTest: Car");
        Car carTest1 = new Car();
        carTest1.taxStart(2001);
        carTest1.taxEnd(2009);
        System.out.println("Starting Tax Year: "+carTest1.getTaxStart());
        System.out.println("Ending Tax Year: "+carTest1.getTaxEnd());
        System.out.println("Total Tax: £"+carTest1.getRoadTax());
        
        System.out.println("\nTest: MotorCycle");
        Motorocycle motorCycTest1 = new Motorocycle();
        motorCycTest1.taxStart(2001);
        motorCycTest1.taxEnd(2009);
        System.out.println("Starting Tax Year: "+motorCycTest1.getTaxStart());
        System.out.println("Ending Tax Year: "+motorCycTest1.getTaxEnd());
        System.out.println("Total Tax: £"+motorCycTest1.getRoadTax());        
    }
    
    public static void FactoryTest(){   
        try{
            System.out.println("\nTest: CreateFactoryMotorcycle");
            Interface motor = Factory.createVehicle("motorcycle");
            System.out.println("Starting Tax Year: "+motor.getStartYear(2001));
            System.out.println("Ending Tax Year: "+motor.getEndYear(2017));
            System.out.println("Total Tax: £"+motor.getRoadTax());            
         
            System.out.println("\nTest: CreateFactoryCar");
            Interface car = Factory.createVehicle("car");
            System.out.println("Starting Tax Year: "+car.getStartYear(2001));
            System.out.println("Ending Tax Year: "+car.getEndYear(2017));
            System.out.println("Total Tax: £"+car.getRoadTax());

            System.out.println("\nTest: CreateFactoryLorry");
            Interface lorry = Factory.createVehicle("lorry"); 
            System.out.println("Starting Tax Year: "+lorry.getStartYear(2001));
            System.out.println("Ending Tax Year: "+lorry.getEndYear(2017));
            System.out.println("Total Tax: £"+lorry.getRoadTax());
            
        }catch(IllegalArgumentException e){
            System.err.println("IllegalArgumentException: "+e.getMessage());
        }
    }
    
}
