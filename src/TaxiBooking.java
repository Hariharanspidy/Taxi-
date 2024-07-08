import java.util.ArrayList;
import java.util.HashMap;

public class TaxiBooking {
      int n=4;
      int customerId=0;
      HashMap<Integer,TaxiData> taxis=new HashMap<>();
      ArrayList<CustomerData> customerData=new ArrayList<>();
      public TaxiBooking(){
          for(int i=0;i<n;i++){
              taxis.put(i+1,new TaxiData(6,'A',0));
          }
      }
      public void taxiBooking(char pickupPoint, char dropPoint, int pickupTime) {
        int id = 0;
        int minEarnings = Integer.MAX_VALUE;
        boolean available = false;

        for (int i = 1; i <= n; i++) {
            TaxiData taxiData = taxis.get(i);
            int distanceToPickup = Math.abs(taxiData.getCurrentLocation() - pickupPoint);
            int timeToPickup = taxiData.getDropTime() + distanceToPickup;

            if (timeToPickup <= pickupTime) {
                if (taxiData.getTotalEarnings() < minEarnings) {
                    id = i;
                    minEarnings = taxiData.getTotalEarnings();
                    available = true;
                }
            }
        }

        if (available) {
            TaxiData selectedTaxi = taxis.get(id);
            int tripDistance = Math.abs(pickupPoint - dropPoint);
            int tripAmount = ((tripDistance * 15) - 5) * 10 + 100;
            int dropTime = pickupTime + tripDistance;

            selectedTaxi.updateTaxiData(dropTime, dropPoint, selectedTaxi.getTotalEarnings() + tripAmount);
            taxis.put(id, selectedTaxi);

            customerData.add(new CustomerData(id, ++customerId, tripAmount, pickupPoint, dropPoint, pickupTime, dropTime));
            System.out.println("Taxi Booked Successfully\nTaxi ID: " + id);
        } else {
            System.out.println("No Taxi available");
        }
    }
      public void printBooking(){
          for (int i=1;i<=n;i++){
              System.out.println("Taxi ID:"+i+"                                            Earnings Rs."+taxis.get(i).getTotalEarnings());
              System.out.println("Customer ID  Pickup Point  Drop Point Pickup Time  Drop Time  Earnings");
              for (CustomerData j:customerData){
                  if(j.getTaxiID()==i)
                        System.out.println( "     "+ j.getCustomerID()+"                "+ j.getPickupPoint()+"           "+j.getDropPoint()+"           " +
                          j.getPickupTime()+"           "+j.getDropTime()+"           "+j.getEarnings());
              }
              System.out.println();
          }
      }
}
