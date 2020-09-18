
public class Aluno {
	
	//atributos
	private String nomecompleto;
	private String cpf;
	private int idade;
	private double altura;
	private double peso;
	private boolean status;
	private String plano;
	
	//getters e setters
	public String getNomecompleto() {
		return nomecompleto;
	}
	public void setNomecompleto(String nomecompleto) {
		this.nomecompleto = nomecompleto;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getPlano() {
		return plano;
	}
	public void setPlano(String plano) {
		this.plano = plano;
	}
	
	//construtor Padrão 
	public Aluno() {
		
	}
	
	//construtor com Parametros
	public Aluno(String nomecompleto, String cpf, int idade, double altura, double peso, boolean status, String plano) {
		this.nomecompleto = nomecompleto;
		this.cpf = cpf;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.status = status;
		this.plano = plano;
	}
	
	
}
