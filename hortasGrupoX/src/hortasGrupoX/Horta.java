package hortasGrupoX;

public class Horta extends Talhao{

	private String nome;
	private String localizacao;
	
	
	
	public Horta(String data, String sementeira, String tipoCultura, int nIdentificacao, float area,String nome,String localizacao) {
		super(data, sementeira, tipoCultura, nIdentificacao, area);
		this.localizacao=localizacao;
		this.nome=nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	
}