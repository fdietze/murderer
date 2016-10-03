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

println(s"Teilnehmer: ${leute.size}")
enter()

val randomLeute = shuffle(leute)

val first = randomLeute.dropRight(1)
val last = randomLeute.takeRight(1)
val shift = last ++ first

val pairs = randomLeute zip shift

val randomPairs = shuffle(pairs)

println(randomLeute)
println(pairs)
println(randomPairs)

for (_ <- 0 to 1000) println("-")

for ((täter, opfer) <- randomPairs) {
  println(s"Jetzt soll ${täter} kommen.")
  enter()

  println(s"Du musst ${opfer} töten.")
  enter()

  for (_ <- 0 to 1000) println("-")
}
