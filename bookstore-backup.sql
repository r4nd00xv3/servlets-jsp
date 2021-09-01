--
-- PostgreSQL database dump
--

-- Dumped from database version 9.5.25
-- Dumped by pg_dump version 9.5.25

-- Started on 2021-09-01 10:30:02

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 2106 (class 1262 OID 16447)
-- Name: bookstore; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE bookstore WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Portuguese_Brazil.1252' LC_CTYPE = 'Portuguese_Brazil.1252';


ALTER DATABASE bookstore OWNER TO postgres;

\connect bookstore

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

--
-- TOC entry 1 (class 3079 OID 12355)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 2109 (class 0 OID 0)
-- Dependencies: 1
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 181 (class 1259 OID 16448)
-- Name: model_login; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.model_login (
    login character varying(200),
    senha character varying,
    nome character varying(200),
    nomeaut character varying(200),
    titulob character varying(200),
    id integer NOT NULL,
    date character varying
);


ALTER TABLE public.model_login OWNER TO postgres;

--
-- TOC entry 182 (class 1259 OID 16548)
-- Name: model_login_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

CREATE SEQUENCE public.model_login_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.model_login_id_seq OWNER TO postgres;

--
-- TOC entry 2110 (class 0 OID 0)
-- Dependencies: 182
-- Name: model_login_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: postgres
--

ALTER SEQUENCE public.model_login_id_seq OWNED BY public.model_login.id;


--
-- TOC entry 1982 (class 2604 OID 16550)
-- Name: id; Type: DEFAULT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.model_login ALTER COLUMN id SET DEFAULT nextval('public.model_login_id_seq'::regclass);


--
-- TOC entry 2099 (class 0 OID 16448)
-- Dependencies: 181
-- Data for Name: model_login; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, NULL, NULL, NULL, 1, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, NULL, NULL, NULL, 2, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, NULL, NULL, NULL, 3, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, NULL, NULL, NULL, 4, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, NULL, NULL, NULL, 5, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, NULL, NULL, NULL, 6, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, NULL, NULL, NULL, 7, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, NULL, NULL, NULL, 8, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, NULL, NULL, NULL, 9, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, NULL, NULL, NULL, 10, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, NULL, NULL, NULL, 11, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, NULL, NULL, NULL, 12, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, NULL, NULL, NULL, 13, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, NULL, NULL, NULL, 14, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, NULL, NULL, NULL, 15, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, NULL, NULL, NULL, 16, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, NULL, NULL, NULL, 17, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, NULL, NULL, NULL, 18, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, NULL, NULL, NULL, 19, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, NULL, NULL, NULL, 20, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, NULL, NULL, NULL, 21, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, NULL, NULL, NULL, 22, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, NULL, NULL, NULL, 23, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, NULL, NULL, NULL, 24, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, NULL, NULL, NULL, 25, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, NULL, NULL, NULL, 26, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, NULL, NULL, NULL, 27, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, NULL, NULL, NULL, 28, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, NULL, NULL, NULL, 29, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, NULL, NULL, NULL, 30, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, NULL, NULL, NULL, 31, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES ('administrador', 'dqm50vnc', NULL, NULL, NULL, 32, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, 'eliton', 'eliton', 'eliton', 38, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, 'eliton', 'eliton', 'eliton', 39, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, 'eliton', 'eliton', 'eliton', 40, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, 'juli', 'juli', 'juli', 44, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, 'julio', 'julio', 'julio', 45, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES ('leo', 'leo', NULL, NULL, NULL, 47, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, 'ulice', 'ulice', 'ulice', 48, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, 'uri', 'uri', 'uri', 53, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES ('bio', 'bio', NULL, NULL, NULL, 54, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES ('ppp', 'ppp', NULL, NULL, NULL, 55, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, NULL, NULL, NULL, 57, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES ('ellll', 'ellll', 'elll', NULL, NULL, 58, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES ('maili', 'maili', NULL, NULL, NULL, 59, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES ('qqqqqqqqqqqqqqqqq', 'qqqqqqqqqqqqq', 'qqqqqqqqqqqqqqqqqqqqqq', NULL, NULL, 60, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, 'lenio', NULL, NULL, 63, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES ('charles', '123', NULL, NULL, NULL, 64, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES ('patrik', '000', NULL, NULL, NULL, 65, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, 'kelv', 'qqqqqqqq', 'qqqqqqqqqq', 67, '2021-08-12');
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, 'leee', 'llllss', 'lslslsl', 69, '2021-08-18');
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES ('bia', '0000', NULL, NULL, NULL, 70, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES ('leonardo', '202020', NULL, NULL, NULL, 71, NULL);
INSERT INTO public.model_login (login, senha, nome, nomeaut, titulob, id, date) VALUES (NULL, NULL, 'neto', 'mr crowl', 'cobra', 73, '2021-09-03');


--
-- TOC entry 2111 (class 0 OID 0)
-- Dependencies: 182
-- Name: model_login_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.model_login_id_seq', 73, true);


--
-- TOC entry 1984 (class 2606 OID 16552)
-- Name: model_login_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.model_login
    ADD CONSTRAINT model_login_pkey PRIMARY KEY (id);


--
-- TOC entry 2108 (class 0 OID 0)
-- Dependencies: 6
-- Name: SCHEMA public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2021-09-01 10:30:03

--
-- PostgreSQL database dump complete
--

