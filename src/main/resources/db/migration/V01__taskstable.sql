CREATE TABLE IF NOT EXISTS tasks (
id BIGINT(20) NOT NULL AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(50) NOT NULL,
status VARCHAR(10) NOT NULL,
open BOOLEAN NOT NULL,
data_start TIME,
data_final TIME,
tempo_task BIGINT(20) NOT NULL,
tempo_descanso BIGINT(20) NOT NULL,
is_ready BOOLEAN NOT NULL) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO tasks (nome, status, open, data_start, data_final, tempo_task, tempo_descanso, is_ready) values ('Malhar Perna', 'doing', true, '11:11', '11:11', 60, 5, true);

