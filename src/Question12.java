/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Red King
 */
public class Question12 {
    public static void main(String[] args){
        System.out.println(numbers(5));
    }

    static int numbers(int n){
        if(n == 1){
                return 1;
        }else{
                return n * n + numbers(n - 1);
        }
    }
}
