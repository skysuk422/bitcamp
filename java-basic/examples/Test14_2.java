package bitcamp.java100;
  
public class Test14_2 {    
    
    public static void main(String[] args) {
    // 도서명, 저자, 출판사, 페이지, 가격($)
    class book{
        String bookname;
        String author;
        String publisher;
        int page;
        int price;
       

    }
    
        book b1;

        b1 = new book();

        b1.bookname = "작은별";
        b1.author = "심현석";
        b1.publisher = "임광출판";
        b1.page = 200;
        b1.price = 50;
        System.out.printf("%s\n %s\n %s\n %d\n %d\n",
        b1.bookname, b1.author, b1.publisher, b1.page, b1.price);

    }
}

    



