## SQL Queries - JOIN
```sql
CREATE TABLE Garten (
    GartenID INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(255) NOT NULL,
    Größe DECIMAL(10, 2) NOT NULL
);

CREATE TABLE Pflanze (
    PflanzenID INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(255) NOT NULL,
    Essbar BOOLEAN NOT NULL,
    WasserbedarfProPflanze DECIMAL(10, 2) NOT NULL
);

CREATE TABLE GartenPflanzen (
    GartenID INT,
    PflanzenID INT,
    Anzahl INT NOT NULL,
    PRIMARY KEY (GartenID, PflanzenID),
    FOREIGN KEY (GartenID) REFERENCES Garten(GartenID),
    FOREIGN KEY (PflanzenID) REFERENCES Pflanze(PflanzenID)
);

INSERT INTO Garten (GartenID, Name, Größe)
VALUES
(1, 'Blumenparadies', 500),
(2, 'GemüseObstGarten', 300),
(3, 'Kräutergarten', 150);

INSERT INTO Pflanze (PflanzenID, Name, Essbar, WasserbedarfProPflanze)
VALUES
(1, 'Rose', FALSE, 2),
(2, 'Tomate', TRUE, 3),
(3, 'Basilikum', TRUE, 1),
(4, 'Sonnenblume', FALSE, 5),
(5, 'Karotte', TRUE, 2),
(6, 'Apfelbaum', TRUE, 10),
(7, 'Lavendel', FALSE, 1),
(8, 'Erdbeere', TRUE, 2),
(9, 'Kartoffel', TRUE, 4),
(10, 'Kürbis', TRUE, 3),
(11, 'Dill', TRUE, 1);

INSERT INTO GartenPflanzen (GartenID, PflanzenID, Anzahl)
VALUES
(1, 1, 50),    
(1, 4, 20),   
(1, 7, 100),

(2, 2,  30),   
(2, 5,  40),   
(2, 9,  20),    
(2, 10, 10),    
(2, 6,  5),    
(2, 8,  25),    

(3, 3, 100),   
(3, 2, 15),   
(3, 7, 50),   
(3, 11, 100);  

/* 1. **Berechne die gesamte Anzahl von Pflanzen in jedem Garten***/
Select Garten.Name, Sum(Anzahl) As Sum_von_Pflanzen
From Garten
Inner Join GartenPflanzen On GartenPflanzen.GartenId=Garten.GartenId
Group by Garten.GartenId

/* 2. **Finde die Namen der Pflanzen und die Anzahl der Pflanzen im „Blumenparadies“***/
Select Pflanze.Name, Sum(Anzahl) As Sum_von_Pflanzen
From Pflanze
Inner Join GartenPflanzen On GartenPflanzen.PflanzenId=Pflanze.PflanzenId
Where (Select GartenId from garten where gartenid=1)
Group by Pflanze.PflanzenId

/* 3. **Liste Gärten mit weniger als 200 Pflanzen auf***/
Select Garten.Name, Sum(Anzahl) As Sum_von_Pflanzen
From Garten
Inner Join GartenPflanzen On GartenPflanzen.GartenId=Garten.GartenId
Group by Garten.GartenId
having sum(Anzahl)<200;

/* 4. **Finde den Namen der Pflanze und den Wasserbedarf für alle essbaren Pflanzen im „Kräutergarten“***/
Select Pflanze.Name, Pflanze.Wasserbedarfpropflanze
From Pflanze
Inner Join GartenPflanzen On GartenPflanzen.PflanzenId=Pflanze.PflanzenId
Where (Select GartenId from garten where gartenid=3 ) and pflanze.essbar = TRUE 
Group by Pflanze.PflanzenId;

/* 5. **Berechne die durchschnittliche Anzahl an Pflanzen pro Garten***/
Select AVG(AnzahlPflanzen)
From (Select GartenID, Count(PflanzenID) AS AnzahlPflanzen from Gartenpflanzen group by GartenId)

/* 6. **Finde alle essbaren Pflanzen im Kräutergarten***/
Select Pflanze.Name
From Pflanze
Inner Join GartenPflanzen On GartenPflanzen.PflanzenId=Pflanze.PflanzenId
Where (Select GartenId from garten where gartenid=3 ) and pflanze.essbar = TRUE 
Group by Pflanze.PflanzenId;


/*2 JOINS notwendig*/

/** *Liste alle Gärten auf, die mindestens eine essbare Pflanze enthalten***/
Select Garten.Name
From Garten
Inner Join GartenPflanzen On GartenPflanzen.GartenId=Garten.GartenId
Inner Join Pflanze On GartenPflanzen.PflanzenId=pflanze.pflanzenid
Where Essbar = TRUE
Group by Garten.GartenId;

/** *Finde die Gärten, in denen mindestens eine Pflanze mehr als 10 Liter Wasser pro Tag benötigt***/
Select Garten.Name
From Garten
Inner Join GartenPflanzen On GartenPflanzen.GartenId=Garten.GartenId
Inner Join Pflanze On GartenPflanzen.PflanzenId=pflanze.pflanzenid
Where Wasserbedarfpropflanze>=10
Group by Garten.GartenId;

/** *Berechne den gesamten Wasserbedarf für einen bestimmten Garten***/
Select Garten.Name, Sum(Wasserbedarfpropflanze) As Total_Wasserbedarfpropflanze
From Garten
Inner Join GartenPflanzen On GartenPflanzen.GartenId=Garten.GartenId
Inner Join Pflanze On GartenPflanzen.PflanzenId=pflanze.pflanzenid
Group by Garten.GartenId;

/** *Berechne den Garten mit dem höchsten Wasserbedarf***/
Select Garten.Name, Sum(Wasserbedarfpropflanze) As Total_Wasserbedarfpropflanze
From Garten
Inner Join GartenPflanzen On GartenPflanzen.GartenId=Garten.GartenId
Inner Join Pflanze On GartenPflanzen.PflanzenId=pflanze.pflanzenid
Group by Garten.GartenId
Order by Total_Wasserbedarfpropflanze DESC
Limit 1;

/** *Finde den Garten mit der größten Anzahl an essbaren Pflanzen**/
Select Garten.Name, Count(Pflanze.Essbar) as Count_Essbar_Pflanze
From Garten
Inner Join GartenPflanzen On GartenPflanzen.GartenId=Garten.GartenId
Inner Join Pflanze On GartenPflanzen.PflanzenId=pflanze.pflanzenid
Group by Garten.GartenId
Order by Count_Essbar_Pflanze DESC
Limit 1;

/** *Finde die Gärten, die keine essbaren Pflanzen enthalten***/
Select Garten.Name
From Garten
Inner Join GartenPflanzen On GartenPflanzen.GartenId=Garten.GartenId
Inner Join Pflanze On GartenPflanzen.PflanzenId=pflanze.pflanzenid
Group by Garten.GartenId
Having SUM(CASE WHEN Pflanze.Essbar = TRUE THEN 1 ELSE 0 END) = 0;


```