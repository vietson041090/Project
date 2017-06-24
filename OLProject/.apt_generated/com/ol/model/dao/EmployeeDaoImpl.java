package com.ol.model.dao;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2014-05-21T11:24:01.226+0700")
public class EmployeeDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements com.ol.model.dao.EmployeeDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final java.lang.reflect.Method __method2 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.ol.model.dao.EmployeeDao.class, "deleteEmpByID", java.util.ArrayList.class);

    private static final java.lang.reflect.Method __method3 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.ol.model.dao.EmployeeDao.class, "insertEmployee", com.ol.model.entity.Employee.class);

    private static final java.lang.reflect.Method __method13 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.ol.model.dao.EmployeeDao.class, "updatePasswordByID", java.lang.String.class, java.lang.String.class);

    private static final java.lang.reflect.Method __method14 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.ol.model.dao.EmployeeDao.class, "updateSql", com.ol.model.entity.Employee.class);

    /** */
    public EmployeeDaoImpl() {
        super(new com.ol.model.db.DBConfig());
    }

    /**
     * @param connection the connection
     */
    public EmployeeDaoImpl(java.sql.Connection connection) {
        super(new com.ol.model.db.DBConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public EmployeeDaoImpl(javax.sql.DataSource dataSource) {
        super(new com.ol.model.db.DBConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected EmployeeDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected EmployeeDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected EmployeeDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public int checkIDExist(java.lang.String sID) {
        entering("com.ol.model.dao.EmployeeDaoImpl", "checkIDExist", sID);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/EmployeeDao/checkIDExist.sql");
            __query.addParameter("sID", java.lang.String.class, sID);
            __query.setCallerClassName("com.ol.model.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("checkIDExist");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.lang.Integer> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.lang.Integer>(__query, new org.seasar.doma.internal.jdbc.command.BasicSingleResultHandler<java.lang.Integer>(new org.seasar.doma.wrapper.IntegerWrapper(), true));
            int __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.EmployeeDaoImpl", "checkIDExist", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.EmployeeDaoImpl", "checkIDExist", __e);
            throw __e;
        }
    }

    @Override
    public int checkPasswordExist(java.lang.String sID, java.lang.String sPassWord) {
        entering("com.ol.model.dao.EmployeeDaoImpl", "checkPasswordExist", sID, sPassWord);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/EmployeeDao/checkPasswordExist.sql");
            __query.addParameter("sID", java.lang.String.class, sID);
            __query.addParameter("sPassWord", java.lang.String.class, sPassWord);
            __query.setCallerClassName("com.ol.model.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("checkPasswordExist");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.lang.Integer> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.lang.Integer>(__query, new org.seasar.doma.internal.jdbc.command.BasicSingleResultHandler<java.lang.Integer>(new org.seasar.doma.wrapper.IntegerWrapper(), true));
            int __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.EmployeeDaoImpl", "checkPasswordExist", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.EmployeeDaoImpl", "checkPasswordExist", __e);
            throw __e;
        }
    }

    @Override
    public int deleteEmpByID(java.util.ArrayList<java.lang.String> sID) {
        entering("com.ol.model.dao.EmployeeDaoImpl", "deleteEmpByID", sID);
        try {
            if (sID == null) {
                throw new org.seasar.doma.DomaNullPointerException("sID");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileUpdateQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileUpdateQuery();
            __query.setMethod(__method2);
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/EmployeeDao/deleteEmpByID.sql");
            __query.addParameter("sID", java.util.ArrayList.class, sID);
            __query.setCallerClassName("com.ol.model.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("deleteEmpByID");
            __query.setQueryTimeout(-1);
            __query.setVersionIncluded(false);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.UpdateCommand __command = new org.seasar.doma.internal.jdbc.command.UpdateCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.EmployeeDaoImpl", "deleteEmpByID", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.EmployeeDaoImpl", "deleteEmpByID", __e);
            throw __e;
        }
    }

    @Override
    public int insertEmployee(com.ol.model.entity.Employee employee) {
        entering("com.ol.model.dao.EmployeeDaoImpl", "insertEmployee", employee);
        try {
            if (employee == null) {
                throw new org.seasar.doma.DomaNullPointerException("employee");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileInsertQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileInsertQuery();
            __query.setMethod(__method3);
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/EmployeeDao/insertEmployee.sql");
            __query.addParameter("employee", com.ol.model.entity.Employee.class, employee);
            __query.setCallerClassName("com.ol.model.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("insertEmployee");
            __query.setQueryTimeout(-1);
            __query.setEntityAndEntityType("employee", employee, com.ol.model.entity._Employee.getSingletonInternal());
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.EmployeeDaoImpl", "insertEmployee", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.EmployeeDaoImpl", "insertEmployee", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.ol.model.entity.Employee> searchEmpPrj(java.lang.String searchField, java.lang.String searchValue) {
        entering("com.ol.model.dao.EmployeeDaoImpl", "searchEmpPrj", searchField, searchValue);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/EmployeeDao/searchEmpPrj.sql");
            __query.addParameter("searchField", java.lang.String.class, searchField);
            __query.addParameter("searchValue", java.lang.String.class, searchValue);
            __query.setCallerClassName("com.ol.model.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("searchEmpPrj");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.ol.model.entity.Employee>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.ol.model.entity.Employee>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.ol.model.entity.Employee>(com.ol.model.entity._Employee.getSingletonInternal()));
            java.util.List<com.ol.model.entity.Employee> __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.EmployeeDaoImpl", "searchEmpPrj", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.EmployeeDaoImpl", "searchEmpPrj", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.ol.model.entity.Employee> selectAll() {
        entering("com.ol.model.dao.EmployeeDaoImpl", "selectAll");
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/EmployeeDao/selectAll.sql");
            __query.setCallerClassName("com.ol.model.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("selectAll");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.ol.model.entity.Employee>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.ol.model.entity.Employee>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.ol.model.entity.Employee>(com.ol.model.entity._Employee.getSingletonInternal()));
            java.util.List<com.ol.model.entity.Employee> __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.EmployeeDaoImpl", "selectAll", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.EmployeeDaoImpl", "selectAll", __e);
            throw __e;
        }
    }

    @Override
    public com.ol.model.entity.Employee selectByID(java.lang.String empID) {
        entering("com.ol.model.dao.EmployeeDaoImpl", "selectByID", empID);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/EmployeeDao/selectByID.sql");
            __query.addParameter("empID", java.lang.String.class, empID);
            __query.setCallerClassName("com.ol.model.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("selectByID");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<com.ol.model.entity.Employee> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<com.ol.model.entity.Employee>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<com.ol.model.entity.Employee>(com.ol.model.entity._Employee.getSingletonInternal()));
            com.ol.model.entity.Employee __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.EmployeeDaoImpl", "selectByID", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.EmployeeDaoImpl", "selectByID", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.ol.model.entity.EmployeeCombobox> selectComboboxList() {
        entering("com.ol.model.dao.EmployeeDaoImpl", "selectComboboxList");
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/EmployeeDao/selectComboboxList.sql");
            __query.setCallerClassName("com.ol.model.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("selectComboboxList");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.ol.model.entity.EmployeeCombobox>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.ol.model.entity.EmployeeCombobox>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.ol.model.entity.EmployeeCombobox>(com.ol.model.entity._EmployeeCombobox.getSingletonInternal()));
            java.util.List<com.ol.model.entity.EmployeeCombobox> __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.EmployeeDaoImpl", "selectComboboxList", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.EmployeeDaoImpl", "selectComboboxList", __e);
            throw __e;
        }
    }

    @Override
    public java.lang.Integer selectCountByIDPass(java.lang.String sID, java.lang.String sPassword) {
        entering("com.ol.model.dao.EmployeeDaoImpl", "selectCountByIDPass", sID, sPassword);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/EmployeeDao/selectCountByIDPass.sql");
            __query.addParameter("sID", java.lang.String.class, sID);
            __query.addParameter("sPassword", java.lang.String.class, sPassword);
            __query.setCallerClassName("com.ol.model.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("selectCountByIDPass");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.lang.Integer> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.lang.Integer>(__query, new org.seasar.doma.internal.jdbc.command.BasicSingleResultHandler<java.lang.Integer>(new org.seasar.doma.wrapper.IntegerWrapper(), false));
            java.lang.Integer __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.EmployeeDaoImpl", "selectCountByIDPass", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.EmployeeDaoImpl", "selectCountByIDPass", __e);
            throw __e;
        }
    }

    @Override
    public com.ol.model.entity.Employee selectEmpByID(java.lang.String empID) {
        entering("com.ol.model.dao.EmployeeDaoImpl", "selectEmpByID", empID);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/EmployeeDao/selectEmpByID.sql");
            __query.addParameter("empID", java.lang.String.class, empID);
            __query.setCallerClassName("com.ol.model.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("selectEmpByID");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<com.ol.model.entity.Employee> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<com.ol.model.entity.Employee>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<com.ol.model.entity.Employee>(com.ol.model.entity._Employee.getSingletonInternal()));
            com.ol.model.entity.Employee __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.EmployeeDaoImpl", "selectEmpByID", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.EmployeeDaoImpl", "selectEmpByID", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.ol.model.entity.Employee> selectEmpPrj() {
        entering("com.ol.model.dao.EmployeeDaoImpl", "selectEmpPrj");
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/EmployeeDao/selectEmpPrj.sql");
            __query.setCallerClassName("com.ol.model.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("selectEmpPrj");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.ol.model.entity.Employee>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.ol.model.entity.Employee>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.ol.model.entity.Employee>(com.ol.model.entity._Employee.getSingletonInternal()));
            java.util.List<com.ol.model.entity.Employee> __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.EmployeeDaoImpl", "selectEmpPrj", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.EmployeeDaoImpl", "selectEmpPrj", __e);
            throw __e;
        }
    }

    @Override
    public java.lang.String selectPasswordByID(java.lang.String sID) {
        entering("com.ol.model.dao.EmployeeDaoImpl", "selectPasswordByID", sID);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/EmployeeDao/selectPasswordByID.sql");
            __query.addParameter("sID", java.lang.String.class, sID);
            __query.setCallerClassName("com.ol.model.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("selectPasswordByID");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.lang.String> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.lang.String>(__query, new org.seasar.doma.internal.jdbc.command.BasicSingleResultHandler<java.lang.String>(new org.seasar.doma.wrapper.StringWrapper(), false));
            java.lang.String __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.EmployeeDaoImpl", "selectPasswordByID", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.EmployeeDaoImpl", "selectPasswordByID", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.ol.model.entity.TodayLetter> selectTodayLetter() {
        entering("com.ol.model.dao.EmployeeDaoImpl", "selectTodayLetter");
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/EmployeeDao/selectTodayLetter.sql");
            __query.setCallerClassName("com.ol.model.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("selectTodayLetter");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.ol.model.entity.TodayLetter>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.ol.model.entity.TodayLetter>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.ol.model.entity.TodayLetter>(com.ol.model.entity._TodayLetter.getSingletonInternal()));
            java.util.List<com.ol.model.entity.TodayLetter> __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.EmployeeDaoImpl", "selectTodayLetter", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.EmployeeDaoImpl", "selectTodayLetter", __e);
            throw __e;
        }
    }

    @Override
    public int updatePasswordByID(java.lang.String sID, java.lang.String newPassword) {
        entering("com.ol.model.dao.EmployeeDaoImpl", "updatePasswordByID", sID, newPassword);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileUpdateQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileUpdateQuery();
            __query.setMethod(__method13);
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/EmployeeDao/updatePasswordByID.sql");
            __query.addParameter("sID", java.lang.String.class, sID);
            __query.addParameter("newPassword", java.lang.String.class, newPassword);
            __query.setCallerClassName("com.ol.model.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("updatePasswordByID");
            __query.setQueryTimeout(-1);
            __query.setVersionIncluded(false);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.UpdateCommand __command = new org.seasar.doma.internal.jdbc.command.UpdateCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.EmployeeDaoImpl", "updatePasswordByID", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.EmployeeDaoImpl", "updatePasswordByID", __e);
            throw __e;
        }
    }

    @Override
    public int updateSql(com.ol.model.entity.Employee employee) {
        entering("com.ol.model.dao.EmployeeDaoImpl", "updateSql", employee);
        try {
            if (employee == null) {
                throw new org.seasar.doma.DomaNullPointerException("employee");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileUpdateQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileUpdateQuery();
            __query.setMethod(__method14);
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/EmployeeDao/updateSql.sql");
            __query.addParameter("employee", com.ol.model.entity.Employee.class, employee);
            __query.setCallerClassName("com.ol.model.dao.EmployeeDaoImpl");
            __query.setCallerMethodName("updateSql");
            __query.setQueryTimeout(-1);
            __query.setEntityAndEntityType("employee", employee, com.ol.model.entity._Employee.getSingletonInternal());
            __query.setVersionIncluded(false);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.UpdateCommand __command = new org.seasar.doma.internal.jdbc.command.UpdateCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.EmployeeDaoImpl", "updateSql", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.EmployeeDaoImpl", "updateSql", __e);
            throw __e;
        }
    }

}
