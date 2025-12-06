public class part1 {
    public void main() {
        List<String> lines = Files.readAllLines(Path.get("input.txt"));
        String[] rotations = lines.split("\n");
        List<boolean, String> rotations = new ArrayList();
        for (String line : rotations) {
            if (line.charAt(0).equals('L'))
                rotations.add(false, Integer.parseInt(line));
            else if (line.charAt(0).equals('R'))
                rotations.add(true, Integer.parseInt(line));

            System.println(rotations;);
        }
    }
}