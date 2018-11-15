import java.util.*;

public class HashTable {

	public static void main(String[] args) {
		ArrayList<Double> data = new ArrayList<Double>();
		data.add(5.0);
		data.add(2.0);
		data.add(8.0);
		data.add(1.0);
		data.add(2.0);
		data.add(9.0);
		data.add(45.0);
		data.add(2.0);
		data.add(3.0);
		data.add(8.0);
		data.add(6.0);
		data.add(4.0);
		data.add(3.0);

		System.out.println("Data : " + data.toString());

		Scanner s = new Scanner(System.in);
		System.out.print("Masukkan kunci pencarian: ");
		double key = s.nextDouble();
		int posisi = -1;
		for (int i = 0; i < data.size(); i++) {
			if (key == data.get(i)) {
				posisi = i;
				break;
			}
		}
		if (posisi != -1) {
			System.out.println("KEY: " + key + " Berada di index array list: " + posisi);
		} else {
			System.out.println("KEY TIDAK DITEMUKAN");

		}

	}

}