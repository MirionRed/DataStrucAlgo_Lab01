/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Red King
 */
public class Question10 {
    public static void main(String[]args){
        numbers(5);
    }
    
    static void numbers(int n){
        System.out.print(n + " ");
        if (n != 0)
                numbers(n - 1);
    }
}
