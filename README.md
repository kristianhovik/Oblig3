# Oblig3
Repository for oblig3.
De første commitsa har like kommentarer, slurvet litt og glemte å endre de.

Det første jeg gjorde var å opprette et repository, for så å klone med oblig2 prosjektet.
Dermed limte jeg inn referanse til maven-surefire-plugin i byggesekvensen som jeg fant i kunngjøringer.
Endret i dependency fra "code" compile "code" til  "code" test "code"
Hadde noen problemer med versjonene, men oppdaterte IntelliJ og så funket det.
Så konfigurerte jeg workflow Java with Maven i Actions tabben på Github.
Når jeg commitet, så ble det ingen error, men testene kjørte ikke. Da endret jeg litt på filnavnene og maven filen, så funket det.
La til et tilleg i maven filen som gjorde at testene blir lagt frem i en fin rapport.

