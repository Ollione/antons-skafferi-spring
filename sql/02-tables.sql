CREATE TABLE IF NOT EXISTS food
(
    menu_item_id INT AUTO_INCREMENT NOT NULL,
    name VARCHAR(255) NOT NULL,
    description TEXT NOT NULL,
    time_to_make TIME NOT NULL,
    dinner_item_id INT NOT NULL,
    PRIMARY KEY (menu_item_id)
);
