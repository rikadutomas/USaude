

public class USaude {

	public static void main(String[] args) {
		Uinterface uinterface = new Umain();

		uinterface.registarUtente("Joao", "Jovem");
		uinterface.registarUtente("Teresa", "Idoso");
		uinterface.registarUtente("Rodrigo", "Adulto");
		uinterface.registarUtente("Joana", "Jovem");
		uinterface.registarUtente("Teresa", "Idoso");
		uinterface.registarUtente("Anibal", "Adulto");
		uinterface.registarUtente("Goncalo", "Jovem");
		uinterface.registarUtente("Oscar", "Idoso");
		uinterface.registarUtente("Rui", "Adulto");
		uinterface.registarUtente("Romeu", "Jovem");
		uinterface.registarUtente("Andreia", "Carcaca");
		uinterface.registarUtente("Jucinda", "Adulto");
		uinterface.registarUtente("Ceu", "Jovem");
		uinterface.registarUtente("Lucifer", "Idoso");
		uinterface.registarUtente("Paulo", "Adulto");
		uinterface.registarFamilia("Tomas");
		uinterface.registarFamilia("Ferreira");

		uinterface.registarProfissional("Medicina","Joao");
		uinterface.registarProfissional("Enfermagem","Teresa");
		uinterface.registarProfissional("Auxiliara","Maria");
		uinterface.registarProfissional("Medicina","Ronaldo");
		uinterface.registarProfissional("Enfermagem","Gaspar");
		uinterface.registarProfissional("Auxiliar","Anabela");
		uinterface.registarProfissional("Medicina","Joao");
		uinterface.registarProfissional("Enfermagem","Ramiro");
		uinterface.registarProfissional("Auxiliar","Jaime");
		uinterface.registarProfissional("Medicina","Ismael");
		uinterface.registarProfissional("Enfermagem","Paulo");
		uinterface.registarProfissional("Auxiliar","Anibal");
		uinterface.registarFamilia("Tomas");
		uinterface.registarFamilia("Ferreira");
		uinterface.registarFamilia("Francisco");
		uinterface.associarFamilia("Joao", "Tomas");
	}

}
