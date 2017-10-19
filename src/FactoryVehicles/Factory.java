package FactoryVehicles;

public class Factory {
    public static Interface createVehicle(String vehType){
        if (vehType.equalsIgnoreCase("Motorcycle")){
            return new MotorCycleFactory();
        }else if(vehType.equalsIgnoreCase("Car")){
            return new CarFactory();
        }else if(vehType.equalsIgnoreCase("Lorry")){
            return new LorryFactory();
        }
        throw new IllegalArgumentException("Cannot create '"+vehType+"' vehicle!");
    }
}
