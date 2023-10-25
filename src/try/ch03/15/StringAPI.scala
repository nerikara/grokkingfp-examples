def abbreviate(name: String): String = {
  val wordsArray = name.split(' ')
  if (wordsArray.size == 2) {
    s"${wordsArray(0)(0)}. ${wordsArray(1)}"
  } else {
    ""
  }
}
