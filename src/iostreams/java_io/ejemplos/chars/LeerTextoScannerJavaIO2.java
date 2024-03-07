package iostreams.java_io.ejemplos.chars;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LeerTextoScannerJavaIO2 {

	public static void main(String[] args) {

		File file = new File("c:\\data100\\configuracion01.txt");

		try (Scanner sc = new Scanner(file)) {
			while (sc.hasNext()) {
				System.out.print(sc.nextLine() + "\n");
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
