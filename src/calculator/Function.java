/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

public class Function {
    
    int a, b, c;

    public Function(int a, int b) {
        this.a = a;
        this.b = b;
        if((a > 10 || a < 1) || (b > 10 || b < 1)){
            System.out.println("Диапазон чисел для ввода от 1 до 10!");
            System.exit(0);
        }
    }
    
    public void summa(){
        c = a + b;
    }
    
    public void difference(){
        c = a - b;
    }
    
    public void multiplication(){
        c = a * b;
    }
    
    public void bisection(){
        c = a / b;
    }
    public String getResult(){
        return c + "";
    }
    
}
