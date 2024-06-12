import java.util.Scanner;
public class Demo {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        String str = "he llo";
        char number = str.charAt(str.length() -1);
        System.out.println("Hello "+name+", only use "+number);
    };

}