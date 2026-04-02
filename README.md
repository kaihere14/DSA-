
# 📚 DSA‑ Java Solutions  
**A curated collection of Java implementations for classic Data Structures & Algorithms (DSA) problems, primarily from LeetCode.**  

[![License](https://img.shields.io/github/license/kaihere14/DSA-)](LICENSE)  
[![Java 17](https://img.shields.io/badge/Java-17%20%7C%20OpenJDK-blue)](https://openjdk.org/projects/jdk/17/)  
[![GitHub stars](https://img.shields.io/github/stars/kaihere14/DSA-?style=social)](https://github.com/kaihere14/DSA-/stargazers)  
[![GitHub forks](https://img.shields.io/github/forks/kaihere14/DSA-?style=social)](https://github.com/kaihere14/DSA-/network)  


---  

## Overview  

`DSA-` is a **self‑contained, language‑agnostic reference** for anyone preparing for technical interviews or brushing up on algorithmic thinking.  
- **What it does** – Provides clean, well‑documented Java solutions for > 80 LeetCode problems ranging from *Array Search* to *Dynamic Programming*, now including the Hard‑level *Split Array Largest Sum* (LeetCode 410).  
- **Why it matters** – All solutions follow a consistent style, include time/space complexity analysis, and are ready to run out‑of‑the‑box.  
- **Target audience** – Students, interview candidates, and developers who want a quick, searchable repository of algorithmic patterns in Java.  

Current version: **v1.0.0** (2024‑09‑15)  

---  

## Features  

| Category | Problems (sample) | Status |
|----------|-------------------|--------|
| **Array & Hashing** | Two Sum, 3Sum, Contains Duplicate, Majority Element, Valid Anagram, **Remove Element** | ✅ Stable |
| **Two‑Pointer / Sliding Window** | 4Sum, Rotate Array, Trapping Rain Water, Move Zeroes | ✅ Stable |
| **Binary Search** | Search in Rotated Sorted Array, Find Minimum in Rotated Sorted Array, Binary Search (LeetCode 704), **Median of Two Sorted Arrays** | ✅ Stable |
| **Sorting & Selection** | Kth Largest Element, Sort Colors (0‑1‑2), Sort an Array, Kth Smallest | ✅ Stable |
| **Dynamic Programming** | Maximum Subarray (Kadane), Subarray Sum Equals K, Longest Consecutive Sequence | ✅ Stable |
| **Matrix & Geometry** | Rotate Image, Transpose Matrix, Spiral Matrix, Matrix Diagonal Sum | ✅ Stable |
| **String Manipulation** | Palindrome Number, Longest Palindromic Substring, Find First Occurrence | ✅ Stable |
| **Miscellaneous** | Missing Number, Set Matrix Zeroes, Power of Two, Odd/Even checks | ✅ Stable |

**Additional note:**  
- **Median of Two Sorted Arrays (LeetCode 4)** – Implemented with a linear‑time merge approach (O(m + n) time, O(m + n) space). Measured runtime **7 ms** (≈ 25.57 % faster than the average Java submission) and memory usage **49.3 MB** (≈ 14.73 % lower than average).  

*All solutions are accompanied by a short README in each problem folder that explains the approach, complexity, and usage.*  

---  

## Tech Stack  

| Component | Description |
|-----------|-------------|
| **Language** | Java 17 (compatible with Java 8+) |
| **Build / Run** | Plain `javac`/`java` (no external build tool required) – optional Maven/Gradle wrapper for IDE integration |
| **Testing** | JUnit 5 (tests can be added by contributors) |
| **IDE Recommendations** | IntelliJ IDEA, VS Code with Java extensions, Eclipse |
| **Version Control** | Git (GitHub) |
| **CI (optional)** | GitHub Actions – can be extended to run static analysis or unit tests |

---  

## Repository Architecture  

```
DSA-
├── 1-two-sum/
│   ├── README.md                # problem description + solution notes
│   └── two-sum.java             # Java implementation
├── 15-3sum/
│   ├── 3sum.java
│   └── README.md
├── 4-median-of-two-sorted-arrays/
│   ├── README.md                # problem description, approach, complexity, usage
│   └── median-of-two-sorted-arrays.java
├── 27-remove-element/
│   ├── README.md                # problem description & solution notes
│   └── remove-element.java
├── 121-best-time-to-buy-and-sell-stock/
│   └── ...
├── Difficulty: Basic/
│   ├── Array Search/
│   │   ├── array-search.java
│   │   └── README.md
│   └── ...
├── Difficulty: Easy/
│   └── ...
├── Difficulty: Medium/
│   └── ...
└── README.md                    # THIS FILE
```

*Each problem folder contains:*  

1. **`README.md`** – concise description, algorithmic approach, time/space complexity, and a usage snippet.  
2. **`*.java`** – a single public class with a `public static void main(String[] args)` entry point (or a static method that can be called from a driver).  

---  

## Getting Started  

### Prerequisites  

| Tool | Minimum version |
|------|-----------------|
| **JDK** | 17 (or 8+ if you modify the code) |
| **Git** | any recent version |
| **IDE (optional)** | IntelliJ IDEA 2022+, VS Code, Eclipse |

### Installation  

```bash
# 1️⃣ Clone the repository
git clone https://github.com/kaihere14/DSA-.git
cd DSA-

# 2️⃣ Compile a single solution (example: Two Sum)
javac 1-two-sum/two-sum.java

# 3️⃣ Run it (the program reads from STDIN)
java -cp 1-two-sum TwoSum
```

> **Tip:** All Java files are self‑contained; you can compile any folder independently.

### Using Maven (optional)  

If you prefer Maven for IDE auto‑completion:

```bash
# Create a temporary pom.xml (only needed once)
mvn -N archetype:generate -DgroupId=com.dsa -DartifactId=DSA -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
# Move source files into src/main/java/com/dsa/ (or adjust the package statements)
```

---  

## 🚀 Usage

### Running a solution from the command line

All solution classes expose a `main` method that expects input via **standard input** (`System.in`).  
Typical format: space‑separated integers, one line per array, followed by any additional parameters.  

bash
java -cp target/classes com.dsa.<ProblemClass> < input.txt


### Example: Find a Peak Element II

**Input** (as it would appear on STDIN):

text
2 2
1 4
3 2


**Output** (STDOUT):

text
[0, 1]


The first line contains the matrix dimensions (rows and columns), followed by the matrix elements. The program outputs the coordinates `[i, j]` of a peak element that is strictly greater than its adjacent neighbors. Some problems may also include a `Notes.md` file containing metadata such as time taken to solve.
# Example: Remove Element (LeetCode 27)

**Problem statement**: Remove all instances of a given value `val` in‑place and return the new length of the array.

**Input format** (STDIN):

[0,1,2,2,3,0,4,2]
2

**Output** (STDOUT):

5


The first line is the array, the second line is the value to remove. After execution the first `5` elements of the array are the remaining values (order may change).
# Input format:
#   n               -> size of the array
#   nums[0] nums[1] ... nums[n‑1]   -> array elements
#   val             -> value to remove
# Example input:
#   8
#   0 1 2 2 3 0 4 2
#   2
java -cp 27-remove-element Solution < input.txt
```

### Sample code snippet (from `27-remove-element/remove-element.java`)

```java
import java.io.*;
import java.util.*;

class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // read array size
        int n = Integer.parseInt(br.readLine().trim());

        // read the array elements
        int[] nums = Arrays.stream(br.readLine().trim().split("\\s+"))
                           .mapToInt(Integer::parseInt)
                           .toArray();

        // read the value to remove
        int val = Integer.parseInt(br.readLine().trim());

        int k = removeElement(nums, val);
        System.out.println(k);

        // optional: print the first k elements after removal
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + (i + 1 == k ? "\n" : " "));
        }
    }

    /**
     * Removes all occurrences of {@code val} from {@code nums} in‑place.
     * Returns the new length {@code k}. The first {@code k} elements of {@code nums}
     * contain the result.
     *
     * This implementation follows the original repository version that
     * uses an auxiliary array for clarity (O(n) extra space). It runs in
     * O(n) time and was measured at **0 ms** runtime and **43.6 MB** memory
     * on LeetCode's judge.
     *
     * @param nums input array
     * @param val  value to be removed
     * @return new length after removal
     */
    public static int removeElement(int[] nums, int val) {
        int[] ans = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                ans[count++] = nums[i];
            }
        }
        // copy back the filtered elements
        for (int i = 0; i < ans.length; i++) {
            nums[i] = ans[i];
        }
        return count;
    }
}
```

> **All other solutions follow a similar pattern** – read input, invoke the algorithmic method, and print the result.

### Running from an IDE  

1. Open the desired folder as a **Project**.  
2. Ensure the JDK is set to version 17 (or your preferred version).  
3. Right‑click the class containing `main` → **Run**.  

---  

## Development  

### Setting up a local development environment  

```bash
# Fork the repo on GitHub, then clone your fork
git clone https://github.com/<your‑username>/DSA-.git
cd DSA-
```

*No additional dependencies are required.*  

### Running tests (if you add them)  

```bash
# Example with Maven Surefire
mvn test
```

### Code style  

- **Formatting** – Follow the Google Java Style Guide (or use `google-java-format`).  
- **Naming** – Classes are PascalCase, methods camelCase, constants UPPER_SNAKE.  
- **Documentation** – Javadoc for public methods; each solution README must contain: problem link, approach summary, complexity, and sample I/O.  

### Debugging tips  

- Use `System.out.println` for quick checks.  
- For large inputs, increase the JVM heap: `java -Xmx2g ...`.  

---  

## Deployment  

The repository is **source‑only**; there is no runtime service to deploy.  
If you wish to package a solution as a JAR:

```bash
javac -d out 27-remove-element/remove-element.java
jar cf remove-element.jar -C out .
java -jar remove-element.jar < input.txt
```

---  

## Contributing  

We welcome contributions! 🎉  

1. **Fork** the repository.  
2. **Create a branch** for your feature or fix: `git checkout -b feat/awesome-algorithm`.  
3. **Add a new problem** (or improve an existing one):  
   - Create a folder named `<leetcode-id>-<slug>/`.  
   - Add a `README.md` that follows the existing template (problem description, link, approach, complexity, usage).  
   - Add a single public class with a `main` method (or a static method that can be called from a driver).  
4. **Run** `javac` to ensure the code compiles.  
5. **Commit** with a clear message, e.g., `feat: add solution for 146 LRU Cache`.  
6. **Push** and open a **Pull Request**.  

### Pull‑request checklist  

- [ ] Code compiles with `javac`.  
- [ ] README for the new problem follows the repository style.  
- [ ] No existing files are unintentionally modified.  
- [ ] License header (if you add new files) matches the project’s MIT license.  

---  

## Troubleshooting  

| Symptom | Likely cause | Fix |
|---------|--------------|-----|
| `java.lang.NoClassDefFoundError` | Classpath not set correctly | Run `java -cp <folder> <ClassName>` or use `-classpath .` |
| Compilation errors about `var` or `record` | Using JDK 8 or older | Upgrade to JDK 17 (or adjust code to older syntax) |
| Input parsing fails | Input format does not match the expected layout | Follow the sample input in each problem’s README |
| `OutOfMemoryError` for large arrays | Default heap too small | Launch with `java -Xmx2g …` |

For further help, open an **Issue** on GitHub or join the Discussions tab.

---  

## Roadmap  

- **Add unit‑test suite** for all solutions (JUnit 5).  
- **Provide Maven/Gradle wrapper** for easier IDE imports.  
- **Include Python & C++ equivalents** for multi‑language reference.  
- **Automated CI** that compiles every solution on push.  

---  

## License & Credits  

**License:** MIT License – see the [LICENSE](LICENSE) file.  

**Author:** Kai Here ([@kaihere14](https://github.com/kaihere14))  

**Contributors:**  
- List of contributors is automatically generated by GitHub.  

**Acknowledgments:**  
- Thanks to the LeetCode community for problem statements and test cases.  
- Inspired by various open‑source algorithm repositories.  

---  

*Happy coding! 🚀*
