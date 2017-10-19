package vehicle;

public class Motorocycle extends Vehicle {
    private final int ART = 200;
    
    public Motorocycle(){
        super();
        roadTax = ART;
    }
    
    public int taxStart(int start){
        startYear = start;
        return startYear;
    }
        
    public int taxEnd(int finish){ 
        endYear = finish;
        return endYear;
    }
    
    public double roadTax(){  
        return roadTax;
    }
    
}
