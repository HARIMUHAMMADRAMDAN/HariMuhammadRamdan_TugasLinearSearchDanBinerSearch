import java.util.Scanner;

public class LinearSearch {
    // Fungsi linear search
    // Mengembalikan indeks dari elemen yang dicari jika ditemukan,
    // atau -1 jika tidak ditemukan
    public static int linearSearch(int[] arr, int target) {
        int i = 0;
        while (i < arr.length && arr[i] != target) {
            i++;
        }
        if (i < arr.length) {
            return i;
        } else {
            return -1;
        }
    }

    // Contoh penggunaan
    public static void main(String[] args) {
        int[] arr = new int[1000];
        for (int i = 0; i < 1000; i++) {
            arr[i] = i + 1;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan elemen yang ingin dicari (1-1000): ");
        int target = scanner.nextInt();

        // Mengukur waktu eksekusi
        long startTime = System.nanoTime();
        int result = linearSearch(arr, target);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        if (result == -1)
            System.out.println("Elemen tidak ditemukan");
        else
            System.out.println("Elemen ditemukan di indeks: " + result);

        System.out.println("Waktu eksekusi: " + executionTime + " nanodetik");

        scanner.close();
    }
}
