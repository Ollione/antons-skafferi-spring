-- Förrätter
INSERT INTO dinner (name, description, time_to_make, type, price) VALUES
    ('Norrlands delikatesser', 'Torkad renfilé med enbärsgele och frästa kantareller serveras med knäckebröd på rågsurdeg.', '00:15:00', 'Förrätt', 85),
    ('Gravlax', 'Tunt skivad gravad lax med hovmästarsås och färskt bröd.', '00:10:00', 'Förrätt', 75),
    ('Västerbottenpaj', 'Västerbottenostpaj serverad med en klick gräddfil och lite gräslök.', '00:20:00', 'Förrätt', 70);

-- Varmrätter
INSERT INTO dinner (name, description, time_to_make, type, price) VALUES
    ('Ungsstekt Piggvar med Pepparrotskräm', 'Ugnsstekt piggvar, krämigt potatismos och pepparrotskräm.', '00:30:00', 'Varmrätt', 220),
    ('Forellfilé med Citronmousse', 'Stekta forellfiléer med citronmousse, serverad med potatispuré.', '00:25:00', 'Varmrätt', 215),
    ('Lax med Dillstuvad Potatis', 'Ugnsbakad lax med dillstuvad potatis och en citronklyfta.', '00:20:00', 'Varmrätt', 195),
    ('Älggryta med Rotfrukter', 'Långkokt älggryta med rotfrukter, serverad med nybakat bröd.', '00:40:00', 'Varmrätt', 195),
    ('Grönsaksbiffar med Svampsås', 'Grönsaksbiffar med krämig svampsås och ugnsrostad potatis.', '00:20:00', 'Vegetarisk', 160),
    ('Svensk Rotfruktsgryta', 'Mustig gryta med rotfrukter och timjan, serverad med nybakat bröd.', '00:30:00', 'Vegetarisk', 160);

-- Efterrätter
INSERT INTO dinner (name, description, time_to_make, type, price) VALUES
    ('Kladdkaka med Grädde', 'Svensk chokladkaka serverad med vispgrädde.', '00:10:00', 'Efterrätt', 55),
    ('Blåbärspaj med Vaniljsås', 'Blåbärspaj serverad med varm vaniljsås.', '00:15:00', 'Efterrätt', 60),
    ('Glass surpris', 'En riktig glassbomb! Välj dina smaker! Utmärkt att dela på.', '00:10:00', 'Efterrätt', 130);


-- Drickor
INSERT INTO drinks (name, type, description, price) VALUES
    ('Kaffe', 'Varma drycker', 'Klassiskt kaffe.', 25),
    ('Te', 'Varma drycker', 'Välj mellan olika sorters te.', 25),
    ('Lingondricka', 'Alkoholfritt', 'Söt och uppfriskande lingondricka.', 30),
    ('Lättöl', 'Alkoholfritt', 'Alkoholfri lättöl.', 35),
    ('Julmust', 'Alkoholfritt', 'Klassisk julmust.', 35),
    ('Lokalt Bryggt Öl', 'Alkoholhaltig', 'Lokalt bryggt öl.', 55);

-- Röda Viner
INSERT INTO drinks (name, type, description, price) VALUES
    ('Château Margaux', 'Röda Viner', 'Ett elegant vin med toner av mörka bär, cederträ och mineralitet. Bordeaux, Frankrike, 2015.', 1500),
    ('Barolo DOCG', 'Röda Viner', 'Ett kraftfullt vin med smaker av körsbär, lakrits och rosor. Piemonte, Italien, 2016.', 850),
    ('Penfolds Bin 389 Cabernet Shiraz', 'Röda Viner', 'En fyllig blandning med inslag av plommon, choklad och ek. South Australia, 2019.', 650);

-- Vita Viner
INSERT INTO drinks (name, type, description, price) VALUES
    ('Chablis Premier Cru', 'Vita Viner', 'Friskt och mineralrikt med toner av citrus och gröna äpplen. Bourgogne, Frankrike, 2020.', 450),
    ('Sauvignon Blanc', 'Vita Viner', 'Aromatisk med smaker av tropiska frukter och krusbär. Marlborough, Nya Zeeland, 2021.', 350),
    ('Riesling Kabinett', 'Vita Viner', 'Fruktigt och livligt med inslag av persika och honung. Mosel, Tyskland, 2021.', 400);

-- Roséviner
INSERT INTO drinks (name, type, description, price) VALUES
    ('Whispering Angel Rosé', 'Roséviner', 'Friskt och lätt med toner av jordgubbar och citrus. Provence, Frankrike, 2022.', 300),
    ('Côtes de Provence Rosé', 'Roséviner', 'Elegant med smaker av röda bär och en aning kryddighet. Provence, Frankrike, 2022.', 320);

-- Mousserande Viner
INSERT INTO drinks (name, type, description, price) VALUES
    ('Champagne Bollinger Special Cuvée', 'Mousserande Viner', 'Klassisk champagne med toner av äpple, brioche och nötter. Frankrike.', 950),
    ('Prosecco DOCG', 'Mousserande Viner', 'Friskt och bubbligt med inslag av päron och vita blommor. Veneto, Italien.', 280),
    ('Cava Brut Reserva', 'Mousserande Viner', 'Krispigt och fruktigt med toner av citrus och mandel. Katalonien, Spanien.', 250);

