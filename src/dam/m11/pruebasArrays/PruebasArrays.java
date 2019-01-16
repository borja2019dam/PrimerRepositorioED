package dam.m11.pruebasArrays;

public class PruebasArrays {

	public static void main(String[] args) {
		
		int [] primos = {2,3,5,7,11,13,0};
		
		System.out.println("Tamaño del Array primos "+ primos.length);
		primos[6] = 17;
		
		String[] palabras = new String[4];
		palabras[0] = "casa";
		palabras[1] = "coche";
		palabras[2] = "perro";
		
		int tamPalabras = palabras.length;
		System.out.println("El tamaño del array palabras es " + tamPalabras);
		
		System.out.println("\nEl contenido de arrays primos es:");
		for (int i = 0; i < primos.length; i++) {
			System.out.println(primos[i]);
		}
		System.out.println("\nEl contenido del array palabras es:");
		for (int i = 0; i <palabras.length; i++) {
			System.out.println(palabras[i]);
		}
		palabras[3] = "gato";
		System.out.println("\nEl contenido del array palabras es:");
		for (int i = 0; i <palabras.length; i++) {
			System.out.println(palabras[i]);
		}
		
	}

}
