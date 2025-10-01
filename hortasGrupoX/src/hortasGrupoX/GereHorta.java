package hortasGrupoX;

import java.util.ArrayList;

public class GereHorta {
	private float areaQuadrado;
	
	ArrayList<Horta>listHorta= new ArrayList();
	ArrayList<Talhao>listtalhao= new ArrayList();
	ArrayList<Plantacao>listPlantacaosP= new ArrayList();
	
	public void Registarhortas(String data, String sementeira, String tipoCultura, int nIdentificacao, float area,String nome,String localizacao){
		Horta horta=new Horta(data, sementeira, tipoCultura, nIdentificacao, area, nome, localizacao);
		listHorta.add(horta);
	}
	public void RegistarTalhõesHorta(String data, String sementeira, String tipoCultura,int nIdentificacao,float area){
		Talhao talhao=new Talhao(data, sementeira, tipoCultura, nIdentificacao, area);
		listtalhao.add(talhao);
		
	}
	public void RegistarPlantaçõesTalhãoHorta(String data, String sementeira, String tipoCultura){
		Plantacao plantacao=new Plantacao(data, sementeira, tipoCultura);
		listPlantacaosP.add(plantacao);
	}
	public float ImprimirDetalhesPlantacaoHorta(Horta horta){
		
		return horta.getArea();		
	}
	public void ImprimirAreaTotalHortaMetrosQuadrados(){}
	public void ImprimirNomeAreHortaMaiorArea(){}
	public void ImprimirNomeHortasTipoCultura(){}

}
