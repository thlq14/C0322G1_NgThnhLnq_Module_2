package _bai_tap_tong_hop.views;

import _bai_tap_tong_hop.controllers.ArrayListPersonController;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayListPersonController.displayMenu();
    }
}
/*
 * iii. Suy nghĩ xem vì sao ArrayList không cần khởi tạo 1000 phần tử trước?
 *
 * iv. Nếu công ty có 1001 nhân viên thì có vấn đề gì không?
 *
 * v. Nêu ưu và nhược điểm của ArrayList so với Array.
 * Ưđ: Kthc có thể thay đổi. Cung cấp nhiều method để thao tác
 * Nđ: Chỉ có thể lưu trữ kdl đối tượg (cơ chế auto boxing để chuyển kdl ng thuỷ -> kdl đối tượng sd wrapper class).
 */
