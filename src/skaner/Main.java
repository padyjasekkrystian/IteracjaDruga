package skaner;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
//		//metoda lenght() z klasy String zwraca dlugosc Stringa
//		String imie = "Wojtek";
//		System.out.println(imie.length());
//		
//		//metoda charAt(x) - zwraca znak ze Stringa o indeksie x
//		System.out.println(imie.charAt(0));
//		
//		Scanner wczytanie = new Scanner(System.in);
//		
//		//wczytuje caly wiersz
//		System.out.println(wczytanie.nextLine());
//
//		//wczytuje pojedyncze slowo
//		System.out.println(wczytanie.next());
//		System.out.println(wczytanie.next());
//		System.out.println(wczytanie.next());
//		
//		wczytanie.close();
		
		//Wczytaj skanerem 3 liczby typu int, wyswietl ich sume na konsoli
		
		Scanner input = new Scanner(System.in);
		
//		int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
//		
//		System.out.println("Suma wczytanych liczb wynosi = " + (a + b + c));
		
		
		
		//Wczytaj skanerem 3 napisy, wyswietl ten ktory jest najdluzszy
//		
//		String x = input.nextLine(), y = input.nextLine(), z = input.nextLine();
//		
//		if(x.length() > y.length() && x.length() > z.length()) {
//			System.out.println(x);
//		} else if(y.length() > z.length()) {
//			System.out.println(y);
//		}else {
//			System.out.println(z);
//		}
		
		//Stwórz kalkulator za pomoc¹ skanera, uzytkownik wprowadza liczbe (double), znak, druga liczbe
				//w zaleznosci od tego czy poda +,-,/,* to wykonujemy taka operacje matematycna
		
//		double a = input.nextDouble();
//		char c = input.next().charAt(0); 
//		double b = input.nextDouble();
//		
//		if(c == '+') {
//			System.out.println(a + b);
//		} else if(c == '-') {
//			System.out.println(a - b);
//		} else if(c == '/') {
//			System.out.println(a / b);
//		} else if(c == '*') {
//			System.out.println(a * b);
//		} else {
//			System.out.println("Kalkulator nie obsluguje tego znaku");
//		}
		
		//Uzytkownik wprowadza liczby. Na poczatku uzytkownik deklaruje ile liczb chce wprowadzic. Nastepnie wprowadza
	 	//tyle liczb ile podac. Chcemy policzyc ich sume, element najmniejsz, najwiekszy oraz srednia arytmetyczna.
		
//		int ilosc = input.nextInt();
//		double suma = 0;
//		
//		int[] tab = new int[ilosc];
//		
//		for(int i = 0; i<tab.length; i++) {
//			tab[i] = input.nextInt();
//			suma += tab[i];
//		}
//		
//		int min = tab[0], max = tab[0];
//		
//		for(int i = 0; i<tab.length; i++) {
//			if(max < tab[i]) {
//				max = tab[i];
//			}
//			if(min > tab[i]) {
//				min = tab[i];
//			}
//		}
//		
//		System.out.println("suma = " + suma + ", min = " + min + ", max = " + max + ", srednia = " + (suma/ilosc));
		
	 	//Symulacja wprowadzania hasla przez uzytkownika. Uzytkownik wprowadza has³o, tak dlugo az jest
	 	//niepoprawne, wyswietlamy napis ze haslo jst niepoparwne, wprowadz poprawne has³o.
	 	//Jesli uzytkownik wprowadzi poprawne haslo to wyswietlamy komunikat ze haslo jest poprawne.
		
//		String haslo = "asd";
//		
//		while(true) {
//			String wprowadzone = input.nextLine();
//			if(wprowadzone.equals(haslo)) {
//				System.out.println("Haslo jest poprawne");
//				break;
//			} else {
//				System.out.println("Haslo niepoprawne, probuj dalej");				
//			}
//			
//			
//		}
		
		//Wczytaj scannerem 5 liczb, przypisz je do tablicy, policz sumê tych elementów
		
//		int[] tab = new int[5];
//		int suma = 0;
//		
//		System.out.println("Podaj 5 liczb");
//		
//		for(int i = 0; i < tab.length; i++) {
//			tab[i] = input.nextInt();
//			suma += tab[i];
//		}
//		
//		System.out.println("Suma podanych liczb wynosi: " + suma);
		
		//Wczytuj scannerem kilka Stringów, przypisz je do wczeœniej utworzonej zmiennej typu
		//String i wyœwietl j¹ na konsoli.
		
//		String wszystkie, a = input.nextLine(), b = input.nextLine(), c = input.nextLine();
//		
//		wszystkie = a + " " + b + " " + c;
//		
//		System.out.println(wszystkie);
		
		// Za pomoca JOptionpane wczytaj liczbê i sprawdŸ czy jest parzysta (mo¿na zrobiæ to za
		//		 pomoc¹ metody)
		
//		int liczba = Integer.parseInt(JOptionPane.showInputDialog("Podaj liczbe"));
//		
//		if(liczba % 2 == 0) {
//			JOptionPane.showMessageDialog(null, "Liczba jest parzysta");
//		}else {
//			JOptionPane.showMessageDialog(null, "Liczba jest nieparzysta");
//		}
//		
		


		
		
		
		
		
		
	}

}
