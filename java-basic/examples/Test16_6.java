package bitcamp.java100;
// 반복문 for
public class Test16_6 {    

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++)
            System.out.print(i);

        System.out.println("-----------------");

        for (int i = 0, j = 0; i < 5; i ++, j +=2)
            System.out.printf("%d, %d\n", i, j);

        System.out.println("------------------");

        int sum = 0;
        for (int i = 1; i <= 10; i++)
            sum += i;
        System.out.println(sum);
        //System.out.println(i); // 컴파일오류

        System.out.println("-----------------------");

        for ( int i = 1; i <= 10; i++) {
            System.out.print("=>");
            System.out.println(i);
        }


        System.out.println("-----------------------");


        for ( int i = 1; i <= 10; i++) {
            if ( i == 5 )
                break;
            System.out.println(i);
        }

        System.out.println("-----------------------");


        for ( int i = 1; i <= 10; i++) {
            if ( i == 5 )
                continue;
            System.out.println(i);
        }

        System.out.println("-----------------------");

        int i = 0;
        for (; i < 5; i++)
            System.out.println(i);
        System.out.println(i);

        System.out.println("-----------------------");

        i = 0;
        for (; i < 5; ) {
            System.out.println(i);
            i++;
        }

        System.out.println("-----------------------");

        i = 0;
        for (;; ) {
            System.out.println(i);
            i++;
            if (i ==5)
                break;
        }

        System.out.println("-----------------------");

        String[] names = {"홍길동", "임꺽정", "유관순", "안중근", "윤봉길"};
        for (int index = 0; index < names. length; index++) {
            System.out.println(names[index]);
        }
        System.out.println("-------------------------");

        for (int a = 1; a < 5; a++) {
            for (int b = 0; b < a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-----------------");

        label1:
            for (int a = 1; a < 5; a++) {
                for (int b = 0; b < a; b++) {
                    System.out.print("*");
                    if ( b == 2)
                        break label1;
                }
                System.out.println();
            }
        System.out.println("------------------");
        
        // for 문만을 이용하여 구구단을 출력하라!
        
        ;
        for (i=1; i<=9; i++) {
            for (int j=2; j<=9; j++) {
                System.out.printf("%d x %d=%d\n",i ,j, i*j);
            }
        }
        
        System.out.println("----------------------");
        
        //주어진 숫자를 거꾸로 한개씩 출력하라
        // 주어진 숫자 : 98761234
        int v = 98761234;
                for(; v > 0; v /=10) {
        System.out.printf("%d", v % 10);
    }
                System.out.println();
}
}



