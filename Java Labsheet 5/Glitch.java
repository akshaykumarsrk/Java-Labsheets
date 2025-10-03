import java.util.Scanner;

public class Glitch 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name = new String();
        System.out.println("Enter a name: ");
        name = sc.next();

        String line = new String();
        System.out.println("Enter a line: ");
        sc.nextLine();
        line = sc.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Line: " + line);
    } 
}
