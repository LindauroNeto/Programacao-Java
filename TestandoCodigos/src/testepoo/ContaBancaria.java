package testepoo;
// ENCAPSULAMENTO

public class ContaBancaria {
	private String nome;
	private long cpf;
	private float saldo;
	private int agencia;
	private int conta;
	private String instituicao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	ContaBancaria(String nome, long cpf, float saldo, int agencia, int conta, String instituicao) {
		setNome(nome);
		setCpf(cpf);
		setSaldo(saldo);
		setAgencia(agencia);
		setConta(conta);
		setInstituicao(instituicao);
	}

	ContaBancaria() {
		this("NaN", 0, 0, 0, 0, "NaN");
	}
}
