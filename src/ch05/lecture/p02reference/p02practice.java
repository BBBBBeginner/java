package ch05.lecture.p02reference;

public class p02practice {
    public static void main(String[] args) {
        int[][] a = new int[2][2];
        System.out.println(a.length);

        for(int i=0; i < a.length; i++){
            System.out.println("a =" + a[i][i]);
        }

        int[][] b = {
            {1,2,3},{1,2,5}
        };

        int[][] c = new int[b.length][];

       for(int i = 0; i < b.length; i++){
           c[i]=b[i];
       }


        for(int i = 0; i < c.length; i++){
            System.out.println(c[i][i]);
        }
    }
}
