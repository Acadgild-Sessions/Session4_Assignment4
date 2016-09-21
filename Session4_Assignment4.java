import java.util.*;

class Shape1 
{ 
	int length ; 
	int breadth ; 
	        
	Shape1(int side) 
	{ 
		length  = side ;
		breadth = side ;
	} 
	Shape1(int l,int b) 
	{ 
		length = l ; 
		breadth = b ; 
	} 
	int area() 
	{ 
		return (length * breadth) ; 
	} 
} 

public class Session4_Assignment4 {
	public static void main(String[] args){		
		Scanner sc = new Scanner(System.in);
		int s,l,b;
		
		System.out. println("Area of Square Calculation"); 
		System.out.print("Enter Side : ");
		s=sc.nextInt();
	    Shape1 s2 = new Shape1(s);
	    System.out. println("Area of Square  : "+ s2.area( )); 
	    
	    System.out. println("\nArea of Rectangle Calculation");
	    System.out.print("Enter Length : ");
		l=sc.nextInt();
		System.out.print("Enter Breadth : ");
		b=sc.nextInt();
		Shape1 s3 = new Shape1(l,b);
	    System.out.println("Area of Rectangle  : "+ s3.area( )); 
    } 
}


      