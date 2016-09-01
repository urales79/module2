/**
 * Created by Юрий on 02.09.2016.
 */
public class Task2_2 {
    static double withdrawBalance(double balance, double withdrawal) {
        double comision = 5;
        double procente = (withdrawal*comision)/100;
        double  balances= balance-withdrawal-procente;
        if (balances>0){
            System.out.println("OK");
        }
        else System.out.println("NO");



        return balances;
    }

    public static void main(String[] args) {

        int[] balances = {1200, 250, 2000, 500, 3200,4,34,54,4,80};




        int[] balances1 = {200, 200, 500, 4000, 30};

    }

}
