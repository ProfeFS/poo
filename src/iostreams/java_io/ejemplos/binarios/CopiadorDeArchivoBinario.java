package iostreams.java_io.ejemplos.binarios;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopiadorDeArchivoBinario {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("origen.bin");
            fos = new FileOutputStream("destino.bin");
            int byteLeido;
            while ((byteLeido = fis.read()) != -1) {
                fos.write(byteLeido);
            }
        } catch (IOException e) {
            //e.printStackTrace();
        	System.out.println(e.getLocalizedMessage());
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}