import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
public class part2 {

    public static long best12(String s) {
        int toRemove = s.length() - 12;
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            while (!stack.isEmpty() && toRemove > 0 && stack.peekLast() < c) {
                stack.removeLast();
                toRemove--;
            }
            stack.addLast(c);
        }
        while (stack.size() > 12)
            stack.removeLast();
        StringBuilder result = new StringBuilder();
        for (char c : stack)
            result.append(c);
        return Long.parseLong(result.toString());
    }


    public static void main(String[] args) throws Exception {
        Path inputFile = Paths.get("input1.txt");
        List<String> lines = Files.readAllLines(inputFile);
    
        long totalJolt = 0;
        for (String line : lines) {
            long maxJoltBattery = best12(line);
            totalJolt += maxJoltBattery;
        }
        System.out.println(totalJolt);
    }
}
