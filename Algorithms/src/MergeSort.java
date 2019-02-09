
public class MergeSort {
	
	private int[] arr;
	private int[] tempMergArr;
	private int len;
	
	public void mergeParts(int low, int mid, int high) {
		for(int i=low; i<=high; i++) {
			tempMergArr[i] = arr[i];
		}
		
		int i=low;
		int j=mid+1;
		int k=low;
		while(i <= mid && j<= high) {
			if(tempMergArr[i] <= tempMergArr[j]) {
				arr[k] = tempMergArr[i];
				i++;
			} else {
				arr[k] = tempMergArr[j];
				j++;
			}
			k++;
		}
		
		while (i <= mid) {
			arr[k] = tempMergArr[i];
			k++;
			i++;
		}
	}
	
	public void doMergeSort(int low, int high) {
		if ( low < high ) {
		int mid = low + (high - low) / 2;
		doMergeSort(low, mid);
		doMergeSort(mid+1, high);
		mergeParts(low, mid, high);
		}
	}
	
	public void sort(int[] inputArr) {
		arr = inputArr;
		len = inputArr.length;
		tempMergArr = new int[len];
		doMergeSort(0, len-1);
	}
	
	public static void main(String[] args) {
		int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
		MergeSort ms = new MergeSort();
		ms.sort(inputArr);
		for(int i:inputArr){
            System.out.print(i);
            System.out.print(" ");
        }
	}
}
