package pracitise;

import java.util.Scanner;

public class ProductSearchData {
	private String[][] proTable;
	String proInfo = null;
	
	public ProductSearchData(int num, Scanner sc) {
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
	

