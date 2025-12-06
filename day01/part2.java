import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.AbstractMap.SimpleEntry;

public class part1 {

    public static int circularAdd(int current, int delta) {
        int result = (current + delta) % 100;
        if (result < 0) result += 100;
        return result;
    }

    public static int countZeros(List<SimpleEntry<Boolean, Integer>> rotations) {
        int zeroCounter = 0;
        int current = 50;

        for (SimpleEntry<Boolean, Integer> next : rotations) {
            int delta = next.getKey() ? -next.getValue() : next.getValue();
            int sign = delta > 0 ? 1 : -1;
            int steps = Math.abs(delta);
            for (int i = 0; i < steps; i++) {
                current = (current + sign + 100) % 100;
                if (current == 0) zeroCounter++;
            }
        }
        return zeroCounter;
    }

    public static void main(String[] args) throws Exception {
        Path inputFile = Paths.get("input.txt");
        List<String> lines = Files.readAllLines(inputFile);
        List<SimpleEntry<Boolean, Integer>> rotations = new ArrayList<>();
        for (String line : lines) {
            char dir = line.charAt(0);
            int value = Integer.parseInt(line.substring(1));
            rotations.add(new SimpleEntry<>(dir == 'R', value));
        }
        int password = countZeros(rotations);
        System.out.println(password);
    }
}
