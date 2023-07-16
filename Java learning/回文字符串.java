import java.util.Scanner;
class Palindromic_String{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段字符串：");
        String str1 = sc.nextLine();
        if(!solution(str1)){
            System.out.println("输入的不是回文字符串!");
        }else{
            System.out.println("输入的是回文字符串!");
        }
    }
    public static boolean solution(String str){
        char[] chars = str.toCharArray();
        int c1 = 0;int c2 = chars.length - 1;
        while (c1 < c2){
            if(chars[c1] != chars[c2]){
                return false;
            }
            c1++;c2--;
        }
        return true;
    }
}
——————————————————————————————————————————————————————————————
import java.util.Scanner;
class Palindromic_String{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一段字符串：");
        String str1 = sc.nextLine();
        if(!solution(str1)){
            System.out.println("输入的不是回文字符串!");
        }else{
            System.out.println("输入的是回文字符串!");
        }
    }
    public static boolean solution(String str){
        StringBuilder str1=new StringBuilder(str);
        //反转
        String str2 = str1.reverse().toString();
        return str.equals(str2);
        /*
        if(str.equals(str2))
            return true;
        else
            return false;
         **/
    }
}
