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
            System.out.println("max: " + max);
            System.out.println("min: " + max);
       for (int i = min ; i<max;i++)
           if (!temp.contains(i)){
        System.out.println(("never saw temperature:" +i));
    }
        }

    }
    public static  String tally(<String> votes){
        HashSet<Integer> h = new HashSet<>();
for (String vote : votes){
    if (tallies.containsKey(vote)){
        tallies.put(vote,tallies.get(vote) +1);

    }
    else {
        tallise.put(vote,1);
            }
    int highestVotes = 0;
    string winner = "";
    for (String key: tallies.keyset()){
        if (tallies.get(key)>highestVotes){
            highestVotes = tallies.get(key);
            Winner = key;
        }

    }
}return Winner + "received the most votes!";
    }
}








