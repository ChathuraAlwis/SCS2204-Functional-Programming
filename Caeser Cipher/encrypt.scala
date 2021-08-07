package encrypt

class encrypt(val str:String, n:Int = 1) {

  //initializing resultant string
  var res_str = ""

  //loop through the input
  for (char <- str){

    //if char is a capital letter
    if (char <= 'Z' && char >= 'A') res_str += (((char + n - 'A') % 26 + 'A').toChar)

    //if char is a simple letter
    else if (char <= 'z' && char >= 'a') res_str += (((char + n - 'a') % 26 + 'a').toChar)

    //other character
    else res_str += char
  }

  def cipherText = res_str

}