import java.util.Scanner;
public class program {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String nama;
		int tahun;
		Scanner masukan = new Scanner(System.in);

		System.out.println("Assalamu'alaikum");
		System.out.println("Nama saya : ");
		nama = masukan.nextLine();
		System.out.println("Saya lahir di Tahun: " );
		tahun = masukan.nextInt();
	}
}