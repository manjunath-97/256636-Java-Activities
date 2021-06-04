import java.util.*;

/*Hotel room - Base class */
class HotelRoom{
  protected String hotelname;
  protected int numberofsquarefeet;
  protected boolean hasTV;
  protected boolean hasWifi;
  public HotelRoom(String hotelname,int numberofsquarefeet,boolean hasTV,boolean hasWifi) {
    this.hotelname=hotelname;
    this.numberofsquarefeet=numberofsquarefeet;
    this.hasTV=hasTV;
    this.hasWifi=hasWifi;
  }
  public int calculatetarrif() {
    return numberofsquarefeet*getRatepersqfeet();
  }
  public int getRatepersqfeet()
  {
    return 0;
  }
  
}

/*DeluxRoom class */
class DeluxRoom extends HotelRoom{
  protected int ratepersqfeet;
  public DeluxRoom(String hotelname,int numberofsquarefeet,boolean hasTV,boolean hasWifi) {
    super(hotelname,numberofsquarefeet,hasTV,hasWifi);
    this.ratepersqfeet=10;
  }

  public int getRatepersqfeet()
  {
    if(hasWifi) {
      return ratepersqfeet+2;
    }
    else {
      return ratepersqfeet;
    }
  }
  public int calculatetarrif() {
    return numberofsquarefeet*getRatepersqfeet();
  }
  
}

/*Delux ac room class*/
class DeluxACRoom extends DeluxRoom{
  public DeluxACRoom(String hotelname,int numberofsquarefeet,boolean hasTV,boolean hasWifi){
    super(hotelname,numberofsquarefeet,hasTV,hasWifi);
    this.ratepersqfeet=12;
  }
  public int calculatetarrif() {
    return numberofsquarefeet*getRatepersqfeet();
  }
}

/*Suite Ac room class*/
class SuiteACRoom extends HotelRoom{
  private int ratepersqfeet;
  public SuiteACRoom(String hotelname,int numberofsquarefeet,boolean hasTV,boolean hasWifi) {
    super(hotelname,numberofsquarefeet,hasTV,hasWifi);
    this.ratepersqfeet=15;
  }
  public int getRatepersqfeet()
  {
    if(hasWifi) {
      return ratepersqfeet+2;
    }
    else {
      return ratepersqfeet;
    }
  }
  public int calculatetarrif() {
    return numberofsquarefeet*getRatepersqfeet();
  }
}

/*main class*/
public class Hotel {
  public static void main(String[] args) {
    int hotelType;
    String hotelname;
    int numberofsquarefeet;
    String hasTV, hasWifi;

    System.out.println("-------Hotel tarrif calcuator-------");

    Scanner sc = new Scanner(System.in);
    for(;;)
    {
      System.out.println("\n1.1. Deluxe Room\n2.Deluxe AC Room\n3.Suite AC Room\n4.exit");
      System.out.println("\nSelect Room type :");
      hotelType = sc.nextInt();sc.nextLine();
      if(hotelType>3 || hotelType<1)
        break;
      System.out.println("\nHotel Name: :");
      hotelname = sc.nextLine();
      System.out.println("\nnumberofsquarefeet :");
      numberofsquarefeet = sc.nextInt();sc.nextLine();
      System.out.println("\nRoom has TV (yes/no) :");
      hasTV = sc.nextLine();
      System.out.println("Room has Wifi (yes/no:");
      hasWifi = sc.nextLine();
      Boolean hTv,hWf;
      if(hasTV.equals(new String("yes")))
        hTv = true;
      else  
        hTv = false;
        if(hasWifi.equals(new String("yes")))
        hWf = true;
      else  
        hWf = false;
      
      switch(hotelType){
        case 1:DeluxRoom d = new DeluxRoom(hotelname, numberofsquarefeet, hTv, hWf);
                System.out.println("Room Tariff per day is :"+d.calculatetarrif());
                break;
        case 2:DeluxACRoom dAc = new DeluxACRoom(hotelname, numberofsquarefeet, hTv, hWf);
              System.out.println("Room Tariff per day is :"+dAc.calculatetarrif());
              break;
        case 3:SuiteACRoom sAc = new SuiteACRoom(hotelname, numberofsquarefeet, hTv, hWf);
              System.out.println("Room Tariff per day is :"+sAc.calculatetarrif());
              break;
      }

    }
    sc.close();
  }

}