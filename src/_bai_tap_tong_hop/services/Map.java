package _bai_tap_tong_hop.services;

import java.util.HashMap;
import java.util.Set;

public class Map {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(159, "Quản Lý");
        hashMap.put(453, "Công Nhật");
        hashMap.put(857, "Sản Xuất");
        Set<Integer> set = hashMap.keySet();
        for (Integer key : set) {
            System.out.println(key + " " + hashMap.get(key));
        }
    }
}
