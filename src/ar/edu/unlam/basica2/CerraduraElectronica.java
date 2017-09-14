package ar.edu.unlam.basica2;

public class  CerraduraElectronica extends Cerradura {

	public CerraduraElectronica(Integer claveApertura) {
		super(claveApertura, cantidadDeFallosConsecutivosQueLaBloquean);
		
	}

}
