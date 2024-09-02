package ch05.lecture.p02reference;

public class C11MatrixCopy {
    public static void main(String[] args) {
        int[][] m1 = {
                {30, 40},
                {22, 11}
        };

        System.out.println(m1[0][0]);

        int[][] m2 = new int[m1.length][];

        for (int i = 0; i < m1.length; i++) {
            m2[i] = m1[i]; // 일차원이랑 다르게 행을 상징
        }

        m2[0][0] = 90;

        System.out.println(m1[0][0]); // 30?, 90?
    }
}