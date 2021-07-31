import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));
        for (Iterator<Integer> it = intList.iterator(); it.hasNext(); ) {
            int number = it.next();
            if (number <= 0 || number % 2 != 0) it.remove();
        }
        Collections.sort(intList);
        System.out.println(intList);


    }
}
