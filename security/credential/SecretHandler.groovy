def secret = "SECRET_HERE"

def decrypt(String pass) {
  def sanitizedPass = pass.trim()
  if(!sanitizedPass.startsWith("{") && !sanitizedPass.endsWith("}")) {
  	sanitizedPass = "{" + sanitizedPass + "}"
  }
  return hudson.util.Secret.decrypt("${sanitizedPass}")
}

println( decrypt(secret) )
