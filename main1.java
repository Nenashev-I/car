import java.awt.Event;

public class main1 {
	
public static void main(String[] args)
{
  Starter a = new Starter();
    Starter a2 = new Starter();
    Starter a3 = new Starter();
    a3.x1=30;
    a2.x1=30;
    a.x1=30;
  
  
  Starter a1 = new Starter();
  a1.addMyListener(a1);
  
  a2.addMyListener(a2);
	 a3.addMyListener(a3);
	 //a.addMyListener(a);
	 
	
 
  a.fireMyEvent("ÿ");
  }

}
