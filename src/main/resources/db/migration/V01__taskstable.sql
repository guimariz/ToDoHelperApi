CREATE TABLE IF NOT EXISTS tasks (
id BIGINT(20) NOT NULL AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(50) NOT NULL,
data_start DATETIME,
data_final DATETIME,
tempo_task BIGINT(20) NOT NULL,
tempo_descanso BIGINT(20) NOT NULL) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO tasks (nome, data_start, data_final, tempo_task, tempo_descanso) values ('Malhar Perna', '2020-03-13 15:13:30', '2020-03-13 15:30:30', 60, 5);
INSERT INTO tasks (nome, data_start, data_final, tempo_task, tempo_descanso) values ('Malhar Antebraco', '2020-03-13 15:13:30', '2020-03-13 15:30:30', 60, 5);
INSERT INTO tasks (nome, data_start, data_final, tempo_task, tempo_descanso) values ('Malhar Peito', '2020-03-13 15:13:30', '2020-03-13 15:30:30', 60, 5);
INSERT INTO tasks (nome, data_start, data_final, tempo_task, tempo_descanso) values ('Malhar Costas', '2020-03-13 15:13:30', '2020-03-13 15:30:30', 60, 5);
INSERT INTO tasks (nome, data_start, data_final, tempo_task, tempo_descanso) values ('Malhar Biceps', '2020-03-13 15:13:30', '2020-03-13 15:30:30', 60, 5);
INSERT INTO tasks (nome, data_start, data_final, tempo_task, tempo_descanso) values ('Correr', '2020-03-13 15:13:30', '2020-03-13 15:30:30', 60, 5);
