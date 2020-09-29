package Homework_23_Sep_2020;

import lombok.SneakyThrows;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {

        // List top 5 common words in Phil Collins In The Air Tonight
        Files.lines(Paths.get("c:\\aaa", "\\Phi_Collins_ln_The_Air_Tonight.txt"))
                .flatMap(Pattern.compile("\\W+")::splitAsStream)
                .filter(s -> s.length() >= 2)
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(a->a, Collectors.summingInt(a->1)))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(5)
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

        System.out.println("===================================");

        // For each Age list Customers names
        Stream<Customer> stream = Stream.of(
                Customer.builder().first_Name("Moshe").last_Name("Cohen").age(30).build(),
                Customer.builder().first_Name("Boris").last_Name("Tupkin").age(40).build(),
                Customer.builder().first_Name("Eli").last_Name("Baruch").age(50).build(),
                Customer.builder().first_Name("Dudu").last_Name("Dankner").age(40).build(),
                Customer.builder().first_Name("Ronen").last_Name("Efrati").age(50).build());


        stream.map(customer -> new AbstractMap.SimpleEntry<>(customer.getAge(), customer.getFirst_Name() + " " + customer.getLast_Name()))
                .collect(Collectors.groupingBy(AbstractMap.SimpleEntry::getKey))
                .forEach((age, firstLast) -> System.out.println(age + "=" + firstLast));

    }

}
