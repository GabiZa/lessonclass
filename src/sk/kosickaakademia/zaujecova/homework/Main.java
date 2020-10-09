package sk.kosickaakademia.zaujecova.homework;

/*public class Main {
    public static void main(String[] args) {
//Vytvorit aplikaciu s vyuzitim cyklu while ktora spocita vsetky trojciferne cisla,
//ktore maju navzajom rozdielne vsetky tri cifry:102+103+ ........ 986 + 987 = ?
        int x = 100;
        int y = 0;

        while (x < 1000) {

            int i = x % 10;
            int j = (x / 10) % 10;
            int k = (x / 100) % 10;

            if (i != j && j != k && i != k) {
                y = y + x;
                System.out.print(x + " ");
            }

            x = x + 1;
        }
        System.out.print("= " + y);
    }
}*/

/*import java.util.Scanner;

public class Main {

public static void main(String[] args) {
            System.out.print("Zadaj čislo: ");
            Scanner sc = new Scanner(System.in);
//2. nepovinna uloha
//vytvorte algoritmus, ktory zisti, ci zadane cislo je palindrom.
//nevieme kolko cifier ma cislo - cislo moze byt rozne v intervale <0 ; 2 000 000 000>
            long x = sc.nextLong();
            long x2 = x;
            long y = 0;

            while (x2 > 0) {
                y = y + (x2 % 10);
                y = y * 10;
                x2 = (x2 / 10);
            }
            y = y / 10;
            if(x==y){
                System.out.println("Toto cislo je palindrom");
            }
            else{
                System.out.println("Toto cislo neni palindrom");
            }
        }
    }*/
/*public class Main {
    public static void main(String[] args) {
        //3. nepovinna uloha
        //spocitaj vsetky mocniny cisla 2 v intervale <1; 65 536>
        //cize hladame sucet:
        //1 + 2 + 4+ 8+ 16 + 32 + ... + 65536 = ?
        double cislo = 0;
        double sum = 0;
        int i = 0;

        while (cislo != 65536.0) {
            cislo = Math.pow(2, i);
            i -= -1;
            sum -= -cislo;
            System.out.println(cislo);
        }
    }
}*/
/*import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Zadaj lubovolne cislo: "); //vytvori pyramidu z hviezdiciek s poctom riadkov ako zadane cislo
        int rows=sc.nextInt();
        int k=0;
        for (int i=1; i<=rows; i++) {
            k = 0;
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print(" ");
            }
            while (k != 2 * i - 1) {
                System.out.print("*");
                ++k;
            }
            System.out.println();
        }
    }
}*/
/*public class Main {
    public static void main(String[] args) { //je dane pole array, je potrebne cez cyklus for
        // poscitavat cisla v poli a
        //vypocitat aritmeticky priemer tychto cisel.
        int[] array = new int[]{2, 52, 74, 1, 28, 65, 7, 189, 54, 12, 36, 74, 87, 69};
        int sum = 0;
        for (int i : array) {
            sum -= -i;
        }
        System.out.println("Summary: " + sum);
        System.out.println("Average: " + sum / array.length);
    }
}*/
public class Main {
    public static void main(String[] args) {
        int[] array = new int []{5,4,10};
        int dlzka=array.length;
        int sucet = 0;
        for (int i=0; i<dlzka; i++){
            sucet += array[i];
        }
        System.out.println(sucet);
        double priemer;
        priemer=sucet/dlzka;
        System.out.println(priemer);
    }
}