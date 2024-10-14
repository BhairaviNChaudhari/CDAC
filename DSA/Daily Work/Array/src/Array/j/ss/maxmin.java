package Array.j.ss;

public class maxmin {
	public static int min(int a [],int N) {
		int mini = Integer.MAX_VALUE;
		for (int i=0;i<N;i++) {
			if(a[i]<mini) {
				mini =a[i];
			}
		}
		return mini;
		
	}
	public static int min(int[]a,int N) {
		int max = Integer.MIN_VALUE;
		for(int i =0;i<N;i++) {
			if(a[i]>max)
				max=a[i];
		}
	}
	return max;
}
