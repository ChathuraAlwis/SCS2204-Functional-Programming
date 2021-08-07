import encrypt.encrypt
import decrypt.decrypt

object Main extends App{

  //Initial plaintext
  val str:String = "Caesar cipher"

  //Key
  val n:Int = 20

  println("Initial Plaintext   : " + str)

  //Encrypting the initial plaintext
  val cipherText = new encrypt(str, n).cipherText
  println("Encrypted Ciphertext: " + cipherText)

  //Decrypting the ciphertext
  val plainText = new decrypt(cipherText, n).plainText
  println("Decrypted Plaintext : " + plainText)
}
