
import java.util.*;
public class ArraysMethod {

	public static void main(String[] args) {
		int[] arr= {5,4,10,2,1};
		int[] arr1={5,4,10,2,1};
		int[] arr2={15,24,1,2,1};
		
	
		System.out.println(Arrays.compare(arr1, arr2));
		System.out.println(Arrays.compare(arr, arr1));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		

	}

}
