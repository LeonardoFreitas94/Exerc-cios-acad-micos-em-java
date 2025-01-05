package listaSemanal8;

public class exercito2 extends exercito implements metodo{
	
	public void lista() {
		this.unidades[0] = this.catapultas;
		this.unidades[1] = this.infantaria;
		this.unidades[2] = this.cavalaria;
		this.unidades[3] = this.artilharia;
	}
	@Override
	public boolean ganhaQuandoAtacado(int def, int atak) {
		if(def==0 && atak==1) {
			return true;
		}
		else if(def==0 && atak==2 || atak==3) {
			this.unidades[def]--;
			return false;
		}
		else if(def==1 && atak==2) {
			return true;
		}
		else if(def==1 && atak==0 || atak==3) {
			this.unidades[def]--;
			return false;
		}
		else if(def==2 && atak==1) {
			return true;
		}
		else if(def==2 && atak==1 || atak==3) {
			this.unidades[def]--;
			return false;
		}
		else if(def==3 && atak==0 || atak==1 || atak==2) {
			return true;
		}
		else if(def==3 && atak==3) {
			this.unidades[def]--;
			return false;
		}
		else {
			this.unidades[def]--;
			return false;
		}

}
}	
