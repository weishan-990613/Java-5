# Java-5
Java课程作业项目

## 实验目的

1.掌握字符串String及其方法的使用
2.掌握文件的读取/写入方法
3.掌握异常处理结构

## 实验过程

1.通过IO流中的FileInPutStream字节流对文本文件b进行读取；
2.将读取的byte型转为String字符串；
3.再使用String的toCharArray()方法将字符串转成字符数组；
4.在数组中进行循环遍历，用if判断语句加入逗号、句号和换行转义符；
5.使用字符流输出结果。

## 核心方法

1.使用String(byte[] bytes,int offset,int length)构造方法将字节流读入的字节构造成字符串；
2.使用String的tocharArray()方法，将字符串转为字符数组
3.在循环中加入判断语句如果 i 可以整除7不能整除14则加逗号，如果可以整除14且 i 不等于0则加入句号。

## 实验结果

![image](https://github.com/weishan-990613/Java-5/blob/main/%E5%AE%9E%E9%AA%8C%E4%BA%94.PNG)

## 实验感想

通过本次实验，首先，我对IO流的字节流输入输出和字符流输入输出有了进一步的了解，如果文件是文本文件那么字符流比字节流使用更加方便；其次，我基本掌握了String字符串及其方法的使用。
