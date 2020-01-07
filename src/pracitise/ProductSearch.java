package pracitise;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ProductSearch {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		JOptionPane j = new JOptionPane();
		System.out.println("상품의 갯수를 입력하세요.");
		
		ProductSearchData product = new ProductSearchData(sc.nextInt(), sc, j);
		
		String goods = JOptionPane.showInputDialog("검색할 상품명을 입력하세요.");
		String proInfo = product.search(goods);
		try {
			proInfo.length();
			JOptionPane.showMessageDialog(null,proInfo);
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "해당 상품이 없습니다.");
		} //try ~ catch end
		sc.close();
		
	}


}
