/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Red King
 */
public class Question13 {
    public static void main(String[]args){
        System.out.print(numbers(2,5) + " ");
    }

    static int numbers(int x, int y){
        if(y == 0)
                return 1;
        else
                return x * numbers(x, y-1);
    }
}
