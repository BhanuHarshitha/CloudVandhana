import java.util.Random;
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		Random r = new Random();
		for (int i=0;i<arr.length;i++){
		    int rand_num = r.nextInt(arr.length);
		    int temp = arr[rand_num];
		    arr[rand_num] = arr[i];
		    arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
