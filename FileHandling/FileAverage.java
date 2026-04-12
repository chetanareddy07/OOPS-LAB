import java.io.*;
import java.util.Scanner;

public class FileAverage {
    public static void main(String[] args) {
        try {
            // Step 1: Create file
            File file = new File("numbers.txt");
            file.createNewFile();

            // Step 2: Write into file
            FileWriter fw = new FileWriter(file);
            fw.write("10\n20\n30\n40\n50");
            fw.close();

            // Step 3: Read from file
            Scanner sc = new Scanner(file);

            int sum = 0, count = 0;

            while (sc.hasNext()) {
                int num = sc.nextInt();
                sum += num;
                count++;
            }

            sc.close();

            double avg = (double) sum / count;

            // Output
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + avg);

        } catch (IOException e) {
            System.out.println("Error handling file!");
        }
    }
}