package minheap;

/**
 *
 * @author fehime
 */
public class HeapWorker {
    
    public int[] arrayToParseInt(String input){
        String[] temp = input.split(",");
        int[] numbers = new int[temp.length];
        
        for (int i = 0; i < temp.length; i++) {
            numbers[i] = Integer.parseInt(temp[i]);
        }
        
        return numbers;
    }

    public boolean isMinHeap(int[] numbers) {
        // Dizinin uzunlugunu al
        int n = numbers.length;

        // Dizi min heap'tir, eger açiklamalari saglar
        for (int i = (n - 2) / 2; i >= 0; i--) {
            // Eger sol cocuk buyukse
            if (numbers[i] > numbers[2 * i + 1]) {
                return false;
            }
            // Eger sağ cocuk varsa ve buyukse
            if (2 * i + 2 < n && numbers[i] > numbers[2 * i + 2]) {
                return false;
            }
        }
        return true;
    }

    public void makeMinHeap(int[] numbers) {
        // Dizinin uzunlugunu al
        int n = numbers.length;

        // Dizi min heap'e cevirin
        for (int i = 1; i < n; i++) {
            // Yeni elemani ekle
            int child = i;
            while (child > 0) {
                // Parent indeksini bul
                int parent = (child - 1) / 2;

                // Eger parent'ten kucukse yer degistirin
                if (numbers[child] < numbers[parent]) {
                    int temp = numbers[parent];
                    numbers[parent] = numbers[child];
                    numbers[child] = temp;
                } else {
                    break;
                }

                // Yeni child indeksini ata
                child = parent;
            }
        }
    }

    public void printHeap(int[] numbers) {
        System.out.println("Dizinin min heap'e çevrilmiş hali :\n");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" " + numbers[i]);
        }
        System.out.println("");
    }
}
