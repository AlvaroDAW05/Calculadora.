/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.entornos;

/**
 *
 * @author Alumnado
 */
public class calculadora {

    private int num1;
    private int num2;
    
    public calculadora(int a, int b){
        num1=a;
        num2=a;
    }
    
    public int resta(){
        int result=num1-num2;
        return result;
    }
    
    public int multiplica(){
        int result=num1*num2;
        return result;
    }
    
    public int divide(){
        int result=num1/num2;
        return result;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
}
