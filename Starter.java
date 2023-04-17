import java.awt.Event;
import java.util.ArrayList;


public class Starter implements MyListener {
	
	int x1, y1;
	
	  private static ArrayList<MyListener> listeners = new ArrayList<MyListener>();
	  public static void addMyListener(MyListener listener)
	  {
	    listeners.add(listener);
	  }

	  protected void fireMyEvent(String message)
	  {
	    Event ev = new Event(this, 0, message);
	    ev.x=x1;
	    
	    for(MyListener listener : listeners)
	      listener.myHappend(ev);
	  }
	  
	  
	public void myHappend(Event ev) {
	    if (ev.arg.toString()=="ggg")
	    	System.out.println("не жжужи");
	    	else 
		System.out.println("a got it"+" "+ev.toString());
	    
	    if (ev.x==x1) System.out.println("Авария");
	    System.out.println("мои координаты"+" "+x1);
		
		
		

	  
	}
}
