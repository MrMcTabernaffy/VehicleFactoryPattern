package vehicle;

public class Motorocycle extends Vehicle {
    private final int ART = 200;
    
    public Motorocycle(){
        super();
    }
    
    public double roadTax(double amount){
        roadTax += (int)Math.round(amount/ART);
        return roadTax;
    }
    
}
