package enums;

public class TestColor {

	public static void main(String[] args) {
	
		//Asugnación de colores
		String colorOjos = ColorOjo.verde.toString();		//enum más básico
		ColorOjo miColorOjos = ColorOjo.azul; 
			
		//Enum avanzado (con atributos y métodos)
		ColorOjoSimple miColorOjosSimple = ColorOjoSimple.AZUL; 
		System.out.println(miColorOjosSimple);
	
		
		//Método values retorna un array con los elementos del enum		
		for(ColorOjo color: ColorOjo.values()) {
			System.out.println(color.ordinal()+1);
			System.out.println(color);			
		}
		
		//Método ordinal retorna la posición del elemento (parecido a un array)
		System.out.println();		
		System.out.println(ColorOjo.azul.ordinal()+1);
		
		//Comparación entre enums
		ColorOjoSimple c = ColorOjoSimple.AZUL;
		System.out.println(c.compareTo(c));
		
		//Pueden ser mutables
		System.out.println(ColorOjo.azul.getCode());
		ColorOjo.azul.setCode(1000);
		System.out.println(ColorOjo.azul.getCode());
		
		
		
		
		
		

	}

}
