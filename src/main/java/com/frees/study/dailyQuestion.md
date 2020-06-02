- set 中可以插入重复的元素，然后不报错吗？
	可以的，以hashSet为例，其内部使用的保存方式为hashMap的key保存，若重复，则会再put一次假值。

- hashCode 与 equals方法？
	主要用于hash表的比较时使用，如：HashSet HashMap;
	比较时，先比较hashCode，再是 equals方法;
	hashCode相同，表示存放的是一个域;
	hashCode 相同，equals不一定相同;
	equals相等，hashCode一定相等

- hashcode的作用？哈希表的作用？
	https://blog.csdn.net/qq_33619378/article/details/92661494
	hashCode的作用：将集合存储空间分成几个域，根据hashCode可以找到对应的域，避免遍历时，逐一遍历，影响性能。
	哈希表的作用：相当于容器，分为多个域，用于存放，更具hashCode找到对应的域，做存取

- 为什么重写equal方法，就要重写hashCode的方法？
	java 协议规定：equals方法判定相等的对象，hashCode必须相等。所以重写的目的是为了保证这个。

