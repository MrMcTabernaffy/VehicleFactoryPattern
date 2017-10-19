package vehicle;

public class Car extends Vehicle{
    private final int ART = 500;
    
    public Car(){
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
