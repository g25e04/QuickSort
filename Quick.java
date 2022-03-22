public class Quick {

	public Quick() {
		// TODO Auto-generated constructor stub
	}

	
	public int Partition(int myarray[], int low, int high) {
		//i is the index of the smallest
		int i = low - 1;
		
		for(int j = low;j<high;j++) {
			if(myarray[j]<myarray[high]) {
				i++;
				int temp = myarray[i];
				myarray[i]=myarray[j];
				myarray[j]=temp;
			}
		}
		
		//swap myarray[i+1] and myarray[high](bigger)
		int temp = myarray[i+1];
		myarray[i+1]=myarray[high];
		myarray[high]=temp;
		//because i = low-1 at start, so return i+1	
		return i+1;
	}
	
	public void Sort(int myarray[], int low, int high) {
		if(low<high) {
			int i = Partition(myarray, low, high);
			//Now i is in the ture place, so not use i
			Sort(myarray,low,i-1);
			Sort(myarray,i+1,high);
		}
	}
}
