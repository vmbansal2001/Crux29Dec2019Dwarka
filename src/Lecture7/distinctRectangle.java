package Lecture7;

public class distinctRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,2,3,4,5};
		int area=10;
		
		int left=0;
		int right=arr.length-1;
		int count=0;
		while(left<=right) {
			if(arr[left]*arr[right]<area) {
				count=count+2*(right-left)+1;
				left++;				
			}else {
				right--;
			}
		}
		
		System.out.println(count);
		

	}

}
