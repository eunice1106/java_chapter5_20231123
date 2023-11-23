package chapter5_2;

public class UpgradeForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {1, 2 ,3, 4};
		int sum = 0;
		
//		for(int i=0;i<arr1.length;i++) {
//			sum = sum + arr1[i];
//		}
		
		boolean[] arrBool = {false, true, true};
		boolean[] arrBoo2 = new boolean[3];
		//boolean은 0, 즉 false로 초기화됨
		
		//파이썬문법:for i in arr1:
		//향상된 for문 -> 파이썬문법과 유사
		for(int value:arr1) {
			sum = sum + value;
			
		}
		
		System.out.print(sum);
		
	} 

}
