
# Lab 14: Binary Search Tree Implementation

This project is a Java implementation of a **Binary Search Tree (BST)**. It includes core operations for managing and traversing a BST, with custom exception handling.

## Features

- A `BinaryNode` class to represent nodes in the binary search tree.
- `BinarySearchTree` class for tree operations (insert, remove, find minimum/maximum, etc.).
- Custom exception classes:
  - `DuplicateItemException`: Thrown when attempting to insert duplicate elements.
  - `ItemNotFoundException`: Thrown when removing an element that doesn’t exist.
- A `BinarySearchTreeTest` class for validating the functionality.
- `Lab14BinarySearchTree`: A driver class demonstrating the usage of the BST.

## File Structure

- `BinaryNode.java`: Node representation for the binary tree.
- `BinarySearchTree.java`: Implements the binary search tree operations.
- `BinarySearchTreeTest.java`: Unit tests for BST operations.
- `DuplicateItemException.java`: Handles duplicate item errors.
- `ItemNotFoundException.java`: Handles missing item errors.
- `Lab14BinarySearchTree.java`: Demonstrates BST functionality.

## How to Run

1. **Compile the Project**:
    ```bash
    javac binarySearchTree/*.java
    ```

2. **Run the Main Class**:
    ```bash
    java binarySearchTree.Lab14BinarySearchTree
    ```

3. **Run the Test Class**:
    ```bash
    java binarySearchTree.BinarySearchTreeTest
    ```

## Notes

- This project was developed as part of Lab 14 in a computer science course.
- Designed for educational purposes to demonstrate binary search tree operations.

## License

This project is licensed under the MIT License - see the LICENSE file for details.
