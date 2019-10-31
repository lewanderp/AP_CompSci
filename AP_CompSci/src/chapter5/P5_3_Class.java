package chapter5;

public class P5_3_Class {
	
	private int nums [] = new int [3];
	
	P5_3_Class(int a, int b, int c){
		nums[0] = a;
		nums[1] = b;
		nums[2] = c;
	}
	public String numsToString() {
		String toPrint = ("[ " +nums[0]+", "+nums[1]+", "+nums[2]+"] ");
		return toPrint;
	}
	public void sortNums() {
		int n = nums.length; 
        for (int i = 0; i < n-1; i++) {
        	for (int j = 0; j < n-i-1; j++) {
        		if (nums[j] > nums[j+1]) {
                    int temp = nums[j]; 
                    nums[j] = nums[j+1]; 
                    nums[j+1] = temp; 
                }
        	}        
        } 
	}
}
