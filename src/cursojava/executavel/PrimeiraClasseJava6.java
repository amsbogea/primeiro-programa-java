package cursojava.executavel;

public class PrimeiraClasseJava6 {

    // main é um método auto executável em Java
    public static void main(String[] args) {

        double nota1 = 50;
        double nota2 = 50;
        double nota3 = 50;
        double nota4 = 88;
        double media = 0;

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        /*operações lógicas aninhadas -sao operações dentro de operações*/
        if (media >= 50) {
            if (media >= 70) {
                if (media >= 90) {
                    System.out.println("Aluno está aprovado direto - Parabens! media do aluno " + media);
                } else {
                    System.out.println("Aluno está aprovado direto, media do aluno " + media);
                }
            } else {
                System.out.println("Aluno está reprovado");
            }
        }
    }
}
