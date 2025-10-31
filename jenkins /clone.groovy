def call (string url,string branch){
  echo"this is cloning the code"
  git url:"url",branch:"${branch}"
  echo "code cloning successful"
}
