import java.util.Scanner;
import java.util.Arrays;
public class sortingArrays {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizi için boyut giriniz: ");
        int n = input.nextInt();
        int[] list = new int[n];

        System.out.println("Dizinin elemanlarını giriniz: ");
        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + ". Eleman: ");
            list[i] = input.nextInt();
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}