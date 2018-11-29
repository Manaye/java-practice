import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
public class linter {

    public static void main(String[] args) {
        System.out.println(getMaxValue(new int[]{1, 2, 3, 4}));
        System.out.println(getMinValue(new int[]{1, 2, 3, 4}));
        iterateArrayofArray();
    }

    public static int getMaxValue(int[] array) {
//             int maxValue = array[0];
//             for (int i = 1; i < array.length; i++) {
//                 if (array[i] > maxValue) {
//                     maxValue = array[i];
//                 }
//             }
//             return maxValue;
        Arrays.sort(array);

        int max = array[array.length - 1];
        return max;
    }


    // getting the miniumum value
    public static int getMinValue(int[] array) {
//             int minValue = array[0];
//             for (int i = 1; i < array.length; i++) {
//                 if (array[i] < minValue) {
//                     minValue = array[i];
//                 }
//             }
//             return minValue;S
        Arrays.sort(array);

        int min = array[0];
        System.out.println(min);

        return min;

    }



    public static void iterateArrayofArray() {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        HashSet<Integer> h = new HashSet<>();
        for (int i = 0; i < weeklyMonthTemperatures.length; i++) {
            for (int j = 0; j < weeklyMonthTemperatures[i].length; j++) {
                System.out.println(weeklyMonthTemperatures[i][j]);
          h.add(weeklyMonthTemperatures[i][j]);



            }
        Iterator<String> i = h.iterator();
        while (i.hasNext())
            System.out.println(i.next());
        }
    }
}








