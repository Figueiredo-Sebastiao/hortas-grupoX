package hortasGrupoX;

public class Plantacao {
	
	private String data;
	private String sementeira;
	private String tipoCultura;
	
	public Plantacao(String data, String sementeira, String tipoCultura) {
		super();
		this.data = data;
		this.sementeira = sementeira;
		this.tipoCultura = tipoCultura;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getSementeira() {
		return sementeira;
	}

	public void setSementeira(String sementeira) {
		this.sementeira = sementeira;
	}

	public String getTipoCultura() {
		return tipoCultura;
	}

	public void setTipoCultura(String tipoCultura) {
		this.tipoCultura = tipoCultura;
	}
	
	
	
	
}
