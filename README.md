# berry-library

# Java Library Management System Challenge

## Scenario: Library Management System

### Challenge Description:
Implement a basic Library Management System that demonstrates your understanding of OOP principles, collections, and exception handling in Java.

### Requirements:

1. **Class Hierarchy (OOP)**:
    - Create an abstract `LibraryItem` class with properties like `id`, `title`, and `isAvailable`
    - Implement concrete subclasses: `Book` and `Magazine` with additional specific properties
    - `Book` should have `author` and `ISBN`
    - `Magazine` should have `issueDate` and `publisher`

2. **Library Management (Collections)**:
    - Implement a `Library` class that uses appropriate collections to store and manage library items
    - Include methods to add items, remove items, search for items by title or ID, and display all items
    - Use a Map to track borrowed items with the borrower's name as the key

3. **Exception Handling**:
    - Create a custom exception class `LibraryException`
    - Implement specific exceptions like `ItemNotFoundException` and `ItemNotAvailableException`
    - Handle these exceptions appropriately in your code

4. **User Interaction**:
    - Implement methods for users to borrow and return items
    - Ensure proper validation and exception handling during these operations

### Expected Functionality:
- Adding new items to the library
- Searching for items by title or ID
- Borrowing an item (which marks it as unavailable)
- Returning an item (which marks it as available again)
- Proper exception messages when trying to borrow unavailable items

### Bonus (if time permits):
- Implement a simple console menu to interact with your library system
- Add date tracking for due dates of borrowed items
