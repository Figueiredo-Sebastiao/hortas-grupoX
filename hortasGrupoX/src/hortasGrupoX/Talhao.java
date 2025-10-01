package hortasGrupoX;

public class Talhao extends Plantacao {
	
	
	private int nIdentificacao;
	private float area;
	

	public Talhao(String data, String sementeira, String tipoCultura,int nIdentificacao,float area) {
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
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	

}
