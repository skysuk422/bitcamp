package java100.app.s10;

public class Test10 {



    public static void main(String[] args) {

        Score[] scores = {

                new Score("홍길동", 100, 90, 80),
                new Score("임꺽정", 80, 80, 80),
                new Score("유관순", 100, 100, 100)

        };

        for (Score s : scores) {
            s.print();
        }


    }

}


