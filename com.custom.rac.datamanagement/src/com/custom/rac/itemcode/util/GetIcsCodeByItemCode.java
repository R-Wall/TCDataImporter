package com.custom.rac.itemcode.util;

public class GetIcsCodeByItemCode {

	public static String getIcsCode(String itemcode) {
		String icsCode = null;
		String temp = itemcode.substring(0, 6);
		String  prefix = itemcode.substring(0, 8);
		switch (temp) {
		case "121003":		
			icsCode = prefix.substring(0, 3)+prefix.substring(4, 8);
			break;
		case "121005":
			icsCode = prefix.substring(0, 3)+prefix.substring(4, 8);
			break;
		case "121008":
			icsCode = prefix.substring(0, 3)+prefix.substring(4, 8);
			break;
		case "121010":
			icsCode = prefix.substring(0, 3)+prefix.substring(4, 8);
			break;
		case "121018":
			icsCode = prefix.substring(0, 3)+prefix.substring(4, 7);
			break;
		case "121022":
			icsCode = prefix.substring(0, 3)+prefix.substring(4, 7);
			break;
		default:
			icsCode =itemcode.substring(0, 3)+itemcode.substring(4, 6);
			break;
		}
		return icsCode;
	}
	
}
