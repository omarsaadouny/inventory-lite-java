# Inventory Lite (Java)

Kleines Beispielprojekt in **Java 17** mit **JUnit-Tests**. Ziel: saubere Struktur, einfache Fachlogik und testgetriebene Entwicklung im Mini-Format.

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
- Zeigt **sauberen Code**, **Input-Validierung** und **Unit-Tests**
- Verständliche README, klare Ordnerstruktur, kleiner Scope
- Leicht erweiterbar: z. B. persistentes Repository (MySQL), REST-API etc.
