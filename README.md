# Kotlin MutableList removeIf() Iteration Bug
This repository demonstrates a common error when using the `removeIf()` function on a mutable list in Kotlin.  Modifying the list while iterating can lead to unexpected results because the indices of the elements shift.

The `bug.kt` file contains the buggy code, and `bugSolution.kt` shows the corrected version.

## Problem
The original code attempts to remove even numbers from a list, but because `removeIf` modifies the list in place while the iteration is happening, some elements might be skipped, leading to incorrect results.

## Solution
The solution iterates through a copy of the list, or uses a different approach that doesn't modify the list during iteration.