 
INSERT INTO code_strikers.CREDENTIALS(username,password,enabled, verifyPassword) VALUES ('user','user', TRUE, 'user');
INSERT INTO code_strikers.CREDENTIALS(username,password,enabled, verifyPassword) VALUES ('admin','admin', TRUE, 'admin');


INSERT INTO code_strikers.AUTHORITY(id,authority,username, credentials_id) VALUES (1,'ADMIN', 'admin', 'admin');
INSERT INTO code_strikers.AUTHORITY(id,authority,username, credentials_id) VALUES (2,'USER', 'user', 'user');
 
 
  					