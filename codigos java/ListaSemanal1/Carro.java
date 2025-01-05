
public class Carro {
	private String Modelo;
	private float Autonomia;
	private int CapacidadeDeTanque;
	
	public String getModelo() {
		return Modelo;
	}
	public float getAutonomia() {
		return Autonomia;
	}
	public int getCapacidadeDeTanque() {
		return CapacidadeDeTanque;
	}
	public void setModelo(String NovoModelo) {
		Modelo=NovoModelo;
	}
	public void setAutonomia(float NovaAutonomia) {
		Autonomia=NovaAutonomia;
	}
	public void setCapacidadeDeTanque(int NovaCapacidadeDeTanque) {
		CapacidadeDeTanque=NovaCapacidadeDeTanque;
	}


}
