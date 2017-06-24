package com.ol.model.dao;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2014-05-21T11:27:53.152+0700")
public class LoaHistoryDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements com.ol.model.dao.LoaHistoryDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.ol.model.dao.LoaHistoryDao.class, "insertLoaHistory", com.ol.model.entity.LoaHistory.class);

    /** */
    public LoaHistoryDaoImpl() {
        super(new com.ol.model.db.DBConfig());
    }

    /**
     * @param connection the connection
     */
    public LoaHistoryDaoImpl(java.sql.Connection connection) {
        super(new com.ol.model.db.DBConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public LoaHistoryDaoImpl(javax.sql.DataSource dataSource) {
        super(new com.ol.model.db.DBConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected LoaHistoryDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected LoaHistoryDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected LoaHistoryDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public int insertLoaHistory(com.ol.model.entity.LoaHistory loaHistory) {
        entering("com.ol.model.dao.LoaHistoryDaoImpl", "insertLoaHistory", loaHistory);
        try {
            if (loaHistory == null) {
                throw new org.seasar.doma.DomaNullPointerException("loaHistory");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileInsertQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileInsertQuery();
            __query.setMethod(__method0);
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/LoaHistoryDao/insertLoaHistory.sql");
            __query.addParameter("loaHistory", com.ol.model.entity.LoaHistory.class, loaHistory);
            __query.setCallerClassName("com.ol.model.dao.LoaHistoryDaoImpl");
            __query.setCallerMethodName("insertLoaHistory");
            __query.setQueryTimeout(-1);
            __query.setEntityAndEntityType("loaHistory", loaHistory, com.ol.model.entity._LoaHistory.getSingletonInternal());
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.LoaHistoryDaoImpl", "insertLoaHistory", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.LoaHistoryDaoImpl", "insertLoaHistory", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.ol.model.entity.LoaHistory> selectAll() {
        entering("com.ol.model.dao.LoaHistoryDaoImpl", "selectAll");
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/LoaHistoryDao/selectAll.sql");
            __query.setCallerClassName("com.ol.model.dao.LoaHistoryDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.ol.model.entity.LoaHistory>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.ol.model.entity.LoaHistory>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.ol.model.entity.LoaHistory>(com.ol.model.entity._LoaHistory.getSingletonInternal()));
            java.util.List<com.ol.model.entity.LoaHistory> __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.LoaHistoryDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.LoaHistoryDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.ol.model.entity.LoaHistoryInfo> selectAllInfo(java.lang.String sEmpID) {
        entering("com.ol.model.dao.LoaHistoryDaoImpl", "selectAllInfo", sEmpID);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/LoaHistoryDao/selectAllInfo.sql");
            __query.addParameter("sEmpID", java.lang.String.class, sEmpID);
            __query.setCallerClassName("com.ol.model.dao.LoaHistoryDaoImpl");
            __query.setCallerMethodName("selectAllInfo");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.ol.model.entity.LoaHistoryInfo>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.ol.model.entity.LoaHistoryInfo>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.ol.model.entity.LoaHistoryInfo>(com.ol.model.entity._LoaHistoryInfo.getSingletonInternal()));
            java.util.List<com.ol.model.entity.LoaHistoryInfo> __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.LoaHistoryDaoImpl", "selectAllInfo", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.LoaHistoryDaoImpl", "selectAllInfo", __e);
            throw __e;
        }
    }

}
