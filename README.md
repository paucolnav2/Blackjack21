# Blackjack21

Proyecto de simulación/implementación del juego Blackjack.  
Hecho por **Héctor Bascuñana, Marcos Miquel y Pau Collado**.

---

## 📖 Descripción
Blackjack21 es una implementación del clásico juego de cartas Blackjack.  
El objetivo de este repositorio es ofrecer una versión didáctica y funcional del juego, apta para ejecutar desde IDEs como IntelliJ o compilando con `javac`.

### ✨ Características
- Gestión de mazos y reparto de cartas.  
- Reglas básicas de Blackjack (plantarse, pedir carta, valores de cartas, As como 1/11).  
- Lógica de crupier y comparación de manos.  
- Interfaz de consola para jugar (o integrar con GUI en el futuro).  

---

## ⚙️ Instalación
Clona el repositorio y abre el proyecto en tu IDE favorito o compílalo desde la línea de comandos:

```bash
# clonar
git clone https://github.com/paucolnav2/Blackjack21.git
cd Blackjack21

# compilar (si no usas un build system)
javac -d out $(find src -name "*.java")

# ejecutar (ejemplo, ajusta al paquete correcto)
java -cp out paquete.principal.Main
