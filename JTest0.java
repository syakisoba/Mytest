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
            BigInteger result, a, b;
            String x,y;
            x = Integer.toString(sc.nextInt());
            y = Integer.toString(sc.nextInt());
            
            a = new BigInteger(x);
            b = new BigInteger(y);
            result = a.add(b.multiply(b));
            
            out.println(result);
        }

    }
    
}
