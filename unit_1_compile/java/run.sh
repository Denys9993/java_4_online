echo 'run simle'
sd ./simple
javac Hello.java
java Hello

echo 'run package'
sd ../package
javac ua/olx/Hello.java
java ua.olx.Hello

echo 'run separate_packages'
sd ../separate_packages
javac ua/olx/test/Hello.java
java ua.olx.test.Hello

echo 'run minimal_proj'
sd ../minimal_proj
javac src/ua/olx/test/Hello.java
java src.ua.olx.test.Hello

echo 'run med_proj'
sd ../med_proj
javac src/ua/olx/test/Hello.java
java src.ua.olx.test.Hello
