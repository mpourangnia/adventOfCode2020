import java.io.IOException;
import java.util.List;

public class Day1 {

    public static void main(String[] args) throws IOException {

        List<Integer> numbers = Util.readFileInt();
        numbers.forEach(System.out::println);
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 1 ; j < numbers.size(); j++) {
                for (int k = 2 ; k < numbers.size(); k++) {
                    if (numbers.get(i) + numbers.get(j) + numbers.get(k) == 2020) {
                        System.out.println(numbers.get(i) * numbers.get(j) * numbers.get(k));
                    }
                }

             }
        }
    }
}
