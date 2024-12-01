package dao;

import java.util.List;

import entity.CardApplication;

public interface CardApplicationDao {
	//create
	void add(CardApplication c);
	
	//read
	List<CardApplication> selectAll();
	List<CardApplication> selectBy(int id);
	List<CardApplication> selectCardApplication(String number,String indentitycard);
	List<CardApplication> selectbyNumber(String number);
	
	//update
	void update(CardApplication c);
	
	//delete
	void delete(CardApplication c);

}
