/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

public class MyRun {

    public static String result(){
        MyInput in = new MyInput();
        String s[] = in.getInput();
        Argument argum = new Argument(s);
        int arg[] = argum.getArgument();
        Function f  = new Function(arg[0], arg[1]);
        switch (s[1]){
            case "+":
                f.summa();
                break;
            case "-":
                f.difference();
                break;
            case "/":
                f.bisection();
                break;
            case "*":
                f.multiplication();
                break;
                
        }
        if(argum.isArgRim()){
            return Transformation.transformInRim(Integer.parseInt(f.getResult()));
        }
        return f.getResult();
              
    }
}
