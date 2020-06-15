/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;
import java.util.StringTokenizer;

public class MyInput {
    
    private String st[];
    
    public MyInput() {
        String s = new Scanner(System.in).nextLine();
        StringTokenizer input = new StringTokenizer(s);
        if(input.countTokens() < 3 || input.countTokens() > 3){
            System.out.println("Неверно задан формат!\r\nПример ввода: 2 + 2 или II + II, (2 + II запрещено!)\r\n");
            System.exit(0);
        }
        st = new String[]{input.nextToken(), input.nextToken(), input.nextToken()};
    }
    
    public String[] getInput(){
        return st;
    }
    
}
