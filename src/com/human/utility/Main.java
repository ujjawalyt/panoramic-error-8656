package com.human.utility;

import java.sql.Connection;

public class Main {

	public static void main(String[] args) {
		
		DbUtil db = new DbUtil();
	Connection con = 	db.provideConnection();
	System.out.println(con);

	}

}
