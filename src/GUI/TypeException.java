
//Clase que representa una excepción, la cual sera utilizada para validar los caracteres digitados en el login.

package GUI;

public class TypeException extends Exception{

    public TypeException(String mensaje) {
        super(mensaje);
    }
}
