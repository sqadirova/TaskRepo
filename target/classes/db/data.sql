INSERT INTO public.r_operator_subscribers (id_operator, id_subscriber) VALUES (1, 1);
INSERT INTO public.r_operator_subscribers (id_operator, id_subscriber) VALUES (2, 3);
INSERT INTO public.r_operator_subscribers (id_operator, id_subscriber) VALUES (3, 2);

INSERT INTO public.subscribers_table (kod_abonent, adres_abonent, creation_date, name_abonent, telephone_num_abonent) VALUES (1, 'Xezer rayonu', '01.01.2020', 'Siddiqa Qadirova', '994551234567');
INSERT INTO public.subscribers_table (kod_abonent, adres_abonent, creation_date, name_abonent, telephone_num_abonent) VALUES (2, 'Nesimi rayon', '02.02.2020', 'Hasan Aliyev', '994773456789');
INSERT INTO public.subscribers_table (kod_abonent, adres_abonent, creation_date, name_abonent, telephone_num_abonent) VALUES (3, 'Yasamal Rayon', '03.03.2020', 'Leyla Hesenova', '994512348965');

INSERT INTO public.operator_table (kod_operator, name_operator) VALUES (1, 'Ismayil Hesenov');
INSERT INTO public.operator_table (kod_operator, name_operator) VALUES (2, 'Feride Ceferova');
INSERT INTO public.operator_table (kod_operator, name_operator) VALUES (3, 'Orxan Aliyev');