    static int minJumps(int[] arr){
        // your code here
            if(arr.length<=1)
             return 0;
            if(arr[0]==0)
             return -1;
            int maxreach = arr[0], step=arr[0], jump=1;
            for(int i=1;i<arr.length;i++)
            {
                if(i==arr.length-1)
                 return jump;
                maxreach = Math.max(maxreach, i+arr[i]);
                step--;
                if(step==0)
                {
                    jump++;
                    if(i>=maxreach)
                     return -1;
                    step=maxreach-i; 
                }
            }
            return -1;
    }
