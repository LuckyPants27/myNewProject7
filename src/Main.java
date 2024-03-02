import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] arr = new int[]{1, 2, 3};
        double [] divArr = {1.57, 7.654, 9.986};
        char [] charsArr = {'h', 'e', 'l', 'l', '0'};


        for (int i=0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length -1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i=0; i < divArr.length; i++) {
            System.out.print(divArr[i]);
            if (i != divArr.length -1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i=0; i < charsArr.length; i++) {
            System.out.print(charsArr[i]);
            if (i != charsArr.length -1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        System.out.println();
        for (int i=arr.length-1; i > -1; i--) {
            System.out.print(arr[i]);
            if (i != 0 ) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i=divArr.length-1; i > -1; i--) {
            System.out.print(divArr[i]);
            if (i != 0 ) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i=charsArr.length-1; i > -1; i--) {
            System.out.print(charsArr[i]);
            if (i != 0 ) {
                System.out.print(", ");
            }
        }

        System.out.println();
        System.out.println();
        for (int i=0; i < arr.length; i++) {
            if (arr[i]%2 != 0) {
                arr[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}