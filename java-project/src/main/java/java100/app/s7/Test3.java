package java100.app.s7;

public class Test3 {
    public static void main(String[] args) {

        String[] names = {"홍길동", "임꺽정", "유관순"};
        int[] kor = {100, 80, 100};
        int[] eng = {90, 80, 100};
        int[] math = {80, 80, 100};

        for(int i =0; i < names.length; i++) {
            int sum = kor[i] + eng[i] + math[i];
            float aver = sum / 3f;

            System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
                    names[i], kor[i], eng[i], math[i], sum, aver);
        }
    }
}

