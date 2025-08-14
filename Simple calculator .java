import java.util.Scanner;
class Main{
    void Calculator(){
        Scanner sc=new Scanner(System.in);
    String username="Neeraja";
    String password="9225";
    System.out.println("Hello! welcome.please login in.");
    System.out.println("Enter username:");
    String name=sc.nextLine();
    System.out.println("Enter password:");
    String pass=sc.nextLine();
    if(name.equals(username)){
        if(pass.equals(password)){
            System.out.println("login in successfully.");
            System.out.println("welocome to calcuator.");
            System.out.println("Enter a value:");
            int a=sc.nextInt();
            System.out.println("Enter b value:");
            int b=sc.nextInt();
            System.out.println("choose your choice for calculation. 1.Addition,2.Substraction,3.Multiplication,4.Division,5.Modulus.");
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Addition:"+(a+b));
                    break;
                case 2:
                    System.out.println("Substraction:"+(a-b));
                    break;
                case 3:
                    System.out.println("Multiplication:"+(a*b));
                    break;
                case 4:
                    System.out.println("Division:"+(a/b));
                    break;
                case 5:
                    System.out.println("Modulus"+(a%b));
                    break;
                default:
                    System.out.println("Invalid choice.please try again.");
            }
        }
        else{
            System.out.println("Invalid username and password.");
        }
    }
}
    public static void main(String[] args){
        Main obj=new Main();
        obj.Calculator();
    }
}