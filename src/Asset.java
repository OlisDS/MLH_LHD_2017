import java.lang.Math;

public class Asset {
    private int quantity;
    private final int initialPrice;
    private int price;
    private final int period;

    Asset(int initialPrice, int period){
        this.quantity = 0;
        this.initialPrice = 10;
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

}
