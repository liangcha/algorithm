# 第二周总结

本周事情比较多，所以先优先保证最低限度完成作业，后面看时间充足的话再多刷题

## 回顾
* 作业提交更换了格式，写了自己的思路和原题，方便自己回顾
* 这周的题目做起来比上周顺利了一些，不过也进一步发现了自己在基本功方面的欠缺
* 做题的话现在思路已经有所改变了，会先考虑最小子问题，然后思考怎么去解决，效率有了明显的提高
* 有些基本概念理解的还不够深入：递归，迭代，层序遍历和广度优先，这几个容易混淆


## 递归的四个基本法则
_reference：Data Structures and Algorightm Analysis in C_  
1. Base cases：基本情形，无须递归就可以轻松解出
2. Making progress：不断推进，每次递归调用都能向着base cases推进
3. Design rule：设计法则，假设所以的递归调用都能运行
4. Compound intereset rule：合成效益法则，求解一个问题的同一个实例的时，切勿在不同的递归调用中做重复性工作

对应到超哥讲的递归模板：
* terminator  ->  base cases
* process logic and drill down -> makeing progress
* reverse status：只是处理前面process logic造成的副作用

#### 超哥：不要人肉递归 -> Making rule（设计法则）
Making rule是一条很重要的法则，因为它意味着，当设计递归调用的程序的时候一般没有必要知道数据保存的细节，也不需要跟踪大量的递归调用。
