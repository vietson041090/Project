package com.ol.model.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2014-05-16T16:32:57.815+0700")
public final class _AuthorizationHistory extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.ol.model.entity.AuthorizationHistory> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final _AuthorizationHistory __singleton = new _AuthorizationHistory();

    /** the dFromday */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<com.ol.model.entity.Authorization, com.ol.model.entity.AuthorizationHistory, java.util.Date, java.lang.Object> $dFromday = new org.seasar.doma.jdbc.entity.BasicPropertyType<com.ol.model.entity.Authorization, com.ol.model.entity.AuthorizationHistory, java.util.Date, java.lang.Object>(com.ol.model.entity.AuthorizationHistory.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, com.ol.model.entity._Authorization.getSingletonInternal().$dFromday, null, "dFromday", "dFromday", true, true);

    /** the dToday */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<com.ol.model.entity.Authorization, com.ol.model.entity.AuthorizationHistory, java.util.Date, java.lang.Object> $dToday = new org.seasar.doma.jdbc.entity.BasicPropertyType<com.ol.model.entity.Authorization, com.ol.model.entity.AuthorizationHistory, java.util.Date, java.lang.Object>(com.ol.model.entity.AuthorizationHistory.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, com.ol.model.entity._Authorization.getSingletonInternal().$dToday, null, "dToday", "dToday", true, true);

    /** the iID */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<com.ol.model.entity.Authorization, com.ol.model.entity.AuthorizationHistory, java.lang.Integer, java.lang.Object> $iID = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<com.ol.model.entity.Authorization, com.ol.model.entity.AuthorizationHistory, java.lang.Integer, java.lang.Object>(com.ol.model.entity.AuthorizationHistory.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, com.ol.model.entity._Authorization.getSingletonInternal().$iID, null, "iID", "iID");

    /** the iStatus */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<com.ol.model.entity.Authorization, com.ol.model.entity.AuthorizationHistory, java.lang.Integer, java.lang.Object> $iStatus = new org.seasar.doma.jdbc.entity.BasicPropertyType<com.ol.model.entity.Authorization, com.ol.model.entity.AuthorizationHistory, java.lang.Integer, java.lang.Object>(com.ol.model.entity.AuthorizationHistory.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, com.ol.model.entity._Authorization.getSingletonInternal().$iStatus, null, "iStatus", "iStatus", true, true);

    /** the iWorkID */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<com.ol.model.entity.Authorization, com.ol.model.entity.AuthorizationHistory, java.lang.Integer, java.lang.Object> $iWorkID = new org.seasar.doma.jdbc.entity.BasicPropertyType<com.ol.model.entity.Authorization, com.ol.model.entity.AuthorizationHistory, java.lang.Integer, java.lang.Object>(com.ol.model.entity.AuthorizationHistory.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, com.ol.model.entity._Authorization.getSingletonInternal().$iWorkID, null, "iWorkID", "iWorkID", true, true);

    /** the sEmpID */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<com.ol.model.entity.Authorization, com.ol.model.entity.AuthorizationHistory, java.lang.String, java.lang.Object> $sEmpID = new org.seasar.doma.jdbc.entity.BasicPropertyType<com.ol.model.entity.Authorization, com.ol.model.entity.AuthorizationHistory, java.lang.String, java.lang.Object>(com.ol.model.entity.AuthorizationHistory.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, com.ol.model.entity._Authorization.getSingletonInternal().$sEmpID, null, "sEmpID", "sEmpID", true, true);

    /** the sToEmpID */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<com.ol.model.entity.Authorization, com.ol.model.entity.AuthorizationHistory, java.lang.String, java.lang.Object> $sToEmpID = new org.seasar.doma.jdbc.entity.BasicPropertyType<com.ol.model.entity.Authorization, com.ol.model.entity.AuthorizationHistory, java.lang.String, java.lang.Object>(com.ol.model.entity.AuthorizationHistory.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, com.ol.model.entity._Authorization.getSingletonInternal().$sToEmpID, null, "sToEmpID", "sToEmpID", true, true);

    /** the iPrjID */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.AuthorizationHistory, java.lang.Integer, java.lang.Object> $iPrjID = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.AuthorizationHistory, java.lang.Integer, java.lang.Object>(com.ol.model.entity.AuthorizationHistory.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "iPrjID", "iPrjID", true, true);

    /** the sFullName */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.AuthorizationHistory, java.lang.String, java.lang.Object> $sFullName = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.AuthorizationHistory, java.lang.String, java.lang.Object>(com.ol.model.entity.AuthorizationHistory.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sFullName", "sFullName", true, true);

    /** the sPrjName */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.AuthorizationHistory, java.lang.String, java.lang.Object> $sPrjName = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.AuthorizationHistory, java.lang.String, java.lang.Object>(com.ol.model.entity.AuthorizationHistory.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sPrjName", "sPrjName", true, true);

    private final org.seasar.doma.jdbc.entity.NullEntityListener<com.ol.model.entity.AuthorizationHistory> __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.AuthorizationHistory, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.AuthorizationHistory, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.AuthorizationHistory, ?>> __entityPropertyTypeMap;

    private _AuthorizationHistory() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener<com.ol.model.entity.AuthorizationHistory>();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.SNAKE_UPPER_CASE;
        __immutable = false;
        __name = "AuthorizationHistory";
        __catalogName = "";
        __schemaName = "";
        __tableName = "AUTHORIZATION_HISTORY";
        __qualifiedTableName = "AUTHORIZATION_HISTORY";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.AuthorizationHistory, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.AuthorizationHistory, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.AuthorizationHistory, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.AuthorizationHistory, ?>>(10);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.AuthorizationHistory, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.AuthorizationHistory, ?>>(10);
        __list.add($dFromday);
        __map.put("dFromday", $dFromday);
        __list.add($dToday);
        __map.put("dToday", $dToday);
        __idList.add($iID);
        __list.add($iID);
        __map.put("iID", $iID);
        __list.add($iStatus);
        __map.put("iStatus", $iStatus);
        __list.add($iWorkID);
        __map.put("iWorkID", $iWorkID);
        __list.add($sEmpID);
        __map.put("sEmpID", $sEmpID);
        __list.add($sToEmpID);
        __map.put("sToEmpID", $sToEmpID);
        __list.add($iPrjID);
        __map.put("iPrjID", $iPrjID);
        __list.add($sFullName);
        __map.put("sFullName", $sFullName);
        __list.add($sPrjName);
        __map.put("sPrjName", $sPrjName);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return __tableName;
    }

    @Override
    public String getQualifiedTableName() {
        return __qualifiedTableName;
    }

    @Override
    public void preInsert(com.ol.model.entity.AuthorizationHistory entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.ol.model.entity.AuthorizationHistory> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.ol.model.entity.AuthorizationHistory entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.ol.model.entity.AuthorizationHistory> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.ol.model.entity.AuthorizationHistory entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.ol.model.entity.AuthorizationHistory> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.ol.model.entity.AuthorizationHistory entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.ol.model.entity.AuthorizationHistory> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.ol.model.entity.AuthorizationHistory entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.ol.model.entity.AuthorizationHistory> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.ol.model.entity.AuthorizationHistory entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.ol.model.entity.AuthorizationHistory> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.AuthorizationHistory, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.AuthorizationHistory, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.AuthorizationHistory, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.ol.model.entity.AuthorizationHistory, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.ol.model.entity.AuthorizationHistory, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.ol.model.entity.AuthorizationHistory newEntity() {
        return new com.ol.model.entity.AuthorizationHistory();
    }

    @Override
    public com.ol.model.entity.AuthorizationHistory newEntity(java.util.Map<String, Object> __args) {
        return new com.ol.model.entity.AuthorizationHistory();
    }

    @Override
    public Class<com.ol.model.entity.AuthorizationHistory> getEntityClass() {
        return com.ol.model.entity.AuthorizationHistory.class;
    }

    @Override
    public com.ol.model.entity.AuthorizationHistory getOriginalStates(com.ol.model.entity.AuthorizationHistory __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.ol.model.entity.AuthorizationHistory __entity) {
    }

    /**
     * @return the singleton
     */
    public static _AuthorizationHistory getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _AuthorizationHistory newInstance() {
        return new _AuthorizationHistory();
    }

}
