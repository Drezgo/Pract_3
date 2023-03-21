public class Main {
    public static void main(String[] args) {

        //завдання 1
        int a, b;
        a = 650;
        b = 510;
        for ( ; a>=b; b += 10) System.out.print(b+" ");
        System.out.println();

        b = 500;
        while(a > b) {
            b += 10;
            System.out.print(b+" ");
        }
        System.out.println();

        b = 500;
        do {
            b += 10;
            System.out.print(b+" ");
        } while (a > b);
        System.out.println();


        //завдання 2
        a = 2;
        while (a<5000) {
            System.out.print(a + " ");
            a=2*a-1;
        }
        System.out.println();

        /*a=2;
        do {
            System.out.print(a + " ");
            a=2*a-1;
        } while (a<5000);*/


        //завдання 3
        a = 0;
        b = 10;
        while (a++ <= b) {
            if (b % a == 0) System.out.print(a + " ");
        }
        System.out.println();


        //завдання 4
        int n = 10;
        int r = 1;
        for (int i = 1; i<=n; i++) r*=i;
        System.out.println(n+"!="+r);

        int i = 1;
        r = 1;
        while (i<=n) {
            r*=i;
            i++;
        } System.out.println(n+"!="+r);


        //завдання 5
        int c = 0;
        for (int h = 0; h < 24; h++) {
            for (int m = 0; m < 60; m++) {
                int h1 = h / 10;
                int h2 = h % 10;
                int m1 = m / 10;
                int m2 = m % 10;

                if (h1 == m2 && h2 == m1) {
                    //System.out.println(h1+""+h2+":"+m1+""+m2);
                    c++;
                }
            }
        }
        System.out.println("Кількість симетричних комбінацій: " + c);






        //завдання 6
        n = 1;
        int l = 0;
        while (n<999999) {
            //int n1 = n / 1000;
            //System.out.println(n1);
            int n11 = n /100000;
            int n12 = n /10000 % 10;
            int n13 = n /1000 % 10;

            int n2 = n % 1000;
            //System.out.println(n2);
            int n21 = n2 /100;
            int n22 = n2 /10 % 10;
            int n23 = n2 % 10;
            if (n11+n12+n13 == n21+n22+n23){
                //System.out.println(n);
                l++;
            }
            n++;
        }
        System.out.println("Кількість чисел: "+l);





    }
}