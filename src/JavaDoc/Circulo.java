package JavaDoc;

/**
 * <h1>Clase Circulo</h1> 
 * clase POJO que contiene tres atributos de tipo double que permite manejar objetos de tipo Circulo,
 * calcular su circunferencia, desplazar su centro, escalar su radio y obtener una cadena de 
 * carcteres que lo represente como objeto
 * <h2>Atributos:</h2>
 * <ul>
 *  <li>centroX de tipo double, representa la coordenada x del c�rculo</li>
 *  <li>centroY de tipo double, representa la coordenada y del c�rculo</li>
 *  <li>radio de tipo double, representa el radio del c�rculo</li>
 * </ul>
 * <h2>M�todos:</h2>
 * <ul>
 * 	<li>Circulo()</li>
 *  <li>getCentroX()</li>
 *  <li>getCentroY()</li>
 *  <li>getCircunferencia()</li>
 *  <li>desplazar()</li>
 *  <li>escalar()</li>
 *  <li>String toString()</li>
 * </ul>
 * @author 21845808
 * @version 1.0
 * @since 28/11/2018
 */
public class Circulo {

	//Atributos: variables globales que por principio de dise�o son privadas
	private double centroX;
	private double centroY;
	private double radio;

	/**
	 * <h2>M�todo Circulo</h2>
	 * constructor que recibe tres par�metros para asignar/inicializar valor 
	 * (variables locales [par�metros]) a los atributos 
	 * @param cx de tipo double, contendr� el valor que se va a asignar al atributo centroX
	 * @param cy de tipo double, contendr� el valor que se va a asignar al atributo centroY
	 * @param r de tipo double, contendr� el valor que se va a asignar al atributo radio
	 */
	public Circulo(double cx, double cy, double r) {
		centroX = cx;
		centroY = cy;
		radio = r;
	}

	/**
	 * <h2>M�todo getCentro</h2>
	 * retorna el valor del atributo centroX
	 * @return un double que representa el valor de centroX
	 */
	public double getCentroX() {
		return centroX;
	}

	/**
	 * <h2>M�todo de acceso get</h2>
	 * retorna el valor del atributo centroY
	 * @return un double que representa el valor de centroY
	 */
	public double getCentroY() {
		return centroY;
	}

	public double getRadio() {
		return radio;
	}

	/**
	 * <h2>M�todo getCircunferencia</h2>
	 * calcula el valor de la circunferencia de un c�rculo utilizando la constante PI de la clase Math
	 * @return un double con el valor calculado para la circunferencia
	 * @see java.lang.Math
	 */
	public double getCircunferencia() {
		return 2 * Math.PI * radio;
	}

	/**
	 * <h2>M�todo desplazar</h2>
	 * recibe dos par�metros que servir�n para desplazar las coordenadas del centro del c�rculo
	 * @param deltaX de tipo double, representa el desplazamiento de la coordenda x del centro 
	 * del c�rculo
	 * @param deltaY de tipo double, representa el desplazamiento de la coordenda y del centro
	 *  del c�rculo
	 */
	public void desplazar(double deltaX, double deltaY) {
		centroX = centroX + deltaX;
		centroY = centroY + deltaY;
	}

	/**
	 * <h2>M�todo escalar</h2>
	 * aumenta o disminuye el valor del radio con el valor que recibe como par�metro
	 * @param s de tipo double, representa la variaci�n del tama�o radio
	 */
	public void escalar(double s) {
		radio = radio * s;
	}

	/**
	 * <h2>M�todo toString</h2>
	 * m�todo sobreescrito que retorna la cadena de caracteres que representa a un objeto de 
	 * tipo Circulo
	 * @return un String que contiene la cadena de caracteres que representa a un objeto de
	 * tipo Circulo
	 */
	public String toString() {
		return "C�rculo con centro en el punto (" + centroX + ", " + centroY + ") de radio " + radio;
	}
	
	
	
	

}
