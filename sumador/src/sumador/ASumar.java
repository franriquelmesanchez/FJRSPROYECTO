/**
 * 
 */
package sumador;

/**
 * @author Fran
 *
 */
public class ASumar {
	
	private String valor_inicial;
	
	/**
	 * @param string
	 */
	public ASumar (String string) {
		this.valor_inicial= string;
	}
	
	/**
	 * @return devuelve un valor si es un número de un digito
	 */
	public String mostrar() {
		String numero = valor_inicial;
		if (numero.length()==1) {
			return (numero + "=" + numero);
		}
			return null;
	}
	
}
