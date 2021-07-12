package cursojava.executavel;

public class PrimeiraClasseJava4 {

	//main é um método auto executável em Java
	public static void main(String[] args) {
		
		int mediaAluno = 50;
		String nome = "Alex";
		
		if(mediaAluno >= 70 && nome.equals("Alex")) {
			System.out.println("Parabéns, você está aprovado!");
		}   else if (mediaAluno >=40 && mediaAluno < 70 && nome.equals("Alex")) {
			System.out.println("Você está em recuperação!");
		}else 
			System.out.println("Você está em reprovado!");
	}
}
