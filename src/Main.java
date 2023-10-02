import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> intListSecond = new ArrayList<>();
        for (int e : intList) {
            if (e > 0 && e % 2 == 0) {
                intListSecond.add(e);
            }
        }
        intListSecond.sort(Comparator.naturalOrder());
        System.out.println(intListSecond);

        StreamMain streamList = new StreamMain();
        streamList.main();
        }
}



