import java.util.Arrays;
import java.util.Scanner;
/* Phephisa Methula 18000797
 BSc Computer Science and Software Engineering
 QESTION 7
* */
public class BubbleSort {
        public static void main(String[] args) {
            //scanner function for input
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

            System.out.println("Sorted array:  ");
            //using the java Array sort api, sorts in ascending order
            Arrays.sort(arr);
            //printing sorted array
            System.out.print("int[] arr = { ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + ", ");
            }
            System.out.println(" }");
        }
    }

