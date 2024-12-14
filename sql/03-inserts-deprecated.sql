INSERT INTO bookings (date, start_time, end_time, table_number, status, person_id) VALUES
   ('2024-12-13', '18:00:00', '20:00:00', 1, 'Confirmed', 1),
   ('2024-12-14', '19:00:00', '21:00:00', 2, 'Confirmed', 2),
   ('2024-12-15', '17:00:00', '19:00:00', 3, 'Cancelled', 3),
   ('2024-12-16', '18:30:00', '20:30:00', 4, 'Confirmed', 1),
   ('2024-12-17', '19:30:00', '21:30:00', 5, 'Confirmed', 2),
   ('2024-12-18', '18:00:00', '20:00:00', 6, 'Cancelled', 3),
   ('2024-12-19', '20:00:00', '22:00:00', 1, 'Confirmed', 1),
   ('2024-12-20', '18:00:00', '20:00:00', 2, 'Confirmed', 2),
   ('2024-12-21', '19:00:00', '21:00:00', 3, 'Cancelled', 3),
   ('2024-12-22', '17:00:00', '19:00:00', 4, 'Confirmed', 1),
   ('2024-12-23', '18:30:00', '20:30:00', 5, 'Confirmed', 2),
   ('2024-12-24', '19:30:00', '21:30:00', 6, 'Confirmed', 3),
   ('2024-12-25', '18:00:00', '20:00:00', 1, 'Confirmed', 1);

-- Insert sample data into the tab table
INSERT INTO tab (opened_at, status, last_updated_at, employee_id, table_number) VALUES
    ('2023-10-01 12:00:00', 'Open', '2023-10-01 14:00:00', 1, 1),
    ('2023-10-02 13:00:00', 'Open', '2023-10-02 15:00:00', 2, 2),
    ('2023-10-03 12:30:00', 'Open', '2023-10-03 14:30:00', 3, 3),
    ('2023-10-04 13:30:00', 'Open', '2023-10-04 15:30:00', 1, 4),
    ('2023-10-05 12:00:00', 'Open', '2023-10-05 14:00:00', 2, 5);

-- Insert sample data into the orders table
INSERT INTO orders (date, status, employee_id, table_number, tab_id) VALUES
    ('2023-10-01', 'Waiting', 1, 1, 1),
    ('2023-10-02', 'Preparing', 2, 2, 2),
    ('2023-10-03', 'Done', 3, 3, 3),
    ('2023-10-04', 'Waiting', 1, 4, 4),
    ('2023-10-05', 'Preparing', 2, 5, 5);