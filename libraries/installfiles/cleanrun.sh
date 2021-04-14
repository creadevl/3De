cd ~/3De
echo "removing prebuilt classes"
rm main.class cache.class config.class debug.class environment.class packer.class zipunzip.class
echo "building 3De"
javac main.java
javac cache.java
javac config.java
javac environment.java
javac debug.java
javac packer.java
javac zipunzip.java
echo "starting 3De"
java main
echo "running other commands as tests"
java main about
java main notevil
rm main.class cache.class config.class debug.class environment.class packer.class zipunzip.class
echo "ready for git"