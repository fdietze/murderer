import util.Random

val random = new Random("Zion".hashCode)

val leute = List("Katharina", "Gordon", "Nikolaus", "Shahinson (Büni)", "Helix",
  "Greada", "Philippp", "Timtim", "Emma", "Raphael", "Pätrik", "Friedchen", "Steffi", "Tiphophono")

val gegenstaende = List("Gabel", "Glas", "Seife", "Ball", "Banane", "Teller", "Zitrone", "Buch", "Fernbedienung", "Karamell", "Löffel", "Flasche", "Spüli", "Kissen", "Schokolade", "Agnosius", "Stift", "Müll", "Sonnencreme", "Messer", "Kamera", "Olive", "Knoblauch", "Handy", "Rhönrad", "Kostüm", "Spanngurt", "Autoschlüssel", "Bikinioberteil", "Handtuch")

def enter() {
  println("Drücke ENTER.")
  io.StdIn.readLine()
}

def clear() {
  for (_ <- 0 to 1000) println("-")
}

val auftraege = leute.map(taeter => taeter -> ((leute diff List(taeter)) zip random.shuffle(gegenstaende).take(leute.size - 1)).toMap).toMap

for ((taeter, auftrag) <- auftraege.toSeq.sortBy(_._1)) {
  clear()
  println(s"Auftrag für $taeter:")
  enter()
  if (taeter == "Philippp") {
    for ((opfer, gegenstand) <- auftrag) {
      println(s"- Töte $opfer mit $gegenstand.")
    }
  } else {
    val gegenstand = auftraege("Philippp")(taeter)
    println(s"Nicht vergessen. Wir alle verarschen Philippp.")
    println(s"Nimm einen Zettel und schreibe eine fake-Liste auf.")
    println(s"Aber ganz wichtig:")
    println(s"Lass dich auf gar keinen Fall von Philippp mit $gegenstand töten.")
    println(s"Genieße die Show.")
  }
  println()
  enter()
}
clear()
