import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Util {

    static List<String> readFileString() throws IOException {
       return Files.lines(Paths.get("/home/marflo/Documents/day1.txt"))
           .collect(Collectors.toList());
    }

    static List<Integer> readFileInt() throws IOException {
        File file = new File("/home/marflo/Documents/day1.txt");
        List<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextInt())
        {
            numbers.add(scanner.nextInt());
        }
        return numbers;
    }




    static List<Integer> convertStringToInt(List<String> stringList) {
        return stringList.stream().map(Integer::valueOf).collect(Collectors.toList());
    }



}
