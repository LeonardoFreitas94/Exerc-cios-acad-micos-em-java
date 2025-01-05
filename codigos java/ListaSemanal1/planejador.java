
public class planejador {
	public int EstimarAbastecimentos(Carro c,float Distancia) {
		float Auto=(float)(c.getAutonomia()*c.getCapacidadeDeTanque());
		return (int)Math.ceil(Distancia/Auto);
		
		
	}

}
