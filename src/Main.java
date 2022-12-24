import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    //private static Comparator< List<Integer>, List<Integer>> minMaxConsumer;

    public static void main(String[] args) {

//        List<Integer>list=new ArrayList<>();
//     for (Integer i = 1; i < 5; i++) {
//           list.add(i);
//       }

        //
//        list.filter(integer -> integer % 2 == 0).forEach(System.out::println);
//        list.filter(integer -> integer % 2 == 0).count();

//        System.out.println(IntStream.range(1,5).max(Comparator.naturalOrder()).get());
//        System.out.println(IntStream.range(1,5).min(Comparator.naturalOrder()).get());


        //Задание 1


        System.out.println(IntStream.range(1, 5).max().getAsInt());
        System.out.println(IntStream.range(1, 5).min().getAsInt());
        //Задание2

        IntStream.range(1, 5).filter(integer -> integer % 2 == 0).forEach(System.out::println);
        IntStream.range(1,5).filter(integer -> integer % 2 == 0).count();

    }
}