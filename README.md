# Web-Crawler
Ein Web Crawler auf basis von Java, optimiert zur Analyse von Wordpress Webseiten.

Verwendung:
Lege in der Crawl Klasse die zu untersuchende Webseite aus, starte dann die Main Methode.

Um den Crawler zu begrenzen, kann die MAX_DEPTH heruntergesetzt werden
-> Es wird nur ein Teil der Webseite gecrawlt.

## So funktioniert es:
Wir erstellen ein Excel - es wird eine Liste mit allen relevanten ULR's Adressen erstellt - alle Informationen werden gesammelt die in der Klasse (Texts_un) beschrieben sind - speichern den gesamten <"p"> markierten Text in Zellen - speichern den gesamten Text der in <"p"> gekennzeichneten URl - wir speichern das Datum der URl .

## Nicht verwendete Klassen:
BasicWebCrawler
Coll_uniq (analysieren einer einzigen URL)
Bot
Crawl_iterative
Extractor
ALLE Excel Test Klassen
