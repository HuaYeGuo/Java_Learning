package BMS;

import java.io.*;

public class Book implements Serializable {
        private  String  title;
        private  String author;
        private  double price;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Book(String title, String author, double price){
            this.title = title;
            this.author = author;
            this.price = price;
        }
    @Override
        public String toString() {
            return "标题："+"《"+title+"》"+
                    "作者："+author+" "+
                    "价格："+price;
        }
}
