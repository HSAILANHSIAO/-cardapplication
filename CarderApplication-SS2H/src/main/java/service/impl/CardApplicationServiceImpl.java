package service.impl;

import java.util.List;

import dao.Impl.CardApplicationDaoImpl;
import entity.CardApplication;
import service.CardApplicationService;


public  class CardApplicationServiceImpl implements CardApplicationService{
	private static CardApplicationDaoImpl cdi=new CardApplicationDaoImpl();

	@Override
	public void addCard(CardApplication c) {
		cdi.add(c);
		
	}

	@Override
	public CardApplication Login(String number, String indentitycard) {
		List<CardApplication> l=cdi.selectCardApplication(number, indentitycard);
		CardApplication c=null;
		if(l.size()!=0)
		{
			c=l.get(0);
		}
		
		return c;
	}

	@Override
	public boolean findByNumber(String number) {
		List<CardApplication> l=cdi.selectbyNumber(number);
		boolean x=false;
		
		if(l.size()!=0)
		{
			x=true;
		}
		
		return x;
	}
	



		
	}


