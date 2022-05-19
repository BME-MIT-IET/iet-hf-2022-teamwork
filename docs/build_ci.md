# Build keretrendszer beüzemelése, CI beüzemelése

A projekt egy régi 2.x-es Gradle verzióval érkezett, mely modern fejlesztői környezetben nem használható. 
A Gradle verzió fel lett frissítve 6.x-re, a build.gradle és gradle.properties fájlok módosításra kerültek eszerint.
A munkát Pethes Dániel végezte.

Ezután beüzemeltük a GitHub Actions-t, mely gradle teszteket futtat, ezt a build_and_test.yml fájl tartalmazza.
A munkát Pethes Dániel és Kalics Ádám végezte.
