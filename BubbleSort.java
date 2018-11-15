import java.util.ArrayList;
import java.util.Collections;
public class BubbleSort {

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
	
	ArrayList<Double> output = sort(nilai);
	
	System.out.println("Hasil Sorting : " + output.toString());
	}

	private static ArrayList<Double> sort(ArrayList<Double> data) {
	int swapped = 1;
	for(int i=data.size()-1;i>=0 && data.size()-1 >= swapped; i--){
		swapped = 0;
		for(int j=0;j<=i-1;j++){
			if(data.get(j)>data.get(j+1)){
				double temp = data.get(j);
				data.set(j, data.get(j+1));
				data.set((j+1), temp);
				swapped = 1;
			}
		}
		
		System.out.println("STEP : ->" +data.toString());
	}
		return data;
	}

}