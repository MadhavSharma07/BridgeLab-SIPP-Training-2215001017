
public class FirstNegativeNumber {

	public static void main(String[] args) {
		int[] arr = {2,4,-6,8,10};
		boolean found = false;
		for(int i = 0 ;i<arr.length;i++) {
			if(arr[i]<0) {
				System.out.println(i);
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println("-1");
		}
		
	}
}