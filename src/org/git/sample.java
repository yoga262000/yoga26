package org.git;

public class sample {
public static void main(String[] args) {
	int a[] = new int[5];
	
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50;
	
	int length = a.length;
	System.out.println(length);
	
	System.out.println("*********************");
	
	System.out.println(a[3]);
	
	System.out.println("**********************");
	
	for (int i = 0; i < a.length; i++) {
		System.out.println(i);
	}
}
}
