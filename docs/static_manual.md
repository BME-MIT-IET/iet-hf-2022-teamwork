# Manuális kód átvizsgálás elvégzése az alkalmazás egy részére

A manuális kód átvizsgálás során a csapat nem talált hibát.

A munkát a Haragos Gergely Viktor, Kalics Ádám, Kiss Mária Dominika és Pethes Dániel Imre végezték

# Sonarcloud integráció

A projektet GitHub Actions segítségével összekötöttük a Sonarcloud felülettel. A workflow a sonarcube.yml fájlban található.

A Sonarcloud 2 Bug-ot talált, az egyik a Java Regex compilation-nel kapcsolatos, ebben a csapat megállapodott, hogy nem javítjuk.

A másik egy NullPointerException, mely valójában a paraméterek null létéből adódik így IllegalArgumentException dobása lenne a helyes lekezelése. A csapat nem jutott egyhangú közös döntésre az ügyben, azonban egy issue-t létrehoztunk rá a GitHub felületen is.

A munkát Micskei Zoltán és Pethes Dániel Imre végezték.
