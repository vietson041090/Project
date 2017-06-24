package com.ol.model.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2014-05-20T08:35:36.454+0700")
public final class _ProjectMember extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.ol.model.entity.ProjectMember> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final _ProjectMember __singleton = new _ProjectMember();

    /** the iRoleID */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.ProjectMember, java.lang.Integer, java.lang.Object> $iRoleID = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.ProjectMember, java.lang.Integer, java.lang.Object>(com.ol.model.entity.ProjectMember.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "iRoleID", "iRolID", true, true);

    /** the iWorkID */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.ProjectMember, java.lang.String, java.lang.Object> $iWorkID = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.ProjectMember, java.lang.String, java.lang.Object>(com.ol.model.entity.ProjectMember.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "iWorkID", "iID", true, true);

    /** the sDisplay */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.ProjectMember, java.lang.String, java.lang.Object> $sDisplay = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.ProjectMember, java.lang.String, java.lang.Object>(com.ol.model.entity.ProjectMember.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sDisplay", "sDisplay", true, true);

    /** the sEmployeeId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.ProjectMember, java.lang.String, java.lang.Object> $sEmployeeId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.ProjectMember, java.lang.String, java.lang.Object>(com.ol.model.entity.ProjectMember.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sEmployeeId", "sID", true, true);

    /** the sEmployeeName */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.ProjectMember, java.lang.String, java.lang.Object> $sEmployeeName = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.ProjectMember, java.lang.String, java.lang.Object>(com.ol.model.entity.ProjectMember.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sEmployeeName", "sFullName", true, true);

    /** the sManagerId */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.ProjectMember, java.lang.String, java.lang.Object> $sManagerId = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.ProjectMember, java.lang.String, java.lang.Object>(com.ol.model.entity.ProjectMember.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sManagerId", "sManID", true, true);

    /** the sManagerName */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.ProjectMember, java.lang.String, java.lang.Object> $sManagerName = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.ProjectMember, java.lang.String, java.lang.Object>(com.ol.model.entity.ProjectMember.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sManagerName", "sManFullName", true, true);

    private final org.seasar.doma.jdbc.entity.NullEntityListener<com.ol.model.entity.ProjectMember> __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.ProjectMember, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.ProjectMember, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.ProjectMember, ?>> __entityPropertyTypeMap;

    private _ProjectMember() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener<com.ol.model.entity.ProjectMember>();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __immutable = false;
        __name = "ProjectMember";
        __catalogName = "";
        __schemaName = "";
        __tableName = "ProjectMember";
        __qualifiedTableName = "ProjectMember";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.ProjectMember, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.ProjectMember, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.ProjectMember, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.ProjectMember, ?>>(7);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.ProjectMember, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.ProjectMember, ?>>(7);
        __list.add($iRoleID);
        __map.put("iRoleID", $iRoleID);
        __list.add($iWorkID);
        __map.put("iWorkID", $iWorkID);
        __list.add($sDisplay);
        __map.put("sDisplay", $sDisplay);
        __list.add($sEmployeeId);
        __map.put("sEmployeeId", $sEmployeeId);
        __list.add($sEmployeeName);
        __map.put("sEmployeeName", $sEmployeeName);
        __list.add($sManagerId);
        __map.put("sManagerId", $sManagerId);
        __list.add($sManagerName);
        __map.put("sManagerName", $sManagerName);
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
    public void preInsert(com.ol.model.entity.ProjectMember entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.ol.model.entity.ProjectMember> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.ol.model.entity.ProjectMember entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.ol.model.entity.ProjectMember> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.ol.model.entity.ProjectMember entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.ol.model.entity.ProjectMember> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.ol.model.entity.ProjectMember entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.ol.model.entity.ProjectMember> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.ol.model.entity.ProjectMember entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.ol.model.entity.ProjectMember> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.ol.model.entity.ProjectMember entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.ol.model.entity.ProjectMember> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.ProjectMember, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.ProjectMember, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.ProjectMember, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.ol.model.entity.ProjectMember, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.ol.model.entity.ProjectMember, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.ol.model.entity.ProjectMember newEntity() {
        return new com.ol.model.entity.ProjectMember();
    }

    @Override
    public com.ol.model.entity.ProjectMember newEntity(java.util.Map<String, Object> __args) {
        return new com.ol.model.entity.ProjectMember();
    }

    @Override
    public Class<com.ol.model.entity.ProjectMember> getEntityClass() {
        return com.ol.model.entity.ProjectMember.class;
    }

    @Override
    public com.ol.model.entity.ProjectMember getOriginalStates(com.ol.model.entity.ProjectMember __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.ol.model.entity.ProjectMember __entity) {
    }

    /**
     * @return the singleton
     */
    public static _ProjectMember getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _ProjectMember newInstance() {
        return new _ProjectMember();
    }

}
