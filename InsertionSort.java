import java.util.ArrayList;

public class InsertionSort {

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
		
	System.out.print("Nilai awal : " + nilai.toString()+"\n");
		
	ArrayList<Double> output = sort(nilai);
		
	System.out.println("Hasil Sorting : " + output.toString());	
	}

	private static ArrayList<Double> sort(ArrayList<Double> data) {
		for(int i=1;i<=data.size()-1;i++){
			double v = data.get(i);
			int j = i;
			while(j > 0 && data.get(j-1) > v){
				data.set(j, data.get(j-1));
				j--;
			}
			data.set(j, v);
			
			System.out.println("Step ke-"+i+ data.toString());
		}
		return data;
	}

}