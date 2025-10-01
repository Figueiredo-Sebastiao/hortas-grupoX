package hortasGrupoX;

public class Talhao extends Plantacao {
	
	
	private int nIdentificacao;
	private String area;
	

	public Talhao(String data, String sementeira, String tipoCultura,int nIdentificacao,String area) {
		super(data, sementeira, tipoCultura);
		this.area=area;
		this.nIdentificacao=nIdentificacao;
		
	}
	
	public int getnIdentificacao() {
		return nIdentificacao;
	}
	public void setnIdentificacao(int nIdentificacao) {
		this.nIdentificacao = nIdentificacao;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	

}
