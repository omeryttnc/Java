package techproed2020.day44lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class try02 {
    public static void main(String[] args) throws IOException {
        Files.lines(Paths.get("src\\techproed2020\\day44lambda\\scratch.txt"))
                .map(t -> t.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .filter(t -> t.contains("e"))

                .forEach(System.out::println);

    }
}
