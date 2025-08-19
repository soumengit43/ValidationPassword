# ValidationPassword
To validate password

# Password Validation Service

This project provides a  **password validation utility** written in Java.  
It enforces mandatory rules as well as optional conditions to ensure password strength.

---

##  Validation Rules

### 1. Mandatory Conditions
A valid password **must**:
- Not be `null` or blank (`isBlank()` check from Java 11 is used).
- Contain **at least one lowercase letter**.

### 2. At Least One Optional Condition
In addition to the mandatory rules, the password must satisfy **at least one** of the following:
- Minimum length of **8 characters**
- At least **one uppercase letter**
- At least **one digit**

If none of these are satisfied, an `InvalidPassException` is thrown with a descriptive message.

---
# Password Validation Service

This project provides a simple **password validation utility** written in Java.  
It enforces mandatory rules as well as optional conditions to ensure password strength.

---

## ✅ Validation Rules

### 1. Mandatory Conditions
A valid password **must**:
- Not be `null` or blank (`isBlank()` check from Java 11 is used).
- Contain **at least one lowercase letter**.

### 2. At Least One Optional Condition
In addition to the mandatory rules, the password must satisfy **at least one** of the following:
- Minimum length of **8 characters**
- At least **one uppercase letter**
- At least **one digit**

If none of these are satisfied, an `InvalidPassException` is thrown with a descriptive message.

Testcase:
- This project uses JUnit 5 for unit testing.
- The testcases cover both valid and invalid password scenarios.



