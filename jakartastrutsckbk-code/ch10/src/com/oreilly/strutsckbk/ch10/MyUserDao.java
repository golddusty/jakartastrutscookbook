package com.oreilly.strutsckbk.ch10;

import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class MyUserDao {

    private static final SqlMapClient sqlMapClient;
    
    static {
        try {
            Reader reader = Resources.getResourceAsReader("sqlMapConfig.xml");
            sqlMapClient = SqlMapClientBuilder.buildSqlMapClient(reader);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Unable to create iBATIS sql map client.", e);
        }
    }

	public List getAllUsers() throws SQLException {
        return sqlMapClient.queryForList("getAllUsers", null);
    }
}
