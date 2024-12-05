
import java.util.Scanner;

public class add {
    public static int add1(int a,int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c=sc.nextInt();
        int d=sc.nextInt();
        System.out.println(add1(c,d));
    }
    
}
