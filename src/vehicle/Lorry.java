package vehicle;

public class Lorry extends Vehicle {
    private final int ART = 7000;
    
    public Lorry(){
        super();
    }
    
    public double roadTax(double amount){        
        roadTax += (int)Math.round(amount/ART) * taxYears;
        return roadTax;
    }
}