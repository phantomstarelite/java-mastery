# 🧑‍🏫 LESSON 1: Java Program Structure (From Zero)

We’ll go **slow, clear, and logical**. No rush.

---

## 🟢 Step 1: Your First Java Program

Create a file named:

```
HelloWorld.java
```

Write this code **exactly**:

```java
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, Java World!");
    }
}
```

Now run it.

👉 **Output will be:**

```
Hello, Java World!
```

🎉 Congrats! You just ran your **first Java program**.

---

## 🧠 Step 2: Understand EVERY Line (Very Important)

### 1️⃣ `class HelloWorld`

* Java program **always runs inside a class**
* `HelloWorld` is the **class name**
* File name **must be same** as class name
  ✔ `HelloWorld.java`

Think of a class as:

> 📦 A container that holds code

---

### 2️⃣ `public static void main(String[] args)`

This line looks scary 😄 but it’s not.

Let’s break it:

#### 🔹 `main`

* This is the **starting point** of a Java program
* Java always starts execution from `main`

#### 🔹 `public`

* JVM should be able to access it from anywhere

#### 🔹 `static`

* No object needed to run this method

#### 🔹 `void`

* It returns **nothing**

#### 🔹 `String[] args`

* Used to take input from command line (we’ll learn later)

📌 For now, just remember:

> **`main` is where execution starts**

---

### 3️⃣ `System.out.println("Hello, Java World!");`

* `System` → system class
* `out` → output
* `println` → print line

👉 Prints text and moves to next line

---

## 🧪 Step 3: Tiny Experiment (DO THIS)

Change the text:

```java
System.out.println("My name is Pratik");
System.out.println("I am learning Java");
```

👉 Output:

```
My name is Pratik
I am learning Java
```

💡 This proves Java runs **top to bottom**.

---

## 🧠 Step 4: Important Rules (Memorize These)

✅ Java is **case-sensitive**

* `Main` ≠ `main`

✅ Every statement ends with `;`

✅ Curly braces `{ }` define a block

---

## ❓ Mini Check (Answer in your own words)

Reply with answers 👇

1️⃣ Why is `main()` important in Java?  
2️⃣ What happens if class name and file name are different?  
3️⃣ What does `System.out.println()` do?  

## Solution



## ✅ Review & Improvement (Teacher Mode ON)

### **1️⃣ Why is `main()` important in Java?**


### ✅ Perfected answer:

> **`main()` is the entry point of a Java program.**
> The JVM starts execution from the `main()` method.
> Without `main()`, the JVM does not know where to begin execution.

📌 **Interview-ready line**:

> *“The JVM always looks for the `main()` method to start program execution.”*

---

### **2️⃣ What happens if class name and file name are different?**



### ✅ Corrected & clarified:

> If the class is **public**, then the **file name must be exactly the same as the class name**.
> Otherwise, the program will **not compile**.

📌 Example:

```java
public class HelloWorld { }
```

✔ File must be:

```
HelloWorld.java
```

💡 **Important note (advanced hint)**
If the class is **not public**, Java allows different file names — we’ll cover this later 😉

---

### **3️⃣ What does `System.out.println()` do?**

Nice 👍 You’re **right**, just needs a small polish. Let’s fix it **teacher-style** and also level it up for interviews.

---

## ✅ Corrected Statement (Simple & Clear)

> **`System.out.print` is used to print output in the terminal.**

That’s correct ✔️

---

## 🧠 But there’s an IMPORTANT detail you must know

Java has **two very similar methods**:

### 1️⃣ `System.out.print()`

* Prints output **on the same line**
* Does **NOT** move the cursor to the next line

### Example:

```java
System.out.print("Hello");
System.out.print("Java");
```

### Output:

```
HelloJava
```

---

### 2️⃣ `System.out.println()`  ← (Most commonly used)

* Prints output
* **Moves to the next line** after printing

### Example:

```java
System.out.println("Hello");
System.out.println("Java");
```

### Output:

```
Hello
Java
```

---

## 📌 Interview-Ready Difference (IMPORTANT)

> **`print()` prints output on the same line, whereas `println()` prints output and moves the cursor to the next line.**

🔥 This line is GOLD for interviews.

---

## 🧪 Quick Practice (Do this mentally)

```java
System.out.print("A");
System.out.println("B");
System.out.print("C");
```

👉 Output will be:

```
AB
C
```

---

## 🎯 Mini Task (Reply with answer)

What will be the output of this?

```java
System.out.println("Java");
System.out.print("is");
System.out.print(" fun");
```

After this, we’ll officially move to
🚀 **Lesson 3: Taking Input from User using Scanner**



