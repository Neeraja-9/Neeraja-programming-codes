public class BubbleSort {
    public static void main(String[] args){
        int n=5;
        int a[]={24,9,66,13,30};
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]+" ");
        }
    }
}
