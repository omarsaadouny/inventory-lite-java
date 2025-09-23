# Inventory Lite (Java)

Von: Omar Elsaadouny

Einen kleinen Inventardienst in Java, um eine übersichtliche Struktur und grundlegende Tests zu demonstrieren. Er umfasst ein Item-Modell, einen Dienst mit Eingabevalidierung und eine Repository-Schnittstelle mit einer In-Memory-Implementierung. Die JUnit-Tests decken das Hinzufügen, Aktualisieren, Suchen, Entfernen und ungültige Eingaben ab. Die Idee war, ihn klein, korrekt und leicht auf eine Datenbank oder REST-API erweiterbar zu halten. Ziel: saubere Struktur, einfache Fachlogik und Unit-Tests mit JUnit 5. Erstellt als kompaktes Beispiel für Bewerbungen.

## Features
- Artikel (`Item`) mit `sku`, `name`, `quantity`
- Service mit Validierung: hinzufügen, entfernen, suchen, auflisten
- In-Memory-Repository (austauschbar)
- **Unit-Tests** mit JUnit 5


## Warum dieses Beispiel?
- Zeigt grundlegende Java-OOP (Model, Service, Repository)
- Enthält Unit-Tests (JUnit 5) und eine kurze, verständliche README
- Leicht erweiterbar: z. B. persistentes Repository (MySQL), REST-API etc.

## Projektstruktur
```
inventory-lite-java/
├─ src/main/java/com/omar/inventory/
│  ├─ Item.java
│  ├─ InventoryRepository.java
│  ├─ InMemoryInventoryRepository.java
│  └─ InventoryService.java
├─ src/test/java/com/omar/inventory/
│  └─ InventoryServiceTest.java
├─ pom.xml
├─ LICENSE
└─ README.md
```

## Build & Tests
Voraussetzung: Java 17 und Maven.

```bash
mvn -v
mvn test
```

---
© 2025 Omar Elsaadouny – MIT License

