void sort012(int a[], int n)
{
    // coode here 
    int zc=0,oc=0,tc=0;
    for(int i=0;i<n;i++)
    {
        if(a[i]==0)
         zc++;
        else if(a[i]==1)
         oc++;
        else
         tc++;
    }
    for(int i=0;i<zc;i++)
     a[i]=0;
    for(int i=zc;i<zc+oc;i++)
     a[i]=1;
    for(int i=zc+oc;i<n;i++)
     a[i]=2;
}
