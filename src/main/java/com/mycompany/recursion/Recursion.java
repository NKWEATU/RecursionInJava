/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recursion;

/**
 *
 * @author USER
 */
public class Recursion {

    public static void main(String[] args) {
     sayHi(1000);
    }
    
    
    
    
    
    private static void sayHi(int count){
    System.out.println("Hi");
    
    if (count <=1){//this condition is called the base case which prevents it from
    return;         //recursing infinitely
    }
    
    
    sayHi(count-1);
    }  
}
