package calculator;

/**
 * Created by Cristiana Costa
 * on 2019-07-24
 * Program to implements the AdvancedArithmetic interface
 */

public class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n){
        int sum = 0;

        for(int i=1; i <= n; i++){
            if (n == 1){
                return n;
            } else {
                if (n % i == 0){
                    sum += i;

                }
            }
        }
        return sum;
    }

} //class
