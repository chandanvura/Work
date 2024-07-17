public class colNoFixed {
    public static void main(String[] args) {

        int[][] arr= {

                {1,2,3},   //0 th index
                {4,5},   //1 st index
                {7,8,9}     //2nd index -> arr2D[2] ={7,8,9]
        };

        for(int i =0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