-- Dessertviner
INSERT INTO drinks (name, type, description, price) VALUES
    ('Sauternes', 'Dessertviner', 'Ett sött vin med smaker av aprikos, honung och kryddor. Bordeaux, Frankrike, 2017.', 550),
    ('Portvin LBV', 'Dessertviner', 'Rik och söt med inslag av körsbär och mörk choklad. Douro, Portugal, 2018.', 450),
    ('Tokaji Aszú 5 Puttonyos', 'Dessertviner', 'En koncentrerad sötma med smaker av torkade frukter och citrus. Ungern, 2016.', 600);


-- Vermouth
INSERT INTO drinks (name, type, description, price) VALUES
    ('Martini Bianco 1 glas', 'Aperitif - Vermouth', 'En aromatisk vermouth med inslag av vanilj och citrus. Italien.', 80),
    ('Noilly Prat Dry 1 glas', 'Aperitif - Vermouth', 'Torr och elegant med toner av örter och kryddor. Frankrike.', 85);

-- Bitters
INSERT INTO drinks (name, type, description, price) VALUES
    ('Campari 1 glas', 'Aperitif - Bitter', 'En klassisk bitter med smaker av apelsin och kryddiga örter. Italien.', 90),
    ('Aperol 1 glas', 'Aperitif - Bitter', 'Lätt och fräsch med toner av apelsin, rabarber och vanilj. Italien.', 85);

-- Förstärkta Viner
INSERT INTO drinks (name, type, description, price) VALUES
    ('Sherry Fino 1 glas', 'Aperitif - Förstärkta Viner', 'Torr och lätt med inslag av mandel och gröna äpplen. Spanien.', 75),
    ('Portvin White 1 glas', 'Aperitif - Förstärkta Viner', 'Söt och fruktig med toner av aprikos och nötter. Portugal.', 90);

-- Mousserande Aperitifer
INSERT INTO drinks (name, type, description, price) VALUES
    ('Prosecco DOCG 1 glas', 'Aperitif - Mousserande', 'Friskt och lätt med inslag av päron och citrus. Italien.', 95),
    ('Champagne Brut 1 glas', 'Aperitif - Mousserande', 'Klassiskt bubblande med toner av brioche och grönt äpple. Frankrike.', 150);

-- Alkoholfritt
INSERT INTO drinks (name, type, description, price) VALUES
    ('Sanbitter 1 glas', 'Aperitif - Alkoholfritt', 'Ett alkoholfritt alternativ med klassiska bittersmaker. Italien.', 50),
    ('Alkoholfri Mousserande Dryck 1 glas', 'Aperitif - Alkoholfritt', 'Frisk och fruktig med inslag av äpple och fläder. Sverige.', 60);

-- Events
INSERT INTO events (name, description, date, start_time, end_time) VALUES
    ('Julmarknad på Restaurangen', 'Upplev en härlig julmarknad med lokala delikatesser och hantverk.', '2024-12-13', '16:00:00', '21:00:00'),
    ('Luciafirande', 'Fira Lucia med traditionell luciakör och glöggservering.', '2024-12-14', '18:00:00', '20:00:00'),
    ('Vinprovning: Julens Smaker', 'Lär dig mer om viner som passar perfekt till julens rätter.', '2024-12-15', '19:00:00', '21:00:00'),
    ('Julkörskonsert', 'Lyssna på en stämningsfull konsert med julsånger från lokala körer.', '2024-12-17', '17:30:00', '19:30:00'),
    ('Familjedag med Julpyssel', 'Ta med familjen för en dag med julpyssel och aktiviteter för alla åldrar.', '2024-12-19', '12:00:00', '16:00:00'),
    ('Julbordskväll', 'Njut av ett klassiskt julbord med alla svenska favoriter.', '2024-12-20', '18:00:00', '22:00:00'),
    ('Filmkväll: Julklassiker', 'Se en klassisk julfilm med popcorn och mysig atmosfär.', '2024-12-21', '19:00:00', '21:30:00'),
    ('Dans och Glöggkväll', 'Danskväll med liveband och glöggservering.', '2024-12-22', '20:00:00', '23:30:00'),
    ('Uppesittarkväll', 'Spendera kvällen med julspel, lotter och fika.', '2024-12-23', '19:00:00', '23:00:00'),
    ('Julaftonsfirande', 'Fira julafton med julmat, tomtebesök och trevlig stämning.', '2024-12-24', '12:00:00', '18:00:00');

-- Insert into person table
INSERT INTO person (first_name, last_name, date_of_birth, email, phone_number) VALUES
    ('Anton', 'Svensson', '1985-03-12', 'anton.svensson@example.com', '0701234567'),
    ('Emma', 'Karlsson', '1990-07-25', 'emma.karlsson@example.com', '0709876543'),
    ('Johan', 'Andersson', '1995-11-30', 'johan.andersson@example.com', '0705678912');

