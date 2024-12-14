# API Documentation

## Endpoints

### Lunch Items
- **GET** `/api/menu/lunch/all`
    - Description: Get all lunch items.
    - Response: `List<Lunch>`

- **GET** `/api/menu/lunch/date/{date}`
    - Description: Get lunch items by date.
    - Parameters:
        - `date` (Date): The date to filter lunch items.
    - Response: `List<Lunch>`

- **GET** `/api/menu/lunch/week/{week}/year/{year}`
    - Description: Get lunch items by week and year.
    - Parameters:
        - `week` (int): The week number.
        - `year` (int): The year.
    - Response: `List<Lunch>`

### Dinner Items
- **GET** `/api/menu/dinner/all`
    - Description: Get all dinner items.
    - Response: `List<Dinner>`

- **GET** `/api/menu/dinner/type/{type}`
    - Description: Get dinner items by type.
    - Parameters:
        - `type` (String): The type of dinner (e.g., förrätt, varmrätt, vegetarisk, efterrätt).
    - Response: `List<Dinner>`

### Bookings
- **GET** `/api/calendar/bookings/{type}`
    - Description: Get bookings by type.
    - Parameters:
        - `type` (String): The type of bookings (e.g., all).
    - Response: `List<Bookings>`

- **GET** `/api/calendar/bookings/date/{date}`
    - Description: Get bookings by date.
    - Parameters:
        - `date` (Date): The date to filter bookings.
    - Response: `List<Bookings>`

- **GET** `/api/calendar/bookings/week/{week}/year/{year}`
    - Description: Get bookings by week and year.
    - Parameters:
        - `week` (int): The week number.
        - `year` (int): The year.
    - Response: `List<Bookings>`

- **POST** `/api/calendar/bookings`
    - Description: Add a new booking.
    - Request Body: `Bookings`
    - Response: `Bookings`

- **POST** `/api/calendar/bookings/{id}/status`
    - Description: Update the status of a booking.
    - Parameters:
        - `id` (Integer): The booking ID.
    - Request Body: `Bookings.Status`
    - Response: `Bookings`

### Events
- **GET** `/api/events/all`
    - Description: Get all events.
    - Response: `List<Events>`

- **GET** `/api/events/week/{week}/year/{year}`
    - Description: Get events by week and year.
    - Parameters:
        - `week` (int): The week number.
        - `year` (int): The year.
    - Response: `List<Events>`

- **GET** `/api/events/date/{date}`
    - Description: Get events by date.
    - Parameters:
        - `date` (Date): The date to filter events.
    - Response: `List<Events>`