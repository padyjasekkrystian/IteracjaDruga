package zapis.odczyt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws IOException {

		// obiekt klasy File przechowuje sciezke do pliku
//		File sciezka = new File("plik");
//		
//		//FileWriter pozwala zapisywac cos do pliku
//		FileWriter zapis = new FileWriter(sciezka);

		// write() zapisuje cos do pliku
//		zapis.write("Ania\n");
//		zapis.write("Tomek\n");
//		zapis.write("Piotr\n");
//		zapis.write("Krzys\n");
//		zapis.write("65");
//		
//		zapis.close();
//		
		// odczyt
		// FileReader pozwala na odczyt z pliku znak po znaku
//		FileReader fr = new FileReader(sciezka);

		// BufferedReader pozwala na odczyt wiersz po wierszu
//		BufferedReader br = new BufferedReader(fr);

//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());
//		System.out.println(br.readLine());

//		String linia = "";
//		
//		while((linia = br.readLine()) != null) {
//			System.out.println(linia); 
//		}

		// 6) Stwórz tablice 3 stringów, dodaj wszystkie w pêtli do zmiennej typu String
		// i zapisz j¹ do
		// pliku

//		String[] tab = { "Basia", "Tomek", "Asia" };
//
//		String zmienna = "";
//
//		for (int i = 0; i < tab.length; i++) {
//			zmienna += tab[i] + " ";
//		}
//
//		FileWriter fw = new FileWriter("Plik2");
//		fw.write(zmienna);
//		fw.close();

		// 7) Wczytaj to co zapisaleœ do pliku i wyœwietl na konsoli

//		FileReader fr = new FileReader("Plik2");
//		BufferedReader br = new BufferedReader(fr);
//
//		System.out.println(br.readLine());

		// 8) Wpisz do pliku 10 liczb oddzielonych enterem, wyœwietl wszystkie które s¹
		// podzielne
		// przez 2

//		FileReader fr = new FileReader("liczby");
//		BufferedReader br = new BufferedReader(fr);
//		String linia = "";
//		
//		while ((linia = br.readLine()) != null) {
//			if(Integer.parseInt(linia) % 2 == 0) {
//				System.out.print(linia + " ");
//			}
//		}
//		
//		fr.close();

		// Stworz plik z 10 liczbami, wczytaj je i przypisz do tablicy, wyswietl cala
		// tablice

//		FileReader fr = new FileReader("liczby2");
//		BufferedReader br = new BufferedReader(fr);
//		String linia = "";
//		int[] tab = new int[10];
//		int i = 0;
//		
//		while ((linia = br.readLine()) != null) {
//			tab[i] = Integer.parseInt(linia);
//			i++;
//		}
//		
//		for(int j = 0; j < tab.length; j++) {
//			System.out.print(tab[j] + " ");
//		}

		// Stwórzmy program ktory pozwala zapisac do pliku 3 imiona podane przez
		// uzytkownika. Nastepnie odczytajmy te imiona i
		// wyswietlmy najdluzsze z nich

//		FileWriter fw = new FileWriter("imiona");
//
//		for (int i = 0; i < 3; i++) {
//			String imie = JOptionPane.showInputDialog("Podaj imie");
//			fw.write(imie + "\n");
//		}
//		fw.close();
//		
//		FileReader fr = new FileReader("imiona");
//		BufferedReader br = new BufferedReader(fr);
//		String linia ="";
//		String[] tab = new String[3];
//		int i = 0;
//		
//		while((linia = br.readLine()) != null) {
//			tab[i] = linia;
//			i++;
//		}
//		
//		String max = tab[0];
//		
//		for(int j = 0; j < tab.length; j++) {
//			if(max.length() < tab[j].length()) {
//				max = tab[j];
//			}
//		}
//		System.out.println(max);

		// Stworz plik slownik z kilkunastoma wyrazami. Wsrod tych wyrazow wsadz kilka
		// kurde, kurcze i kurka.
		// Program ma za zadanie kazdy wyraz brzydki zastapic **** i zapisac
		// ca³osc do nowego pliku ktory sie nazywa
		// slownikPoprawiony

//		FileReader fr = new FileReader("wyrazy");
//		BufferedReader br = new BufferedReader(fr);
//		FileWriter zapis = new FileWriter("slownikPoprawiony");
//
//		String[] brzydkie = { "kurde", "kurcze", "kurka" };
//
//		String linia = "";
//
//		while ((linia = br.readLine()) != null) {
//			for (int i = 0; i < brzydkie.length; i++) {
//				if (linia.equals(brzydkie[i])) {
//					linia = "****";
//				}
//			}
//
//			zapis.write(linia + "\n");
//
//		}
//		zapis.close();
//		fr.close();

		// W pliku tekstowym sa wyrazy. Wypisz te ktore sa palindromami np kajak, ala

		FileReader fr = new FileReader("palindromy");
		BufferedReader br = new BufferedReader(fr);
		String linia = "";

		// kajak abccba
		while ((linia = br.readLine()) != null) {
			boolean flaga = true;
			for (int i = 0; i < linia.length(); i++) {
				if (linia.charAt(i) != linia.charAt(linia.length() - 1 - i)) {
					flaga = false;
					break;
				}
			}
			if (flaga) {
				System.out.println(linia);
			}
		}
		br.close();
	}

}
