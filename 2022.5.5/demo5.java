import java.util.Arrays;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class demo5 {
    public static void main(String[] args) {
        String[] array = new String[] { " 2019-12-31 ", "2020 - 01-09 ", "2020- 05 - 01 ", "2022 - 02 - 01",
                " 2025-01 -01" };
        Arrays.stream(array)
                .map(s -> s.replaceAll("\\s+", ""))
                .map(LocalDate::parse)
                .forEach(System.out::println);
    }
}
