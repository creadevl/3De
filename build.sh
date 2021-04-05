cd ~/3De
echo "removing prebuilt classes"
rm main.class
echo "building 3De"
javac main.java
echo "starting 3De"
java main
echo "running other commands as tests"
java main about
java main notevil