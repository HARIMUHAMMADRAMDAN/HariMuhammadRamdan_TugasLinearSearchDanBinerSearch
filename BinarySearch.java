import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    // Fungsi binary search
    // Mengembalikan indeks dari elemen yang dicari jika ditemukan,
    // atau -1 jika tidak ditemukan
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Cek apakah elemen tengah adalah elemen yang dicari
            if (arr[mid] == target)
                return mid;

            // Jika elemen tengah lebih kecil dari target, abaikan setengah kiri
            if (arr[mid] < target)
                left = mid + 1;

            // Jika elemen tengah lebih besar dari target, abaikan setengah kanan
            else
                right = mid - 1;
        }

        // Jika elemen tidak ditemukan
        return -1;
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
        int result = binarySearch(arr, target);
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
