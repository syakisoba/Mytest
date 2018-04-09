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
        PrintWriter out = new PrintWriter("pimes.txt")){
            int a=10000000;
            
            boolean prime[] = new boolean[a+1];
            for(int j =0; j<a; j++){
                prime[j] = true;
            }
            for(int i=2; i*i<=a; i++){
                if(prime[i] == true){
                    for(int k = i*2; k <=a; k += i){
                        prime[k] = false;
                    }
                }
            }
            
            for(int i = 2; i <= a; i++){
                if(prime[i]==true){
                    out.println(i);
                }
            }
        }

    }
    
}
