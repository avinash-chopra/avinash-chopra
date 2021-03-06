/**
 * 
 */

/**
 * @author admin
 *
 */
public class SortingArray {

	/**
	 * @param args
	 */
	public int[] join(int a[], int asize, int b[], int bsize, int c[]){
		int aIndex ;
		int bIndex ;
		int cIndex ;
		
		aIndex = 0;
		bIndex = 0;
		cIndex = 0;
		 for(int i = 0; aIndex < asize && bIndex < bsize ; i++){
			 if(a[aIndex] > b[bIndex] ){
				 c[i] = b[bIndex] ;
				 bIndex++; 
			 }else{
				 c[i] = a[aIndex];
				 aIndex++;
			 }	 
			 cIndex = i;
		 }
		 if(aIndex == asize){
			 for(int i = bIndex ; i < bsize ; i++){
				 cIndex++ ;
				 c[cIndex] = b[bIndex] ;
				 bIndex++;
			 }
		 }else{
			 for(int i = aIndex ; i < asize ; i++){
				 cIndex++ ;
				 c[cIndex] = a[aIndex] ;
				 aIndex++;
			 }
		 }
		 
		
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int MAX_ARRAY_SIZE = 20;
		SortingArray sampleClass = new SortingArray();
		int a[] = {2,4,8};
		int b[] = {1,4,7,9,78};
		int c[] = new int[MAX_ARRAY_SIZE] ;
		int d[] = sampleClass.join(a, 3, b, 5, c);
		for(int i=0;i<(a.length+b.length);i++){
			System.out.println(d[i]);
		}
	}

}
