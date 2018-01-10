package com.javaex.problem01;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result;

		while (true) {

			System.out.print(">> ");
			String strLine = sc.nextLine();

			if (strLine.equals("/q")) {
				System.out.println("종료합니다.");
				break;
			}

			String data[] = strLine.split(" ");
			int leftVal = Integer.parseInt(data[0]);
			int rightVal = Integer.parseInt(data[2]);
			String middleVal = data[1];

			switch (middleVal) {
			case "+":
				Add add = new Add();
				add.setValue(leftVal, rightVal);
				result = add.calculate();
				System.out.println(">> " + result);
				break;

			case "-":
				Sub sub = new Sub();
				sub.setValue(leftVal, rightVal);
				result = sub.calculate();
				System.out.println(">> " + result);
				break;

			case "*":
				Mul mul = new Mul();
				mul.setValue(leftVal, rightVal);
				result = mul.calculate();
				System.out.println(">> " + result);
				break;

			case "/":
				Div div = new Div();
				div.setValue(leftVal, rightVal);
				result = div.calculate();
				System.out.println(">> " + result);
				break;

			default:
				System.out.println("알 수 없는 연산입니다.");
				break;
			}
		}

		sc.close();
	}
}
