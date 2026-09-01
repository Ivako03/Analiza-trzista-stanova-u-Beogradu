# Analiza tržišta stanova u Beogradu

Mali Java projekat za obradu i pregled podataka o ***5.613 oglasa za stanove u Beogradu**.

Cilj projekta je bio da na realnom skupu podataka primenim osnove objektno-orijentisanog programiranja i napravim jednostavan alat koji iz CSV fajla izvlači korisne informacije o tržištu nekretnina.

## Šta program radi

- učitava podatke o stanovima iz CSV fajla
- računa prosečnu cenu stana
- pronalazi najskuplji stan
- filtrira stanove prema maksimalnom budžetu
- sortira oglase prema ceni po kvadratnom metru
- prikazuje osnovne podatke o pronađenim stanovima

## Tehnologije i koncepti

- Java
- Object-Oriented Programming (OOP)
- ArrayList
- rad sa fajlovima: BufferedReader, FileReader
- exception handling
- filtriranje i sortiranje podataka
- Double.compare() i lambda izrazi

## Struktura projekta

```text
src/
├── Apartment.java
├── ApartmentAnalyzer.java
└── NewMain1.java
