CREATE TABLE Питомник AS
SELECT *
FROM (
    SELECT 'Собаки' AS тип_животного, имя, команда, дата_рождения, DId FROM Собаки
    UNION ALL
    SELECT 'Кошки' AS тип_животного, имя, команда, дата_рождения, DId FROM Кошки
    UNION ALL
    SELECT 'Хомяки' AS тип_животного, имя, команда, дата_рождения, Did FROM Хомяки
    UNION ALL
    SELECT 'Лошади' AS тип_животного, имя, команда, дата_рождения, VId FROM Лошади
    UNION ALL
    SELECT 'Ослы' AS тип_животного, имя, команда, дата_рождения, Vid FROM Ослы
) AS животные;
