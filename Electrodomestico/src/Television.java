
public class Television extends Electrodomestico{
	
	int resolucion = 20;
	boolean sintonizadorTdt = false;
	
	public Television() {
		
	}
	public Television(int precioBase, int peso) {
		super.precioBase = precioBase;
		super.peso = peso;
	}
	public Television(int resolucion, boolean sintonizadorTdt, int precioBase, String color, char consumoEnergetico, int peso) {
		this.resolucion = resolucion;
		this.sintonizadorTdt = sintonizadorTdt;
		super.precioBase = precioBase;
		super.color = color;
		super.consumoEnergetico = consumoEnergetico;
		super.peso = peso;
	}
	public double getResolucion() {
		return resolucion;
	}
	public boolean isSintonizadorTdt() {
		return sintonizadorTdt;
	}
	public int precioFinal() {
		super.precioFinal();
		if(resolucion > 40){
			super.precioBase = precioBase + 50;
		}
		return precioBase;
		
	}
	
	

}
