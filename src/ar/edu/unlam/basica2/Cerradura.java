package ar.edu.unlam.basica2;

public class Cerradura {
	private Integer claveApertura;
	private Boolean estadoDeLaCerradura = false;
	private Integer aperturaExitosa;
	private Integer aperturaFallida;
	protected static Integer cantidadDeFallosConsecutivosQueLaBloquean;

	public Cerradura(Integer claveApertura, Integer cantidadDeFallosConsecutivosQueLaBloquean) {
		this.claveApertura = claveApertura;
		Cerradura.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
	}

	public Boolean getAbrir(Integer clave) {
		if (this.claveApertura.equals(clave)) {
			estadoDeLaCerradura = true;
			return true;
		} else {
			estadoDeLaCerradura = false;
			return false;
		}
	}

	public void setCerrar() {

		estadoDeLaCerradura = false;
	}

	public Boolean estaAbierta() {

		if (this.estadoDeLaCerradura.equals(true)) {
			return true;

		} else {
			return false;
		}
	}

	public Boolean estaCerrada() {

		if (this.estadoDeLaCerradura.equals(false)) {
			return true;

		} else {
			return false;
		}
	}

	public Boolean getFuebloqueada() {
		if (Cerradura.cantidadDeFallosConsecutivosQueLaBloquean.equals(this.getContadorDeAperturasFallidas())) {
			return true;
		} else {
			return false;
		}
	}

	public Integer getContadorDeAperturasExitosas() {
		aperturaExitosa = 0;
		if (this.estadoDeLaCerradura.equals(true)) {
			aperturaExitosa++;
			return aperturaExitosa;
		} else {
			aperturaExitosa = 0;
			return aperturaExitosa;
		}
	}

	public Integer getContadorDeAperturasFallidas() {
		aperturaExitosa = 0;
		if (this.estadoDeLaCerradura.equals(false)) {
			aperturaExitosa++;
			return aperturaExitosa;
		} else {
			aperturaExitosa = 0;
			return aperturaExitosa;
		}
	}

	public Integer getClaveApertura() {
		return claveApertura;
	}

	public void setClaveApertura(Integer claveApertura) {
		this.claveApertura = claveApertura;
	}

	public Boolean getEstadoDeLaCerradura() {
		return estadoDeLaCerradura;
	}

	public void setEstadoDeLaCerradura(Boolean estadoDeLaCerradura) {
		this.estadoDeLaCerradura = estadoDeLaCerradura;
	}

	public Integer getAperturaExitosas() {
		return aperturaExitosa;
	}

	public void setAperturaExitosas(Integer aperturaExitosas) {
		this.aperturaExitosa = aperturaExitosas;
	}

	public Integer getAperturafallidas() {
		return aperturaFallida;
	}

	public void setAperturafallidas(Integer aperturafallidas) {
		this.aperturaFallida = aperturafallidas;
	}

	public Integer getCantidadDeFallosConsecutivosQueLaBloquean() {
		return cantidadDeFallosConsecutivosQueLaBloquean;
	}

	public void setCantidadDeFallosConsecutivosQueLaBloquean(Integer cantidadDeFallosConsecutivosQueLaBloquean) {
		Cerradura.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
	}

}
