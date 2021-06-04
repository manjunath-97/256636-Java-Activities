import java.util.*;

class Employee1 {
  private String name,address,mobile;
  public String getName() {
    return name;
  }
  public String getAddress(){
    return address;
  }
  public String getMobile() {
    return mobile;
  }
  public void setName(String name) {
    this.name=name;
  }
  public void setAddress(String address) {
    this.address=address;
  }
  public void setMobile(String mobile) {
    this.mobile=mobile;
  }
  public void display()
  {
    
  }
  public void menu(int choice) {
    Scanner ssc=new Scanner(System.in);
    switch(choice) {
      case 1: System.out.println("Current Name:"+this.name);
          System.out.println("Enter New Name:");
          this.name=ssc.next();
          break;
      case 2: System.out.println("Current Address:"+this.address);
             System.out.println("Enter New Address:");
             this.address=ssc.next();
             break;
      case 3: System.out.println("Current Mobile Number:"+this.mobile);
          System.out.println("Enter New Mobile Number:");
          this.mobile=ssc.next();
          break;
      case 4:System.exit(0);
  }
  ssc.close();
  }
}
   public class EmployeeMain1{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      Employee1 emp=new Employee1();
      System.out.println("Enter the name:");
      emp.setName(sc.next());
      System.out.println("Enter the address:");
      emp.setAddress(sc.next());
      System.out.println("Enter the mobile:");
      emp.setMobile(sc.next());
      System.out.println("\nEmployee Details");
      System.out.println("Name:"+emp.getName());
      System.out.println("Address:"+emp.getAddress());
      System.out.println("Mobile:"+emp.getMobile());
      System.out.println("\nMenu");
      System.out.println("1.Update Employee Name");
      System.out.println("2.Update Employee Address");
      System.out.println("3.Update Employee Mobile");
      System.out.println("4.All Correct /Exit");
      System.out.println("\nEnter your Choice:");
      int choice=sc.nextInt();
      emp.menu(choice);
      System.out.println("\nUpdated Details");
      System.out.println("Employee Details");
      System.out.println("Name:"+emp.getName());
      System.out.println("Address:"+emp.getAddress());
      System.out.println("Mobile:"+emp.getMobile());
      sc.close();
      
    }
  }