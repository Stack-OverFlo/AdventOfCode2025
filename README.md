# 🎄 Advent of Code 2025 - Algorithmic Solutions

This repository showcases my solutions for **Advent of Code 2025**. My approach focuses on writing clean, efficient, and readable code while tackling complex logical puzzles.

## 📖 Project Overview

Advent of Code is a series of daily programming challenges that test problem-solving skills and algorithmic efficiency. Throughout these challenges, I prioritized:

- **Efficient Data Parsing**: Converting raw inputs into structured data using Java NIO.
- **Algorithmic Logic**: Implementing robust filtering, validation, and optimization mechanisms.
- **Mathematical Problem-Solving**: Applying modular arithmetic, string manipulation, and greedy algorithms.
- **Code Readability**: Maintaining clean architecture and functional programming principles.

## ✅ Completed Challenges

### Quest 1: Circular Rotations
**Concepts**: Modular Arithmetic, Circular Arrays, State Tracking.

**Part 1**: Count zero crossings in a circular buffer with directional rotations.
**Part 2**: Enhanced zero detection with step-by-step iteration through rotation deltas.

### Quest 2: ID Sequence Validation
**Concepts**: String Pattern Matching, Repetition Detection, Range Processing.

**Part 1**: Identify and sum IDs with exact half-repetition patterns (e.g., `12341234`).
**Part 2**: Detect any repeated subsequence patterns with at least two repetitions.

### Quest 3: Battery Jolt Optimization
**Concepts**: Greedy Algorithms, Stack-based Optimization, Subsequence Extraction.

**Part 1**: Find maximum two-digit subsequence in battery serial numbers.
**Part 2**: Extract the largest 12-digit subsequence using a monotonic stack approach.

## 🛠 Tech Stack

- **Language**: Java 17+
- **Libraries**: `java.nio.file`, `java.util` (Collections, Deque, AbstractMap)
- **Focus**: Clean code architecture, efficient algorithms, and optimal time complexity

## 🚀 Running the Solutions

Each quest's solution is organized by parts:
```bash
# Quest 1
javac day01/part1.java && java -cp day01 part1
javac day01/part2.java && java -cp day01 part2

# Quest 2
javac day02/part1.java && java -cp day02 part1
javac day02/part2.java && java -cp day02 part2

# Quest 3
javac day03/part1.java && java -cp day02 part1
javac day03/part2.java && java -cp day02 part2
```

## 📊 Performance Highlights

- ⚡ **Optimized Algorithms**: Modular arithmetic, greedy stack operations
- 🧹 **Clean Code**: Separation of concerns with dedicated utility methods
- 🔍 **Multiple Approaches**: Iterative and stack-based solutions for different problem constraints

## 📁 Project Structure
```
.
├── day01/
│   ├── part1.java
│   └── part2.java
├── day02/
│   ├── part1.java
│   └── part2.java
└── day03/
    ├── part1.java
    └── part2.java
```

## 📝 License

This project is for educational purposes as part of the Advent of Code 2025 challenge.

---

⭐ **Follow my progress** as I continue solving the remaining challenges!