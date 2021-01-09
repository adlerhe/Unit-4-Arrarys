package Array_Challenges;

public class Array_Challenges {
	
	public void Q1(double[] nums) {
		double sum;
		for(int i = 0; i < nums.length; i++) {
			sum = nums[i]*i;
		}
	}
	public void Q2(char[]letters) {
		String str = "";
		for(int i=0;i<letters.length;i++) {
			if(letters[i] >= 'a' && letters[i] <= 'z') {
				str += letters[i];
			}
		}
	}
	public static void main(String[] args) {

	}

		
	}


