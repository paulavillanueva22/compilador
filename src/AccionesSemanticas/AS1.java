package AccionesSemanticas;
import AnalizadorLexico.AccionSemantica;
import AnalizadorLexico.AnalizadorLexico;

public class AS1 extends AccionSemantica{
	//Inicializa el buffer y agrega c a el mismo.
	@Override
	public int ejecutar(StringBuffer buffer, char c, AnalizadorLexico AL) {
		buffer.append(c);
		return 0;
	}
}
