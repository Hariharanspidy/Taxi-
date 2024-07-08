import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner sc=new Scanner(System.in);
        TaxiBooking tb=new TaxiBooking();
        tb.taxiBooking('A','C',9);
        tb.taxiBooking('A','B',9);
        tb.taxiBooking('A','D',9);
        tb.taxiBooking('A','E',9);
        tb.printBooking();
//        System.out.println("TAXI BOOKING");
//        System.out.println("************");
//        System.out.println(TaxiBooking.booking('A', 'B',9));
//        System.out.println(TaxiBooking.booking('A', 'B',9));
//        System.out.println(TaxiBooking.booking('A', 'B',9));
//        System.out.println(TaxiBooking.booking('A', 'B',9));
//        System.out.println(TaxiBooking.booking('C', 'D',9));
//        TaxiBooking.display();
//        boolean flag=false;
//        while (true){
//            System.out.println("Select following options\n1->Taxi booking\n2->Taxi Details\n3->Exit");
//            int options=sc.nextInt();
//            switch (options){
//                case 1:
//                    System.out.println("Enter Pickup Point:");
//                    String pickupPoint=sc.next();
//                    System.out.println("Enter Drop Point:");
//                    String dropPoint=sc.next();
//                    System.out.println("Enter Pickup Time:");
//                    String pickupTime=sc.next();
//                    tD.booking(pickupPoint, dropPoint, pickupTime);
//                    System.out.println("Taxi Booking");
//                    break;
//                case 2:
//                    System.out.println("Taxi details");
//                    break;
//                case 3:
//                    flag=true;
//                    break;
//                default:
//                    System.out.println("Give Valid Input");
//            }
//            if(flag) break;
//        }
    }
}