#### 计划

1. string、stringBuilder、stringBuffer方法了解，包括 包含的方法种类、方法的内部实现
2. 涉及到的类、接口了解，包括其功能、大概的实现方式
3. string、stringBuilder、stringBuffer对比学习，根据其使用的场景分析内部差异

### question

1. local
2. formatter
3. System

### 接口

#### Serializable-序列化

[讲解页面](https://yq.aliyun.com/articles/672181) 

##### 作用

1. 转换为字节流，进行网络传输
2. 本地保存

##### transient

1. 被其修饰的字段不会被序列化
2. 被序列化时，可以使用readObject/writeObject 方法，但是多个被序列化字段，调用时，需顺序进行

##### serialVersionUID 

1. 如果没有，编译时会自动生成（对类进行摘要算法）
2. 序列化、反序列化时比对，若不同则失败。主要控制类版本，建议自己添加。若变化版本，且不想兼容前面的版本，则可以改变此值。

#### Comparable-比较

1. compareTo 

#### CharSequence-char序列

1. 表示一个char值得可读序列，此接口为多种char序列提供的统一的、只读的通道。

### 主要类

#### String 

1. 包含的方法、及其细节的实现？

##### 问题：

1. 129 行ObjectStreamField 是干什么用的？
2. String 的hash是做什么用的？其他构造类并未对其赋值，非必须的？
3. System类、Array类 作用？方法大致了解？
4. Character类的作用？isBmpCodePoint的作用？
   1. 处理字符类
5. ~~编码 ascii、unicode、utf-8、gbk的差异？~~
6. 323