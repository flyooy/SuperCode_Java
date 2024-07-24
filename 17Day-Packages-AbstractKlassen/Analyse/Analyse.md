Abstrakte Klassen:

	Definition: Eine abstrakte Klasse ist eine Klasse, die nicht instanziiert werden kann und dazu dient, gemeinsame Eigenschaften und Methoden für Unterklassen zu definieren. Sie kann sowohl abstrakte Methoden (ohne Implementierung) als auch konkrete Methoden enthalten.
	Hauptmerkmale:
	•	Dient als Vorlage für andere Klassen.
	•	Kann sowohl abstrakte als auch konkrete Methoden enthalten.
	•	Kann nicht direkt instanziiert werden.

	Vorteile:
	•	Können sowohl abstrakte als auch konkrete Methoden enthalten.
	•	Verhindern Instanziierung, wenn dies nicht erwünscht ist.
	•	Ermöglichen teilweise Implementierung gemeinsamer Funktionalität.
	Nachteile:
	•	Können nicht mehrfach vererbt werden.
	•	Enge Kopplung zwischen Klassen.


Polymorphismus:

	Definition: Polymorphismus bedeutet, dass eine Methode unterschiedliche Implementierungen haben kann, je nachdem, welches Objekt sie aufruft.
	Hauptmerkmale:
	•	Ermöglicht, dass Objekte unterschiedlichster Klassen auf die gleiche Weise behandelt werden können.
	•	Wird durch Vererbung und Interfaces unterstützt.

    Vorteile:
	•	Erhöht die Flexibilität und Erweiterbarkeit des Codes.
	•	Erlaubt eine einheitliche Behandlung von Objekten unterschiedlicher Klassen.
	Nachteile:
	•	Kann zu weniger klaren Abhängigkeiten führen.
	•	Erfordert eine sorgfältige Design- und Implementierungsstrategie.

   

```java
//Beispiel für Polymorphismus:

class Tier {
    void machenGeraeusch() {
        System.out.println("Das Tier macht ein Geräusch");
    }
}

class Hund extends Tier {
    void machenGeraeusch() {
        System.out.println("Der Hund bellt");
    }
}

class Katze extends Tier {
    void machenGeraeusch() {
        System.out.println("Die Katze miaut");
    }
}

public class Main {
    public static void main(String[] args) {
        Tier tier1 = new Hund();
        Tier tier2 = new Katze();
        
        tier1.machenGeraeusch(); 
        tier2.machenGeraeusch(); 
    }
}
```

```java
//Beispiel für abstrakte Klassen:

abstract class Fahrzeug {
    abstract void fahren();
    
    void tanken() {
        System.out.println("Das Fahrzeug tankt");
    }
}

class Auto extends Fahrzeug {
    void fahren() {
        System.out.println("Das Auto fährt");
    }
}

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.fahren(); // Implementiert in Auto
        auto.tanken(); // Vererbt von Fahrzeug
    }
}
```