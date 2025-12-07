import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class part2 {

    public static boolean hasAtLeastTwoRepetitions(long n) {
        String s = Long.toString(n);
        int len = s.length();

        for (int m = 1; m <= len / 2; m++) {
            String motif = s.substring(0, m);
            int repetitions = len / m;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < repetitions; i++) {
                sb.append(motif);
            }
            if (sb.toString().equals(s) && repetitions >= 2) {
                return true;
            }
        }
        return false;
    }

    public static long sumInvalidNb(long start, long end) {
        long sum = 0;
        for (long n = start; n <= end; n++) {
            if (hasAtLeastTwoRepetitions(n)) {
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
        Path inputFile = Paths.get("input2.txt");
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
