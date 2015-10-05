package encriptacionCesar;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * 
 * @author GildoAlejandro
 *
 */

public class clsEncriptacionCesar {
	private ArrayList<Integer> arrayAscii = new ArrayList<Integer>();
	private int clave;
	
	/**
	 * 
	 * @param clave
	 */
	public clsEncriptacionCesar(int clave){
		setClave(clave);
	}
	//getters
	private void setClave(int clave){
		this.clave= clave;
	}
	/**
	 * 
	 * @return
	 */
	//getters
	public int getClave(){
		return this.clave;
	}
	//metodos
	/**
	 * 
	 * @param mensaje
	 * @return
	 */
	public String encriptarCesar(String mensaje){
		generaAscii(mensaje);
		String texto = "";
		for (int i=0; i < arrayAscii.size();i++){
			texto= texto +  (char) ( (arrayAscii.get(i).intValue()+clave )% 254 );
		}
		return texto;
	}
	/**
	 * 
	 * @param mensaje
	 */
	public void generaAscii(String mensaje){
		
		for(int index = 0; index < mensaje.length(); index++ ){
			arrayAscii.add(new Integer ((int) mensaje.charAt(index)));
		}
	}
	/**
	 * 
	 * @param mensaje
	 * @param clave
	 * @return
	 */
	public String desencriptarCesar(String mensaje, int clave){
		String texto="";
		generaAscii(mensaje);
		for(int i = 0; i < mensaje.length();i++){
			texto= texto + (char) ( (mensaje.charAt(i) - clave)% 255 );
		}
		
		return texto;
	}
	
}
