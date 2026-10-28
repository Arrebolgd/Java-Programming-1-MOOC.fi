
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String fileName = scanner.nextLine();

        try (Scanner file = new Scanner(Paths.get(fileName))) {

            while (file.hasNextLine()) {
                String line = file.nextLine();

                if (line.isEmpty()) {
                    continue;
                }

                String[] formatedContent = line.split(",");
                if (Integer.valueOf(formatedContent[1]) == 1) {
                    System.out.println(formatedContent[0] + ", age: " + formatedContent[1] + " year");
                } else {
                    System.out.println(formatedContent[0] + ", age: " + formatedContent[1] + " years");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
