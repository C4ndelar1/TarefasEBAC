package moduloNove;

public class wrappersBoxingCasting {

	public static void main(String[] args) {
		
		
		
	//Boxing	
	
	int numero1 = 12;
	Integer numero2 = numero1;
	
	//Confirmando que o tipo se transformou de int pra Integer
	System.out.println(numero2.getClass().getSimpleName());
	//Confirmando que o valor permaneceu o mesmo
	System.out.println(numero2);
	
	
	//Casting
	
	//Casting Explícito
	
	long numero3 = 233212;
	int numero4 = (int) numero3;
	//Confirmando a ocorrencia do casting explícito
	System.out.println(numero4);
	
	//Casting Implícito
	
	int numero5 = 12;
	long numero6 = numero5;
	//Confirmando a ocorrencia do casting implícito
	System.out.println(numero6);
	
	
		
		
		// TODO Auto-generated method stub

		
		
	}

}
