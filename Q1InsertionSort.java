import java.util.Scanner;
class Q1InsertionSort{
	static void display(int arr[], int n){
		for(int i= 0;i<n;i++){
			System.out.print("  "+arr[i]);
		}
		System.out.println();
	}
	static int[] SetArrary(int n){
		int arr[] = new int[n];;
		Scanner sc = new Scanner(System.in);
		for(int i= 0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	static void  insertionSort(int arr[], int n){
		int j, key;
		for(int i = 1;i<n;i++){
			key = arr[i];
			j= i-1;
			while(j>=0 && arr[j]>key){
				arr[j+1]= arr[j];
				j--;
				display(arr, n);
			}
			arr[j+1]= key;
		}
	}
	
	public static void main(String... args){
		Scanner sc = new Scanner(System.in);
		System.out.print("n :");
		int n = sc.nextInt();
		int arr[] = SetArrary(n);
		display(arr, n);
		insertionSort(arr, n);
		display(arr, n);
	}
}

















// static void  insertionSort(int arr[], int n){
		// int j, key;
		// for(int i = n;i>=0;i++){
			// key = arr[i-1];
			// j= i+1;
			// while( arr[j]>key){
				// arr[j] = arr[j-1];
				// j++;
			// }
			// arr[j-1]= key;
		// }
	// }