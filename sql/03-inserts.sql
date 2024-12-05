-- Insert data into person table
INSERT INTO person (first_name, last_name, date_of_birth, email, phone_number)
VALUES ('Alice', 'Johnson', '1985-03-15', 'alice.johnson@example.com', '5551234567'),
       ('Bob', 'Brown', '1978-07-22', 'bob.brown@example.com', '5559876543');

-- Insert data into employee table
INSERT INTO employee (person_id, hiring_date, salary)
VALUES (1, '2019-05-01', 45000),
       (2, '2018-11-15', 55000);

-- Insert data into role table
INSERT INTO role (name, description, hierarchy_level, employee_id)
VALUES ('Waiter', 'Serves food', 3, 1),
       ('Sous Chef', 'Assists the chef', 2, 2);

-- Insert data into lunch table
INSERT INTO lunch (date, menu_item_id)
VALUES ('2023-02-01', 1),
       ('2023-02-02', 2);

-- Insert data into dinner_menu table
INSERT INTO dinner_menu (menu_item_id, price)
VALUES (1, 30),
       (2, 35);

-- Insert data into ingredients table
INSERT INTO ingredients (name)
VALUES ('Basil'),
       ('Garlic');

-- Insert data into tables table
INSERT INTO tables (room_for_people)
VALUES (2),
       (8);

-- Insert data into orders table
INSERT INTO orders (table_number, employee_id, date)
VALUES (1, 1, '2023-02-01'),
       (2, 2, '2023-02-02');

-- Insert data into shift table
INSERT INTO shift (employee_id, shift_date, start_time, end_time)
VALUES (1, '2023-02-01', '08:00', '16:00'),
       (2, '2023-02-02', '09:00', '17:00');

-- Insert data into bookings table
INSERT INTO bookings (date, start_time, end_time, person_id, table_number)
VALUES ('2023-02-01', '10:00', '12:00', 1, 1),
       ('2023-02-02', '11:00', '13:00', 2, 2);

-- Insert data into events table
INSERT INTO events (name, description, date, start_time, end_time)
VALUES ('Conference', 'Tech Conference', '2023-02-01', '14:00', '16:00'),
       ('Workshop', 'Cooking Workshop', '2023-02-02', '15:00', '17:00');

-- Insert data into works_as table
INSERT INTO works_as (employee_id, role_id)
VALUES (1, 1),
       (2, 2);

-- Insert data into works_at table
INSERT INTO works_at (schedule_id, employee_id)
VALUES (1, 1),
       (2, 2);

-- Insert data into food table
INSERT INTO food (name, description, time_to_make, dinner_item_id)
VALUES ('Salad', 'Fresh garden salad', '00:15:00', 1),
       ('Soup', 'Hearty vegetable soup', '00:20:00', 2);

-- Insert data into for_lunch table
INSERT INTO for_lunch (price, menu_item_id, lunch_id)
VALUES (8, 1, 1),
       (9, 2, 2);

-- Insert data into contains table (food and ingredients)
INSERT INTO contains (menu_item_id, ingredient_id)
VALUES (1, 1),
       (1, 2),
       (2, 1);

-- Insert data into food_order table
INSERT INTO food_order (menu_item_id, order_id)
VALUES (1, 1),
       (2, 2);