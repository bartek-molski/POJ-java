# System Monitorowania Wydajności Serwerów

## Opis Projektu
Ten projekt implementuje statyczny system monitorowania wydajności serwerów. Program umożliwia:
- Pobieranie informacji o serwerach,
- Analizę średniego zużycia zasobów,
- Wykrywanie przeciążeń serwerów,
- Generowanie raportów wydajności.

Kod nie używa wyjątków – błędy są zgłaszane w postaci komunikatów na konsoli.

---

## Struktura Klas

### `Server`
Przechowuje dane o serwerach i ich statystykach.

#### Pola statyczne:
- `serverNames` – tablica przechowująca nazwy serwerów.
- `serverStats` – tablica dwuwymiarowa przechowująca statystyki CPU, RAM i Dysku dla każdego serwera.
  
#### Metody:
- `getServerName(int id) -> String` – Zwraca nazwę serwera.
- `getServerStats(int id) -> double[]` – Zwraca statystyki CPU, RAM, Dysk, po indeksie serwera.
- `getServerStats(String server) -> double[]` – Zwraca statystyki CPU, RAM, Dysk, po nazwie serwera.
- `findServerIndex(String name) -> int` – Wyszukuje indeks serwera po nazwie.

### `PerformanceMonitor`
Analizuje średnie zużycie zasobów.

#### Metody:
- `getAverageUsage(int serverId) -> double` – Oblicza średnie zużycie CPU, RAM i dysku, po indeksie serwera.
- `getAverageUsage(String server) -> double` – Oblicza średnie zużycie CPU, RAM i dysku, po nazwie serwera.

### `AlertSystem`
Wykrywa przeciążenia serwerów.

#### Pola statyczne:
- `CRITICAL_THRESHOLD` – wartość progowa dla przeciążenia serwera (90%).

#### Metody:
- `isServerOverloaded(int serverId) -> boolean` – Sprawdza, czy którykolwiek z zasobów przekracza 90%, po indeksie serwera.
- `isServerOverloaded(String server) -> boolean` – Sprawdza, czy którykolwiek z zasobów przekracza 90%, po nazwie serwera.

### `ReportGenerator`
Generuje raporty wydajnościowe.

#### Metody:
- `generateReport() -> void` – Wypisuje na konsolę raport wydajnościowy.
