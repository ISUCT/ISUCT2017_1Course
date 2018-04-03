import java.util.Scanner;
import java.util.ArrayList;
import java.lang.*;


public class Program {
    public static void main(String[] args) {
        Program S = new Program();
        S.Start();
    }

    private void Start() {
        System.out.println("Выберите, что вы хотите сделать с числом:");
        System.out.println("Для перевода из 10-ой в n-ую, введите '1'");
        System.out.println("Для перевода из 2-ой в 10-ую, введите '2'");
        Scanner in = new Scanner(System.in);
        int transl = in.nextInt();

        switch (transl) {
            case 1:
                System.out.println("(10->n)В какую систему счисления вы хотите перевести? (2,3,4,5,6,7,8,9,16)");
                ArrayList<Integer> lib1 = new ArrayList<Integer>();
                Scanner inp0 = new Scanner(System.in);
                int whc = inp0.nextInt();
                if (whc == 2) {
                    System.out.println("(10->2)Введите число, которое хотите перевести:");
                    Scanner inp1 = new Scanner(System.in);
                    int x = inp1.nextInt();
                    while (x > 0) {
                        if (x % 2 == 0) {
                            lib1.add(0);
                            x /= 2;
                        } else {
                            lib1.add(1);
                            x = (x - 1) / 2;
                        }
                    }
                    for (int i = lib1.size() - 1; i >= 0; i--) {
                        lib1.get(i);
                        System.out.print(lib1.get(i) + " ");
                    }
                }
                else if (whc == 3 || whc == 4|| whc == 5 || whc == 6 || whc == 7 || whc == 8 || whc == 9 || whc == 16) {
                    System.out.println("(10->" + whc + ")Введите число, которое хотите перевести:");
                    Scanner inp1 = new Scanner(System.in);
                    int x = inp1.nextInt();
                    int k = 0;
                    while (x > 0) {
                        k = x % whc;
                        lib1.add(k);
                        x /= whc;
                    }

                    for (int i = lib1.size() - 1; i >= 0; i--) {
                        lib1.get(i);
                        System.out.print(lib1.get(i) + " ");
                    }
                }
                System.out.println(" ");
                break;
            case 2:
                System.out.println("(2->10)Введите число, которое хотите перевести:");
                ArrayList<Integer> lib2 = new ArrayList<Integer>();
                Scanner inp2 = new Scanner(System.in);
                int z = inp2.nextInt();
                int sum = 0;
                int y = 0;
                while (z > 0) {
                    y = z % 10;
                    z /= 10;
                    lib2.add(y);
                    //System.out.println(y);
                }
                for (int i = lib2.size() - 1; i >= 0; i--) {
                    sum += lib2.get(i) * (int) Math.pow(2, i);
                }
                System.out.println(sum);
                break;
            default:
                System.out.println("Неверный код");
        }
        repeat();
    }

    private void repeat() {
        System.out.println("Выйти из программы? y/n");
        Scanner rep = new Scanner(System.in);
        try {
            String exit = rep.next();
            if (exit.equals("y")) {
                System.exit(0);
            }
             else if (exit.equals("n")) {
                    Start();
                }
                else repeat();
                }
                    catch(Exception e) {
                    System.exit(0);
            }
    }
}