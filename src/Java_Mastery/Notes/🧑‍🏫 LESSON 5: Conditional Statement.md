

# 🧑‍🏫 LESSON 5: Conditional Statements (`if`, `else`, `else if`)

> **Goal:**
> Make decisions in your Java program.

Until now:

* Code runs **line by line**
* No decisions ❌

Now:

* Code will **choose paths** ✅

---

## 🔹 1. Why Do We Need Conditions?

Real-life logic:

* If age ≥ 18 → allow vote
* Else → deny vote

Java does the same using **`if`**.

---

## 🔹 2. Basic `if` Statement

### Syntax:

```java
if (condition) {
    // code runs if condition is true
}
```

### Example:

```java
int age = 20;

if (age >= 18) {
    System.out.println("You are eligible to vote");
}
```

📌 If condition is false → block is skipped.

---

## 🔹 3. `if - else`

Used when there are **two choices**.

### Syntax:

```java
if (condition) {
    // true block
} else {
    // false block
}
```

### Example:

```java
int age = 15;

if (age >= 18) {
    System.out.println("Eligible to vote");
} else {
    System.out.println("Not eligible to vote");
}
```

---

## 🔹 4. `else if` Ladder (Multiple Conditions)

Used when there are **more than two conditions**.

### Syntax:

```java
if (condition1) {
    // block 1
} else if (condition2) {
    // block 2
} else {
    // default block
}
```

### Example:

```java
int marks = 85;

if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 75) {
    System.out.println("Grade B");
} else if (marks >= 60) {
    System.out.println("Grade C");
} else {
    System.out.println("Fail");
}
```

📌 Only **one block executes**.

---

## 🔹 5. Nested `if`

An `if` inside another `if`.

### Example:

```java
int age = 20;
boolean hasId = true;

if (age >= 18) {
    if (hasId) {
        System.out.println("Entry allowed");
    } else {
        System.out.println("ID required");
    }
} else {
    System.out.println("Underage");
}
```

---

## 🔹 6. Common Mistakes (INTERVIEW FAVORITE)

### ❌ Mistake 1: Using `=` instead of `==`

```java
if (age = 18) // ❌
```

### ✅ Correct:

```java
if (age == 18)
```

---

### ❌ Mistake 2: Semicolon after `if`

```java
if (age >= 18); {   // ❌
    System.out.println("Eligible");
}
```

---

## 🔹 7. Using Scanner with `if`

```java
import java.util.Scanner;

public class VotingCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }

        sc.close();
    }
}
```

---

## 🔹 8. Interview-Ready Explanation

> **`if-else` is used to execute different blocks of code based on a condition that evaluates to true or false.**

---

## 🧪 PRACTICE TASK (VERY IMPORTANT)

Reply with **code + answers** 👇

### 1️⃣ Write a program that:

* Takes a number from user
* Checks whether it is **positive, negative, or zero**

### 2️⃣ Write a program that:

* Takes marks
* Prints grade:

    * ≥ 90 → A
    * ≥ 75 → B
    * ≥ 60 → C
    * else → Fail

### 3️⃣ One-line answer:

👉 Difference between `if` and `else if`?

Once you reply, I’ll review and then move to
🚀 **LESSON 6: `switch` Statement**
