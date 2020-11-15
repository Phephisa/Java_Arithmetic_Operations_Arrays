import java.util.Scanner;
/* Phephisa Methula 18000797
 BSc Computer Science and Software Engineering
 QUESTION 5
* */
public class Palindrome {

    public static void main(String[] args)
    {
        palindrome(); //calling my method
    }
    public static void palindrome() //palindrome function
    {
        Scanner input =new Scanner(System.in); //scanner input function
        System.out.println("Enter the word");  //prompt to enter name
        String pal =input.nextLine(); //input
        int count=0; // counter for checking a condition
        int strl=pal.length(); //getting length of the string
        for(int i=0;i<strl/2;i++)
        {
            if(pal.charAt(i)==pal.charAt(strl-i-1)) //first condition to increase the count variable
            {
                count++;
            }
        }
        if(count==strl/2) {  //condition to check length of string that should be equal to the count variable
            System.out.println("String " + pal + " is a palindrome");
        }
        else{ //if condition is not met automatically its not a palindrome
            System.out.println("String " + pal + " is not a palindrome");}
    }
}
