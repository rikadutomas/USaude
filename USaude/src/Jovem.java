
public class Jovem extends Utente{

	public Jovem(String nome) {
		setNome(nome);
		setEtaria("Jovem");
	}
	
	public String getEtaria() {
		return etaria;
	}

	public void setEtaria(String etaria) {
		this.etaria = etaria;
	}
	
}
