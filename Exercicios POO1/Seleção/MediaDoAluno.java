import java.util.Scanner;

public class MediaDoAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.print("1° Nota: ");
		float nota1 = entrada.nextFloat();
		
		System.out.print("2° Nota: ");
		float nota2 = entrada.nextFloat();
		
		entrada.close();
		
		float media;
		
		media = (nota1 + nota2) / 2;
		
		if (media >= 0 && media <= 2.9) {
			System.out.println("Média: " + media);
			System.out.println("REPROVADO");
		}
		else if (media >= 3 && media <= 6.9) {
			System.out.println("Média: " + media);
			System.out.println("EM EXAME");
		}
		else if (media >= 7 && media <= 10) {
			System.out.println("Média: " + media);
			System.out.println("APROVADO");
		}
	}

}
