object CaeserCipher extends App{
  val str = "abcdexyz"
  val n = 10

  def encrypt = (c:Char, key:Int) => ((c.toUpper + key + 26 - 'A') % 26 + 'A').toChar
  def decrypt = (c:Char, key:Int) => ((c.toUpper - key + 26 - 'A') % 26 + 'A').toChar

  def cipher = (algo: (Char, Int)=>Char, text: String, key: Int) => text.map(algo(_, key))

  val cipherText = cipher(encrypt, str, n)
  val plainText = cipher(decrypt, cipherText, n)

  println(str,cipherText, plainText)
}