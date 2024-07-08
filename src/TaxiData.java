public class TaxiData {
    private int dropTime;
    private char currentLocation;
    private int totalEarnings;
    public TaxiData(int dropTime,char currentLocation,int totalEarnings){
        this.dropTime=dropTime;
        this.currentLocation=currentLocation;
        this.totalEarnings=totalEarnings;
    }
    public int getTotalEarnings(){
        return  totalEarnings;
    }

    public int getDropTime() {
        return dropTime;
    }

    public char getCurrentLocation() {
        return currentLocation;
    }
    public void updateTaxiData(int availableTime, char currentLocation, int totalEarnings) {
        this.dropTime = availableTime;
        this.currentLocation = currentLocation;
        this.totalEarnings = totalEarnings;
    }
}
