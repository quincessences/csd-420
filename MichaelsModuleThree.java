// CSD420 - Advanced Programming with Java
// Name: Maria Q. Michaels
// Date: 08/28/2022
// Assignment: Module 3 Assignment
// Purpose: Write a test program that contains a static method that returns a new ArrayList, without duplicates from the original list.
// References: https://stackoverflow.com/questions/4307273/how-can-i-create-and-display-an-arraylist-of-random-numbers-in-java


import java.util.*;

public class MichaelsModuleThree {
    public static void main(String[] args)
    {
        Random random=new Random();
        ArrayList<Integer> array=new ArrayList<Integer>();
        System.out.println("ArrayList 1:");
        for(int i=0;i<50;i++)
        {
            array.add(random.nextInt(20)+1);
            System.out.print(array.get(i)+" ");
        }
        ArrayList<Integer> aList=removeDuplicates(array);
        System.out.println("\nArrayList2 :");
        for(int i=0;i<aList.size();i++)
        {
            System.out.print(aList.get(i)+" ");
        }
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> bList=new ArrayList<E>();
        for(int i=0;i<list.size();i++)
        {
            if(!bList.contains(list.get(i))) {
                bList.add(list.get(i));
            }
        }
        return bList;
    }
    
}