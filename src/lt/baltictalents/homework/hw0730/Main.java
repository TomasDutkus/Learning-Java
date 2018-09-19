package lt.baltictalents.homework.hw0730;

public class Main {
    public static void main(String[] args) {
        sumFirst5();
        sumLast3();

    }

    private static void sumFirst5() {
        int sum = 0;
        int counter = 0;
        for (int i = 1; i <= 100; i++) {

            if (i % 2 !=0) {
                sum += i;
                counter++;
            }
            if (counter == 5) {
                break;
            }
        }
        System.out.println("pirmu 5 nelyginiu suma yra: " +sum);
    }

    private static void sumLast3() {
        int sum = 0;
        int min = 100-3;
        for (int i = 100; i >= 1; i--) {
            sum+=i;
        }
        System.out.println("last 3 sum is " +sum);
    }
}
