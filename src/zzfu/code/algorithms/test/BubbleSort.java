package zzfu.code.algorithms.test;
 

public class BubbleSort extends AbstractSort {

	public BubbleSort(int arraySize) {
		super(arraySize); 
	}

	public static void main(String[] args) {
		new BubbleSort(100000).test();
	}
	
	public void sort(int[] ints){
		for(int i=1;i<ints.length;i++){ 
			for(int j=0;j<i;j++){				 
				if(ints[i]<ints[j]){
					int a=ints[j];
					ints[j]=ints[i];
					ints[i]=a;
				}
			}
		}
	}
}
