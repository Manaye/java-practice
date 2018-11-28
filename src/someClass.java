public class someClass {
    public static void main(String[] args) {
        shiftArr([2,3,5,6],4)
    }
    //[2,3,5,6], 4

    public static int[] shiftArr(int arr[], int n){
        int temp[]  = new int[arr.length+1];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>n){
                temp[i] = n;
            }
            else{
                temp[i] = arr[i];


            }
        }
        return temp;
    }
}
