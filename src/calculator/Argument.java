/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

public class Argument {
    
    private String argum1;
    private String argum2;
    private boolean argRim;
    
    public Argument(String[] input) {
        this.argum1 = input[0];
        this.argum2 = input[2];
    }
    
    public int[] getArgument(){
        int argum[] = null;
        try{
            argum = new int[]{Integer.parseInt(argum1), Integer.parseInt(argum2)};
            argRim = false;
        }catch(NumberFormatException e){
            int a = Transformation.transformInInt(argum1), b = Transformation.transformInInt(argum2);
            if(a != 0 && b != 0){
                argum = new int[]{a, b};
                argRim = true;
            }
            else{   
                System.out.println("Неверно задан формат!\r\nПример ввода: 2 + 2 или II + II, (2 + II запрещено!)\r\n");
                System.exit(0);
            }
                
        }
        return argum;
    }
    
    public boolean isArgRim(){
        return argRim;
    }
    
}
