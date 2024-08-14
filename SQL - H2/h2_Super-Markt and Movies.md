## 1. SQL Movies
```sql
/* 1 Filme gruppieren nach Genrev*/
Select Genre, Count(*) 
 From Movies
Group By Genre

/* 2 Durchschnittliches Erscheinungsjahr pro Genre: */
Select Genre, Avg(Release_Year) as Avarage_Year
From Movies
Group by Genre;

/* 3. Top 5 Genres nach Anzahl der Filme:*/
Select Genre,  Count(*) as Count_by_Genres
From Movies
Group by Genre
Order by Count_by_Genres DESC
Limit 5;


/* 4. Jahr mit den meisten Filmen:***/
Select Release_Year, Count(*) as Count
from movies
Group by  Release_Year
order by Count DESC
Limit 1;

/* 5. Genres mit den meisten Filmen nach 2000***/
Select Genre, Count(*) as Count
from movies
where Release_Year>2000
Group by  Genre
order by Count DESC
Limit 1;

/* 6. Genres nach der Anzahl der Filme sortiert:***/
Select Genre,  Count(*) as Count_by_Genres
From Movies
Group by Genre
Order by Count_by_Genres ASC

/* 7. Genre mit den ältesten durchschnittlichen Erscheinungsjahren:***/
SELECT Genre, AVG(Release_Year) as Average_Release_Year
FROM Movies
GROUP BY Genre
ORDER BY Average_Release_Year
LIMIT 1;

```

## 2. SQL Super-Markt
```sql
CREATE TABLE Products (
    ID_Products INT PRIMARY KEY,
    NAME  VARCHAR(50),
    Kategorie  VARCHAR(50),
    Price Int,
    ExpirationDate Date
);

CREATE TABLE Categories (
    CategoryID INT PRIMARY KEY,
    CategoryName VARCHAR(50) NOT NULL
);


INSERT INTO Categories (CategoryID,CategoryName) VALUES (1,'Obst'); /* Obst = 1*/
INSERT INTO Categories (CategoryID,CategoryName) VALUES (2,'Gemüse'); /* Gemüse = 2*/
INSERT INTO Categories (CategoryID, CategoryName) VALUES (3,'Getränke'); /* Getränke = 3*/

INSERT INTO Products (ID_Products, Name, Kategorie, Price, ExpirationDate) VALUES
(1,'Äpfel', 1, 3, '2024-09-01'),
(2,'Tomaten', 2, 1, '2024-08-20'),
(3, 'Cola', 3, 2, '2024-12-31');


Select * 
From Products
Where Kategorie = 1;

Select *
From Products
Where Price > 5;


Select *
From Products
Where ExpirationDate < '2024-08-25'; /* Z.b heute ist 2024-08-25, bekomme ich product Tomaten  mit ExpirationDate 2024-08-20*/


/* 1 Produkte gruppieren nach Kategorie*/
Select Count(*), Kategorie
From Products 
Group by Kategorie;

/* 2 **Durchschnittlicher Preis pro Kategorie***/
Select AVG(Price), Kategorie
From Products 
Group by Kategorie;

/* 3 - **Top 3 Kategorien nach Anzahl der Produkte***/
Select Count(*), Kategorie
From Products 
Group by Kategorie
Limit 3;

/* 4 - **Kategorie mit dem höchsten durchschnittlichen Preis***/
Select AVG(Price) as Average_Price, Kategorie
From Products 
Group by Kategorie
Order by Average_Price
Limit 1;
/* 5 - **Produkte, die teurer als der Durchschnitt ihrer Kategorie sind**/
Select  NAME, Kategorie, Price
FROM Products
WHERE Price > (
    SELECT AVG(Price)
    FROM Products p2
    WHERE p2.Kategorie = Products.Kategorie
)
/* 6 - **Kategorien mit den meisten abgelaufenen Produkten***/
Select  Kategorie, Count(*)
From Products
Where ExpirationDate <  CURDATE()
Group by Kategorie;

/* 7 - **Produkte mit der höchsten Haltbarkeit in ihrer Kategorie***/
/* 8  - **Produkte mit der höchsten Haltbarkeit in ihrer Kategorie***/
/* 9 - **Durchschnittliche Haltbarkeit (Tage) pro Kategorie***/
/* 10 - **Durchschnittlicher Preis für Produkte, die nach 2023 ablaufen***/
/* 11 - **Produkte mit Preis über dem Durchschnitt, sortiert nach Haltbarkeit***/
/* 12 - **Teuerstes Produkt in jeder Kategorie finden***/
/* 13 - Produkte anzeigen, deren Preis über dem Durchschnittspreis aller Produkte liegt*/

    
    
    
    
   
    
    
    
   
    

```