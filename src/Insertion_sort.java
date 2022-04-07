public class Insertion_sort {
    public static void main(String[] args) {
        int[] array={2222,9,11,3,1};
        int x, pos;
        for (int i = 1; i < array.length ; i++) {
            x=array[i];
            pos=i;
            while (pos>0&&x<array[pos-1]){
                array[pos]=array[pos-1];
                pos--;
            }
            array[pos]=x;
        }
        for (int e: array
             ) {
            System.out.print(e+"-");
        }
    }
}
