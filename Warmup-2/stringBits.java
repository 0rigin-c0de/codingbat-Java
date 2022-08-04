public String stringBits(String str) {
    String result = "";
    // Note: the loop increments i by 2
    for (int i=0; i<str.length(); i+=2) {
      result = result + str.substring(i, i+1);
      // Alternately could use str.charAt(i)
    }
    return result;
  }