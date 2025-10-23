# Playground1 — Learn Java by Exploring a Tiny Library App

Welcome! This project is a small, intentionally simple Java codebase that you can use to learn core Java concepts. It models a Library with Books and shows how to work with:

- Classes and objects
- Fields (properties)
- Methods (behavior)
- Access modifiers (public vs. package‑private)
- Generics with ArrayList
- Arrays
- Working with dates (using java.util.Date)

It’s a great starter for experimenting and trying small changes.


## Project Structure
```
Playground1/
├── src/
│   ├── Main.java      // Demonstrates creating objects and using collections
│   ├── Library.java   // A Library with books, opening hours, and storage
│   └── Book.java      // A Book with basic fields and placeholder methods
└── README.md
```


## How to Open
- Recommended IDE: IntelliJ IDEA (Community Edition is fine)
- JDK: 17+ (any modern JDK works for this code)

In IntelliJ:
1. File → Open → select the project folder.
2. Ensure the `src` directory is marked as a Sources root (usually automatic).


## How to Run
The current Main class contains a method named `void main()` (non‑standard). To run from the command line or IDE Run button, Java expects this exact signature:

```java
public class Main {
    public static void main(String[] args) {
        // your code here
    }
}
```

Two options:
- Quick try: change `void main()` to `public static void main(String[] args)` and keep the body as is.
- Keep as is: use the code as reading material without running.


## Code Walkthrough and Concepts

### 1) Classes and Objects
- `Book` and `Library` are separate classes (blueprints). You create objects (instances) with `new`.
- In `Main`, the code constructs objects:
  ```java
  Book mmm = new Book();
  Library HN = new Library();
  ```

### 2) Fields (State)
- `Book` has: `author`, `title`, `edition`.
- `Library` has: `books` (a list), `location` (text), `openHours` (list of strings), and `bookStorage` (an `int[]`).
- The project sets fields directly (no getters/setters yet):
  ```java
  mmm.author = "Fred Brooks";
  mmm.title = "The mythical man";
  mmm.edition = 2;
  ```

### 3) Methods (Behavior)
- `Book` declares placeholder methods using `java.util.Date`:
  ```java
  void Borrow(Date s, Date e) { }
  void GiveBack(Date today) { }
  ```
- `Library` declares a placeholder `void visit()` method.
- These are empty, making them perfect for your practice: implement behavior as an exercise (see Exercises below).

Note on naming convention: In Java, method names typically use lowerCamelCase. So `borrow(...)` and `giveBack(...)` would be more idiomatic than `Borrow`, `GiveBack`.

### 4) Access Modifiers and Packages
- `Library` is `public`, so it’s visible outside its package.
- `Book` has no explicit modifier on the class, so it’s package‑private (visible only within the same package).
- Fields and methods are also package‑private by default here. In real apps you usually make fields `private` and expose access via methods to enforce encapsulation.
- All classes are in the default package (no `package` statement). For larger projects, create a package like `com.example.playground` and move classes into it.

### 5) Collections: ArrayList (Generics)
- This project uses `ArrayList` to hold a dynamic list of Books and opening hours:
  ```java
  ArrayList<Book> books = new ArrayList<>();
  ArrayList<String> openHours = new ArrayList<>();
  ```
- Generics (`<Book>`, `<String>`) provide compile‑time type safety, so you can only add the right types.
- Basic operations shown in `Main`:
  ```java
  HN.books.add(mmm);          // add a Book
  HN.openHours.add("11 am"); // add a String
  HN.openHours.add("11 pm");
  ```
- Other useful operations you can try:
  - `books.get(0)` — get the first Book
  - `books.size()` — how many items
  - `books.remove(0)` — remove by index
  - Enhanced for‑loop: `for (Book b : HN.books) { ... }`

### 6) Arrays
- Fixed‑size arrays store a predetermined number of elements:
  ```java
  int[] bookStorage = new int[5];
  HN.bookStorage[0] = 1; // index access
  ```
- Compare arrays vs. `ArrayList`:
  - Arrays: fixed length, faster and lower‑level
  - ArrayList: dynamic size, convenient methods

### 7) Dates
- The code imports `java.util.Date` as a simple placeholder.
- In modern Java, prefer the `java.time` package (`LocalDate`, `LocalDateTime`) for better API and immutability.


## Exercises (Try These!)
1. Make `Main` runnable by changing the method signature to `public static void main(String[] args)` and print details about the library and books.
2. Implement `Book.borrow(LocalDate start, LocalDate end)` and `Book.giveBack(LocalDate day)` using `java.time` instead of `Date`.
3. Encapsulate fields:
   - Make fields `private`.
   - Add getters/setters.
   - Validate inputs (e.g., edition must be positive).
4. Improve naming to follow Java conventions (e.g., `borrow`, `giveBack`).
5. Add a `toString()` method to `Book` and `Library` for easy printing.
6. Replace the default package with a named package like `org.example.playground` and update imports.
7. Explore collections:
   - Iterate over `HN.books` and print all titles.
   - Prevent duplicate books (consider `HashSet` or `equals/hashCode`).
8. Add simple behavior to `Library.visit()` (e.g., print a welcome message and open hours).


## Example: A Runnable Main
Below is a tiny example you can paste into `Main.java` to run the program:

```java
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Book mmm = new Book();
        mmm.author = "Fred Brooks";
        mmm.title = "The Mythical Man-Month";
        mmm.edition = 2;

        Library hn = new Library();
        hn.books.add(mmm);
        hn.location = "TUM Campus Heilbronn";
        hn.openHours.add("11 am");
        hn.openHours.add("11 pm");
        hn.bookStorage[0] = 1;

        System.out.println("Library at: " + hn.location);
        for (String h : hn.openHours) System.out.println("Open: " + h);
        for (Book b : hn.books) System.out.println("Book: " + b.title + " by " + b.author);
    }
}
```


## Tips for Learners
- Use the IDE’s autocomplete and quick documentation (⌘J / Ctrl+Q) to explore types.
- Step through code with a debugger to see object state changes.
- Try refactoring (rename, move to package) to feel how IDE tools help structure code.


## Why This Project Is Useful for Learning
- Tiny scope keeps focus on language features.
- Shows both arrays and collections so you can compare.
- Leaves deliberate gaps (empty methods) for you to implement and practice.

Enjoy experimenting and learning Java!