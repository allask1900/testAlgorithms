package zzfu.code.algorithms.test;

import java.util.Random;

import zzfu.code.util.PrintArray;

public abstract class AbstractSort {
	
	public AbstractSort(int arraySize){
		this.arraySize=arraySize;
	}
	public int arraySize=10;
	
	public void testPrint(){
		int[] ints=getArray();
		System.out.print("≈≈–Ú«∞£∫");
		PrintArray.printInts(ints);
		sort(ints);		
		System.out.print("≈≈–Ú∫Û£∫");
		PrintArray.printInts(ints);
	}
	
	public void test(){
		int[] ints=getArray();
		long begin=System.currentTimeMillis();
		System.out.println("begin........");
		sort(ints);
		long end=System.currentTimeMillis()-begin;
		System.out.println("time:"+end+"ms");
		System.out.println("end..........");
	}
	
	public abstract void sort(int[] ints);
	
	public int[] getArray(){
		int[] ints=new int[arraySize];
		Random rd=new Random();
		for(int i=0;i<arraySize;i++){
			int n=arraySize;
			if(arraySize<Integer.MAX_VALUE/10)
				n=arraySize*10;
			ints[i]=rd.nextInt(n);
		}		
		return ints;
	}
}
