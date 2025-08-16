public class ForMethods{
    public static void main(String[] args){
        String str="Annamacharya University";
        System.out.println("Length of the string is "+str.length());
        System.out.println("character of the string at index 2 is "+str.charAt(2));
        System.out.println("sub-string of the string is "+str.substring(3,6));
        System.out.println("contains of the string is "+str.contains("Anna"));
        System.out.println("Equals of the string is "+str.equals("annamacharya university"));
        System.out.println("Equals Ignore of the string is "+str.equalsIgnoreCase("annamacharya university"));
        System.out.println("Upper case of the string is "+str.toUpperCase());
        System.out.println("Lower case of the string is "+str.toLowerCase());
        System.out.println("Trim of the string is "+str.trim());
    }
}
