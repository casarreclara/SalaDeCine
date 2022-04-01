package salaDeCine;

public class SalaDeCine {
	
	private boolean[][] butacas;
	
	public SalaDeCine(int butacasTotales, int filas) {
		if(butacasTotales % filas == 0) {
			butacas = new boolean[filas][butacasTotales/filas];
		} else {
			butacas = new boolean[filas][];
		int	butacasDeMas = butacasTotales % filas;
		for(int i=0;i<butacas.length;i++) {
			if (butacasDeMas > 0) {
			butacas[i] = new boolean[butacasTotales/filas + 1];
			butacasDeMas --;
		} else 
			butacas[i] = new boolean[butacasTotales/filas];
		}
		
		for(int i=0; i<butacas.length;i++){
			for(int z=0; z<butacas[i].length;z++) {
				butacas[i][z] = false;
			}
		}
	  }
	}
	
	public boolean estaOcupada(int x, int y) {
		return butacas[x][y];
	}
	
	public void ocuparButaca(int x, int y) {
		if(butacas[x][y]) {
			System.out.println("Ya está ocupada");
		} else 
			butacas[x][y] = true;
		
	}
	
	public int butacasOcupadas() {
		int butacasOcupadas = 0;
		for(int i=0; i<butacas.length;i++) {
			for(int z=0; z<butacas[i].length;z++) {
				if(butacas[i][z]) {
					butacasOcupadas += 1;
				}
			}
		} return butacasOcupadas;
	}
	
	public boolean hayEspacioPara(int cantidadDePersonas) {
		int libresSeguidos = 0;
		for(int i=0;i<butacas.length;i++) {
			for(int z=0; z<butacas[i].length;z++) {
				if(!butacas[i][z]) 
					libresSeguidos ++;
			  else 
				 libresSeguidos = 0;
			}
		}	return libresSeguidos >= cantidadDePersonas;
	}
	
	public String toString()
	{
		String str = "";
		for(int x = 0; x < butacas.length; x++)
		{
			for(int y = 0; y < butacas[x].length; y++)
			{
				if(butacas[x][y])
					str += "X ";
				else
					str += "O ";
			}
			str += "\n";
		}
		return str;
	}

public static void main(String[] args) {
	SalaDeCine Odeon = new SalaDeCine(50,5);
	Odeon.ocuparButaca(2, 0);
	System.out.println(Odeon.toString());
}
}

