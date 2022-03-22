public class QuickSort {

	public QuickSort() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myarray[]= {6,3,1,2,5,7,9,8,4,6,5};
		Quick qu = new Quick();
		System.out.println("The array befort QuickSort is:");
		for(int i=0;i<myarray.length;i++) {
			System.out.print(myarray[i]);
		}
		qu.Sort(myarray,0,myarray.length-1);
		System.out.println("\nThe array after QuickSort is:");
		for(int i=0;i<myarray.length;i++) {
			System.out.print(myarray[i]);
		}
	}

}
