
# 🧑‍🏫 LESSON 3: Taking Input from User (Scanner Class)

Until now:

* ❌ values were **hard-coded**
* ✅ now we’ll take **real input from user (keyboard)**

This is **mandatory knowledge** for:

* interviews
* real programs
* competitive coding

---

## 🔹 1. Why Do We Need Input?

Hard-coding is bad ❌

```java
int age = 21;
```

What if:

* age changes?
* another user runs the program?

👉 Solution: **take input at runtime**

---

## 🔹 2. Scanner



Class (Core Idea)

Java provides a built-in class called **`Scanner`** to read input from keyboard.

📌 Scanner is present in:

```java
java.util
```





So we must **import it**.

---

## 🔹 3. Basic Scanner Syntax (MEMORIZE THIS)

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
```

Think of it as:

* `System.in` → keyboard
* `sc` → reader

---

## 🔹 4. First Input Program (Step by Step)

```java
import java.util.Scanner;

public class Lesson3Scanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Your age is: " + age);
    }
}
```

### Example Run:

```
Enter your age: 21
Your age is: 21
```

---

## 🔹 5. Common Scanner Methods (VERY IMPORTANT)

| Method          | Used for             |
| --------------- | -------------------- |
| `nextInt()`     | integer              |
| `nextDouble()`  | decimal              |
| `nextBoolean()



` | true/false           |
| `next()`        | single word          |
| `nextLine()`    | full line (sentence) |

---

## 🔹 6. Multiple Inputs Example

```java
import java.util.Scanner;

public class UserDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Are you learning Java? (true/false): ");
        boolean isLearningJava = sc.nextBoolean();

        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Learning Java: " + isLearningJava);
    }
}
```

---

## 🔥 7. MOST COMMON BEGINNER MISTAKE (READ CAREFULLY)

### ❌ Problem:

```java
int age = sc.nextInt();
String name = sc.nextLine(); // ❌ skipped
```

### ❓ Why?

`nextInt()` leaves a **newline** in buffer.

---

### ✅ Solution:

Add an extra `nextLine()`:

```java
int age = sc.nextInt();
sc.nextLine(); // consume leftover newline
String name = sc.nextLine();
```

📌 This is **INTERVIEW FAVORITE** question.

---

## 🔹 8. Close Scanner (Good Practice)

```java
sc.close();
```

(Not mandatory for small programs, but good habit.)

---

## 🧪 PRACTICE TASK (IMPORTANT)

Reply with **code + answers** 👇

### 1️⃣ Write a Java program that:

* Takes **name**
* Takes **age**
* Takes **percentage**
* Prints all values nicely

### 2️⃣ Answer in one line:

👉 Why do we use `Scanner` in Java?


