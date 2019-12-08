package ua.lviv.lgs;

public class Home {
	
	public static void main(String[] args) {
		
		// 1. Змінні примітивних типів даних
		
		byte a1 = 127;
		char a2 = 22;
		short a3 = -22;
		int a4 = 5;
		long a5 = 5;
		float a6 = 5;
		double a7 = 5.5;
		
		
		// 2. Мінімальне і максимальне значення типів даних
		
		System.out.println("Byte (min) -> " + Byte.MIN_VALUE);
		System.out.println("Byte (max) -> " + Byte.MAX_VALUE);
		System.out.println();
		
		System.out.println("Character (max) -> " + (Character.MAX_VALUE+0));
		System.out.println("Character (min) -> " + (Character.MIN_VALUE+0));
		System.out.println();
		
		System.out.println("Charset (min) -> " + Short.MIN_VALUE);
		System.out.println("Charset (max) -> " + Short.MAX_VALUE);
		System.out.println();
		
		System.out.println("Integer (min) -> " + Integer.MIN_VALUE);
		System.out.println("Integer (max) -> " + Integer.MAX_VALUE);
		System.out.println();
		
		System.out.println("Long (min) -> " + Long.MIN_VALUE);
		System.out.println("Long (max) -> " + Long.MAX_VALUE);
		System.out.println();
		
		System.out.println("Float (min) -> " + Float.MIN_VALUE);
		System.out.println("Float (max) -> " + Float.MAX_VALUE);
		System.out.println();
		
		System.out.println("Boolean (max) -> " + Boolean.FALSE);
		System.out.println("Boolean (max) -> " + Boolean.TRUE);
		System.out.println("Boolean (max) -> " + Boolean.TYPE);
		System.out.println();
		System.out.println("---------------------------");
		System.out.println();
		
		// 3. масив та min & max значення
		
		int [] value = new int [10]; 
		
		for (int i = 0; i < value.length; i++) {
			value [i] = i;
		}
		
		for (int i = 0; i < value.length; i++) {
			System.out.println(value[i]);
		}
		
		System.out.println("It's min value of the array "+ value[0]);
		System.out.println("It's max value of the array "+ value[value.length-1]);
		
		// First commit to GitHube
		
	}

}
