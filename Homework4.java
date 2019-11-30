（1）程序代码：
class Book {
    private String bookid;
    private String bookname;
    protected int pages;//包内，子类可以访问

    public Book(String bookid, String bookname, int pages) {
        this.bookid = bookid;//调用同一个类的构造方法
        this.bookname = bookname;//调用同一个类的构造方法
        this.pages = pages;//调用同一个类的构造方法
    }

    public String getBookid() {
        return bookid;//调用同一个类的构造方法
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;//调用同一个类的构造方法
    }

    public String getBookname() {
        return bookname;//调用同一个类的构造方法
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;//调用同一个类的构造方法
    }

    public int getPages() {//访问pages
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
public class Dictionary extends Book {//继承出来的子类
    private int pingyinPages;

    public Dictionary(String bookid, String bookname, int pages,int pingyinPages) {
        super(bookid, bookname, pages);//supre调用父类
        this.pingyinPages = pingyinPages;//调用同一个类的构造方法
    }

    public int getPingyinPages() {
        return pingyinPages;
    }

    public void setPingyinPages(int pingyinPages) {
        this.pingyinPages = pingyinPages;//调用同一个类的构造方法
    }
}
public class Bookmanager {
    public static void main(String[] args){
        Dictionary dictionary = new Dictionary("INB001","free",90,3);//向上类型转换
        System.out.println(dictionary.getPingyinPages());
        System.out.println(dictionary.getBookid());
        System.out.println(dictionary.getBookname());
    }
}

（2）程序代码：
package com.google.shape;

//图形抽象
abstract class Shape {
    abstract void draw();
    abstract void erase();
}

public class Circle extends Shape {
    void draw() {
        System.out.println("Circle.draw()");
    }
    void erase() {
        System.out.println("Circle.erase()");
    }
}
public class Square extends Shape {
    void draw() {
        System.out.println("Square.draw()");
    }
    void erase() {
        System.out.println("Square.erase()");
    }
}
public class Triangle extends Shape {
    void draw() {
        System.out.println("Triangle.draw()");
    }
    void erase() {
        System.out.println("Triangle.erase()");
    }
}
public class Shape2 {
    public static void randShape() {
        //抽象类不能生成实例
        switch ((int)(Math.random()*3)) {
            //选择0抽象圆形
            case 0:
                Circle circle = new Circle();
                circle.draw();
                circle.erase();
                break;
            //选择1抽象正方形
                case 1:
                Square square = new Square();
                square.draw();
                square.erase();
                break;
            //选择2抽象三角形
                case 2:
                Triangle triangle = new Triangle();
                triangle.draw();
                triangle.erase();
                break;
        }
    }
    public static void main(String[] args) {
        randShape();
    }
}
