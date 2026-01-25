# 🧑‍🏫 LESSON 2: Variables & Data Types (FROM ZERO)

---

## 🔹 1. What is a Variable? (Core Idea)

👉 **Definition (simple):**

> A **variable** is a container used to store data in memory.

Think like this 👇

* You want to store **age**
* You give it a **name**
* You store a **value**

📦 **Box analogy**

```
name → "Pratik"
age  → 21
```

Each box has:

* a **name**
* a **type**
* a **value**

---

## 🔹 2. Why Java Needs Data Types

Java is a **strictly typed language**.

That means:

> Java must know **what kind of data** you are storing.

Why?

* Numbers need different memory than text
* True/False is different from characters

So Java asks you:

> “Tell me the type first.”

---

## 🔹 3. Variable Syntax (VERY IMPORTANT)

```java
dataType variableName = value;
```

### Example:

```java
int age = 21;
```

Break it down:

* `int` → data type (whole number)
* `age` → variable name
* `21` → value

📌 `=` means **assignment**, not equality.

---

## 🔹 4. Most Important Data Types (Start Here)

### 1️⃣ `int` – whole numbers

```java
int count = 10;
int temperature = -5;
```

---

### 2️⃣ `double` – decimal numbers

```java
double marks = 85.5;
double price = 99.99;
```

---

### 3️⃣ `char` – single character

```java
char grade = 'A';
char symbol = '#';
```

⚠️ Uses **single quotes `' '`**

---

### 4️⃣ `boolean` – true or false

```java
boolean isJavaEasy = true;
boolean isRaining = false;
```

---

### 5️⃣ `String` – text

```java
String name = "Pratik";
String course = "Java Mastery";
```

⚠️ Uses **double quotes `" "`**

---

## 🔹 5. Complete Example Program (READ CAREFULLY)

```java
class Lesson2Variables {
    public static void main(String[] args) {

        String name = "Pratik";
        int age = 21;
        double percentage = 85.5;
        char grade = 'A';
        boolean isLearningJava = true;

        System.out.println(name);
        System.out.println(age);
        System.out.println(percentage);
        System.out.println(grade);
        System.out.println(isLearningJava);
    }
}
```

### Output:

```
Pratik
21
85.5
A
true
```

---

## 🔹 6. Variable Naming Rules (INTERVIEW IMPORTANT)

### ✅ Valid names

```java
int age;
int myAge;
int totalMarks;
```

### ❌ Invalid names

```java
int 2age;     // cannot start with number
int my-age;   // no hyphen allowed
```

📌 Best practice:

> Use **meaningful names**, not `a`, `x`, `temp`

---

## 🔹 7. Java is Case-Sensitive

```java
int age = 20;
int Age = 30;
```

✅ These are **two different variables**.

---

## 🔹 8. Small Logical Example

```java
int a = 10;
int b = 20;

System.out.println(a + b);
```

Output:

```
30
```

👉 Java adds numbers, not text.

---

## 🧪 PRACTICE TASK (VERY IMPORTANT)

Reply with **ALL answers** 👇

### 1️⃣ In ONE line: What is a variable?

### 2️⃣ Choose correct data type:

* Age → ?
* Percentage → ?
* Grade (A/B/C) → ?
* Is Java interesting? → ?
* Your name → ?

### 3️⃣ Write a small Java program that prints:

* Your name
* Your age
* `true` if you are learning Java


🔥 **Very good work, Pratik!**
Your fundamentals are landing solidly. Now I’ll do what a **good teacher / interviewer** does:
✔ validate
✏️ correct gently
🎯 upgrade your answers to **professional level**

---

# ✅ REVIEW & CORRECTIONS (Lesson 2)

---

## 1️⃣ Variable Definition

### ✔ Your answer:

> Variable is a container which help store the same type of data in the same data type

### ✅ Improved (clean & correct):

> **A variable is a named container used to store data of a specific type in memory.**

📌 Why improvement?

* A variable can store **only one value at a time**
* “same type of data” → better said as **specific type**

🔥 **Interview-ready line (remember this):**

> “A variable is a named memory location that stores a value of a specific data type.”

---

## 2️⃣ Data Types Selection

### ✔ Your answers:

* Age → `int` ✅
* Percentage → `float, double` ⚠️
* Grade → `char` ✅
* Is Java interesting → `boolean` ✅
* Name → `String` ✅

### 🎯 Correction (IMPORTANT):

For **percentage**, prefer:

```java
double
```

📌 Why?

* `double` is more precise
* `float` needs `f` suffix and is rarely used in industry

✅ **Final correct list (professional choice):**

* Age → `int`
* Percentage → `double`
* Grade → `char`
* Is Java interesting → `boolean`
* Name → `String`

---

## 3️⃣ Java Program Review

### ✔ Your code:

```java
public class ProgramVariables {
    public static void main(String[] args) {
       String name = "Pratik";
       int age = 21;
       boolean isLearningJava = true;
       
       System.out.println(name);
       System.out.println(age);
       System.out.println(isLearningJava);
    }
}
```

### ✅ Verdict:

* ✔ Syntax correct
* ✔ Naming correct
* ✔ Logic correct
* ✔ Output correct

🔥 **This is 100% valid professional Java code.**

---

## 🧠 SMALL PRO TIP (Optional Improvement)

To make output **more readable**, professionals often do:

```java
System.out.println("Name: " + name);
System.out.println("Age: " + age);
System.out.println("Learning Java: " + isLearningJava);
```

This introduces **string concatenation** (we’ll cover it soon).

---


