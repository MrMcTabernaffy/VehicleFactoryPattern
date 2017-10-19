package vehicle;

public class Car extends Vehicle{
    private final int ART = 500;
    
    public Car(){
        super();
    }
    
    public double roadTax(double amount){
        roadTax += (int)Math.round(amount/ART);
        return roadTax;
    } 
}
