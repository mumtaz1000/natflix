CREATE TABLE content_type
(
    id              SERIAL PRIMARY KEY,
    type            varchar(80)
);

CREATE TABLE content_category
(
    id                  SERIAL PRIMARY KEY,
    category            varchar(80)
);

CREATE TABLE content
(
    id              SERIAL PRIMARY KEY,
    title           varchar(80)     NOT NULL,
    type_id         integer NOT NULL REFERENCES content_type (id),
    category_id     integer NOT NULL REFERENCES content_category (id),
    summary         varchar(1024),
    logo_url        varchar(80),
    poster_url      varchar(80),
    banner_url      varchar(80),
    thumbnail_url   varchar(80)
);

