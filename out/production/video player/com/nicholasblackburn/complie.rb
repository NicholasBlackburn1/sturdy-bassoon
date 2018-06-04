puts "now compling7 SturdyBasoon\n"
system("javac  main.java texttohex.java hextobinary.java hextotex.java")
puts "now moving .class files to jarfile SturdyBasoon.jar\n "
system("jar cvfm SturdyBasoon.jar MANIFEST.MF *.class")
