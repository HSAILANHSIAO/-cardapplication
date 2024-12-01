package dao.Impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import dao.CardApplicationDao;
import dao.DbConnection;
import entity.CardApplication;

public class CardApplicationDaoImpl implements CardApplicationDao{

	@Override
	public void add(CardApplication c) {
		Session se=DbConnection.getDb();
		Transaction t=se.beginTransaction();
		se.save(c);
		t.commit();
		
	}

	@Override
	public List<CardApplication> selectAll() {
		Session se=DbConnection.getDb();
		String SQL="select * from cardapplication";
		NativeQuery q=se.createNativeQuery(SQL,CardApplication.class);
		return q.list();
	}

	@Override
	public List<CardApplication> selectBy(int id) {
		Session se=DbConnection.getDb();
		String SQl="select * from CardApplication where id=?1";
		NativeQuery q=se.createNativeQuery(SQl,CardApplication.class);
		q.setParameter(1, id);
		
		return q.list();
	}

	@Override
	public List<CardApplication> selectCardApplication(String number, String indentitycard) {
		Session se=DbConnection.getDb();
		String SQL="select * from CardApplication where number=?1 and indentitycard=?2";
		NativeQuery q=se.createNativeQuery(SQL,CardApplication.class);
		q.setParameter(1,number);
		q.setParameter(2,indentitycard);
		
		return q.list();
	}

	@Override
	public List<CardApplication> selectbyNumber(String number) {
		Session se=DbConnection.getDb();
		String SQL="select * from CardApplication where number=?1";
		NativeQuery q=se.createNativeQuery(SQL,CardApplication.class);
		q.setParameter(1, number);
		return q.list();
	
	}

	@Override
	public void update(CardApplication c) {
		 Session se=DbConnection.getDb() ;
		 Transaction t=se.beginTransaction();
		se.update(c);
		 t.commit();
	}

	@Override
	public void delete(CardApplication c) {
		Session se=DbConnection.getDb();
		Transaction t=se.beginTransaction();
		se.delete(c);
		t.commit();// TODO Auto-generated method stub
		
	}

}
