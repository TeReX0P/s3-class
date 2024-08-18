import java.util.*;
class student{
    String name;
    int marks;
    student(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
}
public class main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        student[] s = new student[5];
        System.out.println("Enter name and marks of 5 students: ");
        for(int i=0; i<5; i++){
            String name = sc.next();
            int marks = sc.nextInt();
            s[i] = new student(name, marks);
        }
        System.out.println("Name and marks of 5 students: ");
        for(int i=0; i<5; i++){
            for(int j=i+1; j<5; j++){
                if(s[i].marks > s[j].marks){
                    student temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
            System.out.println(s[i].name + " " + s[i].marks);
        }
        System.out.println("average marks: ");
        int sum = 0;
        for(int i=0; i<5; i++){
            sum += s[i].marks;
        }
        System.out.println(sum/5);
    }
}