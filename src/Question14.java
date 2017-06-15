/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Red King
 */
public class Question14 {
    public static void main(String[] args){
        binaryPrint(32);
        System.out.print(" ");
    }

    public static void binaryPrint(int x){
        if(x == 1)
                System.out.print(x%2);
        else{	
                binaryPrint(x/2);
                System.out.print(x%2);
        }
    }
}
