import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();
		for(int l = 0; l < cases; l++){
		    int a = scan.nextInt();
		    int b = scan.nextInt();
		    int c = scan.nextInt();
		    int d = scan.nextInt();
		    int e = scan.nextInt();
		    int f = scan.nextInt();
		    
		    int drag = a+b+c;
		    int sloth = d+e+f;
		    if(drag > sloth){
		        System.out.println("Dragon");
		    }
		    else if (drag < sloth){
		        System.out.println("Sloth");
		    }
		    else{
		        if(a > d){
		            System.out.println("Dragon");
		        }
		        else if(a < d){
		            System.out.println("Sloth");
		        }
		        else{
		            if(b > e){
		                System.out.println("Dragon");
		            }
		            else if(b < e){
		                System.out.println("Sloth");
		            }
		            else{
		                System.out.println("Tie");
		            }
		        }
		    }
		}
	}
}
