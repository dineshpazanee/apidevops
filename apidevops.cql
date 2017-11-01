CREATE KEYSPACE IF NOT EXISTS apidevops WITH replication = {'class':'SimpleStrategy', 'replication_factor':3};

CREATE TABLE IF NOT EXISTS apidevops.user (
        id uuid PRIMARY KEY,
        name text,
        password text,
        host text,
        request text,
        data blob
        );
        
        CREATE TABLE IF NOT EXISTS apidevops.user (
        id uuid,
        username text PRIMARY KEY,
        password text,
        email text,
        isactive text
        );
        
        
        {
  "username": "Muruga",
  "password": "123456789",
  "email": "dinesh@apidevops.com",
  "isactive": "true"
}
     
        
nohup target/universal/stage/bin/apidevops -Dplay.http.secret.key=pazani -Dhttp.port=80 &


sudo nohup target/universal/stage/bin/play-scala-streaming-example -Dplay.http.secret.key=pazani -Dhttp.port=80 &
        
{
  "name": "Blue Paper clips",
  "ean": "12345432123",
  "description": "Big box of paper clips",
  "pieces": 500,
  "manufacturer": {
    "name": "Paperclipfactory Inc.",
    "contact_details": {
      "email": "contact@paperclipfactory.example.com",
      "fax": null,
      "phone": "+12345654321"
    }
  },
  "tags": [
    "paperclip",
    "coated"
  ],
  "active": true
}

INSERT INTO  apidevops.user  (id, name, password, host, request) VALUES(now(), 'muruga', 'dinesh', 'host', 'request')

-----------------------------------------------------------------------

persons:

CREATE KEYSPACE apidevopsdb WITH REPLICATION = {
	'class': 'SimpleStrategy',
	'replication_factor': 1
};


CREATE TABLE apidevopsdb.person_info (
	id UUID,
	gender TEXT,
	userId TEXT,
	password TEXT,
	email TEXT,
	firstName TEXT,
	lastName TEXT,
	PRIMARY KEY (id)
);






 