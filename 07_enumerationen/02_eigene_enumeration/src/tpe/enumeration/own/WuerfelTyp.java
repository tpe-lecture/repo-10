package tpe.enumeration.own;

public enum WuerfelTyp {
    
   D4(4), D6(6), D8(8), D10(10), D12(12);
    
    
    private final int zahl;
    
    private WuerfelTyp(int zahl){
        this.zahl=zahl;
    }
    
    
}
