# SzefBoard

## 🇵🇱 Opis

**SzefBoard** to prosty i lekki plugin typu **scoreboard** na serwery **Spigot 1.19.4**, stworzony przez **AntekSzef**. Plugin jest w pełni kompatybilny z **PlaceholderAPI**, dzięki czemu możesz dowolnie konfigurować zawartość tablicy wyników według własnych potrzeb.

SzefBoard nie posiada komend ani permisji — po prostu działa po zainstalowaniu i skonfigurowaniu.

## 🇬🇧 Description

**SzefBoard** is a simple and lightweight **scoreboard plugin** for **Spigot 1.19.4 servers**, created by **AntekSzef**. The plugin is fully compatible with **PlaceholderAPI**, so you can freely customize your scoreboard content to suit your needs.

SzefBoard does not include any commands or permissions — it just works after installation and configuration.

---

## 📦 Instalacja / Installation

1. Pobierz plugin `SzefBoard.jar`
2. Wrzuć plik do folderu `plugins/` na swoim serwerze
3. Upewnij się, że masz zainstalowany **PlaceholderAPI**
4. Zrestartuj serwer
5. Skonfiguruj tablicę wyników w pliku konfiguracyjnym `config.yml`

---

## ⚙️ Wymagania / Requirements

- **Spigot 1.19.4**
- **PlaceholderAPI**

---

## 📄 Konfiguracja / Configuration

Plik `config.yml` pozwala na pełne dostosowanie tablicy wyników. W treści możesz używać placeholderów z PlaceholderAPI.

Przykład:
```yaml
scoreboard:
  title: "&b&lSzef&e&lBoard 1.0"
  lines:
    - "&7Gracz: &f%player_name%"
    - "&7Kasa: &f%vault_eco_balance%"
    - "&7Online: &f%server_online%"
    - "&7Świat: &f%player_world%"
