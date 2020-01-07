package pracitise;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ProductSearchData {
	private String[][] proTable;
	String proInfo = null;
	
	public ProductSearchData() {
		proTable = new String[][] {{"세탁기" , "드럼 세탁기 최신형"},
									{"냉장고" , "지펠 냉장고 최신형"},
									{"TV" , "HDTV 150인치 최신형"}};
	}

	
	public ProductSearchData(int num, Scanner sc, JOptionPane j) {
		setProTable(num);
		for(int i = 0; i < proTable.length; i++) {
			for(int n = 0; n < proTable[i].length; n++) {
				if(n == 0) {
					System.out.print("상품명 : ");
					proTable[i][0] = sc.next();
				} else if(n == 1) {
					System.out.print("상품 정보 : ");
					proTable[i][1] = sc.next();
				}
			}
		}
	}

	public String[][] getProTable() {
		return proTable;
	}
	public void setProTable(int num) {
		this.proTable = new String[num][2];
	}
	
	public String search(String goods) {
		for(int i = 0; i < proTable.length; i++) {
			if(goods.equalsIgnoreCase(proTable[i][0])) {
				proInfo = proTable[i][1];
			}
		}
		return proInfo;
		
	}
}
	

