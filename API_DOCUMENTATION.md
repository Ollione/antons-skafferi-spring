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

- **POST** `/api/events`
    - Description: Add a new event.
    - Request Body: `Events`
    - Response: `Events`

### Orders
- **GET** `/api/orders/all`
    - Description: Get all orders.
    - Response: `List<Orders>`

- **GET** `/api/orders/id/{id}`
    - Description: Get orders by ID.
    - Parameters:
        - `id` (Integer): The order ID.
    - Response: `Orders`

- **GET** `/api/orders/date/{date}`
    - Description: Get orders by date.
    - Parameters:
        - `date` (Date): The date to filter orders.
    - Response: `List<Orders>`

- **GET** `/api/orders/status/{status}`
    - Description: Get orders by status.
    - Parameters:
        - `status` (Orders.Status): The status of the orders.
    - Response: `List<Orders>`

- **POST** `/api/orders`
    - Description: Create a new order.
    - Request Body: `Orders`
    - Response: `Orders`

- **POST** `/api/orders/{orderId}/menu-item`
    - Description: Add a menu item to an order.
    - Parameters:
        - `orderId` (int): The order ID.
    - Request Body: `Integer` (dinner ID)
    - Response: `Orders`

- **POST** `/api/orders/{orderId}/drink`
    - Description: Add a drink to an order.
    - Parameters:
        - `orderId` (int): The order ID.
    - Request Body: `Integer` (drink ID)
    - Response: `Orders`

- **POST** `/api/orders/{orderId}/status`
    - Description: Update the status of an order.
    - Parameters:
        - `orderId` (int): The order ID.
    - Request Body: `Orders.Status`
    - Response: `Orders`

- **POST** `/api/orders/{orderId}/note`
    - Description: Update the note of an order.
    - Parameters:
        - `orderId` (int): The order ID.
    - Request Body: `String` (note)
    - Response: `Orders`

### Tab
- **GET** `/api/tab/all`
    - Description: Get all tabs.
    - Response: `List<Tab>`

- **GET** `/api/tab/id/{id}`
    - Description: Get tab by ID.
    - Parameters:
        - `id` (Integer): The tab ID.
    - Response: `Tab`

- **GET** `/api/tab/date/{date}`
    - Description: Get tab by date.
    - Parameters:
        - `date` (String): The date to filter tabs.
    - Response: `List<Tab>`

- **GET** `/api/tab/status/{status}`
    - Description: Get tab by status.
    - Parameters:
        - `status` (Tab.Status): The status of the tabs.
    - Response: `List<Tab>`

- **GET** `/api/tab/table/{table}`
    - Description: Get tab by table number.
    - Parameters:
        - `table` (Integer): The table number.
    - Response: `List<Tab>`

- **POST** `/api/tab`
    - Description: Create a new tab.
    - Request Body: `Tab`
    - Response: `Tab`

- **POST** `/api/tab/{tabId}/status`
    - Description: Update the status of a tab.
    - Parameters:
        - `tabId` (int): The tab ID.
    - Request Body: `Tab.Status`
    - Response: `Tab`

### Drinks
- **GET** `/api/menu/drinks/all`
    - Description: Get all drinks.
    - Response: `List<Drinks>`

- **GET** `/api/menu/drinks/id/{id}`
    - Description: Get drink by ID.
    - Parameters:
        - `id` (int): The drink ID.
    - Response: `Drinks`

- **GET** `/api/menu/drinks/type/{type}`
    - Description: Get drinks by type.
    - Parameters:
        - `type` (String): The type of drinks.
    - Response: `List<Drinks>`

- **POST** `/api/menu/drinks`
    - Description: Add a new drink.
    - Request Body: `Drinks`
    - Response: `Drinks`

- **POST** `/api/menu/drinks/{drinkId}/price`
    - Description: Update the price of a drink.
    - Parameters:
        - `drinkId` (int): The drink ID.
    - Request Body: `Integer` (price)
    - Response: `Drinks`

### Tables
- **GET** `/api/tables/all`
    - Description: Get all tables.
    - Response: `List<Tables>`

- **GET** `/api/tables/id/{id}`
    - Description: Get table by ID.
    - Parameters:
        - `id` (int): The table ID.
    - Response: `Tables`

- **GET** `/api/tables/seats/{room_for_people}`
    - Description: Get tables by number of seats.
    - Parameters:
        - `room_for_people` (int): The number of seats.
    - Response: `List<Tables>`

- **POST** `/api/tables`
    - Description: Add a new table.
    - Request Body: `Tables`
    - Response: `Tables`

### Employees
- **GET** `/api/employees/all`
    - Description: Get all employees.
    - Response: `List<Employee>`

- **GET** `/api/employees/id/{id}`
    - Description: Get employee by ID.
    - Parameters:
        - `id` (int): The employee ID.
    - Response: `Employee`

- **GET** `/api/employees/name/{name}`
    - Description: Get employees by name.
    - Parameters:
        - `name` (String): The name of the employees.
    - Response: `List<Employee>`

- **GET** `/api/employees/email/{email}/password`
    - Description: Get employee password by email.
    - Parameters:
        - `email` (String): The email of the employee.
    - Response: `String`

- **GET** `/api/employees/{id}/hierarchy`
    - Description: Get hierarchy by employee ID.
    - Parameters:
        - `id` (int): The employee ID.
    - Response: `List<Role>`

- **POST** `/api/employees`
    - Description: Create a new employee.
    - Request Body: `Employee`
    - Response: `Employee`

- **POST** `/api/employees/{employeeId}/password`
    - Description: Change employee password.
    - Parameters:
        - `employeeId` (int): The employee ID.
    - Request Body: `String` (password)
    - Response: `Employee`

- **POST** `/api/employees/{employeeId}/role/{roleId}`
    - Description: Change employee role.
    - Parameters:
        - `employeeId` (int): The employee ID.
        - `roleId` (int): The role ID.
    - Response: `Employee`

### Roles
- **GET** `/api/roles/all`
    - Description: Get all roles.
    - Response: `List<Role>`

- **GET** `/api/roles/id/{id}`
    - Description: Get role by ID.
    - Parameters:
        - `id` (int): The role ID.
    - Response: `Role`

- **POST** `/api/roles`
    - Description: Create a new role.
    - Request Body: `Role`
    - Response: `Role`

- **POST** `/api/roles/{roleId}/hierarchy`
    - Description: Change the hierarchy of a role.
    - Parameters:
        - `roleId` (int): The role ID.
    - Request Body: `Integer` (hierarchy level)
    - Response: `Role`