create type user_status AS ENUM ('ACTIVE', 'INACTIVE');
create type type_activity AS ENUM ('CAMINHADA', 'CORRIDA');

create table tb_user(
	id_user serial not null primary key,
	first_name varchar(50) not null,
	last_name varchar(50) not null,
	birth_date date null,
	gender user_gender null,
	height decimal null,
	weight decimal null,
	email varchar(50) unique not null,
	password varchar(20) unique not null,
	status user_status not null,
	user_photo bytea null
);

create table tb_activity(
	id_activity serial not null primary key,
	id_user int not null,
	type_activity type_activity not null,
	date_start timestamp not null,
	date_end timestamp,
	lat_start numeric,
	lng_start numeric,
	lat_end numeric,
	lng_end numeric,
	scheduled timestamp,
	description text,
	foreign key(id_user) references tb_user(id_user)
);
   
create table tb_activity_rhythm(
	id_activity_rhythm serial not null primary key,
	id_activity int not null,
	duration time not null,
	distance decimal not null,
	pace decimal not null,
	foreign key(id_activity) references tb_activity(id_activity)
);

create table tb_route_activity(
	id_route_activity serial not null primary key,
	id_activity int not null,
	latitude numeric not null,
	longitude numeric not null,
	foreign key(id_activity) references tb_activity(id_activity)
);