
# 🧑‍🏫 LESSON 6: `switch` Statement (From Basics to Pro)

> **Goal:**
> Handle **multiple fixed choices** cleanly and efficiently.

---

## 🔹 1. Why `switch`?

When you have **many options**, `if–else` becomes messy 👇

```java
if (choice == 1) { ... }
else if (choice == 2) { ... }
else if (choice == 3) { ... }
```

👉 `switch` makes this **clean and readable**.

---

## 🔹 2. Basic `switch` Syntax

```java
switch (expression) {
    case value1:
        // code
        break;

    case value2:
        // code
        break;

    default:
        // code
}
```

### Rules:

* `expression` must be:

    * `int`, `char`, `String`, `enum`
* `case` values must be **constant**
* `break` stops execution

---

## 🔹 3. First Simple Example

```java
int day = 3;

switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid day");
}
```

Output:

```
Wednesday
```

---

## 🔥 4. MOST IMPORTANT CONCEPT: `break`

### ❌ Without `break` (Fall-through)

```java
int x = 1;

switch (x) {
    case 1:
        System.out.println("One");
    case 2:
        System.out.println("Two");
    default:
        System.out.println("Default");
}
```

Output:

```
One
Two
Default
```

📌 This is called **fall-through**.

---

### ✅ With `break`

```java
case 1:
    System.out.println("One");
    break;
```

Stops execution ✔️

---

## 🔹 5. `default` Case

* Runs when **no case matches**
* Optional but recommended

```java
default:
    System.out.println("Invalid choice");
```

---

## 🔹 6. `switch` with `String` (VERY COMMON)

```java
String role = "admin";

switch (role) {
    case "admin":
        System.out.println("Full access");
        break;
    case "user":
        System.out.println("Limited access");
        break;
    default:
        System.out.println("Guest access");
}
```

📌 Java 7+ supports `String` in switch.

---

## 🔹 7. Real-World Example (Menu Program)

```java
import java.util.Scanner;

public class MenuProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Addition selected");
                break;
            case 2:
                System.out.println("Subtraction selected");
                break;
            case 3:
                System.out.println("Multiplication selected");
                break;
            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}
```

---

## 🔹 8. `switch` vs `if-else` (INTERVIEW)

| `switch`           | `if-else`                |
| ------------------ | ------------------------ |
| Fixed values       | Range / conditions       |
| Cleaner for menus  | Better for complex logic |
| Faster readability | More flexible            |

📌 Interview line:

> Use `switch` when comparing one variable with multiple fixed values.

---

## 🧪 PRACTICE TASK (IMPORTANT)

Reply with **code + answers** 👇

### 1️⃣ Write a program that:

* Takes a number (1–7)
* Prints day name using `switch`

### 2️⃣ What happens if we don’t use `break` in switch?

### 3️⃣ Convert this `if-else` to `switch`:

```java
if (option == 1)
    System.out.println("Start");
else if (option == 2)
    System.out.println("Stop");
else
    System.out.println("Exit");
```


