/**
 * Created by Юрий on 02.09.2016.
 */
public class Task2_3 {
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
    static int[] balances = {1200, 250, 2000, 500, 3200};

    static double withdrawBalance(String ownerName, double withdrawal) {
        double balance = 0;
        double comision = 5.0;
        double procente = (withdrawal * comision) / 100;
        double index = 0;

        for (int i = 0; i < balances.length; i++) {
            //  double balance = 0;
            if (balances[i] > 0) {
                ownerNames[(int) index] = ownerName;
                balance = balances[i]-procente;

                System.out.println(ownerName + withdrawal + balance);
            } else System.out.println("вывод не представляется возможным");


        }
        return balance;
    }
    public static void main(String[] args) {


        System.out.println(Task2_3.withdrawBalance("Jane",200));

    }
}
