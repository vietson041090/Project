package com.ol.model.db;

import javax.sql.*;

import org.seasar.doma.jdbc.DomaAbstractConfig;
import org.seasar.doma.jdbc.SimpleDataSource;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.dialect.Mssql2008Dialect;
import org.seasar.doma.jdbc.tx.LocalTransaction;
import org.seasar.doma.jdbc.tx.LocalTransactionalDataSource;

public class DBConfig extends DomaAbstractConfig{

	protected static final LocalTransactionalDataSource dataSource = createDataSource();
	protected static final Dialect dialect = new Mssql2008Dialect();
	
	protected static final String DB_CONNECTION_STRING = "jdbc:sqlserver://192.168.0.18:1433;database=LOS";
	protected static final String DB_CONNECTION_USER = "training2014";
	protected static final String DB_CONNECTION_PASSWORD = "Zaq12wsx";
	
	@Override
	public DataSource getDataSource() {
		// TODO Auto-generated method stub
		return dataSource;
	}
	

	@Override
	public Dialect getDialect() {
		// TODO Auto-generated method stub
		return dialect;
	}

	private static LocalTransactionalDataSource createDataSource() {
		// TODO Auto-generated method stub
		SimpleDataSource simpleDataSource = new SimpleDataSource();
		simpleDataSource.setUrl(DB_CONNECTION_STRING);
		simpleDataSource.setUser(DB_CONNECTION_USER);
		simpleDataSource.setPassword(DB_CONNECTION_PASSWORD);
		
		return new LocalTransactionalDataSource(simpleDataSource);
	}

	
	public static LocalTransaction getLocalTransaction(){
		return dataSource.getLocalTransaction(defaultJdbcLogger);
	}
}
