import java.util.*;
public class lettercount
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String str = sc.nextLine();
        int c=0;  
        System.out.print("Enter the letter to be counted : ");  
        String ch = sc.nextLine();      
        for(int i=0 ; i<str.length();i++){
          if(str.charAt(i) == ch.charAt(0)){
            c++;
          }
        }
        System.out.println("The letter "+ch+" is repeated "+c+" times in the word "+str);
    }
}