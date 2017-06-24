package com.ol.model.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2014-05-16T16:32:57.845+0700")
public final class _Work extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.ol.model.entity.Work> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final _Work __singleton = new _Work();

    /** the iID */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, com.ol.model.entity.Work, java.lang.Integer, java.lang.Object> $iID = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, com.ol.model.entity.Work, java.lang.Integer, java.lang.Object>(com.ol.model.entity.Work.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "iID", "iID");

    /** the iPrjID */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Work, java.lang.Integer, java.lang.Object> $iPrjID = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Work, java.lang.Integer, java.lang.Object>(com.ol.model.entity.Work.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "iPrjID", "iPrjID", true, true);

    /** the iRolID */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Work, java.lang.Integer, java.lang.Object> $iRolID = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Work, java.lang.Integer, java.lang.Object>(com.ol.model.entity.Work.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "iRolID", "iRolID", true, true);

    /** the iStatus */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Work, java.lang.Integer, java.lang.Object> $iStatus = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Work, java.lang.Integer, java.lang.Object>(com.ol.model.entity.Work.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "iStatus", "iStatus", true, true);

    /** the sEmpID */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Work, java.lang.String, java.lang.Object> $sEmpID = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Work, java.lang.String, java.lang.Object>(com.ol.model.entity.Work.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sEmpID", "sEmpID", true, true);

    /** the sManID */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Work, java.lang.String, java.lang.Object> $sManID = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Work, java.lang.String, java.lang.Object>(com.ol.model.entity.Work.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sManID", "sManID", true, true);

    private final org.seasar.doma.jdbc.entity.NullEntityListener<com.ol.model.entity.Work> __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.Work, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.Work, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.Work, ?>> __entityPropertyTypeMap;

    private _Work() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener<com.ol.model.entity.Work>();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.SNAKE_UPPER_CASE;
        __immutable = false;
        __name = "Work";
        __catalogName = "";
        __schemaName = "";
        __tableName = "OL_Work";
        __qualifiedTableName = "OL_Work";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.Work, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.Work, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.Work, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.Work, ?>>(6);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.Work, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.Work, ?>>(6);
        __idList.add($iID);
        __list.add($iID);
        __map.put("iID", $iID);
        __list.add($iPrjID);
        __map.put("iPrjID", $iPrjID);
        __list.add($iRolID);
        __map.put("iRolID", $iRolID);
        __list.add($iStatus);
        __map.put("iStatus", $iStatus);
        __list.add($sEmpID);
        __map.put("sEmpID", $sEmpID);
        __list.add($sManID);
        __map.put("sManID", $sManID);
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
    public void preInsert(com.ol.model.entity.Work entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.ol.model.entity.Work> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.ol.model.entity.Work entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.ol.model.entity.Work> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.ol.model.entity.Work entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.ol.model.entity.Work> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.ol.model.entity.Work entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.ol.model.entity.Work> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.ol.model.entity.Work entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.ol.model.entity.Work> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.ol.model.entity.Work entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.ol.model.entity.Work> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.Work, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.Work, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.Work, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.ol.model.entity.Work, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.ol.model.entity.Work, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.ol.model.entity.Work newEntity() {
        return new com.ol.model.entity.Work();
    }

    @Override
    public com.ol.model.entity.Work newEntity(java.util.Map<String, Object> __args) {
        return new com.ol.model.entity.Work();
    }

    @Override
    public Class<com.ol.model.entity.Work> getEntityClass() {
        return com.ol.model.entity.Work.class;
    }

    @Override
    public com.ol.model.entity.Work getOriginalStates(com.ol.model.entity.Work __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.ol.model.entity.Work __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Work getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Work newInstance() {
        return new _Work();
    }

}
