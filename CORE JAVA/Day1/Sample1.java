import java.util.Scanner;
public class Sample1{
public static void main(String args[]){
int a;
int b;
Scanner s1=new Scanner(System.in);
System.out.println("Enter first number");
a=s1.nextInt();
System.out.println("Enter second number");
b=s1.nextInt();
if(a>b){
System.out.println("A is greater");
}
else{
System.out.println("B is greater");
}
}
}