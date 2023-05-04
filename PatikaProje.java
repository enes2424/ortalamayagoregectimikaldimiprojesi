import java.util.Scanner;

public class PatikaProje {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Matematik notunu giriniz: ");
		int mat = input.nextInt();
		System.out.print("Fizik notunu giriniz: ");
		int fiz = input.nextInt();
		System.out.print("Kimya notunu giriniz: ");
		int kim = input.nextInt();
		System.out.print("Türkçe notunu giriniz: ");
		int tür = input.nextInt();
		System.out.print("Tarih notunu giriniz: ");
		int tar = input.nextInt();
		System.out.print("Müzik  notunu giriniz: ");
		int müz = input.nextInt();
		double ortalama = (double)(mat + fiz + kim + tür + tar + müz) / 6;
		System.out.println("Ortalama -> " + ortalama);
		System.out.print((ortalama > 60)? "Sınıfı Geçti" : "Sınıfta Kaldı");
	}

}
