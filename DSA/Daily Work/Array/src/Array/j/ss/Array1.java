package Array.j.ss;

public class Array1 {
	public static void main(String[] args) {
		int a[]=new int[100];
		int size = 10;
		a[0]=11;
		a[1]=12;
		a[2]=13;
		a[3]=14;
		a[4]=15;
		a[5]=16;
		a[6]=17;
		a[7]=18;
		a[8]=19;
		a[9]=20;
		a[10]=21;
		
		for(int i=0;i<size;i++) {
			System.out.print(a[i]+" ");
		}
		
		int key = 20;
		for(int j=0;j<size;j++) {
			if(a[j]==key)
				break;
			
		
		if( a[j] == size)
			System.out.println("Not found");
		else 
			System.out.println("found");
		}
	}

}
