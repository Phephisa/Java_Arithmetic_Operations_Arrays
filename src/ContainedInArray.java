import java.util.*;
/* Phephisa Methula 18000797
 BSc Computer Science and Software Engineering
 QUESTION 9
* */
public class ContainedInArray {

    public static void main(String[] args)
    {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter length/size of array: ");
    int size = input.nextInt();
    System.out.println("Enter elements of array: ");
    int[] arr = new int[size];
    //input of elements
    for (int i = 0; i < size; i++)
    {
        arr[i] = input.nextInt();
    }
        System.out.println("Enter integer to be checked: ");
    int c_number = input.nextInt(); //the number being checked
    check(arr,c_number);           //calling the function
    }
    public static void check(int arr[], int num) //checking function
    {   int size = arr.length;
        int count = 0; //counting variable
       // Arrays.sort(arr);
        for (int i = 0; i < size; i++) //condition if number appears in array
        {
            if (arr[i] == num) {
                count++;
            }
        }
        if (count == 0)
            System.out.println("False");
        else
            System.out.println("True");
    }
}

