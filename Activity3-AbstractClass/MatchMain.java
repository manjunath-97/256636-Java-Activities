import java.util.*;

abstract class Match{
  private int currentscore;
  private int currentover;
  private int target;
  void setCurrentscore(int currentscore)
  {
    this.currentscore=currentscore;
  }
  int getCurrentscore() {
    return this.currentscore;
  }
  void setCurrentover(int currentover){
    this.currentover=currentover;
  }
  int getCurrentover() {
    return this.currentover;
  }
  void setTarget(int target) {
    this.target=target;
  }
  int getTarget() {
    return this.target;
  }

  abstract float Calculaterunrate();
  abstract int CalculateBalls();
  abstract void Display(float rate,int balls);
  
}

class OdiMatch extends Match{
  int oversleft,runs,balls;
  void setruns() {
    this.runs=this.getTarget()-this.getCurrentscore();
  }
  int getruns()
  {
    return this.runs;
  }
  float rate;

  @Override
  float Calculaterunrate() {
    this.oversleft=50-this.getCurrentover();
    this.runs=this.getTarget()-this.getCurrentscore();
    this.rate=(float)this.runs/(float)this.oversleft;
    return this.rate;
  }

  @Override
  int CalculateBalls() {
    this.balls=(50-this.getCurrentover())*6;
    return this.balls;
  }

  @Override
  void Display(float rate,int balls) {
    System.out.println("--------------------------");
    System.out.println("Need " +this.getruns()+ " in " +balls+ " balls" );
    System.out.println("Required Runrate:" +rate +" per over");
    
  }
  
}

class TestMatch extends Match{
  int oversleft,runs,balls;
  void setruns() {
    this.runs=this.getTarget()-this.getCurrentscore();
  }
  int getruns()
  {
    return this.runs;
  }
  float rate;
  @Override
  float Calculaterunrate() {
    this.oversleft=90-this.getCurrentover();
    this.runs=this.getTarget()-this.getCurrentscore();
    this.rate=(float)this.runs/(float)this.oversleft;
    return this.rate;
  }
  @Override
  int CalculateBalls() {
    this.balls=(90-this.getCurrentover())*6;
    return this.balls;
  }
  @Override
  void Display(float rate,int balls) {
    System.out.println("------------------------------");
    System.out.println("Need " +this.getruns()+ " in " +balls+ " balls" );
    System.out.println("Required Runrate:" + rate +" per over");
    
  }
}

class T20Match extends Match{
  int oversleft,runs,balls;
  void setruns() {
    this.runs=this.getTarget()-this.getCurrentscore();
  }
  int getruns()
  {
    return this.runs;
  }
  float rate;
  @Override
  float Calculaterunrate() {
    this.oversleft=20-this.getCurrentover();
    this.runs=this.getTarget()-this.getCurrentscore();
    this.rate=(float)this.runs/(float)this.oversleft;
    return this.rate;
  }
  @Override
  int CalculateBalls() {
    this.balls=(20-this.getCurrentover())*6;
    return this.balls;
  }
  @Override
  void Display(float rate,int balls) {
    System.out.println("-------------------------");
    System.out.println("Need " +this.getruns()+ " in " +balls+ " balls" );
    System.out.println("Required Runrate:" + rate +" per over");
    
  }
}

public class MatchMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Match Format-1.ODI /2.TEST /3.T20");
        int format=sc.nextInt();
        switch(format) {
        case 1: Match odi=new OdiMatch();
            System.out.println("Enter Current Score:");
            odi.setCurrentscore(sc.nextInt());
            System.out.println("Enter Current Over:");
            odi.setCurrentover(sc.nextInt());
            System.out.println("Enter Target:");
            odi.setTarget(sc.nextInt());
            odi.Display(odi.Calculaterunrate(),odi.CalculateBalls());
            break;
        case 2: Match test=new TestMatch();
            System.out.println("Enter Current Score:");
            test.setCurrentscore(sc.nextInt());
            System.out.println("Enter Current Over:");
            test.setCurrentover(sc.nextInt());
            System.out.println("Enter Target:");
            test.setTarget(sc.nextInt());
            test.Display(test.Calculaterunrate(),test.CalculateBalls());
            break;
        case 3: Match t20=new T20Match();
            System.out.println("Enter Current Score:");
            t20.setCurrentscore(sc.nextInt());
            System.out.println("Enter Current Over:");
            t20.setCurrentover(sc.nextInt());
            System.out.println("Enter Target:");
            t20.setTarget(sc.nextInt());
            t20.Display(t20.Calculaterunrate(),t20.CalculateBalls());
            break;
        default:System.out.println("Wronng Input!!!");
            
            
            
        }
        sc.close();

    }

}