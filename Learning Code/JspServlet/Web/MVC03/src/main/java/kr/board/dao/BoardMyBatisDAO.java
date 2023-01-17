package kr.board.dao;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

// MyBatis : Java<--->SQL - 분리개발
// - 성능개선(프로그램의 처리 속도 개선) : Connection POOL 기법
public class BoardMyBatisDAO {
	private static SqlSessionFactory sqlSessionFactory;
	// 1. database연결 -> config.xml과 MyBatis API를 연결
	// 초기화 블럭
	static {
		try {
			String resource = "kr/board/dao/config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	// 전체 리스트 가져오기
	public List<BoardVO> allList() {
		SqlSession session = sqlSessionFactory.openSession();
		// select * from board order by idx desc
		List<BoardVO> list = session.selectList("allList");
		session.close(); // 반납
		return list;
	}
	public void boardInsert(BoardVO vo) {
		SqlSession session = sqlSessionFactory.openSession();
		session.insert("boardInsert", vo);
		session.commit(); //
		session.close();
	}
	public BoardVO getByIdx(int idx) {
		SqlSession session = sqlSessionFactory.openSession();
		BoardVO vo = session.selectOne("getByIdx", idx);
		session.close();
		return vo;
	}
	public void countUpdate(int idx) {
		SqlSession session = sqlSessionFactory.openSession();
		session.update("countUpdate", idx);
		session.commit();
		session.close();
	}
	public void boardDelete(int idx) {
		SqlSession session = sqlSessionFactory.openSession();
		session.delete("boardDelete", idx);
		session.commit();
		session.close();
	}
	public void boardUpdate(BoardVO vo) {
		SqlSession session = sqlSessionFactory.openSession();
		session.update("boardUpdate", vo);
		session.commit();
		session.close();
	}
	
}
