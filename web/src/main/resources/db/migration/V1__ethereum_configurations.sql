create table ethereum_configurations(
  id bigint(20) not null auto_increment,
  name varchar(200) not null,
  user_id varchar(200) not null,
  active bool default TRUE,
  creation_date timestamp not null,
  primary key(id)
)