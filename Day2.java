import java.io.IOException;
import java.util.List;

public class Day2 {

    public static void main(String[] args) throws IOException {

        List<String> rows = Util.readFileString("/home/marflo/Documents/day2.txt");
        long antal = rows.stream().filter(row -> getLowerLimit(row) <= (countOccurance(getPassword(row), getTheLetter(row))))
            .filter(row -> countOccurance(getPassword(row), getTheLetter(row)) <= getUpperLimit(row))
            .count();
        System.out.println(antal);

    }

    static int getLowerLimit(String line) {
        return Integer.valueOf(line.substring(0, line.indexOf("-")));
    }

    static int getUpperLimit(String line) {
        return Integer.valueOf(line.substring(line.indexOf("-") + 1, line.indexOf(" ")));
    }

    static String getTheLetter(String line) {
        return line.substring(line.indexOf(":") -1 ,  line.indexOf(":"));
    }

    static String getPassword(String line) {
        return line.substring(line.indexOf(":") + 1).strip();
    }

    static int countOccurance(String line, String letter) {
        int counter = 0;
        for (int i = 0 ; i < line.length(); i++) {
            if (letter.equals(line.substring(i, i +1))) {
                counter++;
            }
        }
        return counter;
    }
}
