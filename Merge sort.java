import java.util.Arrays;
public class MergeSort{
    static void merge(int[] a,int low,int mid,int high){
        int n1=mid-low+1;
        int n2=high-mid;
        int[] l=new int[n1];
        int[] r=new int[n2];
        for(int i=0;i<n1;i++){
            l[i]=a[low+i];
        }
        for(int j=0;j<n2;j++){
            r[j]=a[mid+1+j];
        }
        int i=0,j=0,k=low;
        while(i<n1&&j<n2){
            if(l[i]<=r[j]){
                a[k]=l[i];
                i++;
            }
            else{
                a[k]=r[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            a[k]=l[i];
            i++;
            k++;
        }
        while(j<n2){
            a[k]=r[j];
            j++;
            k++;
        }
    }
    static  void Mergesort(int[] arr,int l,int r)
    {
        if(l<r)
        {
            int mid=(l+r)/2;
            Mergesort(arr,l,mid);
            Mergesort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }
    public static void main(String[] args){
        int[] a={26,13,9,66,11,3,99};
        System.out.println("Before sorting: "+ Arrays.toString(a));
        Mergesort(a,0,a.length-1);
        System.out.println("After sorting: "+ Arrays.toString(a));
    }
}