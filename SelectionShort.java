import java.util.ArrayList;

public class SelectionShort {

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
	
	System.out.println("Nilai awal : " + nilai.toString());
	
	ArrayList<Double> output = sort(nilai);
	
	System.out.println("Hasil Sorting : " + output.toString());
	}

	private static ArrayList<Double> sort(ArrayList<Double> data) {
		int n = data.size();
		for (int i=0;i<n-1;i++){
			int min = i;
			for (int j=i+1;j<n;j++){
				if(data.get(j)<data.get(min)){
					min = j;
				}
			}
			if (min != i){
				Double tempData = data.get(i);
				data.set(i, data.get(min));
				data.set(min, tempData);
			}
		System.out.println("Step ke-"+i+", min : "+min+" SWAP("+i+","+min+")"+" -> "+data.toString());
		}
		return data;
	}

}