/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_simple;

/**
 *
 * @author isamach
 */
public class Array_Simple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Array de tipo String
        String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def"};
 
        //Segundo Recorido 
        for (int i = 0; i < strArray.length-1; i++)
        {
            
            // Se realiza el primer recorido desde abc hasta def
            for (int j = i+1; j < strArray.length; j++)
            {
                if( (strArray[i].equals(strArray[j])) && (i != j) )
                {
                    System.out.println("Duplicate Element is : "+strArray[j]);
                }
            }
        }
    }    
    }
    

