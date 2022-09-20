package scan;
import java.util.Scanner;

//https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true

public class scanner {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int i = scan.nextInt();
        Double dou = scan.nextDouble();
        scan.nextLine();
        String name = scan.nextLine();

        scan.close();

        System.out.println("String: "+name);
        System.out.println("Double: "+dou);
        System.out.println("Int: "+i);

    }
}