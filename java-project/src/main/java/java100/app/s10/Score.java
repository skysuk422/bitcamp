package java100.app.s10;

public class Score {

    String name;
    int[] subjects = new int[3];
    int sum;
    float aver;

    Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.subjects = new int[] {kor, eng, math};

        this.compute();
    }

    void compute (){
        for (int sub : subjects) {
            sum += sub;
        }
        aver = sum / 3f;
    }

    void print () {
        System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
                name,
                subjects[0],
                subjects[1],
                subjects[2],
                sum,
                aver);

    }


}


