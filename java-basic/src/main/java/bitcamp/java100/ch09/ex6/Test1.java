package bitcamp.java100.ch09.ex6;

public class Test1 {
   
      
    public static void main(String[] args) {
        
        Stack contacts = new Stack();
        contacts.push(new Contact("홍길동", "hong@test.com", "1111-1111"));
        contacts.push(new Contact("임꺽정", "leem@test.com", "1111-1112"));
        contacts.push(new Contact("유관순", "yoo@test.com", "1111-1113"));


        //contacts.push(new String ("안중근"));
        //contacts.push(new Boolean(true));
        
        Contact c = (Contact)contacts.pop();
        
        BookStack bookStack = new BookStack();
        bookStack.push(new Book());
        bookStack.push(new Book());
        
        //bookStack.push(new String()); //컴파일오류
        //bookStack.push(new Integer(20)); //컴파일오류
        
        Book b1 = bookStack.pop();
        Book b2 = bookStack.pop();
        
        //예2) ScoreStack
        ContactStack contactStack = new ContactStack();
        contactStack.push(new Contact());
        contactStack.push(new Contact());
        contactStack.push(new Contact());
        
        Contact c1 = contactStack.pop();
        Contact c2 = contactStack.pop();
        
        //예3) ScoreStack
        ScoreStack scoreStack = new ScoreStack();
        
        scoreStack.push(new Score());
        scoreStack.push(new Score());
        scoreStack.push(new Score());
        
        Score s1 = scoreStack.pop();
        Score s2 = scoreStack.pop();
        
        
    }
    }

