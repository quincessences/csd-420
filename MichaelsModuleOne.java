// CSD420 - Advanced Programming with Java
// Name: Maria Q. Michaels
// Date: 08/14/2022
// Assignment: Module 1 Assignment
// Purpose: Write a program that stores an array of 5 random integers, a data objective instance using current date, and an array of 5 random double values
// References: https://www.tutorialspoint.com/java-program-to-write-int-array-to-a-file


import java.util.*;
import java.text.*;
import java.io.*;

public class MichaelsModuleOne {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        int[] array1 = new int[5];
        for (int i = 0; i < 5; i++) {
            array1[i] = rand.nextInt(); 
            System.out.println(array1[i]);
        }
		
        Date date1 = new Date();
        System.out.println(date1.toString());
        
        double[] array2 = new double[5];
        for (int i = 0; i < 5; i++) {
            array2[i] = rand.nextDouble(); 
            System.out.println(array2[i]);
        }
        
        FileWriter fwriter = new FileWriter("michaelsdatafile.dat");
        
        for (int i = 0; i < 5; i++) {
            fwriter.write(array1[i] + "\n");
        }
        fwriter.close();
        
        try
        {
            String filename= "michaelsdatafile.dat";
            FileWriter fwriter1 = new FileWriter(filename,true);
            
            fwriter1.write(date1.toString()+"\n");
            for (int i = 0; i < 5; i++) {
                fwriter1.write(array2[i] + "\n");
            }
            fwriter1.close();
        
        }
        catch(IOException ioe)
        {
            System.err.println("IOException: " + ioe.getMessage());
        }
	}
}