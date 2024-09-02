package ch05.lecture.p01array;

public class p01Practice {
    public static void main(String[] args) {
        int[] a = new int[3];
        System.out.println(a); // 배열의 클래스 이름과 해시코드를 포함한 문자열
        System.out.println(a.length);

        int[] b;
        b = new int[] {0, 1, 2};
        System.out.println(b.length);


        int[] c = {1,2,3};
        System.out.println(c.length);

        int[] d = new int[3];
        d[0] = 12;
        d[1] = 15;
        d[2] = 100;
        System.out.println(d.length);
//1행 배열일떄는 번호
        for(int i = 0; i < d.length; i++){
            System.out.println("d =" + d[i]);
        }

        for(int j : d){
            System.out.println("d :" + j);
        }



//int[] g = new int[];
//        int[] g;
//        g = new int[3];

//        int[] g = {1,2,3};
//     int[] g = new int[]{1,2,3};
    }
}
