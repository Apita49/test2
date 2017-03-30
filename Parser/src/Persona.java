import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Persona {
	private int edad;
	private String nombre;
	private String ocupacion;
	private boolean masculino;

	public Persona() {

	}

	public Persona(int edad, String nombre, String ocupacion, boolean masculino) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.ocupacion = ocupacion;
		this.masculino = masculino;
	}

	@Override
	public String toString() {
		return "Hola soy " + nombre + " tengo " + edad
				+ " años, soy de genero "
				+ (masculino ? "masculino" : "femenino") + " y soy "
				+ ocupacion;
	}

}
