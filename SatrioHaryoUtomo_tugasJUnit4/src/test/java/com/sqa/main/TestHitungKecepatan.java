package com.sqa.main;


	import static org.junit.Assert.*;

	import java.io.File;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	import org.junit.After;
	import org.junit.Before;
	import org.junit.Test;

	import com.sqa.main.MainApp;

	public class TestHitungKecepatan {
	MainApp function;
	private Scanner reader;
		@Before
		public void setUp() throws Exception {
		}

		@After
		public void tearDown() throws Exception {
		}

		@Test
		public void testMain() {
			for (String isi : readfile("Skenario_Test.csv")) {
				String [] data = isi.split(";");
				
				String jarak = data[0];
				String waktu = data[1];
				String jawab = data[2];
				
				assertEquals(Double.parseDouble(jawab), function.InputUI(Double.parseDouble(jarak),Double.parseDouble(waktu)));
				
			}
		}
		
		public List<String> readfile(String namefile){
			List<String> penampung = new ArrayList<String>();
			
			try {
				File myFile = new File(namefile);

				reader = new Scanner(myFile);
				
				while(reader.hasNextLine()) {
					penampung.add(reader.nextLine());
				}
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			return penampung;
		}

		

	}


