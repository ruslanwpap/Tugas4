import java.util.ArrayList;

public class QuickSort {

	public static void main(String[] args) {
		ArrayList<Double> nilai = new ArrayList<Double>();
		nilai.add(18.17);
		nilai.add(16.17);
		nilai.add(24.12);
		nilai.add(21.45);
		nilai.add(46.33);
		nilai.add(63.31);
		nilai.add(18.17);
		nilai.add(11.32);
		nilai.add(28.10);
		nilai.add(37.46);
		nilai.add(21.45);
		nilai.add(16.17);
		nilai.add(21.45);
		nilai.add(9.53);
		nilai.add(27.6);

		System.out.println("Nilai awal : " + nilai.toString());

		ArrayList<Double> output = sort(nilai, 0, nilai.size() - 1);

		System.out.println("Hasil Sorting : " + output.toString());

	}

	private static ArrayList<Double> sort(ArrayList<Double> data, int low, int high) {
		if (data == null || data.size() == 0) {
			return data;
		}
		if (low >= high) {
			return data;
		}
		int mid = low + (high - low) / 2;
		double pivot = data.get(mid);

		int i = low, j = high;

		while (i <= j) {
			while (data.get(i) < pivot) {
				i++;
			}
			while (data.get(j) > pivot) {
				j--;
			}
			if (i <= j) {
				swap(data, i, j);
				i++;
				j--;
			}
		}
		if (low < j) {
			sort(data, low, j);
		}
		if (high > i) {
			sort(data, i, high);
		}
		System.out.println("Step ->" + data.toString());
		return data;
	}

	private static void swap(ArrayList<Double> data, int x, int y) {
		double temp = data.get(x);
		data.set(x, data.get(y));
		data.set(y, temp);
	}

}