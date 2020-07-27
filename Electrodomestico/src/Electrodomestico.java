
public class Electrodomestico {
	
	int precioBase = 100000;
	String color = "blanco";
	char consumoEnergetico = 'f';
	int peso = 5;
	
	public Electrodomestico() {
	}
	
	public Electrodomestico(int precioBase, int peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		
	}
	
	public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
		
	}

	public int getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public int getPeso() {
		return peso;
	}
	
	public char comprobarConsumoEnergetico() {
		if (consumoEnergetico == 'a' || consumoEnergetico == 'b' || consumoEnergetico == 'c' || consumoEnergetico == 'd' || consumoEnergetico == 'e' || consumoEnergetico == 'f') {
			this.consumoEnergetico = consumoEnergetico;
		}else {
			this.consumoEnergetico = 'f';
		}
		return consumoEnergetico;
		
	}
	
	public String comprobarColor() {
		if(color == "blanco" || color == "negro" || color == "rojo" || color == "azul" || color == "gris") {
			this.color = color;
		}else {
			this.color = "blanco";
		}
		return color;
		
	}
	
	public int precioFinal() {
		if(consumoEnergetico == 'a') {
			this.precioBase = precioBase + 100;			
		}
		if(consumoEnergetico == 'b') {
			this.precioBase = precioBase + 80;			
		}
		if(consumoEnergetico == 'c') {
			this.precioBase = precioBase + 60;			
		}
		if(consumoEnergetico == 'd') {
			this.precioBase = precioBase + 50;			
		}
		if(consumoEnergetico == 'e') {
			this.precioBase = precioBase + 30;			
		}
		if(consumoEnergetico == 'f') {
			this.precioBase = precioBase + 10;			
		}
		if(peso >= 0 && peso <= 19 ) {
			this.precioBase = precioBase + 10; 
		}
		if(peso >= 20 && peso <= 49 ) {
			this.precioBase = precioBase + 50; 
		}
		if(peso >= 50 && peso <= 79 ) {
			this.precioBase = precioBase + 80; 
		}
		if(peso >= 80) {
			this.precioBase = precioBase + 100; 
		}
		return precioBase;
		 
	}

}
