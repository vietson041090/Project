package com.ol.model.dao;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2014-05-19T10:56:45.385+0700")
public class WorkDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements com.ol.model.dao.WorkDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.ol.model.dao.WorkDao.class, "deleteWorkByID", int.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.ol.model.dao.WorkDao.class, "insertWork", com.ol.model.entity.Work.class);

    private static final java.lang.reflect.Method __method4 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.ol.model.dao.WorkDao.class, "updateWork", com.ol.model.entity.Work.class);

    /** */
    public WorkDaoImpl() {
        super(new com.ol.model.db.DBConfig());
    }

    /**
     * @param connection the connection
     */
    public WorkDaoImpl(java.sql.Connection connection) {
        super(new com.ol.model.db.DBConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public WorkDaoImpl(javax.sql.DataSource dataSource) {
        super(new com.ol.model.db.DBConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected WorkDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected WorkDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected WorkDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public int deleteWorkByID(int iID) {
        entering("com.ol.model.dao.WorkDaoImpl", "deleteWorkByID", iID);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileDeleteQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileDeleteQuery();
            __query.setMethod(__method0);
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/WorkDao/deleteWorkByID.sql");
            __query.addParameter("iID", int.class, iID);
            __query.setCallerClassName("com.ol.model.dao.WorkDaoImpl");
            __query.setCallerMethodName("deleteWorkByID");
            __query.setQueryTimeout(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.DeleteCommand __command = new org.seasar.doma.internal.jdbc.command.DeleteCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.WorkDaoImpl", "deleteWorkByID", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.WorkDaoImpl", "deleteWorkByID", __e);
            throw __e;
        }
    }

    @Override
    public com.ol.model.entity.Employee getNextManOfNextMan(com.ol.model.entity.LoaLetter loa) {
        entering("com.ol.model.dao.WorkDaoImpl", "getNextManOfNextMan", loa);
        try {
            if (loa == null) {
                throw new org.seasar.doma.DomaNullPointerException("loa");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/WorkDao/getNextManOfNextMan.sql");
            __query.addParameter("loa", com.ol.model.entity.LoaLetter.class, loa);
            __query.setCallerClassName("com.ol.model.dao.WorkDaoImpl");
            __query.setCallerMethodName("getNextManOfNextMan");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<com.ol.model.entity.Employee> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<com.ol.model.entity.Employee>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<com.ol.model.entity.Employee>(com.ol.model.entity._Employee.getSingletonInternal()));
            com.ol.model.entity.Employee __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.WorkDaoImpl", "getNextManOfNextMan", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.WorkDaoImpl", "getNextManOfNextMan", __e);
            throw __e;
        }
    }

    @Override
    public int getWorkIDByEmpIdAndPrjID(int iPrjID, java.lang.String sEmpID) {
        entering("com.ol.model.dao.WorkDaoImpl", "getWorkIDByEmpIdAndPrjID", iPrjID, sEmpID);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/WorkDao/getWorkIDByEmpIdAndPrjID.sql");
            __query.addParameter("iPrjID", int.class, iPrjID);
            __query.addParameter("sEmpID", java.lang.String.class, sEmpID);
            __query.setCallerClassName("com.ol.model.dao.WorkDaoImpl");
            __query.setCallerMethodName("getWorkIDByEmpIdAndPrjID");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.lang.Integer> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.lang.Integer>(__query, new org.seasar.doma.internal.jdbc.command.BasicSingleResultHandler<java.lang.Integer>(new org.seasar.doma.wrapper.IntegerWrapper(), true));
            int __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.WorkDaoImpl", "getWorkIDByEmpIdAndPrjID", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.WorkDaoImpl", "getWorkIDByEmpIdAndPrjID", __e);
            throw __e;
        }
    }

    @Override
    public int insertWork(com.ol.model.entity.Work work) {
        entering("com.ol.model.dao.WorkDaoImpl", "insertWork", work);
        try {
            if (work == null) {
                throw new org.seasar.doma.DomaNullPointerException("work");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileInsertQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileInsertQuery();
            __query.setMethod(__method3);
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/WorkDao/insertWork.sql");
            __query.addParameter("work", com.ol.model.entity.Work.class, work);
            __query.setCallerClassName("com.ol.model.dao.WorkDaoImpl");
            __query.setCallerMethodName("insertWork");
            __query.setQueryTimeout(-1);
            __query.setEntityAndEntityType("work", work, com.ol.model.entity._Work.getSingletonInternal());
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.WorkDaoImpl", "insertWork", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.WorkDaoImpl", "insertWork", __e);
            throw __e;
        }
    }

    @Override
    public int updateWork(com.ol.model.entity.Work work) {
        entering("com.ol.model.dao.WorkDaoImpl", "updateWork", work);
        try {
            if (work == null) {
                throw new org.seasar.doma.DomaNullPointerException("work");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileUpdateQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileUpdateQuery();
            __query.setMethod(__method4);
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/WorkDao/updateWork.sql");
            __query.addParameter("work", com.ol.model.entity.Work.class, work);
            __query.setCallerClassName("com.ol.model.dao.WorkDaoImpl");
            __query.setCallerMethodName("updateWork");
            __query.setQueryTimeout(-1);
            __query.setEntityAndEntityType("work", work, com.ol.model.entity._Work.getSingletonInternal());
            __query.setVersionIncluded(false);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.UpdateCommand __command = new org.seasar.doma.internal.jdbc.command.UpdateCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.WorkDaoImpl", "updateWork", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.WorkDaoImpl", "updateWork", __e);
            throw __e;
        }
    }

}
