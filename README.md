Here’s a clean and professional **README.md** you can use for your project 👇

---

# 📘 Java DSA Utility Collection

This repository contains a collection of commonly used **Data Structures and Algorithms (DSA)** problems implemented in Java. It is useful for **coding interview preparation**, **practice**, and **quick reference**.

---

## 🚀 Features

This project includes implementations of multiple important algorithms:

### 🔢 Basic Programs

* Swap two numbers without using a third variable
* Fibonacci series generation
* Palindrome number check
* Word count (with and without `split()`)

### 📊 Array Operations

* Find largest element
* Find second largest element
* Sum of array
* Count even and odd numbers
* Pair sum (Two Pointer approach)
* Maximum sum of subarray of size `k` (Sliding Window)

### 📈 Advanced Array / Sliding Window

* Maximum sum subarray with constraint
* Longest substring with `k` distinct characters
* Sliding window maximum
* Longest subarray with sum ≤ k

### 📦 Stack-Based Problems

* Stock Span Problem
* Next Greater Element (NGE)
* Next Smaller Element (NSE)
* Largest Rectangle in Histogram
* Valid Parentheses Checker

### 🔁 Hashing / Prefix Sum

* Subarray sum equals `k` (Prefix sum + HashMap)

---

## 🧠 Concepts Covered

* Sliding Window Technique
* Two Pointer Approach
* Stack & Monotonic Stack
* HashMap & HashSet
* Prefix Sum
* String Manipulation

---

## 📂 Project Structure

```
test.java
```

All methods are implemented inside a single class:

```java
public class test
```

---

## ▶️ How to Run

### 1. Compile

```bash
javac test.java
```

### 2. Run

```bash
java test
```

---

## 📌 Example Output

```text
4
2
0 1 1 2 3 5 8 ...
palindrome
10
2
3
5
...
```

---

## ⚠️ Known Issues / Improvements Needed

Some methods contain minor bugs or can be improved:

* ❌ `longestdistinctstring()` → incorrect `set.remove()` and `set.add()` usage
* ❌ `nge()` and `ngs()` loops condition (`i <= 0`) should be `i >= 0`
* ❌ `sum()` skips last element (`ar.length - 1`)
* ❌ `maxone()` does not return or print result
* ❌ Debug print in `longestSubstringKDistinct()`

👉 These can be optimized and fixed for production use.

---

## 💡 Future Enhancements

* Add unit tests
* Separate problems into different classes
* Add time & space complexity comments
* Convert into a proper utility library

---

## 👨‍💻 Author

**Shivam Jain**

---

## 📜 License

This project is open-source and free to use for learning purposes.

---
