import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //взимаме лист и връщаме индексът на най-малкия елемент
        List<Integer>numbers= Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        Consumer<List<Integer>> findIndexOfMinElement= list-> System.out.println(list.lastIndexOf(Collections.min(list)));
        findIndexOfMinElement.accept(numbers);

    }
}
