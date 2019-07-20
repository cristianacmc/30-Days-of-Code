/**
 * Created by Cristiana Costa
 * on 2019-06-19
 * Program to calculate the hourglass sum for every hourglass in , then print the maximum hourglass sum.
 */

public class TwoDArrays {

    public static void main(String[] args) {

        int sum;
        int row = 6;
        int col = 6;
        int[][] myArray = new int[row][col];
        int cont = 0;


        for (int i=0; i < row; i++){
            for(int j=0; j < col; j++, cont--) {
                myArray[i][j] = cont;
                System.out.print(myArray[i][j] + " ");
            }
            System.out.println();
        }

        int total = -10000;
        for (int i=0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum = myArray[i][j] + myArray[i][j+ 1] + myArray[i][j + 2] +
                        myArray[i+1][j + 1] +
                        myArray[i+2][j] + myArray[i+2][j + 1] + myArray[i+2][j + 2];
                System.out.println(myArray[i][j] + " " + myArray[i][j+ 1] + " " + myArray[i][j + 2] + " \n" + myArray[i+1][j + 1] + " \n" + myArray[i+2][j] + " " + myArray[i+2][j + 1] + " " + myArray[i+2][j + 2]);
                //System.out.println("sum: " + sum);
                System.out.println();
                if(sum > total ){
                    total = sum;
                }

            }
        }

        System.out.print("The maximum hourglass sum: " + total);
    } //main

} //class
