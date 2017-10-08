CREATE KEYSPACE IF NOT EXISTS apidevops WITH replication = {'class':'SimpleStrategy', 'replication_factor':3};

CREATE TABLE IF NOT EXISTS apidevops.user (
        id uuid PRIMARY KEY,
        name text,
        password text,
        host text,
        request text,
        data blob
        );