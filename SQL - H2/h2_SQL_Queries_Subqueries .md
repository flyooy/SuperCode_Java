## 1. SQL - Queries & Subqueries
```sql
CREATE TABLE Kategorie (
    KategorieID INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(255) NOT NULL
);

CREATE TABLE Zug (
    ZugID INT PRIMARY KEY AUTO_INCREMENT,
    KategorieID INT,
    Sitzplaetze INT NOT NULL,
    Stehplaetze INT NOT NULL,
    FOREIGN KEY (KategorieID) REFERENCES Kategorie(KategorieID)
);

CREATE TABLE Zugverbindung (
    VerbindungsID INT PRIMARY KEY AUTO_INCREMENT,
    ZugID INT,
    Startort VARCHAR(255) NOT NULL,
    Ankunftsort VARCHAR(255) NOT NULL,
    Datum DATE NOT NULL,
    Dauer TIME NOT NULL,
    FOREIGN KEY (ZugID) REFERENCES Zug(ZugID)
);

INSERT INTO Kategorie (KategorieID, Name) VALUES (1, 'ICE');
INSERT INTO Kategorie (KategorieID, Name) VALUES (2, 'Regional');
INSERT INTO Kategorie (KategorieID, Name) VALUES (3, 'Intercity');
INSERT INTO Kategorie (KategorieID, Name) VALUES (4, 'S-Bahn');


INSERT INTO Zug (ZugID, Sitzplaetze, Stehplaetze, KategorieID) VALUES (1, 500, 200, 1);
INSERT INTO Zug (ZugID, Sitzplaetze, Stehplaetze, KategorieID) VALUES (2, 300, 100, 2);
INSERT INTO Zug (ZugID, Sitzplaetze, Stehplaetze, KategorieID) VALUES (3, 400, 150, 3);
INSERT INTO Zug (ZugID, Sitzplaetze, Stehplaetze, KategorieID) VALUES (4, 200, 50, 4);
INSERT INTO Zug (ZugID, Sitzplaetze, Stehplaetze, KategorieID) VALUES (5, 600, 250, 1);
INSERT INTO Zug (ZugID, Sitzplaetze, Stehplaetze, KategorieID) VALUES (6, 350, 120, 2);
INSERT INTO Zug (ZugID, Sitzplaetze, Stehplaetze, KategorieID) VALUES (7, 450, 170, 3);
INSERT INTO Zug (ZugID, Sitzplaetze, Stehplaetze, KategorieID) VALUES (8, 250, 80, 4);


INSERT INTO Zugverbindung (VerbindungsID, ZugID, Startort, Ankunftsort, Datum, Dauer) VALUES (1, 1, 'Berlin', 'München', '2024-08-15', '04:30:00');
INSERT INTO Zugverbindung (VerbindungsID, ZugID, Startort, Ankunftsort, Datum, Dauer) VALUES (2, 2, 'Hamburg', 'Köln', '2024-08-15', '03:00:00');
INSERT INTO Zugverbindung (VerbindungsID, ZugID, Startort, Ankunftsort, Datum, Dauer) VALUES (3, 3, 'Frankfurt', 'Stuttgart', '2024-08-15', '02:15:00');
INSERT INTO Zugverbindung (VerbindungsID, ZugID, Startort, Ankunftsort, Datum, Dauer) VALUES (4, 4, 'Düsseldorf', 'Dortmund', '2024-08-15', '00:45:00');
INSERT INTO Zugverbindung (VerbindungsID, ZugID, Startort, Ankunftsort, Datum, Dauer) VALUES (5, 1, 'München', 'Berlin', '2024-08-16', '04:30:00');
INSERT INTO Zugverbindung (VerbindungsID, ZugID, Startort, Ankunftsort, Datum, Dauer) VALUES (6, 2, 'Köln', 'Hamburg', '2024-08-16', '03:00:00');
INSERT INTO Zugverbindung (VerbindungsID, ZugID, Startort, Ankunftsort, Datum, Dauer) VALUES (7, 3, 'Stuttgart', 'Frankfurt', '2024-08-16', '02:15:00');
INSERT INTO Zugverbindung (VerbindungsID, ZugID, Startort, Ankunftsort, Datum, Dauer) VALUES (8, 4, 'Dortmund', 'Düsseldorf', '2024-08-16', '00:45:00');
INSERT INTO Zugverbindung (VerbindungsID, ZugID, Startort, Ankunftsort, Datum, Dauer) VALUES (9, 5, 'Berlin', 'München', '2024-08-17', '04:30:00');
INSERT INTO Zugverbindung (VerbindungsID, ZugID, Startort, Ankunftsort, Datum, Dauer) VALUES (10, 6, 'Hamburg', 'Köln', '2024-08-17', '03:00:00');
INSERT INTO Zugverbindung (VerbindungsID, ZugID, Startort, Ankunftsort, Datum, Dauer) VALUES (11, 7, 'Frankfurt', 'Stuttgart', '2024-08-17', '02:15:00');
INSERT INTO Zugverbindung (VerbindungsID, ZugID, Startort, Ankunftsort, Datum, Dauer) VALUES (12, 8, 'Düsseldorf', 'Dortmund', '2024-08-17', '00:45:00');
INSERT INTO Zugverbindung (VerbindungsID, ZugID, Startort, Ankunftsort, Datum, Dauer) VALUES (13, 1, 'München', 'Berlin', '2024-08-18', '04:30:00');
INSERT INTO Zugverbindung (VerbindungsID, ZugID, Startort, Ankunftsort, Datum, Dauer) VALUES (14, 2, 'Köln', 'Hamburg', '2024-08-18', '03:00:00');
INSERT INTO Zugverbindung (VerbindungsID, ZugID, Startort, Ankunftsort, Datum, Dauer) VALUES (15, 3, 'Stuttgart', 'Frankfurt', '2024-08-18', '02:15:00');
INSERT INTO Zugverbindung (VerbindungsID, ZugID, Startort, Ankunftsort, Datum, Dauer) VALUES (16, 4, 'Dortmund', 'Düsseldorf', '2024-08-18', '00:45:00');

INSERT INTO Zugverbindung (VerbindungsID, ZugID, Startort, Ankunftsort, Datum, Dauer) 
VALUES (17, 1, 'Berlin', 'München', '2024-08-15', '04:30:00');

INSERT INTO Zugverbindung (VerbindungsID, ZugID, Startort, Ankunftsort, Datum, Dauer) 
VALUES (18, 1, 'Berlin', 'München', '2024-08-16', '04:30:00');


INSERT INTO Zugverbindung (VerbindungsID, ZugID, Startort, Ankunftsort, Datum, Dauer) 
VALUES (19, 2, 'Hamburg', 'Köln', '2024-08-15', '03:00:00');

INSERT INTO Zugverbindung (VerbindungsID, ZugID, Startort, Ankunftsort, Datum, Dauer) 
VALUES (20, 2, 'Hamburg', 'Köln', '2024-08-16', '03:00:00');

INSERT INTO Zugverbindung (VerbindungsID, ZugID, Startort, Ankunftsort, Datum, Dauer) 
VALUES (21, 3, 'Frankfurt', 'Stuttgart', '2024-08-15', '02:15:00');

INSERT INTO Zugverbindung (VerbindungsID, ZugID, Startort, Ankunftsort, Datum, Dauer) 
VALUES (22, 3, 'Frankfurt', 'Stuttgart', '2024-08-16', '02:15:00');


INSERT INTO Zugverbindung (VerbindungsID, ZugID, Startort, Ankunftsort, Datum, Dauer) 
VALUES (23, 4, 'Düsseldorf', 'Dortmund', '2024-08-15', '00:45:00');

INSERT INTO Zugverbindung (VerbindungsID, ZugID, Startort, Ankunftsort, Datum, Dauer) 
VALUES (24, 4, 'Düsseldorf', 'Dortmund', '2024-08-18', '00:45:00');


INSERT INTO Zugverbindung (VerbindungsID, ZugID, Startort, Ankunftsort, Datum, Dauer) 
VALUES (25, 5, 'München', 'Berlin', '2024-08-15', '04:30:00');

INSERT INTO Zugverbindung (VerbindungsID, ZugID, Startort, Ankunftsort, Datum, Dauer) 
VALUES (26, 5, 'München', 'Berlin', '2024-08-17', '04:30:00');

/* - **1.1:** Alle Züge auflisten*/
SELECT *FROM Zug;

/* - **1.2:** Alle Zugverbindungen, die in Berlin starten*/
SELECT * FROM ZUGVERBINDUNG
WHERE STARTORT = 'Berlin';

/* - **1.3:** Alle Zugverbindungen, die länger als 3 Stunden dauern*/
SELECT * FROM ZUGVERBINDUNG
WHERE Dauer >= '03:00:00';

/* - **1.4:** Alle Verbindungen für den 15. August 2024*/
SELECT * FROM ZUGVERBINDUNG
WHERE DATUM= '2024-08-15';

/* - **1.5:** Alle Verbindungen von München nach Berlin*/
SELECT * FROM ZUGVERBINDUNG
WHERE STARTORT = 'München' and ANKUNFTSORT = 'Berlin';

/* - **2.1:** Die Anzahl der Sitzplätze und Stehplätze für Züge, die in Frankfurt ankommen*/
SELECT ZugId, SITZPLAETZE, STEHPLAETZE   FROM Zug 
WHERE ZugId In (SELECT ZugId FROM Zugverbindung WHERE ANKUNFTSORT = 'Frankfurt')
group by ZugId;

/* - **2.2:** Finde alle Verbindungen der Kategorie 'ICE’*/
Select *
From ZUGVERBINDUNG
Where ZugID In(SELECT ZugId FROM Zug WHERE KategorieId In(SELECT KategorieID FROM Kategorie WHERE Name = 'ICE'));

/* - **2.3:** Die Gesamtzahl der Sitzplätze für alle Züge, die am 16. August 2024 verkehren*/
SELECT ZugId, SUM(SITZPLAETZE)  FROM Zug 
WHERE ZugId In (SELECT ZugId FROM Zugverbindung WHERE DATUM   = '2024-08-16')
GROUP BY zugId;

/* - **2.4:** Liste die Anzahl der Verbindungen auf, die pro Tag stattfinden*/
SELECT Datum, COUNT(*) AS AnzahlVerbindungen
FROM Zugverbindung
GROUP BY Datum
ORDER BY Datum;

/* - **2.5:** Finde die Startorte, von denen die meisten Verbindungen ausgehen, und sortiere sie nach der Anzahl der Verbindungen*/
SELECT Startort, COUNT(*) AS AnzahlVerbindungen
FROM Zugverbindung
GROUP BY Startort
ORDER BY AnzahlVerbindungen DESC;


/* **Bonus:***/

/* - **3.1:** Finde alle Züge, die an mindestens zwei verschiedenen Tagen im Einsatz sind*/
SELECT ZugID
FROM Zugverbindung
GROUP BY ZugID
HAVING COUNT(Datum) >= 2;

/* - **3.2:** Ermittle die durchschnittliche Dauer aller Verbindungen der Kategorie 'Regional’*/
/* Mit Regional gib es keine verbindung, schreibt null, deshalb ich habe gaendert auf ICE: */

SELECT AVG(CAST(SUBSTRING(Dauer, 1, 2) AS INT) * 60 + CAST(SUBSTRING(Dauer, 4, 2) AS INT)) AS DurchschnittlicheDauerInMinuten
FROM Zugverbindung
WHERE ZugID IN ( SELECT ZugID FROM Zug WHERE KategorieID IN (SELECT KategorieID FROM Kategorie WHERE Name = 'ICE'));

/* - **3.3:** Identifiziere Züge, die in zwei aufeinanderfolgenden Tagen fahren und dabei in den gleichen Städten starten und ankommen*/


Select ZugId
From Zugverbindung z1
WHERE Datum In(Select DATEADD(DAY, 1, Datum)
from Zugverbindung z2
Where z2.ZugId = z1.ZugID
        and z2.ankomen = z1.ankomen
        and z2.startort= z1.startort) 
GROUP BY ZugID

/* Oder */

Select distinct z1.ZugId
From Zugverbindung z1, Zugverbindung z2
Where z2.ZugId = z1.ZugID
        and z2.ankunftsort = z1.ankunftsort
        and z2.startort= z1.startort
And DateDiff('DAY', z2.datum, z1.datum)=1;


/* - **3.4:** Ermittle die Anzahl der Zugverbindungen, die im Jahr 2024 stattfinden, und gruppiere sie nach Monaten.*/
SELECT  EXTRACT(MONTH FROM Datum) AS Monat,  COUNT(*) AS AnzahlVerbindungen
FROM Zugverbindung
WHERE Datum >= '2024-01-01' AND Datum <= '2024-12-31'
GROUP BY EXTRACT(MONTH FROM Datum)
ORDER BY Monat;

/* - **3.5:** Finde den Tag mit den meisten Verbindungen in einem bestimmten Monat, zum Beispiel August 2024.*/
SELECT Datum, COUNT(*) AS MaxAnzahlVerbindungen
FROM Zugverbindung
WHERE Datum >= '2024-08-01' and  Datum <= '2024-08-31' 
GROUP BY Datum
ORDER BY Datum DESC
Limit 1

```