package com.company;

import com.sun.tools.jconsole.JConsoleContext;

import java.awt.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите цвет с большой буквы");
		String color = sc.nextLine();
		switch (color) {
			case "Красный":
				System.out.println("Вы грубый и агресивный");
				break;
			case "Зеленый":
				System.out.println("НЕт ответа");
			case "Белый":
				System.out.println("Вы добрый и мягкий");
				break;
			default:
				System.out.println("404 Error Not Found");
				int a = 23;

		}


	}
}

