public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={1,5,6,8,4,7,33,22};
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length-1 ;j >i ; j--) {
                if (arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;}
            }
        }
        for (int e:arr
             ) {
            System.out.print(e+"-");
        }
    }
}
