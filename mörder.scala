import util.Random.shuffle

val leute = List(
  "Katharina",
  "Gordon",
  "Nikolaus",
  "Shahinson (Byny)",
  "Helix",
  "Greada",
  "Philippp",
  "Timtim",
  "Emma",
  "Raphael",
  "Pätrik",
  "Friedchen",
  "Steffi",
  "Tiphophono")

def enter() {
  println("Drücke ENTER.")
  io.StdIn.readLine()
}

def clear() {
  for (_ <- 0 to 1000) println("-")
}

// println(s"Teilnehmer: ${leute.size}")
// enter()

val randomLeute = shuffle(leute)

val first = randomLeute.dropRight(1)
val last = randomLeute.takeRight(1)
val shift = last ++ first

val pairs = randomLeute zip shift

val randomPairs = shuffle(pairs)

def auswahl() {
  for( (täter, i) <- leute.zipWithIndex ) {
    println(s"$i) ${täter}")
  }

  println("Drücke deine Zahl um zu sehen, wen du töten musst.")
}

auswahl()
