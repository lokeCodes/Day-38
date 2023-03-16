// https://www.codechef.com/problems/BUILDINGRACE
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int a = s.nextInt();
		    int b = s.nextInt();
		    int x = s.nextInt();
		    int y = s.nextInt();
		    double res1 = a * 1.0 / x;
		    double res2 = b * 1.0 / y;
		    if(res1==res2){
		        System.out.println("Both");
		    }else if(res1 < res2){
		        System.out.println("Chef");
		    }else{
		        System.out.println("Chefina");
		    }
		}
	}
}
