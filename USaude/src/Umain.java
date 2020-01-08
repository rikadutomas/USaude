// import java.util.Set;
import java.util.TreeMap;
public class Umain implements Uinterface{
	
	Utente utente = null;
	Familia familia = null;
	
	TreeMap<String,Utente> treeUtente = new TreeMap<String,Utente>();
	TreeMap<String, Familia> treeFamilia = new TreeMap<String,Familia>();
	
	public void registarUtente(String nome, String etaria) {
		if (treeUtente.containsKey(nome)) {
			System.out.println("Utente existente.");
		}
		else {
		
			if (etaria.equals("Jovem")) {
				Utente utente = new Jovem(nome);
				treeUtente.put(nome, utente);
				System.out.println("Utente registado com sucesso.");
			}
			else if (etaria.equals("Adulto")) {
				Utente utente = new Adulto(nome);
				treeUtente.put(nome, utente);
				System.out.println("Utente registado com sucesso.");
			}
			else if (etaria.equals("Idoso")) {
				Utente utente = new Idoso(nome);
				treeUtente.put(nome, utente);
				System.out.println("Utente registado com sucesso.");
			}	
			else {
				System.out.println("Faixa etária inexistente.");
			}
		}
	}

	
	public void registarFamilia(String nomeFamilia) {
		familia.nomeFamilia = nomeFamilia;
	}

	
	public void associarFamilia(Utente nome, String nomeFamilia) {
		familia.adicionarMembro(nome);
	}

}
