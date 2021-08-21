package com.company;

import com.sun.tools.jconsole.JConsoleContext;

import java.awt.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введите ваш возраст");
		int age = sc.nextInt();

		Scanner rc = new Scanner(System.in);
		System.out.println("Введите температуру");
		int temp = sc.nextInt();

		if( age > 20 && age < 45 || temp > -20 && temp < 30 ||
				age<20 && temp > 0 && temp < 28 || age > 45 && temp > -10 && temp < 25 ){
			System.out.print("можно гулять");
		}else{
			System.out.print("Оставайся дома");

		}
		}

//		switch (age) {
	//case "Красный":
	//			System.out.println("Вы грубый и агресивный");
	//			break;
	//		case "Зеленый":
	//			System.out.println("НЕт ответа");
	//		case "Белый":
	//			System.out.println("Вы добрый и мягкий");
	//			break;
	//		default:
	//			System.out.println("404 Error Not Found");
	//			int a = 23;

		}





