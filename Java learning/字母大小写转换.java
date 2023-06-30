/*字符字母转换*/
import java.util.Scanner;
public class Change {
    public static void main(String[] args) {
        System.out.println("请输入一个字母：");
        Scanner sc = new Scanner(System.in);
        char Letter= sc.next().charAt(0);
        if(Letter>='a'&&Letter<='z'){
            System.out.println("转换为大写字母为："+(char)(Letter-32));
        }
        if(Letter>='A'&&Letter<='Z'){
            System.out.println("转换为小写字母为："+(char)(Letter+32));
        }
    }
}
————————————————————————————————————————————————————————————————————————————————————————————————
/*字符串字母转换*/
import java.util.Scanner;
public class Change {
    public static void main(String[] args) {
        System.out.println("请输入一句英文："); 
        Scanner sc = new Scanner(System.in);
        String Letter= sc.nextLine();
        System.out.println("转换为大写形式为："+Letter.toUpperCase());//字符串字母大写转换
        System.out.println("转换为小写形式为："+Letter.toLowerCase());//字符串字母小写转换
    }
}
—————————————————————————————————————————————————————————————————————————————————————————————————
/*字符串中实现所有字母大小转换*/
import java.util.Scanner;
public class Change {
    public static void main(String[] args) {
        System.out.println("请输入一句英文：");
        Scanner sc = new Scanner(System.in);
        String Letter = sc.nextLine();
        System.out.println("转换后的句子为："+changestr(Letter));
    }

    public static String changestr(String str) {
        char[] c = str.toCharArray();//toCharArray将字符串转换为字符数组
        for (int i = 0; i < str.length(); i++) {
            if (c[i] >= 'a' && c[i] <= 'z') {
                c[i] = (char) (c[i] - 32);
            } else if (c[i] >= 'A' && c[i] <= 'Z') {
                c[i] = (char) (c[i] + 32);
            }
        }
        String last_str = new String(c);//将字符数组转换为字符串
        return last_str;
    }
}
