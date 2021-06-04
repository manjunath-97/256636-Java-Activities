import java.util.Scanner;
class Customer {
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
}
public class CustomerMain{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Customer c=new Customer();
    System.out.println("Enter Customer Details(separate by ','):");
    String str=sc.next();
    String[] arr=str.split(",");
    c.setName(arr[0]);
    c.setAddress(arr[1]);
    c.setMobile(arr[2]);
    System.out.println("\nCustomer Details :");
    System.out.println("Name:"+c.getName());
    System.out.println("Address:"+c.getAddress());
    System.out.println("Mobile:"+c.getMobile());
    sc.close();
    
  }
}