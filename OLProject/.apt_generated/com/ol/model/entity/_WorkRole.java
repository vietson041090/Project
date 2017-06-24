package com.ol.model.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2014-05-16T16:32:57.865+0700")
public final class _WorkRole extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.ol.model.entity.WorkRole> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final _WorkRole __singleton = new _WorkRole();

    /** the iID */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, com.ol.model.entity.WorkRole, java.lang.Integer, java.lang.Object> $iID = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, com.ol.model.entity.WorkRole, java.lang.Integer, java.lang.Object>(com.ol.model.entity.WorkRole.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "iID", "iID");

    /** the sRoleTitle */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.WorkRole, java.lang.String, java.lang.Object> $sRoleTitle = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.WorkRole, java.lang.String, java.lang.Object>(com.ol.model.entity.WorkRole.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sRoleTitle", "sRoleTitle", true, true);

    private final org.seasar.doma.jdbc.entity.NullEntityListener<com.ol.model.entity.WorkRole> __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.WorkRole, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.WorkRole, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.WorkRole, ?>> __entityPropertyTypeMap;

    private _WorkRole() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener<com.ol.model.entity.WorkRole>();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.SNAKE_UPPER_CASE;
        __immutable = false;
        __name = "WorkRole";
        __catalogName = "";
        __schemaName = "";
        __tableName = "WORK_ROLE";
        __qualifiedTableName = "WORK_ROLE";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.WorkRole, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.WorkRole, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.WorkRole, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.WorkRole, ?>>(2);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.WorkRole, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.WorkRole, ?>>(2);
        __idList.add($iID);
        __list.add($iID);
        __map.put("iID", $iID);
        __list.add($sRoleTitle);
        __map.put("sRoleTitle", $sRoleTitle);
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
    public void preInsert(com.ol.model.entity.WorkRole entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.ol.model.entity.WorkRole> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.ol.model.entity.WorkRole entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.ol.model.entity.WorkRole> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.ol.model.entity.WorkRole entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.ol.model.entity.WorkRole> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.ol.model.entity.WorkRole entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.ol.model.entity.WorkRole> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.ol.model.entity.WorkRole entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.ol.model.entity.WorkRole> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.ol.model.entity.WorkRole entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.ol.model.entity.WorkRole> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.WorkRole, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.WorkRole, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.WorkRole, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.ol.model.entity.WorkRole, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.ol.model.entity.WorkRole, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.ol.model.entity.WorkRole newEntity() {
        return new com.ol.model.entity.WorkRole();
    }

    @Override
    public com.ol.model.entity.WorkRole newEntity(java.util.Map<String, Object> __args) {
        return new com.ol.model.entity.WorkRole();
    }

    @Override
    public Class<com.ol.model.entity.WorkRole> getEntityClass() {
        return com.ol.model.entity.WorkRole.class;
    }

    @Override
    public com.ol.model.entity.WorkRole getOriginalStates(com.ol.model.entity.WorkRole __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.ol.model.entity.WorkRole __entity) {
    }

    /**
     * @return the singleton
     */
    public static _WorkRole getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _WorkRole newInstance() {
        return new _WorkRole();
    }

}
