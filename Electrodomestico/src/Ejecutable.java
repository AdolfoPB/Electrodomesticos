
public class Ejecutable {
	
	public static void main(String[] args) {
		
	
		//Creamos un array de Electrodomesticos
        Electrodomestico listaElectrodomesticos[]=new Electrodomestico[10];
   
        //Asignamos cada una de las posiciones como queramos
        listaElectrodomesticos[0]=new Electrodomestico(200, "Verde", 'c', 60 );
        listaElectrodomesticos[1]=new Lavadora(150, 30);
        listaElectrodomesticos[2]=new Television(42, false, 500, "negro", 'e', 80);
        listaElectrodomesticos[3]=new Electrodomestico();
        listaElectrodomesticos[4]=new Electrodomestico(600, "gris", 'd', 20 );
        listaElectrodomesticos[5]=new Lavadora(300, 40, "blanco",'b' , 40);
        listaElectrodomesticos[6]=new Television(250, 70);
        listaElectrodomesticos[7]=new Lavadora(400, 100, "verde",'a' , 15);
        listaElectrodomesticos[8]=new Television(30,true,200, "naranja",'c' ,60  );
        listaElectrodomesticos[9]=new Electrodomestico(50, 10);
   
        //Creamos las variables que usaremos para almacenar la suma de los precios
        double sumaElectrodomesticos=0;
        double sumaTelevisiones=0;
        double sumaLavadoras=0;
   
        //Recorremos el array invocando el metodo precioFinal
        for(int i=0;i<listaElectrodomesticos.length;i++){
            /*
             * Cuando una Television o una Lavadora este en la posicion del array actual,
             * pasara por su clase y por la de electrodomestico, ya que una television es un electrodomestico.
             * Ejecutamos en cada uno su propia version del metodo precioFinal
             */
   
            if(listaElectrodomesticos[i] instanceof Electrodomestico){
                sumaElectrodomesticos+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Lavadora){
                sumaLavadoras+=listaElectrodomesticos[i].precioFinal();
            }
            if(listaElectrodomesticos[i] instanceof Television){
                sumaTelevisiones+=listaElectrodomesticos[i].precioFinal();
            }
        }
   
        //Mostramos los resultados
        System.out.println("La suma del precio de los electrodomesticos es de "+sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de "+sumaLavadoras);
        System.out.println("La suma del precio de las televisiones es de "+sumaTelevisiones);
		
		
		/*int electrodomesticos[] = new int[10];
		
		Electrodomestico microondas = new Electrodomestico(100,"azul",'b',10);
		Lavadora lavadora1 = new Lavadora(10,100,"blanco",'e',40);
		Television tele1 = new Television(40,true,200,"rojo",'d',40);
 		
		System.out.println("El consumo energetico es : " + microondas.comprobarConsumoEnergetico());
		System.out.println("el precio final es : " + microondas.precioFinal()); */
	}

}
