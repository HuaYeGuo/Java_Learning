package BMS;

import java.io.*;
import java.util.*;

public class Main {
    private static List<Book> LIST ;

    public static void main(String[] args) {
        System.out.println("正在初始化...");
        load();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("------图书管理系统------");
            System.out.println("1. 录入书籍信息");
            System.out.println("2. 查阅书籍信息");
            System.out.println("3. 删除书籍信息");
            System.out.println("4. 修改书籍信息");
            System.out.println("5. 退出系统");
            System.out.println("----------------------");
            switch (scanner.nextInt()){
                case 1:
                    insert(scanner);
                    break;
                case 2:
                    list();
                    break;
                case 3:
                    delete(scanner);
                    break;
                case 4:
                    modify(scanner);
                    break;
                case 5:
                    System.out.println("正在保存图书数据...");
                    save();
                    System.out.println("感谢使用图书管理系统，再见！");
                    System.exit(0);//类似于break
            }
        }
    }
    private static void save(){
        try(ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream("data"))) {
            stream.writeObject(LIST);
            stream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void load(){
        File file = new File("data");
            if(file.exists()){
                try(ObjectInputStream stream = new ObjectInputStream(new FileInputStream(file))) {
                    LIST = (List<Book>) stream.readObject();

                }  catch (IOException | ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }else{
                LIST = new LinkedList<>();
            }
        }
    private static void insert(Scanner scanner){
        scanner.nextLine();
        System.out.print("请输入添加图书标题:");
        String title = scanner.nextLine();
        System.out.print("请输入添加图书作者:");
        String author = scanner.nextLine();
        System.out.print("请输入添加图书价格:");
        double price = scanner.nextDouble();
        scanner.nextLine();
        Book book = new Book(title,author,price);
        LIST.add(book);
        System.out.println("书籍添加成功！");
        System.out.println(book);
    }
    private static void list() {
        for (Book book : LIST) {
            System.out.println(book);
        }
    }
    private static void delete(Scanner scanner){
        scanner.nextLine();
        System.out.print("请输入删除的书籍编号：");
        int index = scanner.nextInt();
        scanner.nextLine();
        if(index < 0||index > LIST.size()-1){
            System.out.println("没有对应书籍，请重新输入：");
            index = scanner.nextInt();
            scanner.nextLine();
        }
        LIST.remove(index);
        System.out.println("删除数据成功！");
    }
    private static void modify(Scanner scanner){
        System.out.print("请输入修改的书籍编号：");
        int index = scanner.nextInt();
        scanner.nextLine();
        if(index < 0||index > LIST.size()-1){
            System.out.println("没有对应书籍，请重新输入：");
            index = scanner.nextInt();
            scanner.nextLine();
        }
        Book book = LIST.get(index);
        System.out.println("修改书籍标题为：");
        book.setTitle(scanner.nextLine());
        System.out.println("修改书籍作者为：");
        book.setAuthor(scanner.nextLine());
        System.out.println("修改书籍价格为：");
        book.setPrice(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("书籍修改成功！");
    }
}
