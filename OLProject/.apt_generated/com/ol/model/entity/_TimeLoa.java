package com.ol.model.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2014-05-16T16:32:57.805+0700")
public final class _TimeLoa extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.ol.model.entity.TimeLoa> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final _TimeLoa __singleton = new _TimeLoa();

    /** the EmpName */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.TimeLoa, java.lang.String, java.lang.Object> $EmpName = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.TimeLoa, java.lang.String, java.lang.Object>(com.ol.model.entity.TimeLoa.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "EmpName", "EmpName", true, true);

    /** the FromDay */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.TimeLoa, java.sql.Date, java.lang.Object> $FromDay = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.TimeLoa, java.sql.Date, java.lang.Object>(com.ol.model.entity.TimeLoa.class, java.sql.Date.class, org.seasar.doma.wrapper.DateWrapper.class, null, null, "FromDay", "FromDay", true, true);

    /** the LoaID */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.TimeLoa, java.lang.Integer, java.lang.Object> $LoaID = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.TimeLoa, java.lang.Integer, java.lang.Object>(com.ol.model.entity.TimeLoa.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "LoaID", "LoaID", true, true);

    /** the SentDay */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.TimeLoa, java.sql.Date, java.lang.Object> $SentDay = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.TimeLoa, java.sql.Date, java.lang.Object>(com.ol.model.entity.TimeLoa.class, java.sql.Date.class, org.seasar.doma.wrapper.DateWrapper.class, null, null, "SentDay", "SentDay", true, true);

    /** the ToDay */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.TimeLoa, java.sql.Date, java.lang.Object> $ToDay = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.TimeLoa, java.sql.Date, java.lang.Object>(com.ol.model.entity.TimeLoa.class, java.sql.Date.class, org.seasar.doma.wrapper.DateWrapper.class, null, null, "ToDay", "ToDay", true, true);

    private final org.seasar.doma.jdbc.entity.NullEntityListener<com.ol.model.entity.TimeLoa> __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.TimeLoa, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.TimeLoa, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.TimeLoa, ?>> __entityPropertyTypeMap;

    private _TimeLoa() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener<com.ol.model.entity.TimeLoa>();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.SNAKE_UPPER_CASE;
        __immutable = false;
        __name = "TimeLoa";
        __catalogName = "";
        __schemaName = "";
        __tableName = "TIME_LOA";
        __qualifiedTableName = "TIME_LOA";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.TimeLoa, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.TimeLoa, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.TimeLoa, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.TimeLoa, ?>>(5);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.TimeLoa, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.TimeLoa, ?>>(5);
        __list.add($EmpName);
        __map.put("EmpName", $EmpName);
        __list.add($FromDay);
        __map.put("FromDay", $FromDay);
        __list.add($LoaID);
        __map.put("LoaID", $LoaID);
        __list.add($SentDay);
        __map.put("SentDay", $SentDay);
        __list.add($ToDay);
        __map.put("ToDay", $ToDay);
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
    public void preInsert(com.ol.model.entity.TimeLoa entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.ol.model.entity.TimeLoa> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.ol.model.entity.TimeLoa entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.ol.model.entity.TimeLoa> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.ol.model.entity.TimeLoa entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.ol.model.entity.TimeLoa> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.ol.model.entity.TimeLoa entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.ol.model.entity.TimeLoa> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.ol.model.entity.TimeLoa entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.ol.model.entity.TimeLoa> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.ol.model.entity.TimeLoa entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.ol.model.entity.TimeLoa> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.TimeLoa, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.TimeLoa, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.TimeLoa, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.ol.model.entity.TimeLoa, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.ol.model.entity.TimeLoa, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.ol.model.entity.TimeLoa newEntity() {
        return new com.ol.model.entity.TimeLoa();
    }

    @Override
    public com.ol.model.entity.TimeLoa newEntity(java.util.Map<String, Object> __args) {
        return new com.ol.model.entity.TimeLoa();
    }

    @Override
    public Class<com.ol.model.entity.TimeLoa> getEntityClass() {
        return com.ol.model.entity.TimeLoa.class;
    }

    @Override
    public com.ol.model.entity.TimeLoa getOriginalStates(com.ol.model.entity.TimeLoa __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.ol.model.entity.TimeLoa __entity) {
    }

    /**
     * @return the singleton
     */
    public static _TimeLoa getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _TimeLoa newInstance() {
        return new _TimeLoa();
    }

}
