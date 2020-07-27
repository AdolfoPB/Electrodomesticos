
public class Lavadora extends Electrodomestico{
	
	int carga = 5;
	
	public Lavadora(){	
	}
	public Lavadora(int precioBase, int peso) {
		super.precioBase = precioBase;
		super.peso = peso;		
	}
	public Lavadora(int carga, int precioBase, String color, char consumoEnergetico, int peso) {
		this.carga = carga;
		super.precioBase = precioBase;
		super.color = color;
		super.consumoEnergetico = consumoEnergetico;
		super.peso = peso;
	}
	public int getCarga() {
		return carga;
	}
	
	public int precioFinal() {
	super.precioFinal();
	if(carga > 30){
		super.precioBase = precioBase + 50;
	}
	return precioBase;
		
	}
	

}
