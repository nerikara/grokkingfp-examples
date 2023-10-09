def increment(x: Int): Int = {
  x + 1
}

def add(a: Int, b: Int): Int = {
  a + b
}

def wordScore(word: String): Int = {
  word.replaceAll("a", "").length
}

def getTipPercentage(names: List[String]): Int = {
  if (names.size > 5) 20
  else if (names.size > 0) 10
  else 0
}

def getFirstCharacter(s: String): Char = {
  if (s.length() > 0) s.charAt(0)
  else ' '
}
