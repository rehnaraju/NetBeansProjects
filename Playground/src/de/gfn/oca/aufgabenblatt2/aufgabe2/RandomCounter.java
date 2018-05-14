package de.gfn.oca.aufgabenblatt2.aufgabe2;

import java.util.Random;

/**
 *
 * @author tlubowiecki
 */
public class RandomCounter {
    
    public static void main(String[] args) {
        int[] randoms = new int[100];
        int[] counts;
        
        set(randoms);
        print(randoms);
        
        counts = count(randoms);
        print(counts);
        
    }
    
    public static void set(int[] arr) {
        Random r = new Random();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10);
        }
    }
    
    public static void print(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static int[] count(int[] arr) {
        int[] result = new int[10];
        
        for(int i = 0; i < result.length; i++) {
            result[i] = 0;
        }
        
        for(int i = 0; i < arr.length; i++) {
            result[arr[i]]++;
        }
        
        return result;
    }
}