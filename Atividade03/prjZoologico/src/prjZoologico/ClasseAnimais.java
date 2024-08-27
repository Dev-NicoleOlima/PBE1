package prjZoologico;

public class ClasseAnimais {
	//Atributos
	String atributoNome;
	String atributoEspecie;
	String atributoSexo;
	double atributoPeso;
	
	//Construtores
	public ClasseAnimais() {
	
	}
		public ClasseAnimais(String parametroNome, String parametroEspecie, String parametroSexo, double parametroPeso) {
				this.atributoNome = parametroNome;
				this.atributoEspecie = parametroEspecie;
				this.atributoSexo = parametroSexo;
				this.atributoPeso = parametroPeso;
				
				
		}
		
		//Métodos
		public void metodoComer() {
			if (this.atributoPeso >= 170 ) {
				System.out.println(this.atributoNome + " Está obeso, vamos exercitar");
			}
			else {
				this.atributoPeso = this.atributoPeso + 10;
			}
		}
		public void metodoExercitar() {
			if (this.atributoPeso <= 50) {
				System.out.println(this.atributoNome + "Que tal se alimenbtar?");
			}
			else {
			this.atributoPeso = this.atributoPeso -10;
		}
			}
		public void exibirInfo() {
			System.out.println("Nome: " + this.atributoNome);
			System.out.println("Peso: " + this.atributoPeso);
			
		}
			
				// TODO Auto-generated method stub

			}


