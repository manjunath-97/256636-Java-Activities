import java.util.*;

class Vehicle{
    private String make,vehicleNumber,fuelType;
    private int fuelCapacity,cc;
    public Vehicle(String make,String vehicleNumber,String fuelType,int fuelCapacity,int cc){
        this.make = make;
        this.vehicleNumber= vehicleNumber;
        this.fuelType = fuelType;
        this.fuelCapacity = fuelCapacity;
        this.cc = cc;
    }
    public void displayMake(){
        System.out.println("\n-----"+make+"-----\n");
    }
    public void displayBasicInfo(){
        System.out.println("Basic Info\nMake  :"+make+"\nVehiclenumber :"+vehicleNumber+"\nFuelType :"+fuelType+"\nFuelCapacity :"+fuelCapacity+"\ncc :"+cc);
    }
    public void displayDetailInfo(){
        System.out.println("\n---------------------\n");
    }
}

class TwoWheeler extends Vehicle{
    private Boolean kickStartAvailable;
    public TwoWheeler(String make,String vehicleNumber,String fuelType,int fuelCapacity,int cc,Boolean kick){
        super(make, vehicleNumber, fuelType, fuelCapacity, cc);
        kickStartAvailable =kick;
    }
    public void displayDetailInfo(){
        System.out.println("\nDetailed Info:\nKickStartAvailability: ");
        if(kickStartAvailable == true){
            System.out.print("YES");
        }
        else{
            System.out.print("NO");
        }
        super.displayDetailInfo();
    }
}

class FourWheeler extends Vehicle{
    private String audioSystem;
    private int numberOfDoors;
    public FourWheeler(String make,String vehicleNumber,String fuelType,int fuelCapacity,int cc,String audioSystem,int numberOfDoors){
        super(make, vehicleNumber, fuelType, fuelCapacity, cc);
        this.audioSystem = audioSystem;
        this.numberOfDoors = numberOfDoors;
    }
    public void displayDetailInfo(){
        System.out.println("\nDetailed Info:\nAudio system: "+audioSystem+"\nnumberOfDoors :"+ numberOfDoors);
        super.displayDetailInfo();
    }
}

public class VehicleMain {
    public static void main(String args[]) {
       String make, vehicleNumber, fuelType;
       int fuelCapacity, cc;
       String kickStarterAvailable;
       String audioSystem;
       int numberOfDoors;

       int fourOrTwoWheeler;
       int Petrol1Diesel2;
       Scanner sc = new Scanner(System.in);
       for(;;)
       {
           System.out.println("\n1.Four Wheeler\n2.Two Wheeler\n3.exit\nEnter your choice:");
           fourOrTwoWheeler = sc.nextInt();sc.nextLine();
           if(fourOrTwoWheeler!=1 && fourOrTwoWheeler !=2)
                break;
           System.out.println("\nEnter detailes\n");
           System.out.println("Vehicle make :");
           make = sc.nextLine();
           System.out.println("Vehicle number :");
           vehicleNumber = sc.nextLine();
           System.out.println("FuelType :\n1.Petrol\n2.Diesel");
           Petrol1Diesel2 = sc.nextInt();
           System.out.println("\nFuel capacity :");
           fuelCapacity = sc.nextInt();
           System.out.println("\ncc :");
           cc = sc.nextInt();sc.nextLine();

           if(fourOrTwoWheeler==1){
            System.out.println("\nAudio System :");
            audioSystem = sc.nextLine();
            System.out.println("Number of doors :");
            numberOfDoors = sc.nextInt();
            if(Petrol1Diesel2 == 1)
            {
                fuelType = "Petrol";
            }
            else{
                fuelType = "Diesel";
            }
            FourWheeler f = new FourWheeler(make, vehicleNumber, fuelType, fuelCapacity, cc, audioSystem, numberOfDoors);
            f.displayMake();
            f.displayBasicInfo();
            f.displayDetailInfo();
           }
           else{
            System.out.println("Kick start available(yse or no) :");
            kickStarterAvailable = sc.nextLine();
            if(Petrol1Diesel2 == 1)
            {
                fuelType = "Petrol";
            }
            else{
                fuelType = "Diesel";
            }
            Boolean kick ;
            if(kickStarterAvailable.equalsIgnoreCase(new String("yes")))
            {
                kick = true;
                System.out.println(kick);
            }
            else
                kick = false;

            TwoWheeler t = new TwoWheeler(make, vehicleNumber, fuelType, fuelCapacity, cc, kick);
            t.displayMake();
            t.displayBasicInfo();
            t.displayDetailInfo();
           }
          
       }

       sc.close();
    }    
} 