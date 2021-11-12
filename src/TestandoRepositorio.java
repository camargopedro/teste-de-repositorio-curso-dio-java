import java.util.Scanner;

public class TestandoRepositorio {

	public static void main(String[] args) {

		String name1 = "";
		String name2 = "";
		String name3 = "";
		int idade1 = 0;
		int idade2 = 0;
		int idade3 = 0;
		
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o 1o nome: ");
		name1 = entrada.next();
		System.out.println("Digite o 2o nome: ");
		name2 = entrada.next();
		System.out.println("Digite o 3o nome: ");
		name3 = entrada.next();
		
		System.out.println("Digite a idade do 1o nome: ");
		idade1 = entrada.nextInt();
		System.out.println("Digite a idade do 2o nome: ");
		idade2 = entrada.nextInt();
		System.out.println("Digite a idade do 3o nome: ");
		idade3 = entrada.nextInt();
		
		System.out.println("== Dados entrados == ");
		System.out.println(name1 +": " + idade1);
		System.out.println(name2 +": " + idade2);
		System.out.println(name3 +": " + idade3);
		System.out.println();
		System.out.println("A média de idade dos 3 é de: " + (idade1 + idade2 + idade3)/3);
		System.out.println();
		System.out.println("== FIM == ");
		
	}

}
