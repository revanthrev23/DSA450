import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 int test = Integer.parseInt(br.readLine());
			 while(test-- >0){
			    String[] temp = br.readLine().split(" ");
			 	int n = Integer.parseInt(temp[0]);
			 	int m = Integer.parseInt(temp[1]);
			 	temp = br.readLine().split(" ");
			 	int k = 0;
			 	int[] ans = new int[m+n];
			 	for(int i = 0; i<n; i++){
			 	    ans[k++] = Integer.parseInt(temp[i]);
			 	}
			 	temp = br.readLine().split(" ");    
			 	for(int i = 0; i<m; i++){
			 	    ans[k++] = Integer.parseInt(temp[i]);       
			 	}
			 	Arrays.sort(ans);
			 	int count = 1;
			 	k = m+n;
			 		for(int i = 0; i<k-1; i++){
			 			if(ans[i] == ans[i + 1])
			 				continue;
			 			else
			 	           count++;
			 	    }
			 	    System.out.println(count);
			 }
			 br.close();
			 }
}
