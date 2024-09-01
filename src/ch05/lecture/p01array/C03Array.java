package ch05.lecture.p01array;

public class C03Array {
    public static void main(String[] args) {
        int[] a;
        double[] b;
        char[] c;
        String[] d;

        a = new int[3]; //길이 3
        b = new double[2]; // 길이 2
        c = new char[4]; // 길이4
        d = new String[3]; // 길이3

        a[0] =3213;
        a[1] = 43;
        a[2] = 100; //마지막 저장공간의 번호는 (길이 -1)
        b[1] = 3.14;
        c[3] = '한'; // str
        d[2] = "jav"; //string

        System.out.println("a[2] =" + a[2]);
        System.out.println("b[1] =" + b[1]);
        System.out.println("c[3] =" + c[3]);
        System.out.println("d[4] =" + d[2]);




     }
}
