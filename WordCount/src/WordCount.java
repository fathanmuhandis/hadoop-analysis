import java.io.*;
import java.nio.file.*;
import java.util.*;

public class WordCount {
    private static Map<String, Integer> counts = new HashMap<>();

    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.err.println("Usage: WordCount <input path> <output path>");
            System.exit(-1);
        }

        long startTime = System.currentTimeMillis();

        try (FileInputStream fis = new FileInputStream(args[0])) {
            Scanner scanner = new Scanner(fis);
            while (scanner.hasNext()) {
                String word = scanner.next();
                counts.put(word, counts.getOrDefault(word, 0) + 1);
            }
            scanner.close();
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(args[1]))) {
            for (Map.Entry<String, Integer> entry : counts.entrySet()) {
                writer.println(entry.getKey() + "\t" + entry.getValue());
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Execution time in milliseconds: " + (endTime - startTime));
    }
}
