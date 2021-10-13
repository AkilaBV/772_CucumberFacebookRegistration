import java.util.Arrays;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SumnumsOfDiffFirstLastDigitsArray {

	public int calculate(int[] arr) {
		int sum=0,diff=0;
		Arrays.sort(arr);
		if(arr.length==0) {
			return sum;
		}
		int l=arr.length;
		if(arr[0]>arr[l-1]) {
			diff=arr[0]-arr[l-1];
		}else {
			diff=arr[l-1]-arr[0];
		}
		System.out.println("diff : " + diff);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==diff) {
				sum+=arr[i];
				System.out.println(sum);
			}
			
		}
		
		return sum;
	}
	@Test
	public void test1() {
		int T=2;
		int a[]= {1,2,3,3,2};
		//int b[]= {1,4,3,3,3};
		Assert.assertTrue(calculate(a)==4);
		//Assert.assertTrue(calculate(b)==9);
	}
	
	@Test
	public void test2() {
		int b[]= {1,4,3,3,3};
		Assert.assertTrue(calculate(b)==9);
		
	}
}
