
public class CheckSquare {
	
	static int sqDistance(Point p, Point q) {
		
		return (p.x-q.x)*(p.x-q.x)+(p.y-q.y)*(p.y-q.y);
	}
	
	public static void main(String args[]) {
		
		Point p1 = new Point(20,10);
		Point p2 = new Point(10,20);
		Point p3 = new Point(20,20);
		Point p4 = new Point(10,10);
		
		int d2 = sqDistance(p1, p2); // distance from p1 to p2 
	    int d3 = sqDistance(p1, p3); // distance from p1 to p3 
	    int d4 = sqDistance(p1, p4); // distance from p1 to p4 
	  
	    if (d2 == 0 || d3 == 0 || d4 == 0)     
	        System.out.println("Not a Square!"); 
	  
	    // If lengths if (p1, p2) and (p1, p3) are same, then 
	    // following conditions must met to form a square. 
	    // 1) Square of length of (p1, p4) is same as twice 
	    // the square of (p1, p2) 
	    // 2) Square of length of (p2, p3) is same 
	    // as twice the square of (p2, p4) 
	  
	    if (d2 == d3 && 2*d2 == d4 && 2*sqDistance(p2, p4) == sqDistance(p2, p3)) 
	    { 
	    	System.out.println("Square!"); 
	    } 
	  
	    // The below two cases are similar to above case 
	    else if (d3 == d4 && 2*d3 == d2 && 2*sqDistance(p3, p2) == sqDistance(p3, p4))  
	    { 
	    	System.out.println("Square!"); 
	    }
	    
	    else if (d2 == d4 && 2*d2 == d3 && 2*sqDistance(p2, p3) == sqDistance(p2, p4)) 
	    { 
	    	System.out.println("Square!"); 
	    }
	    
	    else
	    	System.out.println("Not a Square!");
	}
}
