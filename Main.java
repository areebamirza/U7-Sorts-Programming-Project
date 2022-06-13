// Selection & Insertion Sorts
import java.io.*;
import static java.lang.System.*;
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

class Main{
  
  public static void main (String str[]) throws IOException {
    
    // Selection Sort - int[]
    
    int[] elements = {21, 17, 60, 20, 56, 12};
    System.out.println("\nPrinting Unsorted Array");
    for(int i : elements)
    {
      System.out.print(i + " ");
    }

    System.out.println("\n\nPrinting Each Pass Through the Selection Sort");
    for(int j = 0; j < elements.length -1; j++)
    {
      int minIndex = j;
      for(int k = j + 1; k < elements.length; k++)
      {
        if(elements[k] < elements[minIndex])
        {
          minIndex = k;
        }
      }
      int temp = elements[j];
      elements[j] = elements[minIndex];
      elements[minIndex] = temp;

      for(int i : elements)
      {
        System.out.print(i + " ");
      }
      System.out.println();
    }
    
    /*for (int num : elements)
    {
      System.out.println(num);
    }*/

    
    // Insertion Sort - int[]
    
    int[] elements2 = {21, 17, 60, 20, 56, 12};
    System.out.println("\n\nPrinting Unsorted Array");
    for(int i : elements2)
    {
      System.out.print(i + " ");
    }

    System.out.println("\n\nPrinting Each Pass Through the Insertion Sort");
    for(int j = 1; j < elements2.length; j++)
    {
      int temp = elements2[j];
      int possibleIndex = j;
      while(possibleIndex > 0 && temp < elements2[possibleIndex - 1])
      {
        elements2[possibleIndex] = elements2[possibleIndex - 1];
        possibleIndex--;
        
      }
      elements2[possibleIndex] = temp;

      for(int i : elements2)
      {
        System.out.print(i + " ");
      }
      System.out.println();
    }

    /*for (int num : elements2)
    {
      System.out.println(num);
    }*/


    // Selection Sort - String[]

    String[] elements3 = new String["forever", "super", "culture", "treasure", "encore"]


    // Insertion Sort - String[]

      String[] elements4 = new String["forever", "super", "culture", "treasure", "encore"]



    // Selection Sort - ArrayList<Integer>

    ArrayList<Integer> int1 = new ArrayList<Integer>()
    {
      {
        add(21);
        add(17);
        add(60);
        add(20);
        add(56);
        add(12);
      }
    };
      
    System.out.println("\n\n\nPrinting Unsorted ArrayList");
    for(int i : int1)
    {
      System.out.print(i + " ");
    }

    System.out.println("\n\nPrinting Each Pass Through the Selection Sort");
    for(int j = 0; j < int1.size() -1; j++)
    {
      int minIndex = j;
      for(int k = j + 1; k < int1.size(); k++)
      {
        if(int1.get(k) < int1.get(minIndex))
        {
          minIndex = k;
        }
      }
      int temp = int1.get(j);
      int1.set(j, int1.get(minIndex));
      int1.set(minIndex, temp);

      for(int i : int1)
      {
        System.out.print(i + " ");
      }
      System.out.println();
    }


    // Insertion Sort - ArrayList<Integer>

    ArrayList<Integer> int2 = new ArrayList<Integer>()
    {
      {
        add(21);
        add(17);
        add(60);
        add(20);
        add(56);
        add(12);
      }
    };
      
    System.out.println("\n\nPrinting Unsorted ArrayList");
    for(int i : int2)
    {
      System.out.print(i + " ");
    }

    System.out.println("\n\nPrinting Each Pass Through the Insertion Sort");
    for(int j = 1; j < int2.size(); j++)
    {
      int temp = int2.get(j);
      int possibleIndex = j;
      while(possibleIndex > 0 && temp < int2.get(possibleIndex - 1))
      {
        int2.set(possibleIndex, int2.get(possibleIndex - 1));
        possibleIndex--;
        
      }
      int2.set(possibleIndex, temp);

      for(int i : int2)
      {
        System.out.print(i + " ");
      }
      System.out.println();
    }


    // Selection Sort - ArrayList<String>


    // Insertion Sort - ArrayList<String>
    
  }
  
}
