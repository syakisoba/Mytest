/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtestab;
import java.io.*;
import java.util.*;
import java.math.*;
/**
 *
 * @author michael
 */
public class JTestAB {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        try(Scanner sc = new Scanner(new File("input.txt"));
        PrintWriter out = new PrintWriter("output.txt")){
            int n, counter=0,mCounter = 0, res=-999;
            
            n = sc.nextInt();
            
            for(int i=1; i<=n; i++){
                for(int j = 1; j<= i; j++){
                    if(i%j==0){
                        counter++;
                    }
                }
                
                if(counter>mCounter){
                    mCounter=counter;
                    res = 1;
                }else{
                    res++;
                }
                counter =0;
            }
            out.println(res);
        }

    }
    
}
