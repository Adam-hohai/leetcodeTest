package hhuc.cenhelm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Solution4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            list.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            list.add(nums2[i]);
        }
        Collections.sort(list);//实际上和array.sort()一样，原理是归并排序
        if (list.size() % 2 == 0) {
            return (float) (list.get(list.size() / 2) + list.get(list.size() / 2 - 1)) / 2;
        } else
            return list.get((int) list.size() / 2);
    }
}
