public class parte2 {
	public static void main(String[] args) {
		Coche miCoche = new Coche();
		miCoche.SumarPuerta();
		System.out.println(miCoche.puertas);
	}



}



class Coche {
	public int puertas = 0;

	public void SumarPuerta() {
		this.puertas++;
	}
}
