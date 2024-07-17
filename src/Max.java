public class Max {
    public static void main(String[] args) {
        int[]  arr = {1,2,3,4,5};
        System.out.println(maxRange(arr ,1 ,4));
    }
//    static  int max(int[] arr){
 //   if(arr.length ==0){
 //       return -1;
 //  }
//        int maxVa = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            if(arr[i]>maxVa){
//                maxVa =arr[i];
//            }
//
//        }
//
//        return  maxVa;




        static  int maxRange(int[] arr , int start, int end){

            // work on edge caes be here , like array being null

            if(end>start){
                return  -1;
            }

        if(arr == null){
            return  -1;
        }

            int maxVa = arr[start];
            for (int i = start; i < end; i++) {
                if(arr[i]>maxVa){
                    maxVa =arr[i];
                }

            }

            return  maxVa;
    }
}
