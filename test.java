import java.util.Arrays;

public class test {

    public static void main(String[] args) {

        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i];
        }
        System.out.printf("(%s) %s-%s",str.substring(0,3), str.substring(3,6), str.substring(6,9));
     


    }

}
