import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class part1 {

    public static boolean isRepeatedSequence(long n) {
        String s = Long.toString(n);
        int len = s.length();
        if (len % 2 != 0) return false;
        String left = s.substring(0, len / 2);
        String right = s.substring(len / 2);
        return left.equals(right);
    }

    public static long sumInvalidNb(long start, long end) {
        long sum = 0;
        for (long n = start; n <= end; n++) {
            if (isRepeatedSequence(n)) {
                sum += n;
            }
        }
        return sum;
    }

    public static long verifyIDS(List<long[]> ranges) {
        long totalSum = 0;
        for (long[] range : ranges)
            totalSum += sumInvalidNb(range[0], range[1]);
        return totalSum;
    }

    public static void main(String[] args) throws Exception {
        Path inputFile = Paths.get("input1.txt");
        List<String> lines = Files.readAllLines(inputFile);
        List<long[]> ranges = new ArrayList<>();

        for (String line : lines) {
            String[] pairs = line.split(",");
            for (String pair : pairs) {
                String[] parts = pair.split("-");
                long start = Long.parseLong(parts[0]);
                long end = Long.parseLong(parts[1]);
                ranges.add(new long[]{start, end});
            }
        }

        long sumInvalid = verifyIDS(ranges);
        System.out.println(sumInvalid);
    }
}
