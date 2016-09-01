/**
 * Created by Юрий on 02.09.2016.
 */
public class Task2_1 {
    static int sum(int[] balances) {
        int sum = 0;
        for (int balance : balances) {
            if (balance > 0 && balance < 4000) {
                sum += balance;
            }
        }
        return sum;
    }
    static double sum (double balances[]){
        double sum = 0;
        for (double balance : balances){
            if(balance > 0 && balance < 4000){
                sum+=balance;
            }
        }
        return sum;
    }
    static int min(int balances[]){
        int minValue = balances[0];
        for (int i = 1; i<balances.length;i++){
            if (balances[i] < minValue){
                minValue = balances[i];
            }
        }
        return minValue;
    }
    static double min(double[]balances){
        double minValue = balances[0];
        for (int i = 1; i<balances.length;i++){
            if (balances[i] < minValue){
                minValue = balances[i];
            }
        }
        return minValue;
    }

    static int max(int[]balances){
        int maxValue = balances[0];
        for (int i = 1; i<balances.length;i++){
            if (balances[i] > maxValue){
                maxValue = balances[i];
            }
        }
        return maxValue;
    }
    static double max(double[]balances){
        double maxValue = balances[0];
        for (int i = 1; i<balances.length;i++){
            if (balances[i] > maxValue){
                maxValue = balances[i];
            }
        }
        return maxValue;
    }
    static int maxPositive(int[]balances){

        return max(balances);
    }

    static double maxPositive(double[]balances){
        return max(balances);

    }
    static int multiplication(int[]balances){
        int multiplication = 1;
        for (int balance : balances){
            if (balance>0&&balance<4000){
                multiplication*=balance;
            }
        }
        return multiplication;
    }
    static double multiplication(double[]balances){
        double multiplication = 1;
        for (double balance : balances){
            if (balance>0){
                multiplication*=balance;
            }
        }
        return multiplication;
    }

    static int modulus(int[]balances){
        return balances[0]% balances.length-1;
    }
    static double modulus(double[]balances){
        return balances[0]% balances.length-1;
    }

    static int secondLargest(int[]balances) {
        int max = max(balances);
        int second = balances[0];
        for (int i = 0; i < balances.length; i++) {
            if (balances[i] > second && balances[i] < max) {

                second=balances[i];
            }
        }
        return second;
    }
    static double secondLargest(double[]balances) {
        double max = max(balances);
        double second = balances[0];
        for (int i = 0; i < balances.length; i++) {
            if (balances[i] > second && balances[i] < max) {

                second=balances[i];
            }
        }
        return second;
    }




}
