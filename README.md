# CatAPI

CatAPI е примерен проект за управление на информация за котки.

## Описание

CatAPI предоставя RESTful API за управление на информация за котки, включително създаване на случайни котки и извличане на котки по ID.

## Инсталация

1. Клонирайте репозиторито:
    ```bash
    git clone https://github.com/borkou17/catapi.git
    ```

2. Отидете в директорията на проекта:
    ```bash
    cd catapi
    ```

3. Инсталирайте зависимостите:
    ```bash
    mvn clean install
    ```

4. Стартирайте проекта:
    ```bash
    mvn spring-boot:run
    ```

## Използване

### Генериране на случайна котка

За да генерирате случайна котка, изпратете GET заявка до `/api/cats/random`:
```bash
curl -X GET http://localhost:8080/api/cats/random
```

### Получаване на котка по ID

За да получите котка по ID, изпратете GET заявка до `/api/cats/{id}`:
```bash
curl -X GET http://localhost:8080/api/cats/{id}
```

## Тестове

За да стартирате тестовете, използвайте следната команда:
```bash
mvn test
```

## Принос

Ако искате да допринесете към проекта, моля следвайте следните стъпки:

1. Форкнете репозиторито.
2. Създайте нов клон: `git checkout -b feature-branch`
3. Направете промените си и ги комитнете: `git commit -m 'Add new feature'`
4. Пушнете промените в клона: `git push origin feature-branch`
5. Подайте pull request.

## Лиценз

Този проект е лицензиран под MIT лиценза. Вижте файла LICENSE за повече информация.

## Контакти и поддръжка

За въпроси и предложения, моля свържете се с мен на [borislavim@abv.bg](mailto:borislavim@abv.bg).
