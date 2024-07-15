package DoubleArraysHandle;
public class Array {

	public static void main(String[] args) {
    int[][]x= {{10,20,30},{5,15,25},{87,34,98,45,76}};
    
    for(int i=0;i<x.length;i++) {
    	for(int n=0;n<x[i].length;n++)
    	System.out.print(x[i][n]+" ");	
    	}                     
	}
}