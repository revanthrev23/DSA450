import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t>0){
		    t--;
		    int n=s.nextInt();
		    int a[]=new int[n];
		    int j=0;
		    int nc=0;
		    for(int i=0;i<n;i++)
		    {
		        a[i]=s.nextInt();
		        if(a[i]<0)
		         nc++;
		    }
		    HashMap<Integer,Integer> h=new HashMap<>();
		    for(int i=0;i<n;i++)
		    {
		        if(a[i]>0)
		        {
		            h.put(j,a[i]);
		            j++;
		        }
		    }
		    for(int i=0;i<n;i++)
		    {
		        if(a[i]<0)
		        {
		            h.put(j,a[i]);
		            j++;
		        }
		    }
		    for(int i=0;i<n;i++)
		    {
		        System.out.print(h.get(i)+" ");
		    }
		    System.out.println();
		}
	}
}
