/*冒泡排序算法(BubbleSort)·*/
import java.util.Arrays;
public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 7, 2, 9, 0, 6, 1, 8, 4};
        for(int i = 0;i < arr.length;i++){
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr [j+1] = arr[j];
                    arr [j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
——————————————————————————————————————————————————————————————————————————————————————————————————
import java.util.Scanner;
public class Bubble_Sort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要输入的数字个数：");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("请输入第"+(i+1)+"个数字：");
            arr[i] = sc.nextInt();
        }

        for(int j=0;j<arr.length;j++){
            for(int k=j;k<arr.length;k++){
                int bigger = arr[j];
                if(arr[j]>arr[k]){
                    bigger = arr[j];
                    arr[j] = arr[k];
                    arr[k] = bigger;
                }
            }
        }
        System.out.println("您输入的数字从小到大的排序为:");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+"，");
    }
}
