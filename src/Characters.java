import java.util.Scanner;
/* Phephisa Methula 18000797
 BSc Computer Science and Software Engineering
 QUESTION 6
* */
public class Characters {

     public static void main(String[] args)
        {
            Scanner input=new Scanner(System.in);
            System.out.println("Please enter your word");
            //inputting the word
            String word1=input.nextLine();
            System.out.println(word1);
            //for easy navigation in string, use for indexing
            int length=word1.length();
            //printing the first character at index 0
            System.out.println("First character is: " +word1.charAt(0));
            //length of string - 1 = the last character in the string
            System.out.println("Last character is: "+word1.charAt(length-1));
            System.out.println("Enter string in small letters ");
            String word = input.nextLine();
            for(int i=0;i<length;i++)
            {   int count=0;
                for(int j = 0; j<length; j++)
                {
                   if((word.charAt(i))==word.charAt(j))
                   {count++;}
                }
                System.out.println(word.charAt(i) + " : " + count);
            }




           /* int[] count=new int[30];
            for(int i=0;i<length;i++)
            {
                count[word.charAt(i)-'a']++;
            }
            System.out.println("FREQUENCY OF EACH CHARACTER IS - ");
            for(int i=0;i<30;i++)
            {
                System.out.println((char)(i+'a') +" = " +count[i]);
            } */
        }
    }

