/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import data.MyToys;
import org.junit.Test;
import static org.junit.Assert.*;
import static data.MyToys.*;
/**
 *
 * @author DELL
 */
public class MyToysTest {
    //chỗ này dùng để test các hàm ta viết, để đảm bả chất lượng
    //mỗi hàm ta test ta phải chuẩn bị trước data, giá trị kì vọng và chạy thử
    //và xem kết quả xử lí và phải so sánh có đúng kì vọng hay không
    //nếu không đùn kì vọng thì sai ở data mẫu hay sai ở code
    //Ví dụ: tui muốn kiểm tra 5! có trả về 120 hay không khi chạy hàm -> 1 test case
    //1 tình huống test
    //login: case 1-> đúng username và pass
    //case2 -> đúng username và sai pass -> chửi, ắt quên mẹ pass 
    
    //tình huống hàm cF chạy đúng, bản chất mỗi case là 1 hàm
    @Test//biến hàm bất kì đi kèm JUnit thành public static void main()
    public void testSuccessfulCases() {
        assertEquals(1, cF(0)); //hàm so sánh và in ra màu xanh khớp, đỏ nếu không khớp
                                //thay vì luận bằng mắt
        assertEquals(2, cF(2)); 
        assertEquals(6, cF(3)); 
        assertEquals(24, cF(4)); 
        assertEquals(120, cF(5)); 
        assertEquals(720, cF(6)); 
    }
    //ngoại lệ ko là value để so sánh
    //nó là bất thường nào đó xảy ra, ko ước lượng được chính xác nó là giá trị gì
    //do đó ko thể so sánh cái khác, ko xài assertX() được
    @Test(expected = IllegalArgumentException.class)
    public void testExceptionCases() {
        cF(-5);
        cF(-6);
    }
    
}
//Ant chỉ quan tâm code không sai cú pháp không thiếu thư viện , bố ra, .jar, .war, .apk,..
//lỗi logic vẫn còn ko check được, cụ thể bài này đang đỏ nè
//hãy dạy cho Ant biết cách: code ko sai cú pháp, ko thiếu thư viện import , màu xanh
//của JUnit mới được ra .jar
//Ant ko thông minh, chỉ biết làm theo những gì nó được chỉ để làm ở trong file build.xml
//và file build-impl.xml

//độ file này 1 chút, độ dòng 1005Netbeans8, 1204Netbeans11

//Giống má khi đi làm dặn mình trong giấy : 4h rửa nồi , vo gạo ,... 
//điện, ấn nút Cook