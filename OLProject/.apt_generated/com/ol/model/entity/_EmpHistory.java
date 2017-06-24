package com.ol.model.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2014-05-16T16:32:57.795+0700")
public final class _EmpHistory extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.ol.model.entity.EmpHistory> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final _EmpHistory __singleton = new _EmpHistory();

    /** the dWhen */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.EmpHistory, java.lang.String, java.lang.Object> $dWhen = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.EmpHistory, java.lang.String, java.lang.Object>(com.ol.model.entity.EmpHistory.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "dWhen", "dWhen", true, true);

    /** the sEmpID */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.EmpHistory, java.lang.String, java.lang.Object> $sEmpID = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.EmpHistory, java.lang.String, java.lang.Object>(com.ol.model.entity.EmpHistory.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sEmpID", "sEmpID", true, true);

    /** the sWhatDo */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.EmpHistory, java.lang.String, java.lang.Object> $sWhatDo = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.EmpHistory, java.lang.String, java.lang.Object>(com.ol.model.entity.EmpHistory.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sWhatDo", "sWhatDo", true, true);

    private final org.seasar.doma.jdbc.entity.NullEntityListener<com.ol.model.entity.EmpHistory> __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.EmpHistory, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.EmpHistory, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.EmpHistory, ?>> __entityPropertyTypeMap;

    private _EmpHistory() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener<com.ol.model.entity.EmpHistory>();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __immutable = false;
        __name = "EmpHistory";
        __catalogName = "";
        __schemaName = "";
        __tableName = "OL_EmpHistory";
        __qualifiedTableName = "OL_EmpHistory";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.EmpHistory, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.EmpHistory, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.EmpHistory, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.EmpHistory, ?>>(3);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.EmpHistory, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.EmpHistory, ?>>(3);
        __list.add($dWhen);
        __map.put("dWhen", $dWhen);
        __list.add($sEmpID);
        __map.put("sEmpID", $sEmpID);
        __list.add($sWhatDo);
        __map.put("sWhatDo", $sWhatDo);
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
    public void preInsert(com.ol.model.entity.EmpHistory entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.ol.model.entity.EmpHistory> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.ol.model.entity.EmpHistory entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.ol.model.entity.EmpHistory> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.ol.model.entity.EmpHistory entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.ol.model.entity.EmpHistory> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.ol.model.entity.EmpHistory entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.ol.model.entity.EmpHistory> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.ol.model.entity.EmpHistory entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.ol.model.entity.EmpHistory> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.ol.model.entity.EmpHistory entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.ol.model.entity.EmpHistory> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.EmpHistory, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.EmpHistory, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.EmpHistory, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.ol.model.entity.EmpHistory, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.ol.model.entity.EmpHistory, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.ol.model.entity.EmpHistory newEntity() {
        return new com.ol.model.entity.EmpHistory();
    }

    @Override
    public com.ol.model.entity.EmpHistory newEntity(java.util.Map<String, Object> __args) {
        return new com.ol.model.entity.EmpHistory();
    }

    @Override
    public Class<com.ol.model.entity.EmpHistory> getEntityClass() {
        return com.ol.model.entity.EmpHistory.class;
    }

    @Override
    public com.ol.model.entity.EmpHistory getOriginalStates(com.ol.model.entity.EmpHistory __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.ol.model.entity.EmpHistory __entity) {
    }

    /**
     * @return the singleton
     */
    public static _EmpHistory getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _EmpHistory newInstance() {
        return new _EmpHistory();
    }

}
