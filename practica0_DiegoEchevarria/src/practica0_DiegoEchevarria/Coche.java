package practica0_DiegoEchevarria;



public class Coche {
	
		 private double miVelocidad; // Velocidad en pixels/segundo
		 protected double miDireccionActual; // Direcci�n en la que estoy mirando en grados (de 0 a 360)
		 protected double posX; // Posici�n en X (horizontal)
		 protected double posY; // Posici�n en Y (vertical)
		 private String piloto; // Nombre de piloto
		 
		 
		 public Coche() {
		        this.miVelocidad = 0.0;
		        this.miDireccionActual = 0.0;
		        this.posX = 300.0;
		        this.posY = 300.0;
		    }
		 
		 
		 /** Cambia la velocidad actual del coche
		  * @param aceleracion Incremento de la velocidad en pixels/segundo
		  */
		  public void acelera( double aceleracion ) {
		  }
		  /** Cambia la direcci�n actual del coche
		  * @param giro Angulo de giro a sumar o restar de la direcci�n actual, en grados (-180 a +180)
		  */
		  public void gira( double giro ) {
		  }
		  /** Cambia la posici�n del coche dependiendo de su velocidad y direcci�n
		  * @param tiempoDeMovimiento Tiempo transcurrido, en segundos
		  */
		  public void mueve( double tiempoDeMovimiento ) {
		  } 

}
