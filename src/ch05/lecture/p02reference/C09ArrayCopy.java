package ch05.lecture.p02reference;

import java.util.Arrays;

public class C09ArrayCopy {
    public static void main(String[] args) {
        int[] a = {6, 7, 8};
        int[] b = a;

        System.out.println(Arrays.toString(a)); // Array.toString() , 배열의 내용을 문자열로 출력
        System.out.println(Arrays.toString(b));

        b[0] = 99;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }
}