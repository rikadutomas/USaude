
public class Idoso extends Utente{
	
	public Idoso(String nome) {
		setNome(nome);
		setEtaria("Idoso");
	}

	public String getEtaria() {
		return etaria;
	}

	public void setEtaria(String etaria) {
		this.etaria = etaria;
	}
}
