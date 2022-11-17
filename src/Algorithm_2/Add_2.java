package Algorithm_2;

import java.util.Set;
import java.util.TreeSet;

public class Add_2 {
    public static void main(String[] args) {
        int numbers[] = {5,0,2,7};
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        System.out.println(set);
    }
}
