import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class Main {
    //private static Comparator< List<Integer>, List<Integer>> minMaxConsumer;

    public static void main(String[] args) {

        List<Integer>list=new ArrayList<>();
        for (Integer i = 1; i < 5; i++) {
            list.add(i);
        }

        //Задание 1


        System.out.println(list.stream().max(Comparator.naturalOrder()).get());
        System.out.println(list.stream().min(Comparator.naturalOrder()).get());


        //Задание2

        list.stream().filter(integer -> integer % 2 == 0).forEach(System.out::println);
        list.stream().filter(integer -> integer % 2 == 0).count();
    }
}