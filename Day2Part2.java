import java.io.IOException;
import java.util.List;

public class Day2Part2 {

    public static void main(String[] args) throws IOException {
        List<String> rows = Util.readFileString("/home/marflo/Documents/day2.txt");
        long antal = rows.stream()
            .filter(row ->
                matchesOnlyOne(
                matches(Day2.getPassword(row), Day2.getLowerLimit(row), Day2.getTheLetter(row)), matches(Day2.getPassword(row),
                        Day2.getUpperLimit(row), Day2.getTheLetter(row))))
            .count();

        System.out.println("antal: " + antal);
    }

    static boolean matches(String password, int lower, String letter) {
        return password.substring(lower - 1, lower).equals(letter);
    }
    static boolean matchesOnlyOne(boolean first, boolean second) {
        return first ^ second;
    }
}
