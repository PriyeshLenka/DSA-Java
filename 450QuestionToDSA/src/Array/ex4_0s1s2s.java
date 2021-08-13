package Array;
//Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo

import java.util.Arrays;

public class ex4_0s1s2s {
	static void sort(int nums[])
    {
        int l = 0;
        int n=nums.length;
		int h = n - 1;
        int m = 0, temp = 0;
        while (m <= h) {
            switch (nums[m]) {
            case 0: {
                temp = nums[l];
                nums[l] = nums[m];
                nums[m] = temp;
                l++;
                m++;
                break;
            }
            case 1:
                m++;
                break;
            case 2: {
                temp = nums[m];
                nums[m] = nums[h];
                nums[h] = temp;
                h--;
                break;
            }
            }
        }
    }
	public static void main(String[] args) {
		int arr[]= {2,0,2,1,1,0};
		sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
