import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Main {

	public static void main(String[] args) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Persona.class);
		Marshaller marshall = context.createMarshaller();
		marshall.marshal(new Persona(30, "Juan Perez", "Supervisor de ventas",
				true), new File("Persona.xml"));
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Persona unmarshalled = (Persona) unmarshaller.unmarshal(new File(
				"Persona.xml"));
		System.out.println(unmarshalled);
	}
}
