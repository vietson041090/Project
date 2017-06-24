package com.ol.model.dao;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2014-05-16T16:32:57.925+0700")
public class EmpHistoryDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements com.ol.model.dao.EmpHistoryDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.ol.model.dao.EmpHistoryDao.class, "insertWithSql", com.ol.model.entity.EmpHistory.class);

    /** */
    public EmpHistoryDaoImpl() {
        super(new com.ol.model.db.DBConfig());
    }

    /**
     * @param connection the connection
     */
    public EmpHistoryDaoImpl(java.sql.Connection connection) {
        super(new com.ol.model.db.DBConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public EmpHistoryDaoImpl(javax.sql.DataSource dataSource) {
        super(new com.ol.model.db.DBConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected EmpHistoryDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected EmpHistoryDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected EmpHistoryDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public int insertWithSql(com.ol.model.entity.EmpHistory empHis) {
        entering("com.ol.model.dao.EmpHistoryDaoImpl", "insertWithSql", empHis);
        try {
            if (empHis == null) {
                throw new org.seasar.doma.DomaNullPointerException("empHis");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileInsertQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileInsertQuery();
            __query.setMethod(__method0);
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/EmpHistoryDao/insertWithSql.sql");
            __query.addParameter("empHis", com.ol.model.entity.EmpHistory.class, empHis);
            __query.setCallerClassName("com.ol.model.dao.EmpHistoryDaoImpl");
            __query.setCallerMethodName("insertWithSql");
            __query.setQueryTimeout(-1);
            __query.setEntityAndEntityType("empHis", empHis, com.ol.model.entity._EmpHistory.getSingletonInternal());
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.EmpHistoryDaoImpl", "insertWithSql", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.EmpHistoryDaoImpl", "insertWithSql", __e);
            throw __e;
        }
    }

}
