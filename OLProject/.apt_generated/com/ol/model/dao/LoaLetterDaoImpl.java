package com.ol.model.dao;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2014-05-21T14:49:33.870+0700")
public class LoaLetterDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements com.ol.model.dao.LoaLetterDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.ol.model.dao.LoaLetterDao.class, "deleteLoa", java.lang.String.class, java.lang.String.class);

    private static final java.lang.reflect.Method __method13 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.ol.model.dao.LoaLetterDao.class, "newLoaDetail", com.ol.model.entity.LoaDetail.class);

    private static final java.lang.reflect.Method __method14 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.ol.model.dao.LoaLetterDao.class, "saveLoaLetter", com.ol.model.entity.LoaLetter.class);

    private static final java.lang.reflect.Method __method15 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.ol.model.dao.LoaLetterDao.class, "saveLoaLetterDetail", com.ol.model.entity.LoaDetail.class);

    private static final java.lang.reflect.Method __method19 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.ol.model.dao.LoaLetterDao.class, "updateLoaLetter", com.ol.model.entity.LoaLetter.class);

    private static final java.lang.reflect.Method __method20 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.ol.model.dao.LoaLetterDao.class, "updateLoaLetterDetail", com.ol.model.entity.LoaDetail.class);

    private static final java.lang.reflect.Method __method21 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.ol.model.dao.LoaLetterDao.class, "updateLoaLetterTuan", com.ol.model.entity.LoaLetter.class);

    /** */
    public LoaLetterDaoImpl() {
        super(new com.ol.model.db.DBConfig());
    }

    /**
     * @param connection the connection
     */
    public LoaLetterDaoImpl(java.sql.Connection connection) {
        super(new com.ol.model.db.DBConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public LoaLetterDaoImpl(javax.sql.DataSource dataSource) {
        super(new com.ol.model.db.DBConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected LoaLetterDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected LoaLetterDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected LoaLetterDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public int SelectCountPersonalLetterByID(java.lang.String sEmpID) {
        entering("com.ol.model.dao.LoaLetterDaoImpl", "SelectCountPersonalLetterByID", sEmpID);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/LoaLetterDao/SelectCountPersonalLetterByID.sql");
            __query.addParameter("sEmpID", java.lang.String.class, sEmpID);
            __query.setCallerClassName("com.ol.model.dao.LoaLetterDaoImpl");
            __query.setCallerMethodName("SelectCountPersonalLetterByID");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.lang.Integer> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.lang.Integer>(__query, new org.seasar.doma.internal.jdbc.command.BasicSingleResultHandler<java.lang.Integer>(new org.seasar.doma.wrapper.IntegerWrapper(), true));
            int __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.LoaLetterDaoImpl", "SelectCountPersonalLetterByID", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.LoaLetterDaoImpl", "SelectCountPersonalLetterByID", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.ol.model.entity.PersonalLoaLetter> SelectPersonalLetterByIDPaging(java.lang.String sEmpID, int PageNumber, int RowsPerPage, java.lang.String sortColumn, java.lang.String sortDir) {
        entering("com.ol.model.dao.LoaLetterDaoImpl", "SelectPersonalLetterByIDPaging", sEmpID, PageNumber, RowsPerPage, sortColumn, sortDir);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/LoaLetterDao/SelectPersonalLetterByIDPaging.sql");
            __query.addParameter("sEmpID", java.lang.String.class, sEmpID);
            __query.addParameter("PageNumber", int.class, PageNumber);
            __query.addParameter("RowsPerPage", int.class, RowsPerPage);
            __query.addParameter("sortColumn", java.lang.String.class, sortColumn);
            __query.addParameter("sortDir", java.lang.String.class, sortDir);
            __query.setCallerClassName("com.ol.model.dao.LoaLetterDaoImpl");
            __query.setCallerMethodName("SelectPersonalLetterByIDPaging");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.ol.model.entity.PersonalLoaLetter>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.ol.model.entity.PersonalLoaLetter>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.ol.model.entity.PersonalLoaLetter>(com.ol.model.entity._PersonalLoaLetter.getSingletonInternal()));
            java.util.List<com.ol.model.entity.PersonalLoaLetter> __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.LoaLetterDaoImpl", "SelectPersonalLetterByIDPaging", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.LoaLetterDaoImpl", "SelectPersonalLetterByIDPaging", __e);
            throw __e;
        }
    }

    @Override
    public int deleteLoa(java.lang.String iLoaID, java.lang.String iID) {
        entering("com.ol.model.dao.LoaLetterDaoImpl", "deleteLoa", iLoaID, iID);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileDeleteQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileDeleteQuery();
            __query.setMethod(__method2);
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/LoaLetterDao/deleteLoa.sql");
            __query.addParameter("iLoaID", java.lang.String.class, iLoaID);
            __query.addParameter("iID", java.lang.String.class, iID);
            __query.setCallerClassName("com.ol.model.dao.LoaLetterDaoImpl");
            __query.setCallerMethodName("deleteLoa");
            __query.setQueryTimeout(-1);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.DeleteCommand __command = new org.seasar.doma.internal.jdbc.command.DeleteCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.LoaLetterDaoImpl", "deleteLoa", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.LoaLetterDaoImpl", "deleteLoa", __e);
            throw __e;
        }
    }

    @Override
    public int getCountLoaByEmpID(java.lang.String sEmpID, int iStatus) {
        entering("com.ol.model.dao.LoaLetterDaoImpl", "getCountLoaByEmpID", sEmpID, iStatus);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/LoaLetterDao/getCountLoaByEmpID.sql");
            __query.addParameter("sEmpID", java.lang.String.class, sEmpID);
            __query.addParameter("iStatus", int.class, iStatus);
            __query.setCallerClassName("com.ol.model.dao.LoaLetterDaoImpl");
            __query.setCallerMethodName("getCountLoaByEmpID");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.lang.Integer> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.lang.Integer>(__query, new org.seasar.doma.internal.jdbc.command.BasicSingleResultHandler<java.lang.Integer>(new org.seasar.doma.wrapper.IntegerWrapper(), true));
            int __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.LoaLetterDaoImpl", "getCountLoaByEmpID", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.LoaLetterDaoImpl", "getCountLoaByEmpID", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.ol.model.entity.DayLoa> getDayLoaList(java.sql.Date fdate, java.sql.Date tdate, java.lang.String empID, int prjID, java.lang.String sortColumn, java.lang.String sortDir, org.seasar.doma.jdbc.SelectOptions selectOptions) {
        entering("com.ol.model.dao.LoaLetterDaoImpl", "getDayLoaList", fdate, tdate, empID, prjID, sortColumn, sortDir, selectOptions);
        try {
            if (selectOptions == null) {
                throw new org.seasar.doma.DomaNullPointerException("selectOptions");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/LoaLetterDao/getDayLoaList.sql");
            __query.setOptions(selectOptions);
            __query.addParameter("fdate", java.sql.Date.class, fdate);
            __query.addParameter("tdate", java.sql.Date.class, tdate);
            __query.addParameter("empID", java.lang.String.class, empID);
            __query.addParameter("prjID", int.class, prjID);
            __query.addParameter("sortColumn", java.lang.String.class, sortColumn);
            __query.addParameter("sortDir", java.lang.String.class, sortDir);
            __query.setCallerClassName("com.ol.model.dao.LoaLetterDaoImpl");
            __query.setCallerMethodName("getDayLoaList");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.ol.model.entity.DayLoa>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.ol.model.entity.DayLoa>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.ol.model.entity.DayLoa>(com.ol.model.entity._DayLoa.getSingletonInternal()));
            java.util.List<com.ol.model.entity.DayLoa> __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.LoaLetterDaoImpl", "getDayLoaList", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.LoaLetterDaoImpl", "getDayLoaList", __e);
            throw __e;
        }
    }

    @Override
    public int getLastLoaIDByEmpID(java.lang.String sEmpID, int iProj) {
        entering("com.ol.model.dao.LoaLetterDaoImpl", "getLastLoaIDByEmpID", sEmpID, iProj);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/LoaLetterDao/getLastLoaIDByEmpID.sql");
            __query.addParameter("sEmpID", java.lang.String.class, sEmpID);
            __query.addParameter("iProj", int.class, iProj);
            __query.setCallerClassName("com.ol.model.dao.LoaLetterDaoImpl");
            __query.setCallerMethodName("getLastLoaIDByEmpID");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.lang.Integer> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.lang.Integer>(__query, new org.seasar.doma.internal.jdbc.command.BasicSingleResultHandler<java.lang.Integer>(new org.seasar.doma.wrapper.IntegerWrapper(), true));
            int __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.LoaLetterDaoImpl", "getLastLoaIDByEmpID", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.LoaLetterDaoImpl", "getLastLoaIDByEmpID", __e);
            throw __e;
        }
    }

    @Override
    public float getMonthCountLoaByEmpID(java.lang.String sEmpID, int iStatus) {
        entering("com.ol.model.dao.LoaLetterDaoImpl", "getMonthCountLoaByEmpID", sEmpID, iStatus);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/LoaLetterDao/getMonthCountLoaByEmpID.sql");
            __query.addParameter("sEmpID", java.lang.String.class, sEmpID);
            __query.addParameter("iStatus", int.class, iStatus);
            __query.setCallerClassName("com.ol.model.dao.LoaLetterDaoImpl");
            __query.setCallerMethodName("getMonthCountLoaByEmpID");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.lang.Float> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.lang.Float>(__query, new org.seasar.doma.internal.jdbc.command.BasicSingleResultHandler<java.lang.Float>(new org.seasar.doma.wrapper.FloatWrapper(), true));
            float __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.LoaLetterDaoImpl", "getMonthCountLoaByEmpID", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.LoaLetterDaoImpl", "getMonthCountLoaByEmpID", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.ol.model.entity.TimeLoa> getTimeLoaList(java.sql.Date fdate, java.sql.Date tdate, java.lang.String empID, int prjID, int PageNumber, int RowsPerPage, java.lang.String sortColumn, java.lang.String sortDir) {
        entering("com.ol.model.dao.LoaLetterDaoImpl", "getTimeLoaList", fdate, tdate, empID, prjID, PageNumber, RowsPerPage, sortColumn, sortDir);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/LoaLetterDao/getTimeLoaList.sql");
            __query.addParameter("fdate", java.sql.Date.class, fdate);
            __query.addParameter("tdate", java.sql.Date.class, tdate);
            __query.addParameter("empID", java.lang.String.class, empID);
            __query.addParameter("prjID", int.class, prjID);
            __query.addParameter("PageNumber", int.class, PageNumber);
            __query.addParameter("RowsPerPage", int.class, RowsPerPage);
            __query.addParameter("sortColumn", java.lang.String.class, sortColumn);
            __query.addParameter("sortDir", java.lang.String.class, sortDir);
            __query.setCallerClassName("com.ol.model.dao.LoaLetterDaoImpl");
            __query.setCallerMethodName("getTimeLoaList");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.ol.model.entity.TimeLoa>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.ol.model.entity.TimeLoa>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.ol.model.entity.TimeLoa>(com.ol.model.entity._TimeLoa.getSingletonInternal()));
            java.util.List<com.ol.model.entity.TimeLoa> __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.LoaLetterDaoImpl", "getTimeLoaList", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.LoaLetterDaoImpl", "getTimeLoaList", __e);
            throw __e;
        }
    }

    @Override
    public int getTotalDayLoaList(java.sql.Date fdate, java.sql.Date tdate, java.lang.String empID, int prjID) {
        entering("com.ol.model.dao.LoaLetterDaoImpl", "getTotalDayLoaList", fdate, tdate, empID, prjID);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/LoaLetterDao/getTotalDayLoaList.sql");
            __query.addParameter("fdate", java.sql.Date.class, fdate);
            __query.addParameter("tdate", java.sql.Date.class, tdate);
            __query.addParameter("empID", java.lang.String.class, empID);
            __query.addParameter("prjID", int.class, prjID);
            __query.setCallerClassName("com.ol.model.dao.LoaLetterDaoImpl");
            __query.setCallerMethodName("getTotalDayLoaList");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.lang.Integer> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.lang.Integer>(__query, new org.seasar.doma.internal.jdbc.command.BasicSingleResultHandler<java.lang.Integer>(new org.seasar.doma.wrapper.IntegerWrapper(), true));
            int __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.LoaLetterDaoImpl", "getTotalDayLoaList", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.LoaLetterDaoImpl", "getTotalDayLoaList", __e);
            throw __e;
        }
    }

    @Override
    public int getTotalTimeLoaList(java.sql.Date fdate, java.sql.Date tdate, java.lang.String empID, int prjID, int PageNumber, int RowsPerPage, java.lang.String sortColumn, java.lang.String sortDir) {
        entering("com.ol.model.dao.LoaLetterDaoImpl", "getTotalTimeLoaList", fdate, tdate, empID, prjID, PageNumber, RowsPerPage, sortColumn, sortDir);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/LoaLetterDao/getTotalTimeLoaList.sql");
            __query.addParameter("fdate", java.sql.Date.class, fdate);
            __query.addParameter("tdate", java.sql.Date.class, tdate);
            __query.addParameter("empID", java.lang.String.class, empID);
            __query.addParameter("prjID", int.class, prjID);
            __query.addParameter("PageNumber", int.class, PageNumber);
            __query.addParameter("RowsPerPage", int.class, RowsPerPage);
            __query.addParameter("sortColumn", java.lang.String.class, sortColumn);
            __query.addParameter("sortDir", java.lang.String.class, sortDir);
            __query.setCallerClassName("com.ol.model.dao.LoaLetterDaoImpl");
            __query.setCallerMethodName("getTotalTimeLoaList");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.lang.Integer> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.lang.Integer>(__query, new org.seasar.doma.internal.jdbc.command.BasicSingleResultHandler<java.lang.Integer>(new org.seasar.doma.wrapper.IntegerWrapper(), true));
            int __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.LoaLetterDaoImpl", "getTotalTimeLoaList", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.LoaLetterDaoImpl", "getTotalTimeLoaList", __e);
            throw __e;
        }
    }

    @Override
    public int getTotalWaitingLoa(java.lang.String empID) {
        entering("com.ol.model.dao.LoaLetterDaoImpl", "getTotalWaitingLoa", empID);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/LoaLetterDao/getTotalWaitingLoa.sql");
            __query.addParameter("empID", java.lang.String.class, empID);
            __query.setCallerClassName("com.ol.model.dao.LoaLetterDaoImpl");
            __query.setCallerMethodName("getTotalWaitingLoa");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.lang.Integer> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.lang.Integer>(__query, new org.seasar.doma.internal.jdbc.command.BasicSingleResultHandler<java.lang.Integer>(new org.seasar.doma.wrapper.IntegerWrapper(), true));
            int __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.LoaLetterDaoImpl", "getTotalWaitingLoa", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.LoaLetterDaoImpl", "getTotalWaitingLoa", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.ol.model.entity.LoaLetter> getWaitingLoa(java.lang.String empID, java.lang.String sortColumn, java.lang.String sortDir, org.seasar.doma.jdbc.SelectOptions selectOptions) {
        entering("com.ol.model.dao.LoaLetterDaoImpl", "getWaitingLoa", empID, sortColumn, sortDir, selectOptions);
        try {
            if (selectOptions == null) {
                throw new org.seasar.doma.DomaNullPointerException("selectOptions");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/LoaLetterDao/getWaitingLoa.sql");
            __query.setOptions(selectOptions);
            __query.addParameter("empID", java.lang.String.class, empID);
            __query.addParameter("sortColumn", java.lang.String.class, sortColumn);
            __query.addParameter("sortDir", java.lang.String.class, sortDir);
            __query.setCallerClassName("com.ol.model.dao.LoaLetterDaoImpl");
            __query.setCallerMethodName("getWaitingLoa");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.ol.model.entity.LoaLetter>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.ol.model.entity.LoaLetter>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.ol.model.entity.LoaLetter>(com.ol.model.entity._LoaLetter.getSingletonInternal()));
            java.util.List<com.ol.model.entity.LoaLetter> __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.LoaLetterDaoImpl", "getWaitingLoa", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.LoaLetterDaoImpl", "getWaitingLoa", __e);
            throw __e;
        }
    }

    @Override
    public float getYearCountLoaByEmpID(java.lang.String sEmpID, int iStatus) {
        entering("com.ol.model.dao.LoaLetterDaoImpl", "getYearCountLoaByEmpID", sEmpID, iStatus);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/LoaLetterDao/getYearCountLoaByEmpID.sql");
            __query.addParameter("sEmpID", java.lang.String.class, sEmpID);
            __query.addParameter("iStatus", int.class, iStatus);
            __query.setCallerClassName("com.ol.model.dao.LoaLetterDaoImpl");
            __query.setCallerMethodName("getYearCountLoaByEmpID");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.lang.Float> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.lang.Float>(__query, new org.seasar.doma.internal.jdbc.command.BasicSingleResultHandler<java.lang.Float>(new org.seasar.doma.wrapper.FloatWrapper(), true));
            float __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.LoaLetterDaoImpl", "getYearCountLoaByEmpID", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.LoaLetterDaoImpl", "getYearCountLoaByEmpID", __e);
            throw __e;
        }
    }

    @Override
    public int newLoaDetail(com.ol.model.entity.LoaDetail detail) {
        entering("com.ol.model.dao.LoaLetterDaoImpl", "newLoaDetail", detail);
        try {
            if (detail == null) {
                throw new org.seasar.doma.DomaNullPointerException("detail");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileInsertQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileInsertQuery();
            __query.setMethod(__method13);
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/LoaLetterDao/newLoaDetail.sql");
            __query.addParameter("detail", com.ol.model.entity.LoaDetail.class, detail);
            __query.setCallerClassName("com.ol.model.dao.LoaLetterDaoImpl");
            __query.setCallerMethodName("newLoaDetail");
            __query.setQueryTimeout(-1);
            __query.setEntityAndEntityType("detail", detail, com.ol.model.entity._LoaDetail.getSingletonInternal());
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.LoaLetterDaoImpl", "newLoaDetail", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.LoaLetterDaoImpl", "newLoaDetail", __e);
            throw __e;
        }
    }

    @Override
    public int saveLoaLetter(com.ol.model.entity.LoaLetter loa) {
        entering("com.ol.model.dao.LoaLetterDaoImpl", "saveLoaLetter", loa);
        try {
            if (loa == null) {
                throw new org.seasar.doma.DomaNullPointerException("loa");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileInsertQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileInsertQuery();
            __query.setMethod(__method14);
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/LoaLetterDao/saveLoaLetter.sql");
            __query.addParameter("loa", com.ol.model.entity.LoaLetter.class, loa);
            __query.setCallerClassName("com.ol.model.dao.LoaLetterDaoImpl");
            __query.setCallerMethodName("saveLoaLetter");
            __query.setQueryTimeout(-1);
            __query.setEntityAndEntityType("loa", loa, com.ol.model.entity._LoaLetter.getSingletonInternal());
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.LoaLetterDaoImpl", "saveLoaLetter", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.LoaLetterDaoImpl", "saveLoaLetter", __e);
            throw __e;
        }
    }

    @Override
    public int saveLoaLetterDetail(com.ol.model.entity.LoaDetail loa) {
        entering("com.ol.model.dao.LoaLetterDaoImpl", "saveLoaLetterDetail", loa);
        try {
            if (loa == null) {
                throw new org.seasar.doma.DomaNullPointerException("loa");
            }
            org.seasar.doma.internal.jdbc.query.AutoInsertQuery<com.ol.model.entity.LoaDetail> __query = new org.seasar.doma.internal.jdbc.query.AutoInsertQuery<com.ol.model.entity.LoaDetail>(com.ol.model.entity._LoaDetail.getSingletonInternal());
            __query.setMethod(__method15);
            __query.setConfig(config);
            __query.setEntity(loa);
            __query.setCallerClassName("com.ol.model.dao.LoaLetterDaoImpl");
            __query.setCallerMethodName("saveLoaLetterDetail");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.LoaLetterDaoImpl", "saveLoaLetterDetail", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.LoaLetterDaoImpl", "saveLoaLetterDetail", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.ol.model.entity.LoaDetail> selectLoaDetail(int iLoaID) {
        entering("com.ol.model.dao.LoaLetterDaoImpl", "selectLoaDetail", iLoaID);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/LoaLetterDao/selectLoaDetail.sql");
            __query.addParameter("iLoaID", int.class, iLoaID);
            __query.setCallerClassName("com.ol.model.dao.LoaLetterDaoImpl");
            __query.setCallerMethodName("selectLoaDetail");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.ol.model.entity.LoaDetail>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.ol.model.entity.LoaDetail>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.ol.model.entity.LoaDetail>(com.ol.model.entity._LoaDetail.getSingletonInternal()));
            java.util.List<com.ol.model.entity.LoaDetail> __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.LoaLetterDaoImpl", "selectLoaDetail", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.LoaLetterDaoImpl", "selectLoaDetail", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.ol.model.entity.LoaHistory> selectLoaHistory(int iLoaID) {
        entering("com.ol.model.dao.LoaLetterDaoImpl", "selectLoaHistory", iLoaID);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/LoaLetterDao/selectLoaHistory.sql");
            __query.addParameter("iLoaID", int.class, iLoaID);
            __query.setCallerClassName("com.ol.model.dao.LoaLetterDaoImpl");
            __query.setCallerMethodName("selectLoaHistory");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.ol.model.entity.LoaHistory>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.ol.model.entity.LoaHistory>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.ol.model.entity.LoaHistory>(com.ol.model.entity._LoaHistory.getSingletonInternal()));
            java.util.List<com.ol.model.entity.LoaHistory> __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.LoaLetterDaoImpl", "selectLoaHistory", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.LoaLetterDaoImpl", "selectLoaHistory", __e);
            throw __e;
        }
    }

    @Override
    public com.ol.model.entity.LoaLetter selectLoaLetter(int iLoaID) {
        entering("com.ol.model.dao.LoaLetterDaoImpl", "selectLoaLetter", iLoaID);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/LoaLetterDao/selectLoaLetter.sql");
            __query.addParameter("iLoaID", int.class, iLoaID);
            __query.setCallerClassName("com.ol.model.dao.LoaLetterDaoImpl");
            __query.setCallerMethodName("selectLoaLetter");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<com.ol.model.entity.LoaLetter> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<com.ol.model.entity.LoaLetter>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<com.ol.model.entity.LoaLetter>(com.ol.model.entity._LoaLetter.getSingletonInternal()));
            com.ol.model.entity.LoaLetter __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.LoaLetterDaoImpl", "selectLoaLetter", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.LoaLetterDaoImpl", "selectLoaLetter", __e);
            throw __e;
        }
    }

    @Override
    public int updateLoaLetter(com.ol.model.entity.LoaLetter loa) {
        entering("com.ol.model.dao.LoaLetterDaoImpl", "updateLoaLetter", loa);
        try {
            if (loa == null) {
                throw new org.seasar.doma.DomaNullPointerException("loa");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileUpdateQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileUpdateQuery();
            __query.setMethod(__method19);
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/LoaLetterDao/updateLoaLetter.sql");
            __query.addParameter("loa", com.ol.model.entity.LoaLetter.class, loa);
            __query.setCallerClassName("com.ol.model.dao.LoaLetterDaoImpl");
            __query.setCallerMethodName("updateLoaLetter");
            __query.setQueryTimeout(-1);
            __query.setEntityAndEntityType("loa", loa, com.ol.model.entity._LoaLetter.getSingletonInternal());
            __query.setVersionIncluded(false);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.UpdateCommand __command = new org.seasar.doma.internal.jdbc.command.UpdateCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.LoaLetterDaoImpl", "updateLoaLetter", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.LoaLetterDaoImpl", "updateLoaLetter", __e);
            throw __e;
        }
    }

    @Override
    public int updateLoaLetterDetail(com.ol.model.entity.LoaDetail loa) {
        entering("com.ol.model.dao.LoaLetterDaoImpl", "updateLoaLetterDetail", loa);
        try {
            if (loa == null) {
                throw new org.seasar.doma.DomaNullPointerException("loa");
            }
            org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<com.ol.model.entity.LoaDetail> __query = new org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<com.ol.model.entity.LoaDetail>(com.ol.model.entity._LoaDetail.getSingletonInternal());
            __query.setMethod(__method20);
            __query.setConfig(config);
            __query.setEntity(loa);
            __query.setCallerClassName("com.ol.model.dao.LoaLetterDaoImpl");
            __query.setCallerMethodName("updateLoaLetterDetail");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setVersionIncluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.UpdateCommand __command = new org.seasar.doma.internal.jdbc.command.UpdateCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.LoaLetterDaoImpl", "updateLoaLetterDetail", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.LoaLetterDaoImpl", "updateLoaLetterDetail", __e);
            throw __e;
        }
    }

    @Override
    public int updateLoaLetterTuan(com.ol.model.entity.LoaLetter loa) {
        entering("com.ol.model.dao.LoaLetterDaoImpl", "updateLoaLetterTuan", loa);
        try {
            if (loa == null) {
                throw new org.seasar.doma.DomaNullPointerException("loa");
            }
            org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<com.ol.model.entity.LoaLetter> __query = new org.seasar.doma.internal.jdbc.query.AutoUpdateQuery<com.ol.model.entity.LoaLetter>(com.ol.model.entity._LoaLetter.getSingletonInternal());
            __query.setMethod(__method21);
            __query.setConfig(config);
            __query.setEntity(loa);
            __query.setCallerClassName("com.ol.model.dao.LoaLetterDaoImpl");
            __query.setCallerMethodName("updateLoaLetterTuan");
            __query.setQueryTimeout(-1);
            __query.setNullExcluded(false);
            __query.setVersionIncluded(false);
            __query.setVersionIgnored(false);
            __query.setIncludedPropertyNames();
            __query.setExcludedPropertyNames();
            __query.setUnchangedPropertyIncluded(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.UpdateCommand __command = new org.seasar.doma.internal.jdbc.command.UpdateCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.LoaLetterDaoImpl", "updateLoaLetterTuan", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.LoaLetterDaoImpl", "updateLoaLetterTuan", __e);
            throw __e;
        }
    }

}
