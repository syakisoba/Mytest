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
            int a,b,c,n,result;
            
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            n = sc.nextInt();
            if(n > 2){
                int[] arr = new int[n+1];
            
                arr[0] = a;
                arr[1] = b;
                arr[2] = c;
            
                for(int i=3; i<=n;i++){
                    arr[i] = arr[i-1]+arr[i-2]-arr[i-3];
                }

                result =arr[n];
            }else if(n == 0){
                result = a;
            }else if(n == 1){
                result = b;
            }else{
                result = c;
            }
            out.println(result);
        }

    }
    
}
