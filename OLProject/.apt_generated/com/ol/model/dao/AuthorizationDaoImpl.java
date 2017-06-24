package com.ol.model.dao;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2014-05-21T09:28:26.096+0700")
public class AuthorizationDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements com.ol.model.dao.AuthorizationDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.ol.model.dao.AuthorizationDao.class, "DisableAuthorization", java.lang.String.class, java.lang.String.class, java.util.Date.class);

    private static final java.lang.reflect.Method __method1 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.ol.model.dao.AuthorizationDao.class, "Insert", com.ol.model.entity.Authorization.class);

    /** */
    public AuthorizationDaoImpl() {
        super(new com.ol.model.db.DBConfig());
    }

    /**
     * @param connection the connection
     */
    public AuthorizationDaoImpl(java.sql.Connection connection) {
        super(new com.ol.model.db.DBConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public AuthorizationDaoImpl(javax.sql.DataSource dataSource) {
        super(new com.ol.model.db.DBConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected AuthorizationDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected AuthorizationDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected AuthorizationDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public int DisableAuthorization(java.lang.String sEmpID, java.lang.String sToEmpID, java.util.Date dToday) {
        entering("com.ol.model.dao.AuthorizationDaoImpl", "DisableAuthorization", sEmpID, sToEmpID, dToday);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileUpdateQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileUpdateQuery();
            __query.setMethod(__method0);
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/AuthorizationDao/DisableAuthorization.sql");
            __query.addParameter("sEmpID", java.lang.String.class, sEmpID);
            __query.addParameter("sToEmpID", java.lang.String.class, sToEmpID);
            __query.addParameter("dToday", java.util.Date.class, dToday);
            __query.setCallerClassName("com.ol.model.dao.AuthorizationDaoImpl");
            __query.setCallerMethodName("DisableAuthorization");
            __query.setQueryTimeout(-1);
            __query.setVersionIncluded(false);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.UpdateCommand __command = new org.seasar.doma.internal.jdbc.command.UpdateCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.AuthorizationDaoImpl", "DisableAuthorization", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.AuthorizationDaoImpl", "DisableAuthorization", __e);
            throw __e;
        }
    }

    @Override
    public int Insert(com.ol.model.entity.Authorization Au) {
        entering("com.ol.model.dao.AuthorizationDaoImpl", "Insert", Au);
        try {
            if (Au == null) {
                throw new org.seasar.doma.DomaNullPointerException("Au");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileInsertQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileInsertQuery();
            __query.setMethod(__method1);
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/AuthorizationDao/Insert.sql");
            __query.addParameter("Au", com.ol.model.entity.Authorization.class, Au);
            __query.setCallerClassName("com.ol.model.dao.AuthorizationDaoImpl");
            __query.setCallerMethodName("Insert");
            __query.setQueryTimeout(-1);
            __query.setEntityAndEntityType("Au", Au, com.ol.model.entity._Authorization.getSingletonInternal());
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.AuthorizationDaoImpl", "Insert", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.AuthorizationDaoImpl", "Insert", __e);
            throw __e;
        }
    }

    @Override
    public java.lang.String checkOverlap(java.lang.String sEmpID) {
        entering("com.ol.model.dao.AuthorizationDaoImpl", "checkOverlap", sEmpID);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/AuthorizationDao/checkOverlap.sql");
            __query.addParameter("sEmpID", java.lang.String.class, sEmpID);
            __query.setCallerClassName("com.ol.model.dao.AuthorizationDaoImpl");
            __query.setCallerMethodName("checkOverlap");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.lang.String> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.lang.String>(__query, new org.seasar.doma.internal.jdbc.command.BasicSingleResultHandler<java.lang.String>(new org.seasar.doma.wrapper.StringWrapper(), false));
            java.lang.String __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.AuthorizationDaoImpl", "checkOverlap", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.AuthorizationDaoImpl", "checkOverlap", __e);
            throw __e;
        }
    }

    @Override
    public int getAuthorizationCountByEmpID(java.lang.String sEmpID) {
        entering("com.ol.model.dao.AuthorizationDaoImpl", "getAuthorizationCountByEmpID", sEmpID);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/AuthorizationDao/getAuthorizationCountByEmpID.sql");
            __query.addParameter("sEmpID", java.lang.String.class, sEmpID);
            __query.setCallerClassName("com.ol.model.dao.AuthorizationDaoImpl");
            __query.setCallerMethodName("getAuthorizationCountByEmpID");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.lang.Integer> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.lang.Integer>(__query, new org.seasar.doma.internal.jdbc.command.BasicSingleResultHandler<java.lang.Integer>(new org.seasar.doma.wrapper.IntegerWrapper(), true));
            int __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.AuthorizationDaoImpl", "getAuthorizationCountByEmpID", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.AuthorizationDaoImpl", "getAuthorizationCountByEmpID", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.ol.model.entity.AuthorizationHistory> selectAllAuthorzationByID(java.lang.String sEmpID) {
        entering("com.ol.model.dao.AuthorizationDaoImpl", "selectAllAuthorzationByID", sEmpID);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/AuthorizationDao/selectAllAuthorzationByID.sql");
            __query.addParameter("sEmpID", java.lang.String.class, sEmpID);
            __query.setCallerClassName("com.ol.model.dao.AuthorizationDaoImpl");
            __query.setCallerMethodName("selectAllAuthorzationByID");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.ol.model.entity.AuthorizationHistory>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.ol.model.entity.AuthorizationHistory>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.ol.model.entity.AuthorizationHistory>(com.ol.model.entity._AuthorizationHistory.getSingletonInternal()));
            java.util.List<com.ol.model.entity.AuthorizationHistory> __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.AuthorizationDaoImpl", "selectAllAuthorzationByID", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.AuthorizationDaoImpl", "selectAllAuthorzationByID", __e);
            throw __e;
        }
    }

}
