//
public class Adulto extends Utente{
	
	public Adulto(String nome) {
		setNome(nome);
		setEtaria("Adulto");
	}

	public String getEtaria() {
		return etaria;
	}

	public void setEtaria(String etaria) {
		this.etaria = etaria;
	}

}
