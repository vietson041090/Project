package com.ol.model.dao;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2014-05-21T13:27:53.008+0700")
public class ProjectDaoImpl extends org.seasar.doma.internal.jdbc.dao.AbstractDao implements com.ol.model.dao.ProjectDao {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final java.lang.reflect.Method __method0 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.ol.model.dao.ProjectDao.class, "deleteProject", java.util.ArrayList.class);

    private static final java.lang.reflect.Method __method8 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.ol.model.dao.ProjectDao.class, "insertProjectWithSql", com.ol.model.entity.Project.class);

    private static final java.lang.reflect.Method __method9 = org.seasar.doma.internal.jdbc.dao.AbstractDao.__getDeclaredMethod(com.ol.model.dao.ProjectDao.class, "updateProject", com.ol.model.entity.Project.class);

    /** */
    public ProjectDaoImpl() {
        super(new com.ol.model.db.DBConfig());
    }

    /**
     * @param connection the connection
     */
    public ProjectDaoImpl(java.sql.Connection connection) {
        super(new com.ol.model.db.DBConfig(), connection);
    }

    /**
     * @param dataSource the dataSource
     */
    public ProjectDaoImpl(javax.sql.DataSource dataSource) {
        super(new com.ol.model.db.DBConfig(), dataSource);
    }

    /**
     * @param config the configuration
     */
    protected ProjectDaoImpl(org.seasar.doma.jdbc.Config config) {
        super(config);
    }

    /**
     * @param config the configuration
     * @param connection the connection
     */
    protected ProjectDaoImpl(org.seasar.doma.jdbc.Config config, java.sql.Connection connection) {
        super(config, connection);
    }

    /**
     * @param config the configuration
     * @param dataSource the dataSource
     */
    protected ProjectDaoImpl(org.seasar.doma.jdbc.Config config, javax.sql.DataSource dataSource) {
        super(config, dataSource);
    }

    @Override
    public int deleteProject(java.util.ArrayList<java.lang.String> iID) {
        entering("com.ol.model.dao.ProjectDaoImpl", "deleteProject", iID);
        try {
            if (iID == null) {
                throw new org.seasar.doma.DomaNullPointerException("iID");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileUpdateQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileUpdateQuery();
            __query.setMethod(__method0);
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/ProjectDao/deleteProject.sql");
            __query.addParameter("iID", java.util.ArrayList.class, iID);
            __query.setCallerClassName("com.ol.model.dao.ProjectDaoImpl");
            __query.setCallerMethodName("deleteProject");
            __query.setQueryTimeout(-1);
            __query.setVersionIncluded(false);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.UpdateCommand __command = new org.seasar.doma.internal.jdbc.command.UpdateCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.ProjectDaoImpl", "deleteProject", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.ProjectDaoImpl", "deleteProject", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.ol.model.entity.ProjectInformation> getAllMyProjectInformation(java.lang.String empID) {
        entering("com.ol.model.dao.ProjectDaoImpl", "getAllMyProjectInformation", empID);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/ProjectDao/getAllMyProjectInformation.sql");
            __query.addParameter("empID", java.lang.String.class, empID);
            __query.setCallerClassName("com.ol.model.dao.ProjectDaoImpl");
            __query.setCallerMethodName("getAllMyProjectInformation");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.ol.model.entity.ProjectInformation>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.ol.model.entity.ProjectInformation>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.ol.model.entity.ProjectInformation>(com.ol.model.entity._ProjectInformation.getSingletonInternal()));
            java.util.List<com.ol.model.entity.ProjectInformation> __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.ProjectDaoImpl", "getAllMyProjectInformation", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.ProjectDaoImpl", "getAllMyProjectInformation", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.ol.model.entity.ProjectInformation> getAllProjectInformation() {
        entering("com.ol.model.dao.ProjectDaoImpl", "getAllProjectInformation");
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/ProjectDao/getAllProjectInformation.sql");
            __query.setCallerClassName("com.ol.model.dao.ProjectDaoImpl");
            __query.setCallerMethodName("getAllProjectInformation");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.ol.model.entity.ProjectInformation>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.ol.model.entity.ProjectInformation>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.ol.model.entity.ProjectInformation>(com.ol.model.entity._ProjectInformation.getSingletonInternal()));
            java.util.List<com.ol.model.entity.ProjectInformation> __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.ProjectDaoImpl", "getAllProjectInformation", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.ProjectDaoImpl", "getAllProjectInformation", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.ol.model.entity.ProjectMember> getNotProjectMember(int iID) {
        entering("com.ol.model.dao.ProjectDaoImpl", "getNotProjectMember", iID);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/ProjectDao/getNotProjectMember.sql");
            __query.addParameter("iID", int.class, iID);
            __query.setCallerClassName("com.ol.model.dao.ProjectDaoImpl");
            __query.setCallerMethodName("getNotProjectMember");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.ol.model.entity.ProjectMember>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.ol.model.entity.ProjectMember>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.ol.model.entity.ProjectMember>(com.ol.model.entity._ProjectMember.getSingletonInternal()));
            java.util.List<com.ol.model.entity.ProjectMember> __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.ProjectDaoImpl", "getNotProjectMember", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.ProjectDaoImpl", "getNotProjectMember", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.ol.model.entity.ProjectInformation> getProjectByUserByUserID(java.lang.String sEmpID) {
        entering("com.ol.model.dao.ProjectDaoImpl", "getProjectByUserByUserID", sEmpID);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/ProjectDao/getProjectByUserByUserID.sql");
            __query.addParameter("sEmpID", java.lang.String.class, sEmpID);
            __query.setCallerClassName("com.ol.model.dao.ProjectDaoImpl");
            __query.setCallerMethodName("getProjectByUserByUserID");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.ol.model.entity.ProjectInformation>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.ol.model.entity.ProjectInformation>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.ol.model.entity.ProjectInformation>(com.ol.model.entity._ProjectInformation.getSingletonInternal()));
            java.util.List<com.ol.model.entity.ProjectInformation> __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.ProjectDaoImpl", "getProjectByUserByUserID", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.ProjectDaoImpl", "getProjectByUserByUserID", __e);
            throw __e;
        }
    }

    @Override
    public java.lang.Integer getProjectID() {
        entering("com.ol.model.dao.ProjectDaoImpl", "getProjectID");
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/ProjectDao/getProjectID.sql");
            __query.setCallerClassName("com.ol.model.dao.ProjectDaoImpl");
            __query.setCallerMethodName("getProjectID");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.lang.Integer> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.lang.Integer>(__query, new org.seasar.doma.internal.jdbc.command.BasicSingleResultHandler<java.lang.Integer>(new org.seasar.doma.wrapper.IntegerWrapper(), false));
            java.lang.Integer __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.ProjectDaoImpl", "getProjectID", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.ProjectDaoImpl", "getProjectID", __e);
            throw __e;
        }
    }

    @Override
    public com.ol.model.entity.ProjectInformation getProjectInformation(int iID) {
        entering("com.ol.model.dao.ProjectDaoImpl", "getProjectInformation", iID);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/ProjectDao/getProjectInformation.sql");
            __query.addParameter("iID", int.class, iID);
            __query.setCallerClassName("com.ol.model.dao.ProjectDaoImpl");
            __query.setCallerMethodName("getProjectInformation");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<com.ol.model.entity.ProjectInformation> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<com.ol.model.entity.ProjectInformation>(__query, new org.seasar.doma.internal.jdbc.command.EntitySingleResultHandler<com.ol.model.entity.ProjectInformation>(com.ol.model.entity._ProjectInformation.getSingletonInternal()));
            com.ol.model.entity.ProjectInformation __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.ProjectDaoImpl", "getProjectInformation", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.ProjectDaoImpl", "getProjectInformation", __e);
            throw __e;
        }
    }

    @Override
    public java.util.List<com.ol.model.entity.ProjectMember> getProjectMember(int iID) {
        entering("com.ol.model.dao.ProjectDaoImpl", "getProjectMember", iID);
        try {
            org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileSelectQuery();
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/ProjectDao/getProjectMember.sql");
            __query.addParameter("iID", int.class, iID);
            __query.setCallerClassName("com.ol.model.dao.ProjectDaoImpl");
            __query.setCallerMethodName("getProjectMember");
            __query.setResultEnsured(false);
            __query.setResultMappingEnsured(false);
            __query.setQueryTimeout(-1);
            __query.setMaxRows(-1);
            __query.setFetchSize(-1);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.ol.model.entity.ProjectMember>> __command = new org.seasar.doma.internal.jdbc.command.SelectCommand<java.util.List<com.ol.model.entity.ProjectMember>>(__query, new org.seasar.doma.internal.jdbc.command.EntityResultListHandler<com.ol.model.entity.ProjectMember>(com.ol.model.entity._ProjectMember.getSingletonInternal()));
            java.util.List<com.ol.model.entity.ProjectMember> __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.ProjectDaoImpl", "getProjectMember", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.ProjectDaoImpl", "getProjectMember", __e);
            throw __e;
        }
    }

    @Override
    public int insertProjectWithSql(com.ol.model.entity.Project prj) {
        entering("com.ol.model.dao.ProjectDaoImpl", "insertProjectWithSql", prj);
        try {
            if (prj == null) {
                throw new org.seasar.doma.DomaNullPointerException("prj");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileInsertQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileInsertQuery();
            __query.setMethod(__method8);
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/ProjectDao/insertProjectWithSql.sql");
            __query.addParameter("prj", com.ol.model.entity.Project.class, prj);
            __query.setCallerClassName("com.ol.model.dao.ProjectDaoImpl");
            __query.setCallerMethodName("insertProjectWithSql");
            __query.setQueryTimeout(-1);
            __query.setEntityAndEntityType("prj", prj, com.ol.model.entity._Project.getSingletonInternal());
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.InsertCommand __command = new org.seasar.doma.internal.jdbc.command.InsertCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.ProjectDaoImpl", "insertProjectWithSql", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.ProjectDaoImpl", "insertProjectWithSql", __e);
            throw __e;
        }
    }

    @Override
    public int updateProject(com.ol.model.entity.Project project) {
        entering("com.ol.model.dao.ProjectDaoImpl", "updateProject", project);
        try {
            if (project == null) {
                throw new org.seasar.doma.DomaNullPointerException("project");
            }
            org.seasar.doma.internal.jdbc.query.SqlFileUpdateQuery __query = new org.seasar.doma.internal.jdbc.query.SqlFileUpdateQuery();
            __query.setMethod(__method9);
            __query.setConfig(config);
            __query.setSqlFilePath("META-INF/com/ol/model/dao/ProjectDao/updateProject.sql");
            __query.addParameter("project", com.ol.model.entity.Project.class, project);
            __query.setCallerClassName("com.ol.model.dao.ProjectDaoImpl");
            __query.setCallerMethodName("updateProject");
            __query.setQueryTimeout(-1);
            __query.setEntityAndEntityType("project", project, com.ol.model.entity._Project.getSingletonInternal());
            __query.setVersionIncluded(false);
            __query.setVersionIgnored(false);
            __query.setOptimisticLockExceptionSuppressed(false);
            __query.prepare();
            org.seasar.doma.internal.jdbc.command.UpdateCommand __command = new org.seasar.doma.internal.jdbc.command.UpdateCommand(__query);
            int __result = __command.execute();
            __query.complete();
            exiting("com.ol.model.dao.ProjectDaoImpl", "updateProject", __result);
            return __result;
        } catch (java.lang.RuntimeException __e) {
            throwing("com.ol.model.dao.ProjectDaoImpl", "updateProject", __e);
            throw __e;
        }
    }

}
