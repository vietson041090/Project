package com.ol.model.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2014-05-16T16:32:57.835+0700")
public final class _Authorization extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.ol.model.entity.Authorization> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final _Authorization __singleton = new _Authorization();

    /** the dFromday */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Authorization, java.util.Date, java.lang.Object> $dFromday = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Authorization, java.util.Date, java.lang.Object>(com.ol.model.entity.Authorization.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, null, null, "dFromday", "dFromday", true, true);

    /** the dToday */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Authorization, java.util.Date, java.lang.Object> $dToday = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Authorization, java.util.Date, java.lang.Object>(com.ol.model.entity.Authorization.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, null, null, "dToday", "dToday", true, true);

    /** the iID */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, com.ol.model.entity.Authorization, java.lang.Integer, java.lang.Object> $iID = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, com.ol.model.entity.Authorization, java.lang.Integer, java.lang.Object>(com.ol.model.entity.Authorization.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "iID", "iID");

    /** the iStatus */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Authorization, java.lang.Integer, java.lang.Object> $iStatus = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Authorization, java.lang.Integer, java.lang.Object>(com.ol.model.entity.Authorization.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "iStatus", "iStatus", true, true);

    /** the iWorkID */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Authorization, java.lang.Integer, java.lang.Object> $iWorkID = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Authorization, java.lang.Integer, java.lang.Object>(com.ol.model.entity.Authorization.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "iWorkID", "iWorkID", true, true);

    /** the sEmpID */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Authorization, java.lang.String, java.lang.Object> $sEmpID = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Authorization, java.lang.String, java.lang.Object>(com.ol.model.entity.Authorization.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sEmpID", "sEmpID", true, true);

    /** the sToEmpID */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Authorization, java.lang.String, java.lang.Object> $sToEmpID = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Authorization, java.lang.String, java.lang.Object>(com.ol.model.entity.Authorization.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sToEmpID", "sToEmpID", true, true);

    private final org.seasar.doma.jdbc.entity.NullEntityListener<com.ol.model.entity.Authorization> __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.Authorization, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.Authorization, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.Authorization, ?>> __entityPropertyTypeMap;

    private _Authorization() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener<com.ol.model.entity.Authorization>();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.SNAKE_UPPER_CASE;
        __immutable = false;
        __name = "Authorization";
        __catalogName = "";
        __schemaName = "";
        __tableName = "OL_Authorization";
        __qualifiedTableName = "OL_Authorization";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.Authorization, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.Authorization, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.Authorization, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.Authorization, ?>>(7);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.Authorization, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.Authorization, ?>>(7);
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
    public void preInsert(com.ol.model.entity.Authorization entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.ol.model.entity.Authorization> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.ol.model.entity.Authorization entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.ol.model.entity.Authorization> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.ol.model.entity.Authorization entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.ol.model.entity.Authorization> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.ol.model.entity.Authorization entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.ol.model.entity.Authorization> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.ol.model.entity.Authorization entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.ol.model.entity.Authorization> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.ol.model.entity.Authorization entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.ol.model.entity.Authorization> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.Authorization, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.Authorization, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.Authorization, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.ol.model.entity.Authorization, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.ol.model.entity.Authorization, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.ol.model.entity.Authorization newEntity() {
        return new com.ol.model.entity.Authorization();
    }

    @Override
    public com.ol.model.entity.Authorization newEntity(java.util.Map<String, Object> __args) {
        return new com.ol.model.entity.Authorization();
    }

    @Override
    public Class<com.ol.model.entity.Authorization> getEntityClass() {
        return com.ol.model.entity.Authorization.class;
    }

    @Override
    public com.ol.model.entity.Authorization getOriginalStates(com.ol.model.entity.Authorization __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.ol.model.entity.Authorization __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Authorization getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Authorization newInstance() {
        return new _Authorization();
    }

}
