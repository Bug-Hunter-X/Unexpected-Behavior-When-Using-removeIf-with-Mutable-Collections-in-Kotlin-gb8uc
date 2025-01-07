# Unexpected Behavior When Using removeIf with Mutable Collections in Kotlin

This repository demonstrates a subtle bug that can occur when using the `removeIf` function with mutable collections (like `MutableList` or `MutableMap`) in Kotlin.  Modifying the collection during iteration can lead to unexpected results, skipping elements or throwing exceptions.

The `bug.kt` file shows the erroneous code and its output, while `bugSolution.kt` provides a corrected version and explanation.

**Problem:**
The `removeIf` function iterates through the collection, removing elements based on the provided predicate.  If an element is removed and the underlying collection is modified during the iteration, the iterator can become inconsistent, leading to elements being skipped or the iterator becoming invalid, ultimately causing exceptions in some cases.