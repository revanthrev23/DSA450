import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0){
		int n=s.nextInt();
		int []a = new int[n];
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
		   a[i]=s.nextInt();
		   if(a[i]<min)
		    min=a[i];
		   if(a[i]>max)
		    max=a[i];
		}
		System.out.println(max + " " + min);
		t--;
		}
	}
}
