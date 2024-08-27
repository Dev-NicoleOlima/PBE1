package prjZoologico;

public class Aplicacaozoo {

	public static void main(String[] args) {
		ClasseAnimais elefante = new ClasseAnimais();
//Apenas o contrutor é acompanhado pelos parentêses
		elefante.atributoNome = "Dumbo";
		elefante.atributoEspecie = "Africano";
		elefante.atributoSexo = "Macho";
		elefante.atributoPeso = 170;
		
		ClasseAnimais girafa = new ClasseAnimais("Mel", "russa", "femea", 50);
		
		SubClasseCarnivoro leao = new SubClasseCarnivoro ();
		leao.atributoNome = "Leãodro";
		leao.atributoEspecie = "Australeandro";
		leao.atributoSexo = "Macho";
		leao.atributoPeso = 123;
		
		
			leao.exibirInfo();
			leao.metodoCacar();
			
			
			elefante.exibirInfo();
		
			
			elefante.metodoComer();
			
			
			elefante.exibirInfo();
			

			girafa.exibirInfo();
			
			
	}

}
