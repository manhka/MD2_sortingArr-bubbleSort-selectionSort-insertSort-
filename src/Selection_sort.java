public class Selection_sort {
    public static void main(String[] args) {
        int count=0;
        int[] arr={2,3,11,1,-5,0,-22,-88};
        int min;
        for (int i = 0; i < arr.length; i++) {
            count++;
            min=i;
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            if (min!=i){
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
            System.out.print("count "+count+" :");
            for (int e:arr
            ) {
                System.out.print(e+" ");
            }
            System.out.println();

        }
// after sorting all the elelment
//        for (int e:arr
//             ) {
//            System.out.print(e+" ");
//        }
    }
}
