import java.util.Scanner;

class Company{
  private String name,employees,teamlead;
  public String getName() {
    return name;
  }
  public String getTeamlead(){
    return teamlead;
  }
  public String getEmployees() {
    String[] arr=employees.split(",");  
    //for(String a :arr) {
    //  return a;
    //}
    return employees;
  }
  public void setName(String name) {
    this.name=name;
  }
  public void setTeamlead(String teamlead) {
    this.teamlead=teamlead;
  }
  public void setEmployees(String employees) {
    this.employees=employees;
  }
}
public class CompanyMain {
public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  Company c=new Company();
  System.out.println("Enter Company Name:");
  c.setName(sc.nextLine());
  System.out.println("Enter Employee Names:");
  String str=sc.next();
  c.setEmployees(str);
  System.out.println("Enter Teamlead :");
  c.setTeamlead(sc.next());
  System.out.println("Name:"+c.getName());
  System.out.println("Employees:"+c.getEmployees());
  System.out.println("Teamlead:"+c.getTeamlead());
}
}