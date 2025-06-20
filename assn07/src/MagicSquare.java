import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MagicSquare {
    public static boolean testMagic(String pathName) throws IOException {
        // Open the file
        BufferedReader reader = new BufferedReader(new FileReader(pathName));

        boolean isMagic = true;
        int lastSum = -1;

        // For each line in the file ...
        String line;
        while ((line = reader.readLine()) != null) {
            // ... sum each row of numbers
            String[] parts = line.split("\t");
            int sum = 0;
            for (String part : parts) {
                //修剪String避免出现空格！
                part = part.trim();
                if (!part.isEmpty()) {
                    sum += Integer.parseInt(part);
                }
            }

            if (lastSum == -1) {
                // If this is the first row, remember the sum
                lastSum = sum;
            } else if (lastSum != sum) {
                // if the sums don't match, it isn't magic, so stop reading
                isMagic = false;
                break;
            }
        }

        reader.close();
        return isMagic;
    }

    public static void main(String[] args) throws IOException {
        String[] fileNames = { "Mercury.txt", "Luna.txt" };
        for (String fileName : fileNames)
        try{
            System.out.println(fileName + " is magic? " + testMagic(fileName));
        }catch (IOException e) {
            System.out.println("Failed to read " + fileName + ": " + e.getMessage());
        }
    }
}
