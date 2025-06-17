
import java.io.*;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) {
        String fileName = "demoFile.txt";

        try {
            // 1️⃣ Create a File
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("✅ File created: " + file.getName());
            } else {
                System.out.println("ℹ️ File already exists.");
            }

            // 2️⃣ Write to the File using FileWriter
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, this is a demo file.\nThis is the second line.");
            writer.close();
            System.out.println("✍️ Successfully wrote to the file.");

            // 3️⃣ Read the file using BufferedReader
            System.out.println("\n📖 Reading using BufferedReader:");
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();

            // 4️⃣ Read the file using Scanner
            System.out.println("\n📖 Reading using Scanner:");
            Scanner sc = new Scanner(new File(fileName));
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();

            // 5️⃣ Delete the file
            if (file.delete()) {
                System.out.println("\n🗑️ File deleted: " + file.getName());
            } else {
                System.out.println("⚠️ Failed to delete the file.");
            }

        } catch (IOException e) {
            System.out.println("❌ An error occurred.");
            e.printStackTrace();
        }
    }
}
