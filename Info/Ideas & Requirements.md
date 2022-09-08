# Rent my Car

## Inleiding

In deze periode gaan wij een REST API maken met Java en Springboot. Als groep, zijn we op de conclusie gekomen dat wij de voorbeeld casus gaan gebruiken. Dit houdt in dat wij een API en (in de volgende periode) een android applicatie gaan bouwen waarin gebruikers auto's kunnen huren en gebruikers hun eigen auto te huur kunnen aanbieden.

## Functionaliteiten

-   Een gebruiker kan kiezen of deze een auto wilt huren of wilt verhuren
-   Als men een auto aanbied moeten de volgende gegevens worden opgeslagen:
    -   Merk
    -   Type
    -   Brandstoftype
    -   Zitplaatsen
    -   Kenteken
    -   Inrichting (Hatchback, Sedan, Station, Cabrio etc.)
-   Ook moeten de voorwaarden worden opgenomen:
    -   Prijs (per uur of per dag?)
    -   Datum van ophalen en inleveren
-   Daarnaast kan men foto's toevoegen voor de advertentie

-   Er moet onderscheid gemaakt worden tussen brandstoftypes. Bijvoorbeeld:
    -   Diesel
    -   Benzine
    -   Hybrid
    -   Elektrisch
    -   Waterstof
    -   LPG
-   Een eigenaar van een auto moet berekeningen kunnen maken. Bijvoorbeeld:

    -   Total Cost of Ownership op basis van een aantal standaard km's per jaar
    -   Verbruikskosten per km. Hierbij is de berekening per categorie en brandstoftype anders.

-   Als een gebruiker een auto wilt huren moet er bij het zoeken gefilterd kunnen worden op criteria zoals: Afstand of tarief. De resultaten worden weergegeven in een lijst of op een kaart. Als men de auto wilt huren kan men deze selecteren en een tijdslot selecteren voor de periode dat men deze wilt huren.
-   Een huurder kan een (loop)route opvragen naar de huurauto van zijn huidige locatie.

-   Inlogsysteem voor klanten?

## Welke data moet er worden opgeslagen?

### Klant

-   Voornaam
-   Achternaam
-   Geboortedatum (Leeftijd)
-   Gehuurde auto's
-   Verhuurde auto's

### Auto

-   Merk
-   Type
-   Inrichting
-   Kenteken
-   Brandstoftype
-   Zitplaatsen
-   GPS locatie
-   Foto's
-   Eigenaar
-   Huidige huurder
-   KM Stand

## Wat moet er opgeleverd worden?

Ontwerp:

-   User Stories
-   Documentatie Rest API
-   Usecasediagrammen
-   Usecase Scenario's
-   Klassediagram
-   Package diagram
-   Sequentiediagram
-   Deploymentdiagram

Beheer:

-   Video over IDE + Beheersysteem
-   Productverantwoording met Testrapportages, overdracht en implementatie, Wat ging goed en wat kon beter

Realisatie en Testen:

-   Code van de API inclusief 3 zinvolle Unittesten
-   Screenshot uitgevoerde unittests
-   3 testen met API Requests

## Idee voor CI & CD

Als men code pushed naar de repository wordt er in een github action alle testen uitgevoerd die we hebben. Daarna wordt er een Docker image gebuild. Deze Docker image wordt vervolgens naar de docker hub of onze prive registery gepushed. Een bash script zorgt er vervolgens voor dat de nieuwste image wordt gepulled naar de VPS zodat wij direct de nieuwste code online kunnen zien. Het bash script wordt aangeroepen via een github action over SSH.

Push code -> Tests (Github Action) -> Build Docker image (Github Action) -> Push to registery (Github Action) -> Trigger bash script over SSH to pull the newest image (Github Action).

## Projectnaam Ideeën

Gegenereerd via www.namelix.com :

-   RentIt
-   Carwaggon
-   RoadRent
-   CarHive
-   Go2Rent
-   RoadRover
-   RoverDrive
-   RoadTender
-   DrivIt
-   Drivio
