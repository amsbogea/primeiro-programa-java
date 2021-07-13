package cursojava.executavel;

public class PrimeiraClasseJava4 {

	// main � um m�todo auto execut�vel em Java
	public static void main(String[] args) {

		int mediaAluno = 50;
		String nome = "Alex";

		if (mediaAluno >= 70 && nome.equals("Alex")) {
			System.out.println("Parab�ns, voc� est� aprovado!");
		} else if (mediaAluno >= 40 && mediaAluno < 70 && nome.equals("Alex")) {
			System.out.println("Voc� est� em recupera��o!");
		} else
			System.out.println("Voc� est� em reprovado!");
	}
}
