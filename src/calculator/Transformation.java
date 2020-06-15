/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

public class Transformation {

    private static int numberFromRim(String n){
        switch (n) {
            case "I":  return 1;
            case "IV":  return 4;
            case "V":  return 5;
            case "IX":  return 9;
            case "X":  return 10;
            case "XL":  return 40;
            case "L":  return 50;
            case "XC":  return 90;
            case "C":  return 100;
        }
        return 0;
    }
    public static int transformInInt(String arg){
        int i = 0;
        int j = 0;
        int ed = 0;
        int dec = 0;
        if(arg.indexOf("XC") != -1){
            i = j = arg.indexOf("XC") + 2;
            dec = numberFromRim("XC");
        }
        if(arg.indexOf("XL") != -1){
            i = j = arg.indexOf("XL") + 2;
            dec = numberFromRim("XL");
        }
        if(arg.indexOf("IX") != -1){
            i = arg.indexOf("IX") + 2;
            ed = numberFromRim("IX");
        }
        if(arg.indexOf("IV") != -1){
            i = arg.indexOf("IV") + 2;
            ed = numberFromRim("IV");
        }
        char c[] = arg.toCharArray();
        for(; j < i - 2; j++)
            dec += numberFromRim(c[j] + "");
      
        for(; i < c.length; i++)
            ed += numberFromRim(c[i] + "");
        return dec + ed;
    }
    
    private static String rimFromNumber(int n){
        switch (n) {
            case 1:  return "I";
            case 2:  return "II";
            case 3:  return "III";
            case 4:  return "IV";
            case 5:  return "V";
            case 6:  return "VI";
            case 7:  return "VII";
            case 8:  return "VIII";
            case 9:  return "IX";
            case 10:  return "X";
            case 20:  return "XX";
            case 30:  return "XXX";
            case 40:  return "XL";
            case 50:  return "L";
            case 60:  return "LX";
            case 70:  return "LXX";
            case 80:  return "LXXX";
            case 90:  return "XC";
            case 100:  return "C";
        }
        return "";
    }
    
    public static String transformInRim(int num){
        int ed = num % 10;
        int dec = num - ed;
        String d  = rimFromNumber(dec);
        String e = rimFromNumber(ed);
        return d + e;
    }
    
}
