/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // TODO code application logic here
        String s = "Добро пожаловать в калькулятор!!!\r\n"
                + "Диапазон чисел возможен для ввода от 1 до 10\r\n"
                + "Ввод возможен как арабскими цифрами так и римскими\r\n"
                + "Калькулятор выполняет операции '+', '-', '*', '/'\r\n"
                + "Пример ввода: 2 + 2 или II + II, (2 + II запрещено!)\r\n";

        System.out.println(s);
        while(true){
        System.out.println(MyRun.result() + "\n");
        }
    }
    
}
