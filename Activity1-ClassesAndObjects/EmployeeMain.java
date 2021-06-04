import java.util.Scanner;
class Employee {
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
   public class EmployeeMain{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      Employee emp=new Employee();
      System.out.println("Enter the name:");
      emp.setName(sc.next());
      System.out.println("Enter the address:");
      emp.setAddress(sc.next());
      System.out.println("Enter the mobile:");
      emp.setMobile(sc.next());
      System.out.println("Employee Details");
      System.out.println("Name:"+emp.getName());
      System.out.println("Address:"+emp.getAddress());
      System.out.println("Mobile:"+emp.getMobile());
      sc.close();
      
    }
  }