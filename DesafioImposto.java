package estruturaCondicional;

import java.util.Scanner;

public class DesafioImposto {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double salarioAnual, prestacaoServicos, rendaCapital, gastosMedicos, gastosEducacionais, salarioMes;
		double impostoSalario = 0, impostoServicos = 0, impostoCapital = 0, impostoBruto = 0, gastosDeducoes = 0,
				maximoDedutivel = 0, impostoDevido = 0;

		System.out.print("Renda anual com salario: ");
		salarioAnual = sc.nextDouble();
		System.out.print("Renda anual com prestacao de servicos: ");
		prestacaoServicos = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		rendaCapital = sc.nextDouble();
		System.out.print("Gastos medicos: ");
		gastosMedicos = sc.nextDouble();
		System.out.print("Gastos educacionais: ");
		gastosEducacionais = sc.nextDouble();

		System.out.println();
		System.out.println("RELATORIO DE IMPOSTO DE RENDA");
		System.out.println();

		System.out.println("CONSOLIDADE DE RENDA");

		// imposto salario
		salarioMes = salarioAnual / 12;
		if (salarioMes < 3000) {
			impostoSalario = 0;
			System.out.printf("IMPOSTO SOBRE SALARIO: R$ %.2f%n", impostoSalario);
		} else if (salarioMes >= 3000 && salarioMes <= 5000) {
			impostoSalario = salarioAnual * 0.1;
			System.out.printf("IMPOSTO SOBRE SALARIO: R$ %.2f%n", impostoSalario);
		} else {
			impostoSalario = salarioAnual * 0.2;
			System.out.printf("IMPOSTO SOBRE SALARIO: R$ %.2f%n", impostoSalario);
		}

		// imposto prestacao de servicos
		if (prestacaoServicos > 0) {
			impostoServicos = prestacaoServicos * 0.15;
			System.out.printf("IMPOSTO SOBRE SERVICOS: R$ %.2f%n", impostoServicos);
		}

		// imposto capital
		if (rendaCapital > 0) {
			impostoCapital = rendaCapital * 0.2;
			System.out.printf("IMPOSTO SOBRE GANHO DE CAPITAL: R$ %.2f%n", impostoCapital);
		}

		impostoBruto = impostoCapital + impostoSalario + impostoServicos;
		maximoDedutivel = impostoBruto * 0.3;
		gastosDeducoes = gastosEducacionais + gastosMedicos;

		System.out.println();
		System.out.println("DEDUCOES: ");
		System.out.printf("Maximo dedutivel: R$ %.2f%n", maximoDedutivel);
		System.out.printf("Gastos dedutiveis: R$ %.2f%n", gastosDeducoes);
		System.out.println();
		System.out.println("RESUMO: ");

		if (maximoDedutivel > gastosDeducoes) {
			impostoDevido = impostoBruto - gastosDeducoes;
			System.out.printf("Imposto bruto total: R$ %.2f%n", impostoBruto);
			System.out.printf("Abatimento: R$ %.2f%n", gastosDeducoes);
			System.out.printf("Imposto devido: R$ %.2f%n", impostoDevido);
		} else {
			impostoDevido = impostoBruto - maximoDedutivel;
			System.out.printf("Imposto bruto total: R$ %.2f%n", impostoBruto);
			System.out.printf("Abatimento: R$ %.2f%n", maximoDedutivel);
			System.out.printf("Imposto devido: R$ %.2f%n", impostoDevido);
		}
		sc.close();
	}
}