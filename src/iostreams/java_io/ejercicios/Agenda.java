package iostreams.java_io.ejercicios;
import java.io.*;
import java.util.*;

public class Agenda {
    private List<Contacto> contactos;
    private String archivoPath;

    public Agenda(String archivoPath) {
        this.contactos = new ArrayList<>();
        this.archivoPath = archivoPath;
    }

    public void añadirContacto(Contacto contacto) {
        contactos.add(contacto);
    }

    public void guardarAgenda() throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(archivoPath))) {
            for (Contacto contacto : contactos) {
                writer.write(contacto.toString());
                writer.newLine();
            }
        }
    }

    public void leerAgenda() throws IOException {
        contactos.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(archivoPath))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                añadirContacto(new Contacto(datos[0], datos[1], datos[2]));
            }
        }
    }

    public void mostrarContactos() {
        for (Contacto contacto : contactos) {
            System.out.println(contacto);
        }
    }
}
