package com.hoping.middleware.test;


public class ApiTest {

    public static void main(String[] args) {
        getHeight(10, 0, 1, 10);
    }

    public static Integer getHeight(Integer height, Integer totalHeight, Integer num, Integer totalNum) {
        System.out.println("第" + num + "递归调用，当前小球下落高度：" + height + "米，移动总距离：" + totalHeight + "米");
        if (num == totalNum || height == 0) {
            return totalHeight;
        }
        num++;
        totalHeight += height;
        height = height >> 1;
        return getHeight(height, totalHeight, num, totalNum);
    }

}
