ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        // code here 
        HashSet<Integer> h1=new HashSet<>();
        HashSet<Integer> h2=new HashSet<>();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<n1;i++)
         h1.add(A[i]);
        for(int i=0;i<n2;i++)
         h2.add(B[i]);
         int prev=Integer.MAX_VALUE;
        for(int i=0;i<n3;i++)
        {
            if(h1.contains(C[i]) && h2.contains(C[i]) && C[i]!=prev)
             {
                 a.add(C[i]);
                 prev=C[i];
             }
        }
        return a;
    }
