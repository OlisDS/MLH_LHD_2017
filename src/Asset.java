import java.lang.Math;

public class Asset {
    private int quantity;
    private final int initialPrice;
    private int price;
    private final int period;
    private final int value;

    Asset(int initialPrice, int value, int period){
        this.quantity = 0;
        this.initialPrice = 10;
        this.value = value;
        this.price = initialPrice;
        this.period = period;
    }

    public void buy(){
        this.quantity += 1;
    }

    public void buy(int q){
        this.quantity += q;
    }

    public void adjustPrice(){
        this.price = (int)Math.floor(this.initialPrice * Math.pow(1.15, this.quantity));
    }

    public int getQuantity(){
        return this.quantity;
    }

    public int getPrice(){
        return this.price;
    }

    public int getValue(){
        return this.value;
    }
    
    public int getPeriod() { 
        return this.period; 
    }


}

