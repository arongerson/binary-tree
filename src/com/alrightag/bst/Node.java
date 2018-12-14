package com.alrightag.bst;

public class Node<T> {

  private T key;
  private Node<T> left;
  private Node<T> right;

  public Node() {
    this(null);
  }

  public Node(T key) {
    this.key = key;
  }

  public T getKey() {
    return T;
  }

  public void setKey(T key) {
    this.key = key;
  }

  public getLeft() {
    return left;
  }

  public setLeft(Node<T> left) {
    this.left = left;
  }

  public getRight() {
    return right;
  }

  public setRight(Node<T> right) {
    this.right = right;
  }

}
