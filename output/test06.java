abstract class Delivery{
    private String orderid;
    private int weightkg;
    Delivery(String orderid, int weightkg) {
        this.orderid = orderid;
        this.weightkg = weightkg;
    }
    public String getorderid(){
        return orderid;
    }
    public int getweightkg(){
        return weightkg;
    }
    public abstract int calculateFee();
    public void printBill(){
        System.out.println(orderid+"运费"+calculateFee()+"元");
    }
}
class StandardDelivery extends Delivery{
    StandardDelivery(String orderid,int weightkg){
        super(orderid,weightkg);
    }
    @Override 
    public int calculateFee(){
        return 8+2*getweightkg();
    }
}
class ExpressDelivery extends Delivery{
    ExpressDelivery(String orderid,int weightkg){
        super(orderid,weightkg);
    }
    @Override 
    public int calculateFee(){
        return 12+4*getweightkg();
    }
}
public class test06 {   
    public static void main(String[] args) {
        Delivery[] orders = {
            new StandardDelivery("A01", 3),
            new ExpressDelivery("A02", 3),
            new StandardDelivery("A03", 1),
            new ExpressDelivery("A04", 1)
        };

        for (Delivery order : orders) {
            order.printBill();
        }
    }
}