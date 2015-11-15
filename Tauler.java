

public class Tauler {

	int alc, ampl;
	
	Casella casella [][];
	
	
	public Tauler(int amplada, int alcada)
	{
		alc=alcada;
		ampl=amplada;
		casella = new Casella[alc][ampl];
		FerTotAigua();
	}

	public void FerTotAigua()
	{
		
		for(int i=0;i<alc;++i)
			for(int j=0;j<ampl;++j)
				casella[i][j]=Casella.A;
		
	}
	
	public void imprimirTauler(){
		System.out.println();
		for(int i=0;i<alc;++i){
			for(int j=0;j<ampl;++j){
				System.out.print(casella[i][j] + " ");
			}
		System.out.println();
		}
	}
	
	public boolean ColocarVaixell(int x, int y, Vaixell v)
	{
		if(y<ampl && x<alc){
			if(v.orient == Orientacio.H){
				if (y + v.mida > ampl) {
					return false;
				}
				for(int i = y; i < (y + v.mida); i++){
					if(casella[x][i] != Casella.A){
						return false;
					}
				}
				for(int i = y; i < (y + v.mida); i++){
					casella[x][i]=Casella.V;
				}
				return true;
			}
			else {
				if(x + v.mida > alc){
					return false;
				}
				for(int i = x; i < (x + v.mida); i++){
					if(casella[i][y] != Casella.A){
						return false;
					}
				}
				
				for(int i = x; i < (x + v.mida); i++){
					casella[i][y]=Casella.V;
				}
				return true;
			}
		}
		else {
			return false;
		}
	}
	
	public Casella Tret(int x, int y)
	{
		return null;
	}
	
}
