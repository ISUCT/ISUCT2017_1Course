import java.util.Scanner;
import java.util.ArrayList;
import java.lang.*;


public class Program {
    public static void main(String[] args) {
            System.out.println("Выберите, что вы хотите сделать с числом:");
            System.out.println("Для перевода из 10-ой в 2-ую, введите '1'");
            System.out.println("Для перевода из 2-ой в 10-ую, введите '2'");
            Scanner in = new Scanner(System.in);
            int from10to2 = in.nextInt();

            switch (from10to2) {
                case 1:
                    System.out.println("Введите число, которое хотите перевести");
                    ArrayList<Integer> lib1 = new ArrayList<Integer>();
                    Scanner inp1 = new Scanner(System.in);
                    int x = inp1.nextInt();
                    while (x > 0)

                    {
                        if (x % 2 == 0) {
                            lib1.add(0);
                            x /= 2;
                        } else {
                            lib1.add(1);
                            x = (x - 1) / 2;
                        }
                    }
                    for (
                            int i = lib1.size() - 1;
                            i >= 0; i--)

                    {
                        lib1.get(i);
                        System.out.print(lib1.get(i) + " ");
                    }
                    break;
                case 2:
                    System.out.println("Введите число, которое хотите перевести");
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
        }
    }



