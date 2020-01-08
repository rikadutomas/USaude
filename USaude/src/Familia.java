import java.util.HashMap;
import java.util.Map;

public class Familia {

    String nomeFamilia;
    Map<String, Utente> hashFamilia;

    public Familia(String n){
        nomeFamilia = n;
        hashFamilia = new HashMap<String, Utente>();

    }

    public void adicionarMembro(Utente m) {
        hashFamilia.put(nomeFamilia, m);
    }
    
    public void removerMembro(Utente m) {
        hashFamilia.remove(m);
    }

    public String mostrarFamilia(){
        String s = "";
        for (Utente u: hashFamilia.values()) {
            s = s + u.etaria + "_" + u.nome + "\n";
        }
        return s;
    }

}
