# 剑指 Offer 一书题集

最近在看《剑指 Offer》，这里使用 **Java** 解决书中的题目。

## 题目

### 面试题 1：赋值运算符函数

如下为类型 CMString 的声明，请为该类型添加赋值运算符函数。

```c++
class CMString
{
  public:
    CMString(char* pData = Null);
    CMString(const CMString& str);
    ~CMString(void);
  private:
    char* m_pData;
}
```

解答：无

### 面试题 2：实现 Singleton 模式

设计一个类，我们只能生成该类的一个实例。

解答：[代码地址]()

**注意：**使用双重检验锁的方式有很多需要注意的细节，为什么是双重检验，为什么使用 volatile 关键字，详情见[参考文章](#参考文章)第一篇。

### 面试题 3：二维数组的查找

在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。

解答：[代码地址]()

### 面试题 4：替换空格

请实现一个函数，把字符串中的每个空格替换成 ”%20“。例如输入 ”We are happy.“，则输出 ”We%20are%20happy.”。

解答：[代码地址]()

### 面试题 5：从尾到头打印链表

输入一个链表的头节点，从尾到头反过来打印出每个节点的值。

解答：[代码地址]()

### 面试题 6：重建二叉树

输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。例如输入前序遍历序列 {1, 2, 4, 7, 3, 5, 6, 8} 和中序遍历序列 {4, 7, 2, 1, 5, 3, 8, 6}，则重建出二叉树并输出它的头节点。二叉树结点的定义如下：

```
struct BinaryTreeNode
{
    int m_nValue;
    BinaryTreeNode m_pLeft;
    BinaryTreeNode m_pRight;
};
```

解答：[代码地址]()

### 面试题 7：用两个栈实现队列

用两个栈实现一个队列。请实现它的两个函数 appendTail 和 deleteHead，分别完成在队列尾部插入结点和在队列头部删除结点的功能。

解答：[代码地址]()

### 面试题 8：旋转数组的最小数字

把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如数组 {3, 4, 5, 1, 2} 为数组 {1, 2, 3, 4, 5} 的一个旋转，该数组的最小为 1。

解答：[代码地址]()

### 面试题 9：斐波那契数列

写一个函数，输入 n，求斐波那契（Fibonacci）数列的第 n 项。斐波那契数列的定义如下：

```
F[0] = 0               (n =  0)
F[1] = 1               (n =  1)
F[n] = F[n-1]+ F[n-2]  (n => 2)
```

解答：[代码地址]()

## 参考文章

1. [如何正确地写出单例模式](http://wuchong.me/blog/2014/08/28/how-to-correctly-write-singleton-pattern/)