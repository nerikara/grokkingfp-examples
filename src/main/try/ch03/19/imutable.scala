def firstTwo(li: List[String]): List[String] = {
  if (li.size >= 2) {
    li.slice(0, 2)
  } else {
    li;
  }
}

def lastTwo(li: List[String]): List[String] = {
  if (li.size >= 2) {
    li.slice(li.size - 2, li.size)
  } else {
    li;
  }
}

def moveFirstTwoToTheEnd(li: List[String]): List[String] = {
  if (li.size >= 2) {
    li.slice(2, li.size).appendedAll(firstTwo(li))
  } else {
    li;
  }
}

def insertBeforeLast(li: List[String], s: String): List[String] = {
  li.slice(0, li.size - 1).appended(s).appended(li.last)
}
