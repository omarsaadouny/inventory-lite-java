# Inventory Lite (Java)

Kleines Beispielprojekt in **Java 17**  von **Omar Elsaadouny**. Ziel: saubere Struktur, einfache Fachlogik
und Unit-Tests mit JUnit 5. Erstellt als kompaktes Beispiel für Bewerbungen.

## Features
- Artikel (`Item`) mit `sku`, `name`, `quantity`
- Service mit Validierung: hinzufügen, entfernen, suchen, auflisten
- In-Memory-Repository (austauschbar)
- **Unit-Tests** mit JUnit 5

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

## Warum dieses Beispiel?
- Zeigt grundlegende Java-OOP (Model, Service, Repository)
- Enthält Unit-Tests (JUnit 5) und eine kurze, verständliche README
- Leicht erweiterbar: z. B. persistentes Repository (MySQL), REST-API etc.


---
© 2025 Omar Elsaadouny – MIT License

