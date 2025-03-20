package object Derivacion {

  /**
   * Comentario General: Las funciones anonimas retornadas al ser evaluadas en un x_0:Double
   * retornan un Double es decir son funciones tipo Double => Double.
   */

  /**
   * Calcula la derivada de una función utilizando la aproximación de cinco puntos.
   * @param f Función de tipo Double => Double cuya derivada se quiere calcular.
   * @return Una función tipo Double => Double que representa la aproximacion de la derivada de f.
   */
  def derivada(f:Double => Double): Double => Double = {
    val h = 0.1
    (x) => (f(x - 2*h) - 8*f(x - h) + 8*f(x + h) - f(x + 2*h))/(12*h)
  }

  /**
   * Calcula la derivada de la suma de dos funciones.
   * @param f Primera función de tipo Double => Double.
   * @param g Segunda función de tipo Double => Double.
   * @return Una función tipo Double => Double que representa la aproximación de la derivada de (f + g).
   */
  def derivadaSuma(f: Double => Double, g: Double => Double): Double => Double = {
    (x) => derivada(f)(x) + derivada(g)(x)
  }

  /**
   * Calcula la derivada de la resta de dos funciones.
   * @param f Primera función de tipo Double => Double.
   * @param g Segunda función de tipo Double => Double.
   * @return Una función tipo Double => Double que representa la aproximación de la derivada de (f - g).
   */
  def derivadaResta(f: Double => Double, g: Double => Double): Double => Double = {
    (x) => derivada(f)(x) - derivada(g)(x)
  }

  /**
   * Calcula la derivada del producto de dos funciones usando la regla del producto.
   * @param f Primera función de tipo Double => Double.
   * @param g Segunda función de tipo Double => Double.
   * @return Una función tipo Double => Double que representa la aproximación de la derivadad de (f * g).
   */
  def derivadaMult(f: Double => Double, g: Double => Double): Double => Double = {
    (x) => derivada(f)(x)*g(x) + f(x)*derivada(g)(x)
  }

  /**
   * Calcula la derivada del cociente de dos funciones usando la regla del cociente.
   * @param f Numerador, función de tipo Double => Double.
   * @param g Denominador, función de tipo Double => Double.
   * @return Una función tipo Double => Double que representa la aproximación de la derivada de (f / g).
   */
  def derivadaDiv(f: Double => Double, g: Double => Double): Double => Double = {
    (x) => (derivada(f)(x)*g(x) - f(x)*derivada(g)(x))/(g(x)*g(x))
  }

}
