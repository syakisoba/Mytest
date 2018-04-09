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
            int max=0;
            double result;
            int[] a = new int[9];
            
            for(int i=0; i<a.length;i++){
                a[i] = sc.nextInt();
            }
            int[] cas = new int[6];
            
            cas[0] = a[0]*a[0]+a[4]*a[4]+a[8]*a[8];
            cas[1] = a[0]*a[0]+a[5]*a[5]+a[7]*a[7];
            cas[2] = a[1]*a[1]+a[3]*a[3]+a[8]*a[8];
            cas[3] = a[1]*a[1]+a[5]*a[5]+a[6]*a[6];
            cas[4] = a[2]*a[2]+a[3]*a[3]+a[7]*a[7];
            cas[5] = a[2]*a[2]+a[4]*a[4]+a[6]*a[6];
            
            for(int i=0; i<cas.length;i++){
                if(cas[i]>max){
                    max = cas[i];
                }
            }
            
            result = Math.sqrt(max);
            out.println(result);
        }

    }
    
}
