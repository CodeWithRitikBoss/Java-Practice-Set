public class FileHandlingPracticeSet19 {
    public static void main(String[] args) {
        System.out.println("File Handling Practice Set - 19.");

        // File handing in java.
        try {
            // Create a new file
            java.io.File file = new java.io.File("example.txt");
            if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
            } else {
            System.out.println("File already exists.");
            }

            // // Write to the file
            // java.io.FileWriter writer = new java.io.FileWriter("example.txt");
            // writer.write("This is a sample text written to the file.");
            // writer.close();
            // System.out.println("Successfully wrote to the file.");

            // Read from the file
            java.util.Scanner reader = new java.util.Scanner(file);
            System.out.println("File contents:");
            while (reader.hasNextLine()) {
            System.out.println(reader.nextLine());
            }
            reader.close();

        } catch (java.io.IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
