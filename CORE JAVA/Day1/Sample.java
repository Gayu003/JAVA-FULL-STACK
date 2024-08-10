import java.util.Scanner;
public class Sample{
  public static void main(String args[]){
     int employeeId;
     String employeeName;
     float employeeSalary;
Scanner s1=new Scanner(System.in);

System.out.println("Enter employee id");
employeeId=s1.nextInt();
System.out.println("Enter employee name");
employeeName=s1.next();
System.out.println("Enter employee salary");
employeeSalary=s1.nextFloat();
System.out.println("Enter employee id"+employeeId);
System.out.println("Enter employee name"+employeeName);
System.out.println("Enter employee salary"+employeeSalary);

}
}