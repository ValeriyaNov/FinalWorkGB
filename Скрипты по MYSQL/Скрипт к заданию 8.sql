CREATE TABLE Верблюды (
  id INT PRIMARY KEY ,
  имя VARCHAR(50),
  команда VARCHAR(50),
  дата_рождения DATE,
  VId INT,
  FOREIGN KEY (Vid) REFERENCES Вьючные_животные(id) ON DELETE CASCADE);
  
CREATE TABLE Лошади (
  id INT PRIMARY KEY ,
  имя VARCHAR(50),
  команда VARCHAR(50),
  дата_рождения DATE,
  VId INT,
  FOREIGN KEY (Vid) REFERENCES Вьючные_животные(id) ON DELETE CASCADE);  
  
CREATE TABLE Ослы (
  id INT PRIMARY KEY ,
  имя VARCHAR(50),
  команда VARCHAR(50),
  дата_рождения DATE,
  VId INT,
  FOREIGN KEY (Vid) REFERENCES Вьючные_животные(id) ON DELETE CASCADE);
  
CREATE TABLE Кошки (
  id INT PRIMARY KEY ,
  имя VARCHAR(50),
  команда VARCHAR(50),
  дата_рождения DATE,
  DId INT,
  FOREIGN KEY (Did) REFERENCES Домашние_животные(id) ON DELETE CASCADE);
  
 CREATE TABLE Собаки (
  id INT PRIMARY KEY ,
  имя VARCHAR(50),
  команда VARCHAR(50),
  дата_рождения DATE,
  DId INT,
  FOREIGN KEY (Did) REFERENCES Домашние_животные(id) ON DELETE CASCADE); 
  
  CREATE TABLE Хомяки (
  id INT PRIMARY KEY ,
  имя VARCHAR(50),
  команда VARCHAR(50),
  дата_рождения DATE,
  DId INT,
  FOREIGN KEY (Did) REFERENCES Домашние_животные(id) ON DELETE CASCADE);
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  