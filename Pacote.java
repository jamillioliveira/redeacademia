
public class Pacote {
	private String tipopacote;

	//getters e setters
	public String getTipopacote() {
		return tipopacote;
	}

	public void setTipopacote(String tipopacote) {
		this.tipopacote = tipopacote;
	}

	//construtor default
	public Pacote() {
		
	}
	
	//construtor parametrizado
	public Pacote(String tipopacote) {
		this.tipopacote = tipopacote;
	}
	
}
