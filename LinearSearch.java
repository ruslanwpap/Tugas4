import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
	
	ArrayList<Double> data = new ArrayList<Double>();
	data.add(16.17);
	data.add(10.11);
	data.add(18.19);
	data.add(3.4);
	data.add(12.13);
	data.add(20.0);
	data.add(9.9);
	data.add(14.15);
	data.add(7.8);
	data.add(5.6);
	data.add(1.2);

	System.out.println("Data : " + data.toString());		
				
	Scanner s = new Scanner(System.in);
	System.out.print("Masukkan kunci pencarian: ");
	double key	= s.nextDouble();
				
	int posisi = -1;
				
	for(int i=0;i<data.size();i++){
		if(key==data.get(i)){
			posisi = i;
			break;
		}
	}
	if(posisi!=-1){
	System.out.println("KEY: "+key+" Berada di index array list: "+posisi);
	}else{
	System.out.println("KEY TIDAK DITEMUKAN");
		}

	}

}