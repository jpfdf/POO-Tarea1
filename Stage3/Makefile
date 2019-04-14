JFLAGS = -g
JC = javac
JVM= java
FILE=
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
        Controlador.java \
        DetectorDeRequerimiento.java \
		    Imprimidor.java \
	    	SemaforoDeGiro.java \
        SimuladorEntrada.java \
        TestStage3.java \

MAIN = TestStage3

default: classes

classes: $(CLASSES:.java=.class)

run: $(MAIN).class 
	$(JVM) $(MAIN) $(FILE)

clean:
	$(RM) *.class
