# 排序算法

## O(n^2)

### 冒泡排序
- 只操作相邻的两个数据，每次排序会让至少1个元素移动到它应该在的位置；
- 重复N次，完成N个数据的排序工作；

### 插入排序
- 将数组分成已排序区和未排序区
- 初始状态已排序区间只有一个元素，数组第一个元素
- 核心思想就是取未排序区的元素，通过一个一个对比在**已排序区**中找到合适的位置插入，并且保证已排序区的有序
- 重复上述流程直到未排序区中的元素为空；

### 选择排序
- 和上述类似，将数组分成已排序区和未排序区
- 核心思想是选择，每次都是选择未排序区最小的元素，放在已排序区的末尾，已排序区初始没有元素；

## O(nlogn)

## O(n)