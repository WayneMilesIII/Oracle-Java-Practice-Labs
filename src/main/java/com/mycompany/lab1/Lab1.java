/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab1;

/**
 *
 * @author theli
 */
public class Lab1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        manipulatePrimitives();
        constructsAndFlow();
    }
    
    public static void manipulatePrimitives(){
        System.out.println("Manipulate Primitives Started!");
        byte x = 2, y = 3, z = 5;
        z = (byte)(x+y);
        float a = (float)x/y;
        double b = (double)(x/y);
        b = a;
        float c = Math.round(b*1000)/1000F;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        char a1 = 'a', a2='\141', a3='\u0061';
        int i = a1;
        System.out.println(Integer.toOctalString(i));
        System.out.println(Integer.toHexString(i));
        int i1 = 0141, i2 = 0x61;
        char a4 = (char)i1;
        System.out.println(a4);
        char someChar = 'k';
        System.out.println(someChar);
        boolean isEven = (someChar%2 == 0);
        System.out.println(isEven);
        char nextChar = (char)(someChar+1);
        System.out.println(nextChar);
        nextChar = ++someChar;
        System.out.println(someChar);
        someChar = 'b';
        System.out.println(someChar);
        --someChar;
        System.out.println(someChar);
        someChar = 'h';
        char upperSomeChar = (char)(someChar-32);
        System.out.println(upperSomeChar);
        System.out.println("Manipulate Primitives Finished!");
    }
    
    public static void constructsAndFlow(){
        System.out.println("Constructs and Flow Started!");        
        char someChar = 'q';
        if (someChar >= 'a' && someChar <= 'z')
        {
            someChar -=32;
        } else {
            someChar +=32;
        }
        System.out.println(someChar);
        
        someChar = (someChar >= 'a' && someChar <= 'z') ? 
                (char)(someChar-32) : (char)(someChar+32);
        
        System.out.println(someChar);
        
        int period = 4;
        float amount = 10;
        float interest = 0.05F;
                //What does the F mean?
        switch (period){
            case 4:
                amount += amount * 0.2F; 
                break;
            case 3:
                amount += amount * interest;
            case 2:
                amount += amount * interest;
            case 1:
                amount += amount * interest;
            
        }
        System.out.println(amount);
        System.out.println("Constructs and Flow Finished!");        
        
        
    }
}
