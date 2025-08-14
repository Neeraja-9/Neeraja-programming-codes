import java.util.Scanner;
class Neon{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println(" Enter the number: ");
        n=s.nextInt();
        int sq=n*n;
        int sum=0;
        while(sq!=0){
            sum+=sq%10;
            sq/=10;
            }
        if(sum==n){
            System.out.println(n+" is a neon number.");
        }
        else{
            System.out.println(n+" is a  not neon number.");
        }
    }
}