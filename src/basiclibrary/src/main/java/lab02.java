public class lab02 {

    public static void main(String[] args) {
        // test for roll dice
        long[] dice_results = roll(6);
        for (int j = 0; j< dice_results.length; j++) {
            System.out.print(dice_results[j]);
        }


        // test for check duplicate
        int[] array = {1, 4, 7 , 9, 8};
        boolean duplicate_exists = containsDuplicates(array);
        System.out.println(duplicate_exists);

        // test for lowest average of array of arrays
        float[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        float lowestAverage = lowestAverageArrayOfArrays(weeklyMonthTemperatures);
        System.out.println(lowestAverage);
    }

    public static long[] roll (int n) {
        long[] results = new long[n];

        for(int i = 0; i < n ;i++) {
            double result = Math.random();
            long dice = Math.round (result* 6);
            results[i] = dice;
        }

        return  results;
    }


    public  static boolean containsDuplicates(int[] array) {

        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array [j]) {
                    return true;
                }
            }
        }

        return  false;
    }


    //calculate array average
    public  static float calculateArrayAverage(float arr[]){
        float sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum +=arr[i];
        }
        float avg =  sum/arr.length;
        return avg;
    }

    //calculate average of array of arrays
    public  static float lowestAverageArrayOfArrays(float arrOfArray[][]){

        float[] averages = new float[arrOfArray.length];
        for (int i =0; i < arrOfArray.length ; i++){
            averages[i] = calculateArrayAverage(arrOfArray[i]);
        }

        float minAverage = averages[0];
        for (int j = 0 ; j < averages.length ; j++) {

            if (minAverage > averages[j]) {
                minAverage = averages[j];
            }
        }
        return  minAverage;
    }

}


