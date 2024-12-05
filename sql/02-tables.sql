CREATE TABLE IF NOT EXISTS person
(
    person_id INT AUTO_INCREMENT NOT NULL,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    date_of_birth DATE NOT NULL,
    email VARCHAR(255) NOT NULL,
    phone_number VARCHAR(255) NOT NULL,
    PRIMARY KEY (person_id)
    );

CREATE TABLE IF NOT EXISTS employee
(
    employee_id INT AUTO_INCREMENT NOT NULL,
    person_id INT NOT NULL,
    hiring_date DATE NOT NULL,
    salary INT NOT NULL,
    PRIMARY KEY (employee_id),
    FOREIGN KEY (person_id) REFERENCES person(person_id),
    UNIQUE (person_id)
    );

CREATE TABLE IF NOT EXISTS role
(
    role_id INT AUTO_INCREMENT NOT NULL,
    name VARCHAR(255) NOT NULL,
    description TEXT NOT NULL,
    hierarchy_level INT NOT NULL,
    employee_id INT NOT NULL,
    PRIMARY KEY (role_id),
    UNIQUE (employee_id)
    );

CREATE TABLE IF NOT EXISTS lunch
(
    lunch_id INT AUTO_INCREMENT NOT NULL,
    date DATE NOT NULL,
    menu_item_id INT NOT NULL,
    PRIMARY KEY (lunch_id),
    UNIQUE (menu_item_id)
    );

CREATE TABLE IF NOT EXISTS dinner_menu
(
    dinner_item_id INT AUTO_INCREMENT NOT NULL,
    menu_item_id INT NOT NULL,
    price INT NOT NULL,
    PRIMARY KEY (dinner_item_id),
    UNIQUE (menu_item_id)
    );

CREATE TABLE IF NOT EXISTS ingredients
(
    ingredient_id INT AUTO_INCREMENT NOT NULL,
    name VARCHAR(255) NOT NULL,
    PRIMARY KEY (ingredient_id)
    );

CREATE TABLE IF NOT EXISTS tables
(
    table_number INT AUTO_INCREMENT NOT NULL,
    room_for_people INT NOT NULL,
    PRIMARY KEY (table_number)
    );

CREATE TABLE IF NOT EXISTS orders
(
    order_id INT AUTO_INCREMENT NOT NULL,
    table_number INT NOT NULL,
    employee_id INT NOT NULL,
    date DATE NOT NULL,
    PRIMARY KEY (order_id),
    FOREIGN KEY (employee_id) REFERENCES employee(employee_id),
    FOREIGN KEY (table_number) REFERENCES tables(table_number),
    UNIQUE (table_number),
    UNIQUE (employee_id)
    );

CREATE TABLE IF NOT EXISTS shift
(
    schedule_id INT AUTO_INCREMENT NOT NULL,
    employee_id INT NOT NULL,
    shift_date DATE NOT NULL,
    start_time TIME NOT NULL,
    end_time TIME NOT NULL,
    PRIMARY KEY (schedule_id),
    UNIQUE (employee_id)
    );

CREATE TABLE IF NOT EXISTS bookings
(
    booking_id INT AUTO_INCREMENT NOT NULL,
    date DATE NOT NULL,
    start_time TIME NOT NULL,
    end_time TIME NOT NULL,
    person_id INT NOT NULL,
    table_number INT NOT NULL,
    PRIMARY KEY (booking_id),
    FOREIGN KEY (person_id) REFERENCES person(person_id),
    FOREIGN KEY (table_number) REFERENCES tables(table_number),
    UNIQUE (person_id),
    UNIQUE (table_number)
    );

CREATE TABLE IF NOT EXISTS events
(
    event_id INT AUTO_INCREMENT NOT NULL,
    name VARCHAR(255) NOT NULL,
    description TEXT NOT NULL,
    date DATE NOT NULL,
    start_time TIME NOT NULL,
    end_time TIME NOT NULL,
    PRIMARY KEY (event_id)
    );

CREATE TABLE IF NOT EXISTS works_as
(
    employee_id INT NOT NULL,
    role_id INT NOT NULL,
    PRIMARY KEY (employee_id, role_id),
    FOREIGN KEY (employee_id) REFERENCES employee(employee_id),
    FOREIGN KEY (role_id) REFERENCES role(role_id)
    );

CREATE TABLE IF NOT EXISTS works_at
(
    schedule_id INT NOT NULL,
    employee_id INT NOT NULL,
    PRIMARY KEY (schedule_id, employee_id),
    FOREIGN KEY (schedule_id) REFERENCES shift(schedule_id),
    FOREIGN KEY (employee_id) REFERENCES employee(employee_id)
    );

CREATE TABLE IF NOT EXISTS food
(
    menu_item_id INT AUTO_INCREMENT NOT NULL,
    name VARCHAR(255) NOT NULL,
    description TEXT NOT NULL,
    time_to_make TIME NOT NULL,
    dinner_item_id INT NOT NULL,
    PRIMARY KEY (menu_item_id),
    FOREIGN KEY (dinner_item_id) REFERENCES dinner_menu(dinner_item_id)
    );

CREATE TABLE IF NOT EXISTS for_lunch
(
    price INT NOT NULL,
    menu_item_id INT NOT NULL,
    lunch_id INT NOT NULL,
    PRIMARY KEY (menu_item_id, lunch_id),
    FOREIGN KEY (menu_item_id) REFERENCES food(menu_item_id),
    FOREIGN KEY (lunch_id) REFERENCES lunch(lunch_id)
    );

CREATE TABLE IF NOT EXISTS contains
(
    menu_item_id INT NOT NULL,
    ingredient_id INT NOT NULL,
    PRIMARY KEY (menu_item_id, ingredient_id),
    FOREIGN KEY (menu_item_id) REFERENCES food(menu_item_id),
    FOREIGN KEY (ingredient_id) REFERENCES ingredients(ingredient_id)
    );

CREATE TABLE food_order
(
    menu_item_id INT NOT NULL,
    order_id INT NOT NULL,
    PRIMARY KEY (menu_item_id, order_id),
    FOREIGN KEY (menu_item_id) REFERENCES food(menu_item_id),
    FOREIGN KEY (order_id) REFERENCES orders(order_id)
);