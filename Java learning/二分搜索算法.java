/*二分搜索算法.非递归算法实现*/
public class Binary_Search{
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 7, 8, 10, 11, 13, 15};
        System.out.println(Search(arr,11));
    }
    public static int Search(int[]arr,int target) {
        int left = 0,right = arr.length - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if (arr[mid] < target)
                left = mid + 1;
            else if(arr[mid] > target)
                right = mid - 1;
            else
                return mid;
        }
        return -1;
    }
}
——————————————————————————————————————————————————————————————————
/*二分搜索算法.递归算法实现*/
public class Binary_Search{
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 7, 8, 10, 11, 13, 15};
        System.out.println(Search(3,arr,0, arr.length - 1));
    }
    public static int Search(int target,int[]arr,int left,int right) {
        int mid = (left + right)/2;
        if (target == arr[mid]) {
            return mid;
        } else if (target < arr[mid]) {
            return Search(target,arr,left,mid - 1);
        } else if (target > arr[mid]) {
            return Search(target,arr,mid + 1,right);
        }
        return -1;
    }
}
