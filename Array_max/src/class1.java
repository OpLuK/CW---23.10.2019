import java.util.Scanner;
public class class1 {
	public static void main (String [] args) {
		int i;
		int [] MyArray = new int [10];
		Scanner in = new Scanner (System.in);
			for (i = 0; i < 10; i = i + 1) {
				System.out.println ("Введите " + i + " элемент массива: "); 
				MyArray[i] = in.nextInt();
			}
			in.close();
			System.out.print("Ваш массив: [ ");
			for (i = 0; i < 10; i = i + 1) {
				System.out.print(MyArray[i] + " ");
			}
			System.out.println("]");
		int max = MyArray [0];
		int min = MyArray[0];
		for (i = 0; i <= 9; i = i + 1) {
			if (MyArray[i] > max) {
				max = MyArray [i];
			}
			if (MyArray[i] < min) {
				min = MyArray[i];
			}
		}
		System.out.println("Наибольший элемент массива равен: " + max);
		System.out.println("Наименьший элемент массива равен: " + min);
	}
}
