import java.util.Scanner;
class Factorial {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=s1.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
          System.out.println("Factorial of the given number");
        System.out.println(fact);
    }
}