import java.io.*;
import java.util.*;
/* Phephisa Methula 18000797
QUESTION 10
* */

public class ReadNumbers {

    public static void main(String[] args) throws IOException {


        FileReader reader = new FileReader("E:/BIUSTSoftwareEngineeringL200/Assignment/src/numbers.txt");
        PrintWriter writer = new PrintWriter("E:/BIUSTSoftwareEngineeringL200/Assignment/src/numbers.txt");

        Scanner scan = new Scanner(reader);

        // create token
        //String token = "";

        // create array list
        List<Integer> arr = new ArrayList<>();

        while (scan.hasNext()) {
            arr.add(scan.nextInt());
        }
        Collections.sort(arr); //sorting an ArrayList

        // Smallest number printing
        int min;
        min = arr.get(0);
        writer.println(min + " -->> Smallest");
        System.out.println(min + " -->> Smallest");
        //Largest number printing
        int max = arr.get(arr.size() - 1);
        writer.println(max + " --> Largest");
        System.out.println(max + " --> Largest");

        //Sum of the numbers in file
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += i;
        }
        writer.println(sum + " --> Sum");
        System.out.println(sum + " --> Sum");

        //Average of the numbers
        int average = sum / arr.size();
        writer.println(average + " --> Average");
        writer.close();
        System.out.println(average + " --> Average");
    }
}

