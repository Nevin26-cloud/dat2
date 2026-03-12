import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {

        System.out.println("Unsorted Array -----------------------------------------");
        ArrayList<Integer> integerList = Lab4.getList();
        Lab4.outputList(integerList);

        // Make copies so each algorithm sorts the same original data
        ArrayList<Integer> bubbleCopy = new ArrayList<>(integerList);
        ArrayList<Integer> insertionCopy = new ArrayList<>(integerList);

        // Time bubble sort
        long startBubble = System.nanoTime();
        ArrayList<Integer> bubbleSortedList = Lab4.bubbleSort(bubbleCopy);
        long endBubble = System.nanoTime();
        long bubbleTime = endBubble - startBubble;

        System.out.println("\n\nBubble sort results --------------------------------");
        Lab4.outputList(bubbleSortedList);
        System.out.println("\nBubble Sort Time: " + bubbleTime + " ns");

        // Time insertion sort
        long startInsertion = System.nanoTime();
        ArrayList<Integer> insertionSortedList = Lab4.insertionSort(insertionCopy);
        long endInsertion = System.nanoTime();
        long insertionTime = endInsertion - startInsertion;

        System.out.println("\n\nInsertion sort results --------------------------------");
        Lab4.outputList(insertionSortedList);
        System.out.println("\nInsertion Sort Time: " + insertionTime + " ns");
    }
}

class Lab4 {

    public static ArrayList<Integer> insertionSort(ArrayList<Integer> integerList) {
        // Implement insertion sort algorithm 
        for (int i = 1; i < integerList.size(); i++) {
            int key = integerList.get(i);
            int j = i - 1;

            while (j >= 0 && integerList.get(j) > key) {
                integerList.set(j + 1, integerList.get(j));
                j = j - 1;
            }
            integerList.set(j + 1, key);
        }
        return integerList;
    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> integerList) {
        // Implement the bubble sort algorithm 
        boolean swapped;

        for (int i = 0; i < integerList.size() - 1; i++) {
            swapped = false;

            for (int j = 0; j < integerList.size() - 1 - i; j++) {
                if (integerList.get(j) > integerList.get(j + 1)) {
                    int temp = integerList.get(j);
                    integerList.set(j, integerList.get(j + 1));
                    integerList.set(j + 1, temp);
                    swapped = true;
                }
            }

            if (!swapped) break;
        }

        return integerList;
    }

    public static ArrayList<Integer> getList() {
        ArrayList<Integer> integerList = new ArrayList<>();
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader("integers.txt"))) {
            while ((line = br.readLine()) != null) {
                integerList.add(Integer.parseInt(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return integerList;
    }

    public static void outputList(ArrayList<Integer> integerList) {
        for (int i = 0; i < integerList.size(); i++) {
            System.out.print(integerList.get(i) + " ");
        }
         System.out.println();
    }


}


