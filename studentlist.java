 import java.util.*;
 class student{
    String name;
    int roll;
}
public class studentlist
{
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
          System.out.print("Enter the number of students : ");
          int n = sc.nextInt();
          student s[] = new student[n];
          for(int i=0;i<n;i++){
            s[i] = new student();
            System.out.print("Enter the name of student "+(i+1)+" : ");
            s[i].name = sc.next();
            System.out.print("Enter the roll number of student "+(i+1)+" : ");
            s[i].roll = sc.nextInt();
          }
          System.out.println("The details of the students are : ");
          for(int i=0;i<n;i++){
            System.out.println("Name : "+s[i].name);
            System.out.println("Roll number : "+s[i].roll);
          }
        }
    }
}
