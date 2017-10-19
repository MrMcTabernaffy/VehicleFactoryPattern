package vehicle;

public class Lorry extends Vehicle {
    private final int ART = 7000;
    
    public Lorry(){        
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