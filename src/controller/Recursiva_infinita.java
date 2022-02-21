package controller;

public class Recursiva_infinita {

	public void Estouro_stack(int valor) {
		if (valor == 0){
			System.exit(0);
		}else {
			Estouro_stack(valor);;
		}	
	}
}
