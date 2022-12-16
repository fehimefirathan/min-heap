package minheap;

import java.util.Scanner;

/**
 *
 * @author fehime
 */
public class MinHeap {
    
    // 9,8,7,6,5,4,3,2,1 : MIN HEAP OLMAYAN DIZI
    // 20,25,27,33,35,40,50:  MIN HEAP OLAN DIZI
    
    public static void main(String[] args) {
        HeapWorker heap = new HeapWorker();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen sayilari virgül ile ayirin (boşluk kullanmadan): ");
        String input = scanner.nextLine();
        int[] numbers = heap.arrayToParseInt(input);

        if (heap.isMinHeap(numbers)) {
            System.out.println("Evet, min heap'tir.");
        } else {
            System.out.println("Hayir, min heap degildir.");
            heap.makeMinHeap(numbers);
            heap.printHeap(numbers);
        }
        System.out.println("\n--..PROGRAM SONLANDI..--\n");

    }

}
