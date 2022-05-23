package _Extra_Exercises._company_management.views;

import _Extra_Exercises._company_management.controllers.ArrayListPersonController;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayListPersonController.displayMenu();
    }
}
/*
 * iii. Suy nghĩ xem vì sao ArrayList không cần khởi tạo 1000 phần tử trước?
 * ArrayList sẽ copy mảng cũ và tự động tặng kích thước mảng lên theo số lượng phần tử được add vào (* 1.5)
 * trong trường hợp mảng cũ đã có đầy phần tử
 *
 * iv. Nếu công ty có 1001 nhân viên thì có vấn đề gì không?
 * Không có vấn đề
 *
 * v. Nêu ưu và nhược điểm của ArrayList so với Array.
 * Ưđ: Kthc có thể thay đổi. Cung cấp nhiều method để thao tác
 * Nđ: Chỉ có thể lưu trữ kdl đối tượg (cơ chế auto boxing để chuyển kdl ng thuỷ -> kdl đối tượng sd wrapper class).
 */
