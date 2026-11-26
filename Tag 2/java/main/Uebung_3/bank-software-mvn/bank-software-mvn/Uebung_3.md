# Übung 3 – Bank-Software

## 1. Blackbox-Testfälle

Für die Blackbox-Testfälle habe ich mir angeschaut, welche Funktionen man als Benutzer ausführen kann und welche Ergebnisse dabei erwartet werden.

| Nr. | Testfall | Eingabe | Erwartetes Ergebnis |
|---|---|---|---|
| BB01 | Alle Konten anzeigen | a | Alle Konten werden angezeigt |
| BB02 | Konto auswählen | 1 | Konto 1 wird angezeigt |
| BB03 | Falsches Konto auswählen | 999 | Eine Fehlermeldung erscheint |
| BB04 | Konto erstellen | Müller, CHF | Neues Konto mit 0 CHF |
| BB05 | Geld einzahlen | 100 | Kontostand steigt um 100 |
| BB06 | Geld abheben | 50 | Kontostand sinkt um 50 |
| BB07 | Zu viel Geld abheben | 999999999 | Eine Fehlermeldung erscheint |
| BB08 | Kontostand anschauen | k | Kontostand wird angezeigt |
| BB09 | Geld überweisen | 100 auf ein anderes Konto | Beide Kontostände ändern sich |
| BB10 | Konto löschen | l, j | Konto wird gelöscht |
| BB11 | Löschen abbrechen | l, n | Konto bleibt bestehen |
| BB12 | Negativen Betrag einzahlen | -100 | Eingabe wird abgelehnt |
| BB13 | Negativen Betrag abheben | -100 | Eingabe wird abgelehnt |
| BB14 | Buchstaben als Betrag eingeben | abc | Eine Fehlermeldung erscheint |
| BB15 | Wechselkurs abfragen | CHF USD | Wechselkurs wird angezeigt |
| BB16 | Programm beenden | q | Programm wird geschlossen |

## 2. Whitebox-Testfälle

Für die Whitebox-Testfälle habe ich im Quellcode nachgeschaut, welche Methoden vorhanden sind und wie man sie testen könnte.

| Nr. | Klasse | Methode | Testfall | Erwartetes Ergebnis |
|---|---|---|---|---|
| WB01 | Account | deposit() | 100 bei 500 Guthaben einzahlen | 600 Guthaben |
| WB02 | Account | withdraw() | 100 bei 500 Guthaben abheben | 400 Guthaben, true |
| WB03 | Account | withdraw() | 600 bei 500 Guthaben abheben | 500 Guthaben, false |
| WB04 | Account | withdraw() | 500 bei 500 Guthaben abheben | 0 Guthaben, true |
| WB05 | Account | getBalance() | Kontostand abfragen | Richtiger Kontostand |
| WB06 | Account | getId() | Kontonummer abfragen | Richtige Kontonummer |
| WB07 | Bank | createAccount() | Konto erstellen | Neues Konto wird hinzugefügt |
| WB08 | Bank | deleteAccount() | Konto löschen | Konto wird entfernt |
| WB09 | Bank | getAccount() | Vorhandenes Konto suchen | Konto wird gefunden |
| WB10 | Bank | getAccount() | Falsches Konto suchen | null |
| WB11 | Bank | getNumberOfAccounts() | Anzahl Konten abfragen | Richtige Anzahl Konten |
| WB12 | Counter | convertCurrency() | 100 USD in CHF umrechnen | 111 CHF laut Code |
| WB13 | Counter | transferAmount() | 100 USD auf ein anderes USD-Konto überweisen | Beide Kontostände ändern sich |
| WB14 | ExchangeRateOkhttp | getExchangeRate() | Keine Verbindung zur API | 0.0 |

## 3. Verbesserungsvorschläge und Best Practices

Beim Anschauen des Codes sind mir einige Sachen aufgefallen, die man verbessern könnte.

| Nr. | Problem | Verbesserung |
|---|---|---|
| 1 | Man kann negative Beträge einzahlen | Nur positive Beträge erlauben |
| 2 | Man kann negative Beträge abheben | Betrag vorher überprüfen |
| 3 | Geldbeträge werden mit double gespeichert | BigDecimal verwenden, damit es keine typischen Rundungsfehler mit double gibt |
| 4 | Der API-Key steht direkt im Code | API-Key ausserhalb des Codes speichern |
| 5 | Leere Eingaben können zum Absturz führen | Eingaben besser überprüfen |
| 6 | Wechselkurse sind fest im Code | Aktuelle Wechselkurse verwenden |
| 7 | Nicht alle Währungen werden umgerechnet | Alle Währungen richtig umrechnen |
| 8 | Konten werden nach dem Beenden nicht gespeichert | Eine Datenbank verwenden |
| 9 | Überweisungen können bei Fehlern Probleme verursachen | Überweisungen nur durchführen, wenn alles funktioniert |
| 10 | Manche Methoden machen zu viele Sachen gleichzeitig | Code besser aufteilen |
| 11 | Automatische Tests wären hilfreich | JUnit-Tests erstellen |

## 4. Verwendung von KI

Für das Layout der Tabellen in Markdown wurde KI verwendet.

## 5. Fazit

Die Bank-Software hat die wichtigsten Funktionen einer einfachen
Bank. Man kann Geld einzahlen, abheben, überweisen und Konten
erstellen oder löschen.

Es gibt aber noch einige Sachen, die man verbessern könnte.
Zum Beispiel sollte man keine negativen Beträge einzahlen oder
abheben können.