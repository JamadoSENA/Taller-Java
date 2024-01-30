package main;

import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		
		int edad1, edad2, edad3, promedio, 
		sueldo=1300000, comision1, comision2, comision3, 
		horas, HN, HE, HI, NA;
		
		float primeraP, segundaP, terceraP, examenF, trabajoF, 
		promedioF, metros, valorH, HNP, HEP, N1, N2, N3, N4, N5,
		N6, N7, N8, AKT, AAKT, PKT, PVP, PA, NAD, BST, KGH, LA,
		BHP, EAP, KHD, LAD;
		
		double totalComision, pf, pef, ptf, cf, pulgadas, pies, 
		sueldoF, SB, AS, DE, SN, dineroT, consumo, KTT, VFP, PP,
		GPA, TPA, PPA, CT, G, PG, IH, LH, IHD, IAD, IT;

		Scanner lapiz = new Scanner(System.in);

		//Ejercicio 1

		System.out.println("**Ejercicio 1**");

		System.out.println("Favor digitar la primer edad:");

		edad1 = lapiz.nextInt();

		System.out.println("Favor digitar la segunda edad:");

		edad2 = lapiz.nextInt();

		System.out.println("Favor digitar la tercer edad:");

		edad3 = lapiz.nextInt();

		

		promedio = (edad1 + edad2 + edad3)/3;

		System.out.println("El promedio es igual a:");

		System.out.println(promedio);

	    //Ejercicio 3

	    System.out.println("**Ejercicio 3**");

	    System.out.println("Ingrese el valor de la comision 1:");

	    comision1 = lapiz.nextInt();

	    System.out.println("Ingrese el valor de la comision 2:");

	    comision2 = lapiz.nextInt();

	    System.out.println("Ingrese el valor de la comision 3:");

	    comision3 = lapiz.nextInt();

	    totalComision = (((comision1 + comision2 + comision3)*0.1)+sueldo);

	    System.out.println("El total es igual a:" + totalComision);

	    
	    //Ejercicio 5

	    System.out.println("**Ejercicio 5**");

	    System.out.println("Ingrese la primera nota parcial: ");
	    primeraP=lapiz.nextFloat();
	    
	    System.out.println("Ingrese la segunda nota parcial: ");
	    segundaP=lapiz.nextFloat();
	    
	    System.out.println("Ingrese la tercera nota parcial: ");
	    terceraP=lapiz.nextFloat();

	    System.out.println("Ingrese la nota del examen final: ");
	    examenF=lapiz.nextFloat();
	    
	    System.out.println("Ingrese la nota del trabajo final: ");
	    trabajoF=lapiz.nextFloat();
	    
	    promedioF = (primeraP+segundaP+terceraP)/3;
	    pf = promedioF*0.55;
	    
	    pef = examenF*0.33;
	    
	    ptf = trabajoF*0.15;
	    
	    cf = pf + pef + ptf;
	    System.out.println("Su nota final es igual a: " + cf);
	    
	    //Ejercicio 7
	    
	    System.out.println("***Ejercicio 7***");
	    
	    System.out.println("Ingrese una cantidad en metros: ");
	    metros=lapiz.nextFloat();
	    
	    pulgadas=metros*39.3701;
	    pies=metros*3.28;
	    
	    System.out.println("La cantidad en pulgadas es igual a: " + pulgadas);
	    System.out.println("La cantidad en pies es igual a: " + pies);
	    
	    //Ejercicio 9
	    System.out.println("***Ejercicio 9***");
	    
	    System.out.println("Ingrese el numero de horas trabajadas: ");
	    horas=lapiz.nextInt();
	    
	    System.out.println("Ingrese el valor por hora: ");
	    valorH=lapiz.nextFloat();
	    
	    sueldoF=(horas*valorH)*0.20;
	    
	    System.out.println("Su sueldo neto es igual a: " + sueldo);
	    
	    //Ejercicio 11
	    System.out.println("***Ejercicio 11***");
	    
	    System.out.println("Ingrese el nombre del trabajador: ");
	    nombre=lapiz.next();
	    
	    System.out.println("Ingrese el numero de horas NORMALES trabajadas: ");
	    HN=lapiz.nextInt();
	    
	    System.out.println("Ingrese el precio por hora NORMAL: ");
	    HNP=lapiz.nextFloat();
	    
	    System.out.println("Ingrese el numero de horas EXTRAS trabajadas: ");
	    HE=lapiz.nextInt();
	    
	    
	    SB=(HN*HNP)+((HNP*1.25)*HE);
	    
	    System.out.println("Resultado de sueldo base:  " + SB);
	    
	    System.out.println("Ingrese el numero de hijos: ");
	    HI=lapiz.nextInt();
	    
	    AS=25000+(HI*17300)+18000;
	    
	    System.out.println("Teniendo en cuenta que son "
	    		+ "25000 Bolívares por actualización  académica, "
	    		+ "17300 Bolívares por cada hijo y una prima por hogar de "
	    		+ "18000 Bolívares. El total de las asignaciones es igual a: " + AS);
	    
	    DE=SB*(0.05+0.02+0.07);
	    
	    System.out.println("Teniendo en cuenta sobre el sueldo base 5% del paro forzoso, "
	    		+ "2%  de política habitacional y 7% para caja de ahorro. "
	    		+ "El total de sus deducciones es igual a: " + DE);
	    
	    SN=SB+AS-DE;
	    
	    System.out.println("Su sueldo neto es igual a: " + SN);
	    
	    //Ejercicio 13
	    System.out.println("***Ejercicio 13***");
	    
	    System.out.println("Ingrese la cantidad de billetes de 50000: ");
	    N1=lapiz.nextInt();
	    
	    System.out.println("Ingrese la cantidad de billetes de 20000: ");
	    N2=lapiz.nextInt();
	    
	    System.out.println("Ingrese la cantidad de billetes de 10000: ");
	    N3=lapiz.nextInt();
	    
	    System.out.println("Ingrese la cantidad de billetes de 5000: ");
	    N4=lapiz.nextInt();
	    
	    System.out.println("Ingrese la cantidad de billetes de 2000: ");
	    N5=lapiz.nextInt();
	    
	    System.out.println("Ingrese la cantidad de billetes de 1000: ");
	    N6=lapiz.nextInt();
	    
	    System.out.println("Ingrese la cantidad de billetes de 500: ");
	    N7=lapiz.nextInt();
	    
	    System.out.println("Ingrese la cantidad de billetes de 200: ");
	    N8=lapiz.nextInt();
	    
	    dineroT=(N1*50000)+(N2*20000)+(N3*10000)+(N4*5000)+(N5*2000)+(N6*1000)+(N7*500)+(N8*200);
	    
	    System.out.println("El total del dinero es: " + dineroT);
	    
	    //Ejercicio 15
	    System.out.println("***Ejercicio 15***");
	    
	    System.out.println("Ingrese la lectura anterior en KiloVatios: ");
	    AKT=lapiz.nextFloat();
	    
	    System.out.println("Ingrese la lectura actual en KiloVatios: ");
	    AAKT=lapiz.nextFloat();
	    
	    System.out.println("Ingrese el costo del KiloVatios: ");
	    PKT=lapiz.nextFloat();
	    
	    consumo=AKT-AAKT;
	    
	    KTT=consumo*PKT;
	    
	    System.out.println("El consumo mensual es igual a: " + consumo + " KiloVatios");
	    
	    System.out.println("El total a pagar es: " + KTT);
	    
	    //Ejercicio 17
	    System.out.println("***Ejercicio 17***");
	    
	    System.out.println("Ingrese el valor del PVP: ");
	    PVP=lapiz.nextFloat();
	    
	    System.out.println("Ingrese el valor final a pagar: ");
	    VFP=lapiz.nextFloat();
	    
	    PP=((PVP-VFP)/PVP)*100;
	    
	    System.out.println("El porcentaje de descuento es igual a: " + PP);
	    
	    //Ejercicio 19
	    System.out.println("***Ejercicio 19***");
	    
	    System.out.println("Ingrese el presupuesto anual: ");
	    PA=lapiz.nextFloat();
	    
	    GPA=PA*0.4;
	    TPA=PA*0.3;
	    PPA=PA*0.3;
	    
	    System.out.println("El monto de Ginecologia es igual a: " + GPA);
	    System.out.println("El monto de Traumatología es igual a: " + TPA);
	    System.out.println("El monto de Pediatria es igual a: " + PPA);
	    
	    //Ejercicio 21
	    System.out.println("***Ejercicio 21***");
	    
	    System.out.println("Ingrese la cantidad de naranjas: ");
	    NA=lapiz.nextInt();
	    
	    System.out.println("Ingrese el valor BS por docena de naranjas: ");
	    NAD=lapiz.nextFloat();
	    
	    System.out.println("Ingrese el total en BS: ");
	    BST=lapiz.nextFloat();
	    
	    CT=NA*(NAD/12);
	    
	    G=NA-CT;
	    
	    PG=(G/CT)*100;
	    
	    System.out.println("El porcentaje de ganancia es igual a: " + PG);
	    
	    //Ejercicio 23
	    System.out.println("***Ejercicio 23***");
	    
	    System.out.println("Ingrese la cantidad de harina en KG: ");
	    KGH=lapiz.nextFloat();
	    
	    System.out.println("Ingrese la cantidad de aceite en Litros: ");
	    LA=lapiz.nextFloat();

	    System.out.println("Ingrese el precio por bulto de 24 paquetes de harina en BS: ");
	    BHP=lapiz.nextFloat();
	    
	    System.out.println("Ingrese el precio por caja de 15 envases de aceite en BS: ");
	    EAP=lapiz.nextFloat();
	    
	    System.out.println("Ingrese el precio por kilogramo de harina al detal en BS: ");
	    KHD=lapiz.nextFloat();
	    
	    System.out.println("Ingrese el precio por litro de aceite al detal en BS: ");
	    LAD=lapiz.nextFloat();
	    
	    IH=(KGH/24)*BHP;
	    
	    LH=(LA/15)*EAP;
	    
	    IHD=(KGH%24)*KHD;
	    
	    IAD=(LA%15)*LAD;
	    
	    IT=IH+LH+IHD+IAD;
	    
	    System.out.println("El total por la venta de cada tonelada de maíz es igual a: " + IT);

	    //Ejercicio 25
	    System.out.println("***Ejercicio 25***");
	    
	    
	    
	    
	}

}
