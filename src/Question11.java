/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Red King
 */
public class Question11 {
    public static void main(String[] args){
        numbers(5, 0);
    }
    
    public static void numbers(int n, int j){
        System.out.print(j + " ");
        if(j != n){
                numbers(n,j+1);
        }
    }
}
