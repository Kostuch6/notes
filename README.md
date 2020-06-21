skrypt do utworzenia wymaganego keyspace'a:

CREATE KEYSPACE notes_keyspace WITH REPLICATION = {'class': 'SimpleStrategy', 'replication_factor': 1};