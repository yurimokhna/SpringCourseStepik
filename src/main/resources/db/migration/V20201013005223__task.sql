CREATE TABLE IF NOT EXISTS task (
        id              BIGSERIAL PRIMARY KEY,
        date DATE       NOT NULL,
        description     TEXT,
        done BOOLEAN    NOT NULL DEFAULT FALSE);

CREATE INDEX IF NOT EXISTS task_date_idx ON task (date);

CREATE INDEX IF NOT EXISTS task_done_idx ON task (done);

