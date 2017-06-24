package com.ol.model.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2014-05-21T13:27:52.226+0700")
public final class _LoaLetter extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.ol.model.entity.LoaLetter> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final _LoaLetter __singleton = new _LoaLetter();

    private final org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator();

    /** the dSentday */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaLetter, java.sql.Date, java.lang.Object> $dSentday = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaLetter, java.sql.Date, java.lang.Object>(com.ol.model.entity.LoaLetter.class, java.sql.Date.class, org.seasar.doma.wrapper.DateWrapper.class, null, null, "dSentday", "dSentday", true, true);

    /** the iID */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.ol.model.entity.LoaLetter, java.lang.Integer, java.lang.Object> $iID = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.ol.model.entity.LoaLetter, java.lang.Integer, java.lang.Object>(com.ol.model.entity.LoaLetter.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "iID", "iID", __idGenerator);

    /** the iPrjID */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaLetter, java.lang.Integer, java.lang.Object> $iPrjID = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaLetter, java.lang.Integer, java.lang.Object>(com.ol.model.entity.LoaLetter.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "iPrjID", "iPrjID", true, true);

    /** the iStatus */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaLetter, java.lang.Integer, java.lang.Object> $iStatus = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaLetter, java.lang.Integer, java.lang.Object>(com.ol.model.entity.LoaLetter.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "iStatus", "iStatus", true, true);

    /** the sEmpID */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaLetter, java.lang.String, java.lang.Object> $sEmpID = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaLetter, java.lang.String, java.lang.Object>(com.ol.model.entity.LoaLetter.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sEmpID", "sEmpID", true, true);

    /** the sNextManID */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaLetter, java.lang.String, java.lang.Object> $sNextManID = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaLetter, java.lang.String, java.lang.Object>(com.ol.model.entity.LoaLetter.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sNextManID", "sNextManID", true, true);

    private final org.seasar.doma.jdbc.entity.NullEntityListener<com.ol.model.entity.LoaLetter> __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaLetter, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaLetter, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaLetter, ?>> __entityPropertyTypeMap;

    private _LoaLetter() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener<com.ol.model.entity.LoaLetter>();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.SNAKE_UPPER_CASE;
        __immutable = false;
        __name = "LoaLetter";
        __catalogName = "";
        __schemaName = "";
        __tableName = "OL_LoaLetter";
        __qualifiedTableName = "OL_LoaLetter";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaLetter, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaLetter, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaLetter, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaLetter, ?>>(6);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaLetter, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaLetter, ?>>(6);
        __list.add($dSentday);
        __map.put("dSentday", $dSentday);
        __idList.add($iID);
        __list.add($iID);
        __map.put("iID", $iID);
        __list.add($iPrjID);
        __map.put("iPrjID", $iPrjID);
        __list.add($iStatus);
        __map.put("iStatus", $iStatus);
        __list.add($sEmpID);
        __map.put("sEmpID", $sEmpID);
        __list.add($sNextManID);
        __map.put("sNextManID", $sNextManID);
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
    public void preInsert(com.ol.model.entity.LoaLetter entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.ol.model.entity.LoaLetter> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.ol.model.entity.LoaLetter entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.ol.model.entity.LoaLetter> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.ol.model.entity.LoaLetter entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.ol.model.entity.LoaLetter> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.ol.model.entity.LoaLetter entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.ol.model.entity.LoaLetter> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.ol.model.entity.LoaLetter entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.ol.model.entity.LoaLetter> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.ol.model.entity.LoaLetter entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.ol.model.entity.LoaLetter> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaLetter, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaLetter, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaLetter, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.ol.model.entity.LoaLetter, ?, ?> getGeneratedIdPropertyType() {
        return $iID;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.ol.model.entity.LoaLetter, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.ol.model.entity.LoaLetter newEntity() {
        return new com.ol.model.entity.LoaLetter();
    }

    @Override
    public com.ol.model.entity.LoaLetter newEntity(java.util.Map<String, Object> __args) {
        return new com.ol.model.entity.LoaLetter();
    }

    @Override
    public Class<com.ol.model.entity.LoaLetter> getEntityClass() {
        return com.ol.model.entity.LoaLetter.class;
    }

    @Override
    public com.ol.model.entity.LoaLetter getOriginalStates(com.ol.model.entity.LoaLetter __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.ol.model.entity.LoaLetter __entity) {
    }

    /**
     * @return the singleton
     */
    public static _LoaLetter getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _LoaLetter newInstance() {
        return new _LoaLetter();
    }

}
