CREATE TABLE IF NOT EXISTS users (
        id              BIGSERIAL PRIMARY KEY,
        login TEXT NOT NULL,
        password    TEXT NOT NULL
        );

CREATE INDEX IF NOT EXISTS user_login_idx ON users (login);
