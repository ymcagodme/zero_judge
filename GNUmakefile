JFLAGS = -g -d build
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES := $(wildcard *.java)

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) build/*.class
