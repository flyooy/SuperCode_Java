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

```