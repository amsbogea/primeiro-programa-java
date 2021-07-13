package cursojava.executavel;

public class PrimeiraClasseJava5 {

	// main é um método auto executável em Java
	public static void main(String[] args) {

		int mediaAluno = 69;
		String nome = "Alex";

		/*operadores ternarios - sao usadas para microvalidacoes*/
		String resultado; //variavel
		resultado = mediaAluno >= 70? "Aluno aprovado" : (mediaAluno >= 40 && mediaAluno < 70) ? "Aluno em recuperação" : "Aluno reprovado";
		System.out.println(resultado); //imprime a variavel
	}
}
