package okienko.dialogowe;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		 
		String napis = "Krzysiek";
		
		//metoda length()  zwraca dlugosc Stringa
		System.out.println(napis.length());
		
		//showMessageDialog() pozwala wyswietlic okienko z jakas informacja
		//JOptionPane.showMessageDialog(null, "Hejka co tam u Ciebie?");
		
		//showInputDialog() pozwala na wprowadzenie tekstu przez uzytkownika, cancel zwraca nulla
//		String imie = JOptionPane.showInputDialog("Podaj swoje imie");
//		System.out.println(imie);
		
		//parsowanie, czyli zmiana w tym przypadku Stringa na inta
//		int liczba = Integer.parseInt(JOptionPane.showInputDialog("Podaj swoje imie"));
//		System.out.println(liczba + 5);
		
		//showConfirmDialog() pozwala na wybranie jednej z trzech opcji 
		//yes - 0
		//no - 1
		//cancel - 2
//		int a = JOptionPane.showConfirmDialog(null, "Co wybierasz?");
//		System.out.println(a);
		
		//Wprowadz za pomoca okienka dialogowego jakis napis. Jesli jego dlugosc jest wieksza niz 15, wyswietl
		//za pomoca okienka napis ze jest za dlugi tekst, a jesli nie to wyswietl ze jest ok.
		
//		String napis1 = JOptionPane.showInputDialog("Podaj napis");
//		
//		if(napis1.length() > 15) {
//			JOptionPane.showMessageDialog(null, "tekst jest zbyt d³ugi");
//		}else {
//			JOptionPane.showMessageDialog(null, "Tekst jest ok");
//		}
		
		//Za pomoca JOPtionPane wczytaj 3 liczby i wyswietl ta ktora jest najwieksza
		
//		int a = Integer.parseInt(JOptionPane.showInputDialog("Podaj pierwsza liczbe"));
//		int b = Integer.parseInt(JOptionPane.showInputDialog("Podaj druga liczbe"));
//		int c = Integer.parseInt(JOptionPane.showInputDialog("Podaj trzecia liczbe"));
//		
//		if(a > b && a > c) {
//			System.out.println("Liczba a jest najwieksza: " + a);
//		}else if(b > c) {
//			System.out.println("Liczba b jest najwieksza: " + b);
//		}else {
//			System.out.println("Liczba c jest najwieksza: " + c);
//		}

		//Za pomoc JOptionpane (confrim dialog) zadaj pytanie uzytkownikowi o to czy chce zlozyc zamowienie. 
				//W zaleznosci od zaznaczonej odpowiedzi wyswietl odpowiedni napis 
		
//		int a = JOptionPane.showConfirmDialog(null, "Czy chcesz zlozyc zamowienie?");
//		
//		if(a == 0) {
//			System.out.println("Tak, chcesz zlozyc zamowienie");
//		}else if(a == 1) {
//			System.out.println("Nie chcesz zlozyc zamowienia");
//		}else {
//			System.out.println("Anulowales wybor");
//		}
		
		
		//Za pomoca JOPtionpane uzytkwonik podaje imiona. Dopoki nie poda tomek to moze je wprowadzac dalej i wypisujemy je na konsoli
		//Gdy wpisze Tomek przerywamy wprowadzanie i podajemy komunikat w okienku dialogowym ze wpisano brzydkie imie.
		
//		while(true) {
//			String a = JOptionPane.showInputDialog("Podaj imiê");
//			
//			if(a.equals("Tomek")) {
//				JOptionPane.showMessageDialog(null, "Wpisano brzydkie imie");
//				break;
//			}else {
//				System.out.println("Imie: " + a);
//			}
//		}
		
		//Uzytkownik podaje najpierw ile liczb chce zsumowac, a potem podaje te liczby, wypiszmy sume tych, ich srednia arytmetyczna,
				//najwieksza liczbe, najmniejsza liczbe.
		
//		int ilosc = Integer.parseInt(JOptionPane.showInputDialog("Podaj ile liczb chcesz zsumowac"));
//		int[] tab = new int[ilosc];
//		double suma = 0;
//		int min = Integer.MAX_VALUE;
//		int max = Integer.MIN_VALUE;
//		
//		for(int i = 0; i < tab.length; i++) {
//			tab[i] = Integer.parseInt(JOptionPane.showInputDialog("Podaj liczbe"));
//			suma += tab[i];
//			if(tab[i] > max) {
//				max = tab[i];
//			}
//			if(tab[i] < min) {
//				min = tab[i];
//			}
//		}
//		
//		
//		System.out.println("Suma liczb wynosi: " + suma + "\nSrednia arytmetyczna: " + (suma/tab.length) + "\nMax = " + max + "\nMin = " + min);
		
		
		//Wpisujemy imiona za pomoca JOPtionPane tak dlugo az uzytkownik nie zrezygnuje. Przypisujemy te wartosci do wczesniej utworzonej
				//zmiennej typu String, wyswietlamy ja na koncu
		
//		String napis1 = "";
//
//		while (true) {
//			String wprowadzone = JOptionPane.showInputDialog("Podaj imie");
//
//			if (wprowadzone != null) {
//				napis1 += wprowadzone + " ";
//			}else {
//				break;
//			}
//
//		}
//		System.out.println(napis1);
		
		//Uzytkownik wybiera dwie opcje, tak lub nie dopoki nie nacisnie cancel. Policz czy uzytkownik wybral wiecej razy tak, nie czy bylo ich tyle samo.

		int licznik = 0;
		while (true) {
			int a = JOptionPane.showConfirmDialog(null, "Wybierz opcje");

			if (a == 0) {
				licznik++;
			}else if(a == 1) {
				licznik--;
			}else {
				break;
			}
		}
		
		if(licznik > 0) {
			System.out.println("uzytkownik wybral wiecej razy tak");
		}else if(licznik < 0){
			System.out.println("uzytkownik wybral wiecej razy nie");
		}else {
			System.out.println("uzytkownik wybral tyle samo razy tak i nie");
		}

	}
}
