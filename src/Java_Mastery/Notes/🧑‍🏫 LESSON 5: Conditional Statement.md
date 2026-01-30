

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

## Soln:-


# ✅ REVIEW: QUESTION 1 (Positive / Negative / Zero)

### ❌ Issues in your code

1. Logical mistake:

  * You printed **“negative”** in the last `else`, but it should be **positive**
2. Extra nested `if` (works, but not clean)
3. Extra closing braces (syntax risk)

---

### ✅ CORRECT & CLEAN VERSION (Recommended)

```java
import java.util.Scanner;

public class CheckNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("The number is positive.");
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        sc.close();
    }
}
```

📌 **Why this is better**

* Clear logic
* No unnecessary nesting
* Easy to read (interviewers love this)

---

# ✅ REVIEW: QUESTION 2 (Marks & Grades)

You had **multiple issues**, but that’s okay — this is how learning works.

### ❌ Issues

1. Typo: `Strin[] args` ❌ → `String[] args` ✅
2. Missing semicolon `;`
3. Wrong logic order

  * `marks >= 60` will catch **all values ≥ 60**, so higher grades never run
4. Unnecessary nested `if`

---

### ✅ CORRECT & PROFESSIONAL VERSION

```java
import java.util.Scanner;

public class MarksObtained {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the marks: ");
        double marks = sc.nextDouble();

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 75) {
            System.out.println("Grade B");
        } else if (marks >= 60) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}
```

📌 **Golden Rule (IMPORTANT)**

> In an `else if` ladder, **always check the highest condition first**.

🔥 This rule is **frequently asked in interviews**.

---

# ✅ REVIEW: QUESTION 3 (Theory)

### ✔ Your answer:

> if is use when there is only one condition while the else if is use when there are multiple condition we have solve in ladder way.

### ✅ Improved Interview-Ready Answer:

> **`if` is used to check a single condition, whereas `else if` is used to check multiple conditions sequentially when the previous conditions are false.**

Perfect ✔️

---

# 🎯 LESSON 5 STATUS

| Topic           | Status |
| --------------- | ------ |
| if              | ✅      |
| if-else         | ✅      |
| else if ladder  | ✅      |
| Common mistakes | ✅      |




