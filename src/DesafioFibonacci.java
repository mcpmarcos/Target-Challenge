public class DesafioFibonacci {

	public static void main(String[] args) {
		int inicialNumber = 13;
		generateCustomFibonacciSequence(inicialNumber);
	}
	
	public static void generateCustomFibonacciSequence(int inicialNumber){
		int sequenceSize = 30;
		int x = inicialNumber, y = x + 1;
		System.out.println("\u001B[32m" + "Fibonacci sequency started by number " + 
		inicialNumber + ": \n" + "\u001B[0m");
		System.out.print(x + " ");
		for (int i = 1; i < sequenceSize; i++) {
		System.out.print(y + " ");
		int aux = y;
		y += x;
		x = aux;
		}
		System.out.println();
		checkNumber(inicialNumber);
	}

	public static void checkNumber(int inicialNumber) {
		int[]array = new int[30];
		array = getFibonacciSequency(array);
		for (int i = 0; i < array.length; i++) {
			if(inicialNumber == array[i]) {
				System.out.println("\u001B[32m" + "\nThe number " + inicialNumber + 
						" belongs to the original fibonacci sequence;\n" + "\u001B[0m");
			} 
		}
		System.out.print("\u001B[32m" + "See the Fibonacci sequency started by 0: \n\n" + 
		"\u001B[0m");

		for (int i = 0; i < array.length; i++) {
			System.out.print("" + array[i] + " ");
		}
	}
	
	public static int[] getFibonacciSequency(int[] seqFibonacci) {
		int a = 0;
		int b = 1;
		seqFibonacci[0] = 0;
		for (int i = 1; i < seqFibonacci.length; i++) {
			int aux =  b;
			b += a;
			a = aux;
			seqFibonacci[i] = b;
		}
		return seqFibonacci;
	}
}
