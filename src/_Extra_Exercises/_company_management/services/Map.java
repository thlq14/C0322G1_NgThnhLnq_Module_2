package _Extra_Exercises._company_management.services;

import _Extra_Exercises._company_management.models.CongNhat;
import _Extra_Exercises._company_management.models.NhanVien;
import _Extra_Exercises._company_management.models.QuanLy;
import _Extra_Exercises._company_management.models.SanXuat;

import java.util.LinkedHashMap;
import java.util.Set;

public class Map {
    static java.util.Map<Integer, NhanVien> map = new LinkedHashMap<>();

    static {
        map.put(1, new QuanLy("Văn J", 1995, "Đà Nẵng", 18000, 1.9));
        map.put(2, new CongNhat("Trần W", 1996, "Huế", 27));
        map.put(3, new SanXuat("Phạm Z", 1994, "Quảng Trị", 510));
    }

    public static void main(String[] args) {
        Set<Integer> set = map.keySet();
        for (Integer item : set) {
            if (item != null) {
                System.out.println("Id Nhân viên: " + item + ", " + map.get(item));
            } else {
                if (map.containsKey(item)) {
                }
            }
        }
    }
}