-- Insert into employee table
INSERT INTO employee (hiring_date, salary, password, person_id) VALUES
    ('2020-01-15', 45000, 'securepassword123', 1), -- Anton
    ('2021-06-01', 35000, 'passwordkitchen456', 2), -- Emma
    ('2022-03-20', 30000, 'passwordservice789', 3); -- Johan

-- Insert into role table (if not already added)
INSERT INTO role (name, description, hierarchy_level) VALUES
    ('Chef', 'Ansvarig för restaurangen och personalen.', 1),
    ('Kock', 'Ansvarar för matlagning och köket.', 2),
    ('Servitör', 'Ansvarar för servering och kundservice.', 3);

-- Assign roles using works_as table
INSERT INTO works_as (employee_id, role_id) VALUES
    (1, 1), -- Anton as Chef
    (2, 2), -- Emma as Cook
    (3, 3); -- Johan as Waiter


-- Insert lunches into lunch table
INSERT INTO lunch (price, date) VALUES
    (120, '2024-12-13'), (130, '2024-12-14'), (125, '2024-12-15'),
    (135, '2024-12-16'), (140, '2024-12-17'), (130, '2024-12-18'),
    (145, '2024-12-19'), (150, '2024-12-20'), (140, '2024-12-21'),
    (135, '2024-12-22'), (150, '2024-12-23'), (160, '2024-12-24'),
    (165, '2024-12-25');

-- Insert items into items table for each lunch
INSERT INTO items (name, description, lunch_id) VALUES
-- December 13
('Potatissoppa', 'Krämig potatissoppa med purjolök.', 1),
('Rostad Kyckling', 'Kyckling med rostad potatis och gräddsås.', 1),
('Vaniljpannacotta', 'Vaniljpannacotta med hallon.', 1),

-- December 14
('Fisksoppa', 'Soppa med lax, torsk och dill.', 2),
('Grönsaksgratäng', 'Grönsaksgratäng med rotfrukter och ost.', 2),
('Äppelpaj', 'Klassisk äppelpaj med vaniljsås.', 2),

-- December 15
('Tomatsoppa', 'Tomatsoppa toppad med färsk basilika.', 3),
('Köttfärsbiffar', 'Köttfärsbiffar med potatismos och lingon.', 3),
('Kladdkaka', 'Svensk chokladkaka med vispad grädde.', 3),

-- December 16
('Broccolisoppa', 'Krämig broccolisoppa med vitlökskrutonger.', 4),
('Fiskgryta', 'Fiskgryta med saffran och grönsaker.', 4),
('Blåbärspaj', 'Blåbärspaj med vaniljsås.', 4),

-- December 17
('Spenatsoppa', 'Grön spenatsoppa med ägg.', 5),
('Köttbullar', 'Köttbullar med potatismos och lingonsylt.', 5),
('Fruktsallad', 'Fruktsallad med färska bär.', 5),

-- December 18
('Morotssoppa', 'Soppa med morot och ingefära.', 6),
('Pasta Carbonara', 'Klassisk pasta med bacon och parmesan.', 6),
('Chokladmousse', 'Luftig chokladmousse med apelsin.', 6),

-- December 19
('Linsgryta', 'Linsgryta med tomat och kokosmjölk.', 7),
('Grillad Kyckling', 'Grillad kyckling med potatisgratäng.', 7),
('Vaniljglass', 'Vaniljglass med bärsås.', 7),

-- December 20
('Pumpasoppa', 'Krämig pumpasoppa med chili.', 8),
('Biff Stroganoff', 'Biff Stroganoff med ris.', 8),
('Pepparkakor', 'Juliga pepparkakor med blåmögelost.', 8),

-- December 21
('Grön ärtsoppa', 'Ärtsoppa med mynta.', 9),
('Laxfilé', 'Stekt laxfilé med dillsås och potatis.', 9),
('Saffranspannkaka', 'Saffranspannkaka med sylt.', 9),

-- December 22
('Sellerisoppa', 'Krämig sellerisoppa med parmesan.', 10),
('Kalops', 'Kalops med kokt potatis.', 10),
('Risgrynsgröt', 'Julgröt med kanel och socker.', 10),

-- December 23
('Gulaschsoppa', 'Klassisk gulaschsoppa med nötkött.', 11),
('Grillade Revbensspjäll', 'Revbensspjäll med potatis och kål.', 11),
('Julgodis', 'Hemgjort julgodis.', 11),

-- December 24
('Klar Grönsakssoppa', 'Lätt grönsakssoppa med rotfrukter.', 12),
('Julbord', 'Klassiskt svenskt julbord med alla tillbehör.', 12),
('Julens Dessertbord', 'Olika juliga desserter.', 12),

-- December 25
('Svampsoppa', 'Krämig svampsoppa med vitlök.', 13),
('Älgstek', 'Älgstek med gräddsås och potatis.', 13),
('Chokladtryffel', 'Hemgjord chokladtryffel.', 13);

