package com.iu.main;

import com.iu.himart.Client;
import com.iu.himart.Computer;
import com.iu.himart.Smartpon;
import com.iu.himart.Tv;

public class Main {

	public static void main(String[] args) {
			Computer cp = new Computer();
			Smartpon st = new Smartpon();
			Tv tv = new Tv();
			
			cp.info();
			System.out.println("=====================================");
			st.info();
			System.out.println("=====================================");
			tv.info();
			
			Client client = new Client();
			client.buy(cp);
			
	}
}

