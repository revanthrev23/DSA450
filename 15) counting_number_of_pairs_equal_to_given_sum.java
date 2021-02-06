int getPairsCount(int[] arr, int n, int k) {
        HashMap<Integer,Integer> h = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(h.containsKey(arr[i]))
              h.put(arr[i],h.get(arr[i])+1);
            h.put(arr[i],1);  
        }
        int t=0;
        for(int i=0;i<n;i++){
            if(h.get(k-arr[i])!=null){
                t+=h.get(k-arr[i]);
            }
            if(k-arr[i]==arr[i])
             t--;
        }
        return t/2;
    }
