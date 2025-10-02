<!doctype html>
<html lang="es">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width,initial-scale=1">
  <title>Blackjack21 — README</title>
  <style>
    :root{--bg:#0f1724;--card:#0b1220;--muted:#9aa4b2;--accent:#7dd3fc;--glass: rgba(255,255,255,0.03)}
    body{font-family:Inter, system-ui, -apple-system, 'Segoe UI', Roboto, 'Helvetica Neue', Arial; background:linear-gradient(180deg,#071022 0%, #091025 100%); color:#e6eef6; margin:0; padding:32px}
    .container{max-width:900px;margin:0 auto}
    header{display:flex;gap:20px;align-items:center}
    h1{font-size:28px;margin:0}
    p.lead{color:var(--muted);margin-top:6px}
    .card{background:var(--card);padding:20px;border-radius:12px;box-shadow:0 8px 30px rgba(2,6,23,0.7);margin-top:20px}
    pre{background:var(--glass);padding:12px;border-radius:8px;overflow:auto;color:#d2eefc}
    code{font-family:SFMono-Regular,Menlo,Monaco,Consolas,'Liberation Mono','Courier New',monospace}
    ul{line-height:1.6}
    .meta{display:flex;gap:12px;flex-wrap:wrap;margin-top:12px}
    .meta span{background:rgba(255,255,255,0.03);padding:6px 10px;border-radius:999px;color:var(--muted);font-size:13px}
    footer{color:var(--muted);font-size:13px;margin-top:18px}
    .btn{display:inline-block;padding:8px 12px;border-radius:8px;background:linear-gradient(90deg,var(--accent),#60a5fa);color:#002632;text-decoration:none;font-weight:600}
  </style>
</head>
<body>
  <div class="container">
    <header>
      <div>
        <h1>Blackjack21</h1>
        <p class="lead">Proyecto de simulación/implementación del juego Blackjack. Hecho por <strong>Héctor Bascuñana, Marcos Miquel y Pau Collado</strong>.</p>
        <div class="meta">
          <span>Lenguaje: Java</span>
          <span>Licencia: (añade tu licencia)</span>
          <span>Estado: Desarrollo</span>
        </div>
      </div>
    </header>

    <section class="card">
      <h2>Descripción</h2>
      <p>Blackjack21 es una implementación del clásico juego de cartas Blackjack. El objetivo de este repositorio es ofrecer una versión didáctica y funcional del juego, apta para ejecutar desde IDEs como IntelliJ o compilando con <code>javac</code>.</p>

      <h3>Características</h3>
      <ul>
        <li>Gestión de mazos y reparto de cartas.</li>
        <li>Reglas básicas de Blackjack (plantarse, pedir carta, valores de cartas, As como 1/11).</li>
        <li>Lógica de crupier y comparación de manos.</li>
        <li>Interfaz de consola para jugar (o integrar con GUI en el futuro).</li>
      </ul>
    </section>

    <section class="card">
      <h2>Instalación</h2>
      <p>Clona el repositorio y abre el proyecto en tu IDE favorito o compílalo desde la línea de comandos:</p>
      <pre><code># clonar
git clone https://github.com/paucolnav2/Blackjack21.git
cd Blackjack21

# Compilar (si no usas un build system)
# Ajusta las rutas según el paquete y la estructura de src
javac -d out $(find src -name "*.java")

# Ejecutar (ejemplo)
java -cp out paquete.principal.Main
</code></pre>
      <p>Si el proyecto usa un sistema de construcción (Maven/Gradle) —añádelo o ajusta los comandos a <code>mvn -q package</code> o <code>gradle build</code>.</p>
    </section>

    <section class="card">
      <h2>Uso</h2>
      <p>Al ejecutar la aplicación, sigue las instrucciones por consola para jugar partidas contra el crupier. Ejemplos de comandos/acciones:</p>
      <ul>
        <li><code>P</code> o <code>plantarse</code> — Plantarte.</li>
        <li><code>H</code> o <code>hit</code> — Pedir carta.</li>
        <li><code>S</code> o <code>stand</code> — Pasar turno.</li>
      </ul>

      <h3>Notas</h3>
      <ul>
        <li>Comprueba el paquete y el punto de entrada (<code>public static void main</code>) en <code>src/</code>.</li>
        <li>Si las clases están en paquetes, usa la estructura de carpetas adecuada al compilar.</li>
      </ul>
    </section>

    <section class="card">
      <h2>Contribuir</h2>
      <p>Contribuciones bienvenidas: mejora de reglas, interfaz gráfica, tests unitarios y refactorización.</p>
      <ul>
        <li>Haz fork del proyecto.</li>
        <li>Crea una rama con tu feature: <code>git checkout -b feat/nueva-funcionalidad</code></li>
        <li>Envía un Pull Request describiendo tus cambios.</li>
      </ul>
    </section>

    <section class="card">
      <h2>Autores</h2>
      <p>Proyecto creado por:</p>
      <ul>
        <li>Héctor Bascuñana</li>
        <li>Marcos Miquel</li>
        <li>Pau Collado</li>
      </ul>
      <p>Repositorio original: <a class="btn" href="https://github.com/paucolnav2/Blackjack21" target="_blank" rel="noopener">Ver en GitHub</a></p>
    </section>

    <footer>
      <p>¿Quieres que lo traduzca a Markdown (<code>README.md</code>) o que genere un archivo listo para subir al repo? Dime y lo creo.</p>
    </footer>
  </div>
</body>
</html>

