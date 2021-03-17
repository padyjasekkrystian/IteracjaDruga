package tablice.dwuwymiarowe;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		int[][] macierz = new int[5][6];

		// ilosc wierszy
		System.out.println("Ilosc wierszy: " + macierz.length);

		// ilosc kolumn
		System.out.println("Ilosc kolumn: " + macierz[0].length);
		System.out.println();

		// przypisawanie do macierzy

		macierz[0][0] = 4;
		macierz[3][4] = 6;
		macierz[1][0] = 3;

		// wypisanie calej macierzy

		// petla zewnetrzna
		for (int i = 0; i < macierz.length; i++) {
			// petla wewnetrzna
			for (int j = 0; j < macierz[0].length; j++) {
				System.out.print(macierz[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

		int[][] macierz2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < macierz2.length; i++) {
			for (int j = 0; j < macierz2[0].length; j++) {
				System.out.print(macierz2[i][j] + " ");
			}
			System.out.println();
		}
		
		//Zadeklaruj tablice dwuwymiarowa 4x6 typu String. Przypsiz do niej kilka elementów, 
		//wypisz jej liczbe wierszy i liczbê kolumn, wypisz jakis przykladowy wyraz Wypisz ca³a macierz
		
		String tablica1[][] = new String[4][6];
		tablica1[3][2] = "aa";
		tablica1[2][3] = "pies";
		tablica1[0][5] = "kot";
		tablica1[1][3] = "ala";

		System.out.println("Liczba wierszy = " + tablica1.length);
		System.out.println("liczba kolumn = " + tablica1[0].length);
		System.out.println("Przykladowy wyraz: " + tablica1[3][2]);

		for (int i = 0; i < tablica1.length; i++) {
			for (int j = 0; j < tablica1[0].length; j++) {
				System.out.print(tablica1[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Zadeklaruj macierz 6x6 i wype³nij ja liczbami od 10 w gore
		//policzyc sume wszystkich elementow w macierzy
		
		int tablica2[][] = new int[6][6];
		int x = 10;
		int suma = 0;
		for (int i = 0; i < tablica2.length; i++) {
			for (int j = 0; j < tablica2[0].length; j++) {
				tablica2[i][j] = x;
				x++;
				suma+=tablica2[i][j];
			}
		}
		
		System.out.println("suma wynosi: " + suma);
		
		//wypisac powyzsza macierz w odwrotnej kolejnosci
		
		for (int i = tablica2.length - 1; i >= 0; i--) {
			for (int j = tablica2[0].length - 1; j >=0; j--) {
				System.out.print(tablica2[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		//wypisz z powyzszej macierzy przekatna od lewej górnej do prawej dolnej
		
		for (int i = 0; i < tablica2.length; i++) {
			for (int j = 0; j < tablica2[0].length; j++) {
				if(i == j) {
					System.out.print(tablica2[i][j]);
				}else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		/*Stwórzmy macierz 4x4 i wpiszmy do niej liczby podzielne przez 3 zaczynajac od 10.
		 Nastêpnie wypisz macierz w ten sposób, ¿e liczby podzielne przez 4 wypisujemy, 
	     a jeeli nie to wstawiamy w ich miejsce liczbê -1.
		*/
		
		int[][] tablica3 = new int[4][4];
		int y = 10;
		for (int i = 0; i < tablica3.length; i++) {
			for (int j = 0; j < tablica3[0].length; j++) {
				if (y % 3 == 0) {
					tablica3[i][j] = y;
				} else {
					j--;
				}
				y++;
			}
		}

		for (int i = 0; i < tablica3.length; i++) {
			for (int j = 0; j < tablica3[0].length; j++) {
				System.out.print(tablica3[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//losowanie liczb
		Random losowanie = new Random();

		for (int i = 0; i < 20; i++) {  //zakres 5-15
			System.out.print(losowanie.nextInt(11)+5 + " ");
											// 0 - 10 + 5 = 5-15
		}
		System.out.println();
		
		//zadeklaruj macierz o wymiarach 5x8, wypelnij ja liczbami losowymi z zakresu
		//10-90, znajdz najwieksza i najmniejsza wartosc oraz srednia arytmetyczna
		
		int [][] tablica4 = new int [5][8];
		int min = 90, max = tablica4[0][0];
		double suma1 = 0;
		
		for (int i = 0; i < tablica4.length; i++) {
			for (int j = 0; j < tablica4[0].length; j++) {
				tablica4[i][j] = losowanie.nextInt(81) + 10;
				if(tablica4[i][j] < min) {
					min = tablica4[i][j];
				}
				if(tablica4[i][j] > max) {
					max = tablica4[i][j];
				}
				suma1+=tablica4[i][j];
			}
			
		}
		
		for (int i = 0; i < tablica4.length; i++) {
			for (int j = 0; j < tablica4[0].length; j++) {
				System.out.print(tablica4[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("max = " + max + "\nmin = " + min + "\nsrednia arytmetyczna wynosi: " + suma1/tablica4.length*tablica4[0].length);
		
		
		// 1) Napisz program ktory tworzy tablice dwuwymiarowa 5x5, uzupelnia ja liczbami naturalnymi od liczby podanej przez uzytkownika
		//(jako zmienna) w dó³ i liczy sumê wszystkich wprowadzonych liczb
		
		int[][] tablica5 = new int[5][5];
		int zm = 13, suma2 = 0;
		for (int i = 0; i < tablica5.length; i++) {
			for (int j = 0; j < tablica5[0].length; j++) {
				tablica5[i][j] = zm;
				zm--;
				suma2 += tablica5[i][j];
			}
		}

		for (int i = 0; i < tablica5.length; i++) {
			for (int j = 0; j < tablica5[0].length; j++) {
				System.out.print(tablica5[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("suma = " + suma2);
		
		// 2) Napisz program który tworzy tablice dwuwymiarowa 5x5 i uzupelmoa ja kolejnymi liczbami naturalnymi zaczynajac od 10 wypisz przekatna takiej macierzy
		// idaca od lewej do prawej od gory do dolu

		int[][] tablica6 = new int[5][5];
		int zm1 = 10;
		for (int i = 0; i < tablica6.length; i++) {
			for (int j = 0; j < tablica6[0].length; j++) {
				tablica6[i][j] = zm1;
				zm1++;
			}
		}

		for (int i = 0; i < tablica6.length; i++) {
			for (int j = 0; j < tablica6[0].length; j++) {
				if (i == j) {
					System.out.print(tablica6[i][j]);
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		
		
		// 3) Napisz program ktory tworzy tablice dwuwymiarowa 8x8 i uzupelnia ja liczbami podzielnymi przez 3 zaczynajac od 10, wypisz ca³¹ macierz. Nastêpnie
		//wypisz macierz w sposob ze liczby ktore sa podzielne przez 4 wypisujemy a jesli nie to wstawiamt w ich miejsce liczbe -1
		

		int[][] tablica7 = new int[8][8];
		int z = 10;
		for (int i = 0; i < tablica7.length; i++) {
			for (int j = 0; j < tablica7[0].length; j++) {
				if (z % 3 == 0) {
					tablica7[i][j] = z;
				} else {
					j--;
				}
				z++;
			}
		}

		for (int i = 0; i < tablica7.length; i++) {
			for (int j = 0; j < tablica7[0].length; j++) {
				System.out.print(tablica7[i][j] + " ");
			}
			System.out.println();
		}

		for (int i = 0; i < tablica7.length; i++) {
			for (int j = 0; j < tablica7[0].length; j++) {
				if (tablica7[i][j] % 4 == 0) {
					System.out.print(tablica7[i][j] + " ");
				} else {
					System.out.print("-1 ");
				}
			}
			System.out.println();
		}

	}
}
