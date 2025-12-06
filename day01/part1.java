import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.AbstractMap.SimpleEntry;
public class part1 {

    public static Integer circularAdd(Integer current, Integer nextNb) {
        Integer result = (current + nextNb) % 100;
        if (result < 0) result = result + 100;
        return result;
    }

    public static void countZeros(List<SimpleEntry<Boolean, Integer>> rotations) {
        Integer zeroCounter = 0;
        int currentEntry = 50;
        for (SimpleEntry<Boolean, Integer> next : rotations) {
            int delta = next.getKey() ? -next.getValue() : next.getValue();
            currentEntry = circularAdd(currentEntry, delta);
            if (currentEntry == 0) zeroCounter++;
        }
        System.out.println("counter : " + zeroCounter);
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
        for (SimpleEntry<Boolean, Integer> rotation : rotations) {
            System.out.println((rotation.getKey() ? "R" : "L") + rotation.getValue());
        }
        countZeros(rotations);
    }
}
