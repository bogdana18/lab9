# lab9 - Програма для збереження даних обраного API в форматі Excel.

## Опис роботи

### 1. Опис основних моделей

- Роблено клас Category з полям: `id`, `name`, `image`.
- Роблено клас User з полями: `id`, `email`, `password`, `name`, `role`, `avatar`.
- Роблено клас Product з полям: `id`, `title`, `price`, `description`, `image`, `category`.

  ### 2. Взаємодія з PlatziFakeStoreAPI

- Розроблено клас PlatziFakeStoreAPI для відправки GET запитів до API: `getCategories`, `getUsers`, `getProducts`.
- Розроблено клас PlatziFakeStoreJSONMapper для парсингу JSON файлів.

### 3. Збереження даних в Excel таблицю

- Розроблено клас ExcelFileFormatter для легкого створення та збереження Excel файлів
- Розроблено клас ExcelSheetFormatter для створення однотипних Excel сторінок  з узагальнених класів.
