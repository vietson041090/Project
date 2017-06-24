package com.ol.model.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2014-05-16T16:32:57.815+0700")
public final class _TodayLetter extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.ol.model.entity.TodayLetter> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final _TodayLetter __singleton = new _TodayLetter();

    /** the dFromday */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.TodayLetter, java.util.Date, java.lang.Object> $dFromday = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.TodayLetter, java.util.Date, java.lang.Object>(com.ol.model.entity.TodayLetter.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, null, null, "dFromday", "dFromday", true, true);

    /** the iDayNo */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.TodayLetter, java.lang.Integer, java.lang.Object> $iDayNo = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.TodayLetter, java.lang.Integer, java.lang.Object>(com.ol.model.entity.TodayLetter.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "iDayNo", "iDayNo", true, true);

    /** the sEmpID */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.TodayLetter, java.lang.String, java.lang.Object> $sEmpID = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.TodayLetter, java.lang.String, java.lang.Object>(com.ol.model.entity.TodayLetter.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sEmpID", "sEmpID", true, true);

    /** the sFullname */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.TodayLetter, java.lang.String, java.lang.Object> $sFullname = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.TodayLetter, java.lang.String, java.lang.Object>(com.ol.model.entity.TodayLetter.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sFullname", "sFullname", true, true);

    /** the sReason */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.TodayLetter, java.lang.String, java.lang.Object> $sReason = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.TodayLetter, java.lang.String, java.lang.Object>(com.ol.model.entity.TodayLetter.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sReason", "sReason", true, true);

    private final org.seasar.doma.jdbc.entity.NullEntityListener<com.ol.model.entity.TodayLetter> __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.TodayLetter, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.TodayLetter, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.TodayLetter, ?>> __entityPropertyTypeMap;

    private _TodayLetter() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener<com.ol.model.entity.TodayLetter>();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __immutable = false;
        __name = "TodayLetter";
        __catalogName = "";
        __schemaName = "";
        __tableName = "TodayLetter";
        __qualifiedTableName = "TodayLetter";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.TodayLetter, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.TodayLetter, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.TodayLetter, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.TodayLetter, ?>>(5);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.TodayLetter, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.TodayLetter, ?>>(5);
        __list.add($dFromday);
        __map.put("dFromday", $dFromday);
        __list.add($iDayNo);
        __map.put("iDayNo", $iDayNo);
        __list.add($sEmpID);
        __map.put("sEmpID", $sEmpID);
        __list.add($sFullname);
        __map.put("sFullname", $sFullname);
        __list.add($sReason);
        __map.put("sReason", $sReason);
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
    public void preInsert(com.ol.model.entity.TodayLetter entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.ol.model.entity.TodayLetter> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.ol.model.entity.TodayLetter entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.ol.model.entity.TodayLetter> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.ol.model.entity.TodayLetter entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.ol.model.entity.TodayLetter> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.ol.model.entity.TodayLetter entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.ol.model.entity.TodayLetter> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.ol.model.entity.TodayLetter entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.ol.model.entity.TodayLetter> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.ol.model.entity.TodayLetter entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.ol.model.entity.TodayLetter> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.TodayLetter, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.TodayLetter, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.TodayLetter, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.ol.model.entity.TodayLetter, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.ol.model.entity.TodayLetter, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.ol.model.entity.TodayLetter newEntity() {
        return new com.ol.model.entity.TodayLetter();
    }

    @Override
    public com.ol.model.entity.TodayLetter newEntity(java.util.Map<String, Object> __args) {
        return new com.ol.model.entity.TodayLetter();
    }

    @Override
    public Class<com.ol.model.entity.TodayLetter> getEntityClass() {
        return com.ol.model.entity.TodayLetter.class;
    }

    @Override
    public com.ol.model.entity.TodayLetter getOriginalStates(com.ol.model.entity.TodayLetter __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.ol.model.entity.TodayLetter __entity) {
    }

    /**
     * @return the singleton
     */
    public static _TodayLetter getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _TodayLetter newInstance() {
        return new _TodayLetter();
    }

}
