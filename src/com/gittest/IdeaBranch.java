package com.gittest;

// 有效的山脉数组

import java.time.temporal.ValueRange;

public class IdeaBranch {
    public static void main(String[] args) {
        System.out.println("IdeaBranch分支");

//        int[] array = {1,3,5,7,9,8,6,4,2,0};
        int[] array = null;
        System.out.println("有效的山脉数组?    "+validMountainArray(array));
    }

    public static boolean validMountainArray(int[] A){
        int mid = 0;   // 记录山脉的顶点

        if(A == null){
            return false;
        }

        int len = A.length;   // 数组的长度

        // 山脉的条件1：A.length >= 3
        if(len <3 ){
            return false;
        }

        // 山脉的顶点不能在第一个
        // 山脉的条件2：A[0]<...<A[i-1]<A[i]
        if(A[0]>A[1]){
            return false;
        }

        // 找出顶点的位置
        for(int i=1;i<len-1;i++){
            if(A[i]>A[i+1]){
                mid = i;
                break;
            }
        }

        // 山脉的条件3：A[i]>A[i+1]>...>A[len -1]
        for (int j=mid;j<len-1;j++){
            if(A[j]<=A[j+1]){
                return false;
            }
        }

        // 所有条件都满足了
        return true;
    }
}
