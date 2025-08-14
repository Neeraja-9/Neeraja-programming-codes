import java.util.Scanner;
class Roman{
    static int romanToInt(String s) {
        int rom = 0;
        int num = 0;
        for (int i = s.length()-1; i>=0;i--) {
            switch (s.charAt(i)) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
                default:
                    System.out.println("Invalid character");
                    break;
            }
            if (num*4<rom) {
                rom -= num;
            }
            else {
                rom += num;
            }
        return rom;
        }
        return 0;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String number;
        System.out.println("Enter the roman number:");
        number=sc.nextLine();
        int result=romanToInt(number);
        System.out.println("The integer value of "+number+" is "+result);
    }
}