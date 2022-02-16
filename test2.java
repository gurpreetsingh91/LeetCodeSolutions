package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class test2 {
    public static void main(String[] args) {
        //System.out.println(PerpetualUnit.SOFTWARE.toString());
        IntStream
                .range(1,10)
                .skip(5)
                .forEach(x -> System.out.println(x));


        System.out.println("//3. Integer Stream with sum");
        System.out.println(
                IntStream
                .range(1,5)
                .sum());

        System.out.println("====== 4. Stream.of, sorted and findFirst =====");
        Stream.of("Ava", "Aneri", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);


        System.out.println("====== 5. Stream from Array, sort, filter and print");
        String[] names = {"Gurpreet", "Simran", "Sonam", "Ashish", "Aman"};
        Arrays.stream(names)
                .filter(x -> x.startsWith("S"))
                .sorted()
                .forEach(System.out::println);


        System.out.println("====== 6. Average of squares of an int array====");
        Arrays.stream(new int[] {2, 4, 6, 8, 10})
                .map(x -> x *x)
                .average()
                .ifPresent(System.out::println);


        System.out.println("====== Testing my examples====");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        int sum = list.stream()
                .mapToInt(x -> x)
                .sum();
        System.out.println(sum);



    }


}
