# Monthly Budget Tracker

A simple console-based Java application that helps you track your monthly budget. Enter your income and your main expenses, and it calculates your total expenses, remaining balance, and financial status.

Built for **HPX100-1 Integrated Project — Question 3: SmartSpend Solutions**.

---

## What It Does

- Asks for your monthly income
- Asks for rent, transport, and grocery expenses
- Calculates total expenses
- Calculates remaining balance
- Tells you your financial status:
  - `Financially Stable` — remaining balance > R1000
  - `At Risk` — remaining balance between R0 and R1000
  - `Overspending` — remaining balance < R0

---

## How To Run It

You need Java (JDK 17 or later) installed.

```bash
# 1. Compile
javac MonthlyBudgetTracker.java

# 2. Run
java MonthlyBudgetTracker
```

Or just press **Run** in VS Code / IntelliJ.

---

## Example Usage

```
Enter monthly income: R15000
Enter rent expense: R5000
Enter transport expense: R2000
Enter grocery expense: R3000

===== Monthly Budget Summary =====
Monthly Income: R15000.00
Total Expenses: R10000.00
Remaining Balance: R5000.00
Financial Status: Financially Stable
```

### More Examples

| Income | Rent | Transport | Grocery | Balance | Status |
|--------|------|-----------|---------|---------|--------|
| R15000 | R5000 | R2000 | R3000 | R5000 | Financially Stable |
| R10000 | R5000 | R2000 | R2500 | R500 | At Risk |
| R8000 | R5000 | R2000 | R2000 | R-1000 | Overspending |

---

## How It Works

| Method | What It Does |
|--------|--------------|
| `calculateTotalExpenses(rent, transport, grocery)` | Adds up all expenses |
| `calculateRemainingBalance(income, totalExpenses)` | Income - Total Expenses |
| `determineFinancialStatus(remainingBalance)` | Returns Stable / At Risk / Overspending based on `RISK_THRESHOLD` |

Constant used:
```java
public static final double RISK_THRESHOLD = 1000.0;
```

---

## Project Structure

```
MonthlyBudgetTracker/
├── MonthlyBudgetTracker.java
└── README.md
```

---

## Tech Used

- Java
- `java.util.Scanner` for user input
- Console / Terminal

---

## Author

Built as part of the HPX100-1 Integrated Project.
