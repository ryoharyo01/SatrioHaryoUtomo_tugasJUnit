package com.sqa.main.ui;


	import java.util.Scanner;

	import com.sqa.main.HitungKecepatan;

	public class InputUI {

		HitungKecepatan kecepatan;
		double jarak;
		double waktu;
		
		public InputUI() {
			if(kecepatan == null) {
				kecepatan = new HitungKecepatan();
			}
		}
		
		public void showKecepatan() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Masukkan Jarak Tempuh Anda(Km) : ");
			jarak = sc.nextDouble();
			System.out.print("Masukkan Waktu Tempuh Anda(Jam) : ");
			waktu = sc.nextDouble();
			double kecepatan = jarak / waktu;
			System.out.println("Kecepatan Rata-Rata Anda Adalah : " +kecepatan+ " Km/h");
		}
		
	}





