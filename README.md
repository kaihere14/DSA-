
# 📚 DSA - Java Solutions  

A curated collection of Java implementations for classic Data Structures & Algorithms (DSA) problems from LeetCode.  

[![License](https://img.shields.io/github/license/kaihere14/DSA-)](LICENSE)  
[![Java 17](https://img.shields.io/badge/Java-17%20%7C%20OpenJDK-blue)](https://openjdk.org/projects/jdk/17/)  
[![GitHub stars](https://img.shields.io/github/stars/kaihere14/DSA-?style=social)](https://github.com/kaihere14/DSA-/stargazers)  
[![GitHub forks](https://img.shields.io/github/forks/kaihere14/DSA-?style=social)](https://github.com/kaihere14/DSA-/network)  

---

## Overview  

**DSA** is a self-contained Java reference for technical interview preparation. It provides:  
- >80 LeetCode solutions (Easy to Hard)  
- Consistent code style with time/space complexity analysis  
- Self-contained `main` methods for direct execution  
- Searchable folder structure by problem ID and difficulty  

Current version: **v1.0.0** (2024-09-15)  

---

## Key Features  

| Category | Sample Problems | Status |
|----------|-----------------|--------|
| **Array & Hashing** | Two Sum, 3Sum, Majority Element, Valid Anagram | ✅ Stable |
| **Two-Pointer / Sliding Window** | Trapping Rain Water, Rotate Array, Move Zeroes | ✅ Stable |
| **Binary Search** | Search in Rotated Sorted Array, Median of Two Sorted Arrays | ✅ Stable |
| **Sorting & Selection** | Kth Largest Element, Sort Colors, Longest Consecutive Sequence | ✅ Stable |
| **Dynamic Programming** | Maximum Subarray (Kadane), Subarray Sum Equals K | ✅ Stable |
| **Matrix & Geometry** | Rotate Image, Spiral Matrix, Matrix Diagonal Sum | ✅ Stable |
| **String Manipulation** | Palindrome Number, Longest Palindromic Substring | ✅ Stable |
| **Miscellaneous** | Set Matrix Zeroes, Power of Two, Odd/Even checks | ✅ Stable |

Each solution includes:  
- Problem description and LeetCode link  
- Algorithmic approach summary  
- Time/space complexity analysis  
- Input/output format examples  

---

## 📂 Repository Structure


├── <problem-id>-<slug>/         # e.g., 1-two-sum/
│   ├── README.md                # Solution documentation
│   ├── Notes.md                 # Optional notes and performance metrics
│   └── <problem-name>.java      # Self-contained Java implementation
├── Difficulty: Basic/           # Basic level problems
├── Difficulty: Easy/            # Easy level problems
├── Difficulty: Medium/          # Medium level problems
└── README.md                    # Main repository documentation

## Getting Started  

### Prerequisites  

| Tool | Minimum Version |
|------|-----------------|
| JDK  | 17 (Java 8+ compatible with syntax adjustments) |
| Git  | Any recent version |
| IDE  | IntelliJ IDEA 2022+, VS Code, Eclipse (optional) |

### Compile & Run  

```bash
# Clone repository
git clone https://github.com/kaihere14/DSA-.git
cd DSA-

# Compile a solution
javac 1-two-sum/two-sum.java

# Run with input from stdin
java -cp 1-two-sum TwoSum < input.txt
```

All Java files are self-contained and can be compiled independently.  

---

## Usage  

Solutions accept input via standard input (`System.in`) in the following format:  
- First line: size of array/list/matrix  
- Subsequent lines: space-separated values or matrix rows  
- Final line: problem-specific parameters (e.g., target value)  

### Example: Remove Element (LeetCode 27)  

**Input** (STDIN):  
```
8
0 1 2 2 3 0 4 2
2
```

**Output** (STDOUT):  
```
5
0 1 3 0 4 0
```

### Code Structure  

Each solution follows this pattern:  
1. Read input via `BufferedReader`  
2. Execute algorithm  
3. Print results (e.g., new array length, transformed data)  

---

## Contributing  

1. **Fork** the repository  
2. **Create a branch**: `git checkout -b feat/leetcode-146-lru-cache`  
3. **Add a new problem**:  
   - Create folder: `<problem-id>-<slug>/`  
   - Add `README.md` with: problem link, approach summary, complexity, and I/O examples  
   - Add a single public class with `main` method  
4. **Verify**:  
   - Compiles with `javac`  
   - Follows [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)  
5. **Submit PR** with clear commit message  

### Pull Request Checklist  

- [ ] Code compiles with `javac`  
- [ ] README follows template  
- [ ] No unintended file changes  
- [ ] MIT license header added to new files  

---

## Troubleshooting  

| Symptom | Likely Cause | Fix |
|---------|--------------|-----|
| `NoClassDefFoundError` | Classpath misconfiguration | Use `java -cp <folder> <ClassName>` |
| Compilation errors for `var`/`record` | JDK < 17 | Upgrade JDK or adjust syntax |
| Input parsing failures | Incorrect format | Match problem-specific input layout |
| `OutOfMemoryError` | Large input size | Increase heap: `java -Xmx2g ...` |

For unresolved issues, open a GitHub [issue](https://github.com/kaihere14/DSA-/issues) or join [Discussions](https://github.com/kaihere14/DSA-/discussions).  

---

## Roadmap  

- [x] Standardize documentation for all solutions  
- [ ] Add JUnit 5 test suite  
- [ ] Provide Maven/Gradle wrapper for IDE integration  
- [ ] Include Python/C++ equivalents for multi-language reference  
- [ ] Implement CI for automated compilation and testing  

---

## License & Credits  

**License:** [MIT License](LICENSE)  
**Author:** Kai Here ([@kaihere14](https://github.com/kaihere14))  
**Contributors:** [View on GitHub](https://github.com/kaihere14/DSA-/graphs/contributors)  

**Acknowledgments:**  
- LeetCode for problem statements and test cases  
- Open-source DSA repositories for inspiration  

---

*Happy coding! 🚀*