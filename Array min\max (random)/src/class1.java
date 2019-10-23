public class class1 {
	public static void main (String [] args) {
		float arifm;
		int sum = 0;
		int i;
		int [] MyArray = new int [10];
		for (i = 0; i < 10; i = i + 1) {
			MyArray [i] = (int)(Math.random()*100);
		}
		System.out.print("Ваш массив: [ ");
		for (i = 0; i < 10; i = i + 1) {
			System.out.print(MyArray[i] + " ");
		}
		System.out.println("]");
		int max = MyArray [0];
		int min = MyArray[0];
		for (i = 0; i < 10; i = i + 1) {
			if (MyArray[i] > max) {
				max = MyArray [i];
			}
			if (MyArray[i] < min) {
				min = MyArray[i];
			}
			sum = sum + MyArray[i];
		}
		arifm = sum / MyArray.length;
		System.out.println("Наибольший элемент массива равен: " + max);
		System.out.println("Наименьший элемент массива равен: " + min);
		System.out.println("Среднее арифметическое равно: " + arifm);
	}
}