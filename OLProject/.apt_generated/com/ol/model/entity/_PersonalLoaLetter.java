package com.ol.model.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2014-05-16T16:32:57.835+0700")
public final class _PersonalLoaLetter extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.ol.model.entity.PersonalLoaLetter> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final _PersonalLoaLetter __singleton = new _PersonalLoaLetter();

    /** the dSentday */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.PersonalLoaLetter, java.sql.Date, java.lang.Object> $dSentday = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.PersonalLoaLetter, java.sql.Date, java.lang.Object>(com.ol.model.entity.PersonalLoaLetter.class, java.sql.Date.class, org.seasar.doma.wrapper.DateWrapper.class, null, null, "dSentday", "dSentday", true, true);

    /** the iID */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.PersonalLoaLetter, java.lang.Integer, java.lang.Object> $iID = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.PersonalLoaLetter, java.lang.Integer, java.lang.Object>(com.ol.model.entity.PersonalLoaLetter.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "iID", "iID", true, true);

    /** the iPrjID */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.PersonalLoaLetter, java.lang.Integer, java.lang.Object> $iPrjID = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.PersonalLoaLetter, java.lang.Integer, java.lang.Object>(com.ol.model.entity.PersonalLoaLetter.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "iPrjID", "iPrjID", true, true);

    /** the iStatus */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.PersonalLoaLetter, java.lang.Integer, java.lang.Object> $iStatus = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.PersonalLoaLetter, java.lang.Integer, java.lang.Object>(com.ol.model.entity.PersonalLoaLetter.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "iStatus", "iStatus", true, true);

    /** the sCode */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.PersonalLoaLetter, java.lang.String, java.lang.Object> $sCode = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.PersonalLoaLetter, java.lang.String, java.lang.Object>(com.ol.model.entity.PersonalLoaLetter.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sCode", "sCode", true, true);

    /** the sEmpID */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.PersonalLoaLetter, java.lang.String, java.lang.Object> $sEmpID = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.PersonalLoaLetter, java.lang.String, java.lang.Object>(com.ol.model.entity.PersonalLoaLetter.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sEmpID", "sEmpID", true, true);

    /** the sFullName */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.PersonalLoaLetter, java.lang.String, java.lang.Object> $sFullName = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.PersonalLoaLetter, java.lang.String, java.lang.Object>(com.ol.model.entity.PersonalLoaLetter.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sFullName", "sFullName", true, true);

    /** the sNextManID */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.PersonalLoaLetter, java.lang.String, java.lang.Object> $sNextManID = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.PersonalLoaLetter, java.lang.String, java.lang.Object>(com.ol.model.entity.PersonalLoaLetter.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sNextManID", "sNextManID", true, true);

    private final org.seasar.doma.jdbc.entity.NullEntityListener<com.ol.model.entity.PersonalLoaLetter> __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.PersonalLoaLetter, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.PersonalLoaLetter, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.PersonalLoaLetter, ?>> __entityPropertyTypeMap;

    private _PersonalLoaLetter() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener<com.ol.model.entity.PersonalLoaLetter>();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.SNAKE_UPPER_CASE;
        __immutable = false;
        __name = "PersonalLoaLetter";
        __catalogName = "";
        __schemaName = "";
        __tableName = "PERSONAL_LOA_LETTER";
        __qualifiedTableName = "PERSONAL_LOA_LETTER";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.PersonalLoaLetter, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.PersonalLoaLetter, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.PersonalLoaLetter, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.PersonalLoaLetter, ?>>(8);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.PersonalLoaLetter, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.PersonalLoaLetter, ?>>(8);
        __list.add($dSentday);
        __map.put("dSentday", $dSentday);
        __list.add($iID);
        __map.put("iID", $iID);
        __list.add($iPrjID);
        __map.put("iPrjID", $iPrjID);
        __list.add($iStatus);
        __map.put("iStatus", $iStatus);
        __list.add($sCode);
        __map.put("sCode", $sCode);
        __list.add($sEmpID);
        __map.put("sEmpID", $sEmpID);
        __list.add($sFullName);
        __map.put("sFullName", $sFullName);
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
    public void preInsert(com.ol.model.entity.PersonalLoaLetter entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.ol.model.entity.PersonalLoaLetter> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.ol.model.entity.PersonalLoaLetter entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.ol.model.entity.PersonalLoaLetter> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.ol.model.entity.PersonalLoaLetter entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.ol.model.entity.PersonalLoaLetter> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.ol.model.entity.PersonalLoaLetter entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.ol.model.entity.PersonalLoaLetter> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.ol.model.entity.PersonalLoaLetter entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.ol.model.entity.PersonalLoaLetter> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.ol.model.entity.PersonalLoaLetter entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.ol.model.entity.PersonalLoaLetter> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.PersonalLoaLetter, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.PersonalLoaLetter, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.PersonalLoaLetter, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.ol.model.entity.PersonalLoaLetter, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.ol.model.entity.PersonalLoaLetter, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.ol.model.entity.PersonalLoaLetter newEntity() {
        return new com.ol.model.entity.PersonalLoaLetter();
    }

    @Override
    public com.ol.model.entity.PersonalLoaLetter newEntity(java.util.Map<String, Object> __args) {
        return new com.ol.model.entity.PersonalLoaLetter();
    }

    @Override
    public Class<com.ol.model.entity.PersonalLoaLetter> getEntityClass() {
        return com.ol.model.entity.PersonalLoaLetter.class;
    }

    @Override
    public com.ol.model.entity.PersonalLoaLetter getOriginalStates(com.ol.model.entity.PersonalLoaLetter __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.ol.model.entity.PersonalLoaLetter __entity) {
    }

    /**
     * @return the singleton
     */
    public static _PersonalLoaLetter getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _PersonalLoaLetter newInstance() {
        return new _PersonalLoaLetter();
    }

}
