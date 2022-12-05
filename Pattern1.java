import java.util.stream.IntStream;

public class Pattern1 {
public static void main(String[] args) {
	//System.out.println("hello");
	//pattern1(5);
	long start = System.currentTimeMillis();
	IntStream.range(1, 100).forEach(x->System.out.println(Thread.currentThread().getName()+" "+x));
	long end = System.currentTimeMillis();
	System.out.println("Milli Secs -->"+(end-start));
	
	long start2 = System.currentTimeMillis();
	IntStream.range(1, 100).parallel().forEach(x->System.out.println(" "+Thread.currentThread().getName()+" "));
	long end2 = System.currentTimeMillis();
	System.out.println("Milli Secs -->"+(end2-start2));
}
public static void pattern1(int n) {
	/*
	 * for(int row=1;row<=n;row++) { for(int space=1; space<=n-row;space++) {
	 * //System.out.println(" "+space); System.out.print(" "); } for(int
	 * star=1;star<(row*2);star++) { System.out.print("*"); }
	 * System.out.println(""); }
	 */
	/*
	 * for ( int row = 1 ; row < n*2 ; row++) { int rowPrint = (row > n) ? (n*2)-row
	 * : row; System.out.println(rowPrint); int spaces = n-rowPrint; for(int space =
	 * 0 ; space<spaces; space++) { System.out.print(" "); } for(int print=0;
	 * print<rowPrint;print++) { System.out.print("* "); } System.out.println(""); }
	 */
	
	/*
	 * for (int row =0 ; row<n; row++) { for( int space = 1; space <n-row; space++)
	 * { System.out.print(" "); } for(int star=0; star<=row; star++) {
	 * System.out.print("*"); } System.out.println(); }
	 */
	
	/*
	 * for(int row=0; row < n*2;row++) {
	 * 
	 * for(int space = 1 ; space <= row ; space++) { System.out.print(" "); }
	 * for(int star=0; star<n*2-row;star++) { System.out.print("* "); }
	 * 
	 * System.out.println(""); }
	 */
	
	for(int row =1 ; row<=n*4; row=row+2) {
		int spaceStr = (row > n*2) ? (n*2)-2 : row;
		int starStr = n*2-row;
		 
		for(int space = 1 ; space < spaceStr; space++) {
			System.out.print(" ");
		}
		for(int star=1; star<=n*2-row; star++) {
			System.out.print("* ");
		}
		System.out.println("");
	}
}
}
