package listaSemanal8;

public class pokemonGenerico extends pokemon {
	
	public String ataqueA() {
		return "soco";
					
		}
	public String ataqueB() {
		return "chute";
		}
	public String ataqueC() {
		if(getNivel()>=10) {
			return "salto";
		}
		return null;
		}
	public String ataqueD() {
		if(getNivel()>=20) {
			return "ataque especial";
		}
		return null;
		}
	public String ataqueE() {
		if(getNivel()>=30) {
			return "ataque especial 2";
		}
		return null;
		
	}

}
