package az.ingress.ms28spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Ms28SpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(Ms28SpringApplication.class, args);

		Calculator();
	}

	public static double toplama(double a, double b) {
		return a + b;
	}

	public static double cixma(double a, double b) {
		return a - b;
	}

	public static double vurma(double a, double b) {
		return a * b;
	}

	public static double bolme(double a, double b) {
		return a / b;
	}

	public static void Calculator() {

		Scanner ab = new Scanner(System.in);
		String yn = "yes";
		while(yn.equals("yes")) {
			System.out.println("a ni daxil edin");
			double a = ab.nextDouble();

			System.out.println("b ni daxil edin");
			double b = ab.nextDouble();

			System.out.println("Operatoru daxil edin: + 1  - 2  * 3  / 4");
			int operation = ab.nextInt();

			double result = 0;
			if (operation == 1) {
				result = toplama(a, b);
			} else if (operation == 2) {
				result = cixma(a, b);
			} else if (operation == 3) {
				result = vurma(a, b);
			} else if (operation == 4) {
				result = bolme(a, b);
			} else {
				System.out.println("Bele operator yoxdur");
			}
			System.out.println("result=" + result);

			System.out.println("Davam etmek isteyirsiniz? yes/no ");

			yn = ab.next();
			if (yn.equals("yes")) {

			} else if (yn.equals("no")) {

			} else {
				while (!(yn.equals("yes") || yn.equals("no"))) {
					System.out.println("Qerarnizi duzgun qeyd edin yes/no");
					yn = ab.next();
				}
			}
			System.out.println("Bize guvendiginiz ucun size tesekkur edirik");
		}
	}
}
