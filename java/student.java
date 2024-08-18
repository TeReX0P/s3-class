import java.util.Scanner;
class student
{
    String name;
    int roll;
    int marks;
    int age;
    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
        System.out.println("Marks: "+marks);
        System.out.println("Age: "+age);
    }
}
class studentmain
{
    public static void main(String args[])
    {
        student s1=new student();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name: ");
        s1.name=sc.next();
        System.out.println("Enter roll: ");
        s1.roll=sc.nextInt();
        System.out.println("Enter marks: ");
        s1.marks=sc.nextInt();
        System.out.println("Enter age: ");
        s1.age=sc.nextInt();
        s1.display();
    }
}