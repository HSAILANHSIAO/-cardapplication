package service;

import entity.CardApplication;

public interface CardApplicationService {
		//create
		void addCard(CardApplication c);
		
		//read
		CardApplication Login(String number,String indentitycard);
		boolean findByNumber(String number);
}
