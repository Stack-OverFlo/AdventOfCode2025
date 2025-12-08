import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
public class part1 {

    public static int computeBatteryJolt(String batteries) {
        int first = -1;
        int second = -1;

        for (int i = 0; i < batteries.length() - 1; i++) {
            int a = batteries.charAt(i) - '0';
            for (int j = i + 1; j < batteries.length(); j++) {
                int b = batteries.charAt(j) - '0';
                int val = a * 10 + b;
                if (val > first * 10 + second) {
                    first = a;
                    second = b;
                }
            }
        }
        return first * 10 + second;
    }  

    public static void main(String[] args) throws Exception {
        Path inputFile = Paths.get("input1.txt");
        List<String> lines = Files.readAllLines(inputFile);
    
        int totalJolt = 0;
        for (String line : lines) {
            int maxJoltBattery = computeBatteryJolt(line);
            totalJolt += maxJoltBattery;
        }
        System.out.println(totalJolt);
    }
}
