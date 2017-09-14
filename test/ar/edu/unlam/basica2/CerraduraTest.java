package ar.edu.unlam.basica2;

import org.junit.Assert;
import org.junit.Test;

public class CerraduraTest {

	@Test
	public void testQueUnaCerraduraNuevaEsteCerrada() {
		Cerradura miCerradura = new Cerradura(1234,3);
		Boolean estadoDeLaCerradura = miCerradura.estaAbierta();
		Assert.assertFalse("La cerradura esta cerrada", estadoDeLaCerradura);
	}
	
	@Test
	public void testQueAbreLaCerraduraCuandoLaClaveEsLaCorrecta(){
		Cerradura miCerradura = new Cerradura(4321,3);
		miCerradura.getAbrir(4321);
		Boolean estadoDeLaCerradura = miCerradura.estaAbierta();
		Assert.assertTrue("La clave es correcta", estadoDeLaCerradura);
	}
	
	@Test
	public void testQueNoAbreLaCerraduraCuandoLaClaveEsIncorrecta(){
		Cerradura miCerradura = new Cerradura(4321,3);
		miCerradura.getAbrir(1234);
		Boolean estadoDeLaCerradura = miCerradura.estaAbierta();
		Assert.assertFalse("La clave es la incorrecta",estadoDeLaCerradura);
	}
	
	@Test
	public void testQueALSegundoIntentoFallidoSeBloqueaAutomaticamenteLaCerradura(){
		Cerradura miCerradura = new Cerradura (567, 1);
		miCerradura.getAbrir(1234);
		Boolean cerraduraBloqueada = true;
		cerraduraBloqueada = miCerradura.getFuebloqueada();
		Assert.assertTrue(cerraduraBloqueada);			
	}
	@Test
	public void queCuandoIngresoClaveIncorrectaNoSeAbra(){
	CerraduraElectronica miCerradura = new CerraduraElectronica(4321);

	miCerradura.getAbrir(1234);
	Boolean estadoCerradura = miCerradura.estaAbierta();
	Assert.assertFalse("La Cerradura bloqueo permanente", estadoCerradura);
	}
	}
	
	