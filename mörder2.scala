import util.Random

val random = new Random("Penis".hashCode)

val leute = List("Katharina", "Gordon", "Nikolaus", "Byny", "Helix",
  "Greada", "Philippp", "Timtim", "Emma", "Raphael", "Pätrik", "Friedchen", "Steffi", "Tiphophono")

val gegenstaende = List("Gabel", "Glas", "Seife", "Ball", "Banane", "Teller", "Zitrone", "Buch", "Fernbedienung", "Karamell", "Löffel", "Flasche", "Spüli", "Kissen", "Schokolade", "Agnosius", "Stift", "Müll", "Sonnencreme", "Messer", "Kamera", "Olive", "Knoblauch")

def enter() {
  println("Drücke ENTER.")
  io.StdIn.readLine()
}

def clear() {
  for (_ <- 0 to 1000) println("-")
}

val auftraege = leute.map(taeter => taeter -> (leute zip random.shuffle(gegenstaende).take(leute.size)))

for ((taeter, auftrag) <- auftraege) {
  println(s"Auftrag für $taeter:")
  for ((opfer, gegenstand) <- auftrag) {
    println(s"- Töte $opfer mit $gegenstand.")
  }
  println()
}
