public class CustomerData {
    private int taxiID;
    private int customerID;
    private int earnings;
    private char pickupPoint;
    private char dropPoint;
    private int pickupTime;
    private int dropTime;
    public CustomerData(int taxId,int customerID,int earnings,char pickupPoint,char dropPoint,int pickupTime,int dropTime){
        this.taxiID=taxId;
        this.customerID=customerID;
        this.earnings=earnings;
        this.pickupPoint=pickupPoint;
        this.dropPoint=dropPoint;
        this.pickupTime=pickupTime;
        this.dropTime=dropTime;
    }
    public int getTaxiID() {
        return taxiID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public int getEarnings() {
        return earnings;
    }

    public char getPickupPoint() {
        return pickupPoint;
    }

    public char getDropPoint() {
        return dropPoint;
    }

    public int getPickupTime() {
        return pickupTime;
    }

    public int getDropTime() {
        return dropTime;
    }
}
