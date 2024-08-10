import java.util.Scanner;
public class Sample2{
public static void main(String args[]){
int arr[]=new int[5];
int sum=0;
Scanner s1=new Scanner(System.in);
System.out.println("Enter 5 integer values");
for(int i=0;i<arr.length;i++){
arr[i]=s1.nextInt();
}
System.out.println("Array elements are:");

for(int i=0;i<arr.length;i++){
System.out.println(arr[i]);
sum+=arr[i];
}
System.out.println("Sum of all array elements are:"+sum);


}
}
