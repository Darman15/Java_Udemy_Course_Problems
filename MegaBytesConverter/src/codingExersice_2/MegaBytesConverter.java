package codingExersice_2;

public class MegaBytesConverter {

	public static void printMegaBytesAndKiloBytes(int kiloBytes) {

		if (kiloBytes < 0) {
			System.out.println("Invalid");
		} else {

			int megaBytes = kiloBytes / 1024;
			int remainingKiloBytes = kiloBytes % 1024;
			System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
		}
	}

}