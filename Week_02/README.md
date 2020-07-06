# 学习笔记

## 哈希表 HashTable
增删都是的时间复杂度为O(1)，但是如果哈希冲突的极端情况下没时间复杂度退化为链表，时间复杂度为O(n)

## 树 Tree
每个节点有多个子节点的
二叉树：每个节点最多有两个子节点的树。
平均时间复杂度：O(nlogn)

## 堆 Heap
大顶堆、小顶堆，可以被看做一棵完全二叉树的数组对象
时间复杂度： find-max：O(1) delete-max: O(logn) insert(create):O(logn)or(log1)

## 图 Graph
越来越少考察