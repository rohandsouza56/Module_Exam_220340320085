
class InsertionSort{
	
	void insertionSort(int arrnew[],int size){
		for(int i = size -1;i>0;i--){
			int key = arrnew[i];
			int j = i - 1;
			while(j>0 && key<arrnew[j]){
				arrnew[j+1] = arrnew[j];
				for(int k = 0;k<arrnew.length;k++){
					System.out.print(arrnew[k]+" ");
				}
				System.out.println();
				j--;
			}
			arrnew[j+1] = key;
			
		}
	}
	
	
	public static void main(String args[]){
		int arr[] = {2,4,6,8,3};
		int size = arr.length;
		InsertionSort s = new InsertionSort();
		s.insertionSort(arr,size);
		for(int k = 0;k<size;k++){
			System.out.print(arr[k]+" ");
		}
		System.out.println();
	}
}