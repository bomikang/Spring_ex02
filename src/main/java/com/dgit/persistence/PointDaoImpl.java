package com.dgit.persistence;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PointDaoImpl implements PointDao{
	@Autowired
	private SqlSession session;
	
	private static String namespace = "com.dgit.mapper.PointMapper";

	@Override
	public void updatePoint(String uid, int point) throws Exception {
		Map<String, Object> map = new HashMap<>();
		map.put("uid", uid);
		map.put("point", point);
		
		session.update(namespace + ".updatePoint", map);
	}

}
