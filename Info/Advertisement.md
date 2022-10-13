# Advertisement

## Wat doet het?

De advertisement klasse zorgt ervoor dat een auto te huur aangeboden kan worden. Potentiele huurders kunnen de advertentie bekijken en de auto huren. De huurder kan de volgende informatie zien:

-   Gegevens auto
    -   Kenteken
    -   Merk
    -   Model
    -   Bouwjaar
    -   Zitplaatsen
    -   Brandstoftype
-   Eigenaar
-   Beschrijving
-   Foto's
-   Beschikbaarheid (Op datum? Op dagen?)
-   Prijs

## Hoe werkt het?

Zodra een gebruiker een overview krijgt van de zoekresultaten kan men op een advertentie klikken. De gebruiker kan dan bovenstaande gegevens vinden over de auto.

## Welke API calls zijn er nodig?

-   Create
-   ReadAll
-   ReadById
-   Update
-   Delete

## Hoe ziet het model eruit?

-   Car Car
-   Car.Owner Owner
-   String Description
-   Car.Pictures Pictures
-   Double Price
-   Date StartAvaliability
-   Date EndAvaliability
