

public class Main {
    public static void counter(int[] arr, int a){
        int c = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == a){
                c++;
            }
        }
        System.out.println("The number " + a + " appears " + c + " times.");
    }
    public static int[] merge(int[] arr, int[] arr2){
        int a;
        a = arr.length + arr2.length;
        int[] arrf = new int[a];
        for (int i = 0; i < arr.length; i++){
            arrf[i] = arr[i];
        }
        for (int i = 0; i < arr2.length; i++){
            arrf[arr.length + i] = arr2[i];
        }
        return arrf;
    }
    public static void reverse(int[] arr){
        for (int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 3, 5};
        int[] arr2 = {6, 7, 8, 9};
        int n = 3;
        counter(arr, n);
        int[] arrf = merge(arr, arr2);
        for (int j : arrf){
            System.out.print(j + " ");
        }
        System.out.println();
        reverse(arr2);
    }
}