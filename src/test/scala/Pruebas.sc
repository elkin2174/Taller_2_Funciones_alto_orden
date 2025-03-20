import Derivacion.{derivada, derivadaResta, derivadaSuma, derivadaMult, derivadaDiv}

/*
* Pruebas solicitadas en el informe
*/
val cte= (x: Double) => 2.0
val f = (x: Double) => (x*x)
val g = (x: Double) => (x*x*x)
val h = (x: Double) => f(x)/g(x)
val j = (x: Double) => g(x)/f(x)
f

val h1 = derivadaDiv(f, g)
val h2 = derivadaDiv(f, g)
val h3 = derivadaDiv(g, f)
val h4 = derivadaDiv(g, f)

h1(2)   //Valor esperado -0.25
h2(2)  //Valor esperado -0.25
h3(2)  //Valor esperado 1
h4(2)  //Valor esperado 1

derivada(cte)(5)  //Valor esperado 0
derivada(cte)(6)  //Valor esperado 0

/* 
  Pruebas propuestas
*/

// - Constante: Para verificar que la derivada es 0.
// - Polinómicas: Para evaluar reglas básicas de derivación.
// - Racionales: Para probar la derivada de cocientes.
// - Trigonométricas: Para verificar la precisión en funciones oscilatorias.
// - Logarítmicas y raíces: Para evaluar funciones con comportamiento más complejo.
// - Funciones compuestas: Para evaluar derivadas más complejas con combinaciones de funciones.

val p = (x: Double) => (x*x + 3*x - 5) / (x + 1) // Función polinómica compuesta con división
val q = (x: Double) => (x*x*x - 4*x + 2) / (x*x + 1) // Otra función polinómica con cociente
val k = (x: Double) => math.sin(x) // Función trigonométrica seno
val l = (x: Double) => math.cos(x) // Función trigonométrica coseno
val tc = (x: Double) => math.sin(x) / (x + 1) // Función trigonométrica con división
val m = (x: Double) => math.log(x) // Función logarítmica
val n = (x: Double) => math.sqrt(x) // Función de raíz cuadrada
val lc = (x: Double) => math.log(x*x + 1) // Función logarítmica compuesta
val sc = (x: Double) => math.sqrt(x*x + x + 1) // Función de raíz cuadrada compuesta

// Aplicación de derivadas
val df = derivada(f)
val dg = derivada(g)
val dp = derivada(p)
val dq = derivada(q)
val dh = derivada(h)
val dj = derivada(j)
val dk = derivada(k)
val dl = derivada(l)
val dtc = derivada(tc)
val dm = derivada(m)
val dn = derivada(n)
val dlc = derivada(lc)
val dsc = derivada(sc)

// Evaluación en puntos clave
df(2)  // Valor esperado: 4
dg(2)  // Valor esperado: 12
dp(2)  // Valor esperado: 1.77
dq(2)  // Valor esperado: 1.28
dh(2)  // Valor esperado: -0.25
dj(2)  // Valor esperado: 1
dk(math.Pi/4)  // Valor esperado: cos(π/4) ≈ 0.7071
dl(math.Pi/4)  // Valor esperado: -sin(π/4) ≈ -0.7071
dtc(1)  // Valor esperado: (cos(1)(2) - sen(1))/ (2^2) ≈ 0.05978
dm(math.E)  // Valor esperado: 1/E ≈ 0.3679
dn(4)  // Valor esperado: 1/4 = 0.25
dlc(2)  // (ln(x)) Valor esperado: 0.8
dsc(3)  // Valor esperado:  ≈ 0.9707

// Operaciones entre derivadas
val mult1 = derivadaMult(f, g)
val div1 = derivadaDiv(f, g)
val div2 = derivadaDiv(g, f)
val sum2 = derivadaSuma(m, n)
val rest2 = derivadaResta(m, n)
val sum3 = derivadaSuma(lc, sc)
val rest3 = derivadaResta(lc, sc)

derivadaDiv(f,(x)=> 0.0)(2) // caso  g(x) = 0 valor esperado: indefinido, no es un numero.

// Evaluación de operaciones
mult1(2)  // Valor esperado: 80
div1(2)  // Valor esperado: -0.25
div2(2)  // Valor esperado: 1
sum2(math.E)  // Valor esperado: 1/E + 1/(2√E) ≈ 0.67
rest2(2)  // Valor esperado: 0.14
rest2(4)  // Valor esperado: 0  el retorno no es 0 sino que es un valor muy pequeño debido la aproximación.
sum3(3)  // Valor esperado: 1.5707
rest3(3)  // Valor esperado: -0.37