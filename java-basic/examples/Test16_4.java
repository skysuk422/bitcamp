package bitcamp.java100;
// 문장 - 반복문 while
public class Test16_4 {    

    public static void main(String[] args) {

        int i = 0;
        while (i < 5)
            System.out.println(i++);

        System.out.println("--------------------");

        i = 0;
        while (i <5) {
            System.out.print("=> ");
            System.out.println(i);
            i++;
        }
        System.out.println("------------------");

        i = 1;
        while (i <= 5) {
            System.out.println(i);
            i++;
        }

        System.out.println("---------------");

        i = 1;
        while (i <= 5) {
            int count = 1;
            while (count <= i) {
                System.out.print("*");
                count++;
            }
            System.out.println();
            i++;
        }

        System.out.println("-------------------");

        i = 1;
        while (i <= 5) {
            int count = 5 - i;
            while (count > 0) {
                System.out.print(" ");
                count--;
            }
            count = 1;
            while (count <= i) {

                System.out.print("*");
                count++;
            }
            System.out.println();
            i++;
        }

        System.out.println("----------------");

        i = 1;
        while (i <= 5) {
            int count = (5 - i) /2 ;
            while (count > 0) {
                System.out.print(" ");
                count--;
            }
            count = 1;
            while (count <= i) {

                System.out.print("*");
                count++;
            }
            System.out.println();
            i += 2;
        }
        System.out.println("---------------");

        i = 5;
        while (i <= 0) {
            int count = 5 - i;

            while (count > 0) {
                System.out.print(" ");
                count--;
            }
            count = 1;
            while (count <= i) {
                System.out.print("*");
                count++;
            }
            System.out.println();
            i -= 2;;
        }

        System.out.println("---------------------");

        i = 0;
        while (i < 5) {
            if ( i == 3) {
                break;
            }
            System.out.println(i);
            i++;
        }

        System.out.println("---------------------");

        i = 0;
        while (i < 5) {
            if ( i == 3) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }

        System.out.println("---------------");

        i = 1;
        label1: {
            while (i <= 10) {
                int count = 1;
                while (count <= i) {
                    System.out.print("*");
                    if (count ==5) {
                        break label1;
                    }
                    count++;
                }
                System.out.println();
                i++;
            }
        }
        System.out.println();
        System.out.println("-------------------");

        i = 1;
        label1: 
            while (i <= 10) {
                int count = 1;
                while (count <= i) {
                    System.out.print("*");
                    if (count ==5) {
                        break label1;
                    }
                    count++;
                }
                System.out.println();
                i++;
            }

        System.out.println();

        // 2단에서 9단까지 구구단을 출력하라

        for ( i = 2; i <= 9; i++) {
            for(int  j=1; j <= 9; j++) {
                System.out.printf("%d * %d = %d\n",  i,  j, i * j);
            }
            System.out.println();
            
            
            System.out.println("-------------------");
        }
        // 주어진 숫자를 뒤에서부터 한 개씩 출력하라
        //예) 출력 > 1 2 3 4 5 6 7 8 9
        i = 987654321;
        while (i > 0) {
            System.out.printf("%d" ,i % 10);
            i /= 10;
        }
        System.out.println();
        
        
        System.out.println("-------------------");

        // 주어진 숫자에서 1에서 9까지 등장하는 숫자의 개수를 세어라!

        i = 4885323;
        int[] cnt = new int[10];
        
        while (i > 0) {
            cnt[i % 10]++;
            i /= 10;
        }
        int x = 0;
        while (x < cnt.length) {
            System.out.printf("%d = %d\n", x, cnt[x]);
            x++;
        }


    }
}



