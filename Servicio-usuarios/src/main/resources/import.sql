INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('admin', '$2a$10$3v22jd.Hr4hj3usNEl4qgeWK0dEl4VGQTFKtlXKcIaQyKllX3VslG', 1, 'admin', 'admin', 'admin@admin.com');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('carlos', '$2a$10$m.Bqm9ScVvkmmBKqns9ZGudpVmg9/FlxmcAU.aAY4hx0dfqDC7xGm', 1, 'carlos', 'm.', 'carlos@admin.com');

INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');
INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');

INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES(1, 1)
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES(1, 2)
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES(2, 2)
