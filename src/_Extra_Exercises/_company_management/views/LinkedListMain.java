package _Extra_Exercises._company_management.views;

import _Extra_Exercises._company_management.controllers.LinkedListPersonController;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedListPersonController.displayMenu();
    }
}
/*
 * ii. Có nên dùng vòng lặp truyền thống (for i = 0 -> size() – 1 => get(i)) để duyệt qua từng phần tử có trong LinkedList hay không? Lý do?
 * K nên dùng..
 * Vì vòg lặp truyền thống duyệt các phần tử ở vị trí kế tiếp nhau..còn LinkedList thì các ptử ở các node có vị trí k xác định..
 *
 * iii. Giả sử công ty ABC thay đổi nhân sự liên tục (xóa và thêm nhân viên) thì nên sử dụng ArrayList hay LinkedList? Lý do?
 * Sd LinkedList cho việc thêm, xoá sẽ nhanh hơn so với ArrayList
 *
 * iv. Ưu và nhược điểm của ArrayList và LinkedList.
 * ArrayList: Ưu : Ctrúc lưu trữ dạng mảng độg.
 *                 Truy xuất ptử nhanh, chèn xoá chậm hơn
 *                 => dùng cho ds ít thay đổi, thg xuyên tìm kiếm.
 *            Nđ : Ds lk đôi.
 *                 Truy xuất ptử chậm hơn.
 *                 Chèn, xoá nhanh hơn.
 *                 => dùg cho ds thg xuyên thay đổi.
 */
