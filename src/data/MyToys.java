/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author DELL
 */
public class MyToys {
    //class này chứa hàm tiện ích xài chung cho mọi dự án
    //nó sẽ là static
    //cF: compute Factorial 1.2.3.4...n
    //n! bùng nổ value nhanh lắm , nên xài long cho kết quả
    //dành cho CI?Continuous Integration, đệ quy rescursion
    public static long cF(int n) {
        if(n < 0 || n > 15)
            throw new IllegalArgumentException("n must be between 0 and 15...");
        if(n == 0)
            return 1;
        long product = 1; //biến nhân dồn, biến tích lũy
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
