package com.ol.model.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2014-05-21T09:28:25.424+0700")
public final class _DayLoa extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.ol.model.entity.DayLoa> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final _DayLoa __singleton = new _DayLoa();

    /** the AllLoaDay */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.DayLoa, java.lang.Float, java.lang.Object> $AllLoaDay = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.DayLoa, java.lang.Float, java.lang.Object>(com.ol.model.entity.DayLoa.class, java.lang.Float.class, org.seasar.doma.wrapper.FloatWrapper.class, null, null, "AllLoaDay", "AllLoaDay", true, true);

    /** the EmpName */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.DayLoa, java.lang.String, java.lang.Object> $EmpName = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.DayLoa, java.lang.String, java.lang.Object>(com.ol.model.entity.DayLoa.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "EmpName", "EmpName", true, true);

    /** the OkLoaDay */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.DayLoa, java.sql.Date, java.lang.Object> $OkLoaDay = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.DayLoa, java.sql.Date, java.lang.Object>(com.ol.model.entity.DayLoa.class, java.sql.Date.class, org.seasar.doma.wrapper.DateWrapper.class, null, null, "OkLoaDay", "OkLoaDay", true, true);

    /** the ProjectName */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.DayLoa, java.lang.String, java.lang.Object> $ProjectName = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.DayLoa, java.lang.String, java.lang.Object>(com.ol.model.entity.DayLoa.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "ProjectName", "ProjectName", true, true);

    private final org.seasar.doma.jdbc.entity.NullEntityListener<com.ol.model.entity.DayLoa> __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.DayLoa, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.DayLoa, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.DayLoa, ?>> __entityPropertyTypeMap;

    private _DayLoa() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener<com.ol.model.entity.DayLoa>();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.SNAKE_UPPER_CASE;
        __immutable = false;
        __name = "DayLoa";
        __catalogName = "";
        __schemaName = "";
        __tableName = "DAY_LOA";
        __qualifiedTableName = "DAY_LOA";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.DayLoa, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.DayLoa, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.DayLoa, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.DayLoa, ?>>(4);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.DayLoa, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.DayLoa, ?>>(4);
        __list.add($AllLoaDay);
        __map.put("AllLoaDay", $AllLoaDay);
        __list.add($EmpName);
        __map.put("EmpName", $EmpName);
        __list.add($OkLoaDay);
        __map.put("OkLoaDay", $OkLoaDay);
        __list.add($ProjectName);
        __map.put("ProjectName", $ProjectName);
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
    public void preInsert(com.ol.model.entity.DayLoa entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.ol.model.entity.DayLoa> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.ol.model.entity.DayLoa entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.ol.model.entity.DayLoa> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.ol.model.entity.DayLoa entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.ol.model.entity.DayLoa> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.ol.model.entity.DayLoa entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.ol.model.entity.DayLoa> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.ol.model.entity.DayLoa entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.ol.model.entity.DayLoa> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.ol.model.entity.DayLoa entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.ol.model.entity.DayLoa> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.DayLoa, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.DayLoa, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.DayLoa, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.ol.model.entity.DayLoa, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.ol.model.entity.DayLoa, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.ol.model.entity.DayLoa newEntity() {
        return new com.ol.model.entity.DayLoa();
    }

    @Override
    public com.ol.model.entity.DayLoa newEntity(java.util.Map<String, Object> __args) {
        return new com.ol.model.entity.DayLoa();
    }

    @Override
    public Class<com.ol.model.entity.DayLoa> getEntityClass() {
        return com.ol.model.entity.DayLoa.class;
    }

    @Override
    public com.ol.model.entity.DayLoa getOriginalStates(com.ol.model.entity.DayLoa __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.ol.model.entity.DayLoa __entity) {
    }

    /**
     * @return the singleton
     */
    public static _DayLoa getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _DayLoa newInstance() {
        return new _DayLoa();
    }

}
