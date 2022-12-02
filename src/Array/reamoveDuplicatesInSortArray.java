package Array;

public class reamoveDuplicatesInSortArray {
    public static void main(String[] args) {
//       // create a new array for storing new values
//        int[] arr = {1,2,2,3,4,5,5,5,6,6,7,8};
//        int[] temp = new int[arr.length];
//        int j=0;
//
//        for(int i=0; i<(arr.length-1); i++){
//              if(arr[i] != arr[i+1]) {
//                  temp[j] = arr[i];
//                  j++;
//              }
//        }
//        temp[j] = arr[arr.length-1];
//
//        for(int i=0; i<temp.length; i++){
//            System.out.print(temp[i] + " ");
//        }


        // remove duplicate value in same array
        int[] arr = {1,2,2,3,4,5,5,5,6,6,7,8};
        int j=0;

        for(int i=0; i<(arr.length-1); i++){
            if(arr[i] != arr[i+1]) {
                arr[j] = arr[i];
                j++;
            }
        }
        arr[j] = arr[arr.length-1];

////        in this array you will find whole array with repeated value
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }


        for(int i=0; i<=j; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
