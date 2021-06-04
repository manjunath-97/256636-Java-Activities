import java.util.*;
class innings{
  private String teamname,inningsname;
  private int runs;
  
  public String getTeamname() {
    return teamname;
  }
  public String getInningsName() {
    return inningsname;
  }
  public int getRuns() {
    return runs;
  }
  public void setTeamname(String teamname) {
    this.teamname=teamname;
  }
  public void setInningsname(String inningsname) {
    this.inningsname=inningsname;
  }
  public void setRuns(int runs) {
    this.runs=runs;
  }
  public void displayInningsDetail() {
    System.out.println("TeamName:"+teamname);
    System.out.println("Innings:"+inningsname);
    System.out.println("Runs Scored:"+runs);
  
  }
}

public class InningsMain {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    innings i1=new innings();
    System.out.println("Enter Team Name:");
    i1.setTeamname(sc.next());
    System.out.println("Enter the Innings:");
    i1.setInningsname(sc.next());
    System.out.println("Enter runs scored:");
    i1.setRuns(sc.nextInt());
    i1.displayInningsDetail();
  }

}