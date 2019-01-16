package dam.m11.pruebasArrays;

public class PruebasArraysII {

	public static void main(String[] args) {
		int c = 15;
		int j = 1;
		
		int [] primos = {2,3,5,7};
		
		int [] array = {1, primos [2], c, (int) Math.pow(2, 2)};
		
		System.out.println("Elementos de array antes del cambio");
		System.out.println("array[0]: " +  array[0]);
		System.out.println("array[0]:" +  array[1] + ", array[2]:" + array[2]);
		System.out.println("array[3]: " + array[3]);
		
		array[0] = 0;
		array [j++ + array[0]] = 1; //estamos accediendo a array[1]
	}

}
