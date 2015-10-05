package encriptacionCesar;

import java.util.ArrayList;

public class clsTestCesar {

	public static void main(String[] args) {
		clsEncriptacionCesar test =  new clsEncriptacionCesar(9);
		String cade;
		
		System.out.println(cade=test.encriptarCesar("!!	"));
		System.out.println(test.desencriptarCesar(cade, 9));

	}

}
