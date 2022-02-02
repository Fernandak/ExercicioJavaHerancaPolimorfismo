package br.com.ExerciciosHeranca;

public class Main {

	public void emitirSom( Animal animal ) {
		animal.emitirSom();
	}

	public static void main(String[] args) {

		Main m = new Main();
		m.emitirSom( new Animal());

		Cachorro dog = new Cachorro();

		dog.setNome("Lassie");
		dog.setIdade(2);

		System.out.println("Cachorro:");
		System.out.println("Nome: "+dog.getNome());
		System.out.println("Idade: "+dog.getIdade()+" anos");

		m.emitirSom( new Cachorro());
		dog.Correr();

		System.out.println();

		Cavalo Hor = new Cavalo();

		Hor.setNome("Bojack");
		Hor.setIdade(15);

		System.out.println("Cavalo:");
		System.out.println("Nome: "+Hor.getNome());
		System.out.println("Idade: "+Hor.getIdade()+" anos");

		m.emitirSom( new Cavalo());
		Hor.Correr();

		System.out.println();
		Preguica laz = new Preguica();

		laz.setNome("Sid");
		laz.setIdade(20);

		System.out.println("Pregui�a:");
		System.out.println("Nome: "+laz.getNome());
		System.out.println("Idade:"+laz.getIdade()+" anos");

		m.emitirSom( new Preguica());
		laz.subirArvore();
	}

}
