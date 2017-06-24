package com.ol.model.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2014-05-21T13:27:52.531+0700")
public final class _LoaDetail extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.ol.model.entity.LoaDetail> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final _LoaDetail __singleton = new _LoaDetail();

    private final org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator();

    /** the dFromday */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaDetail, java.util.Date, java.lang.Object> $dFromday = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaDetail, java.util.Date, java.lang.Object>(com.ol.model.entity.LoaDetail.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, null, null, "dFromday", "dFromday", true, true);

    /** the dToday */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaDetail, java.util.Date, java.lang.Object> $dToday = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaDetail, java.util.Date, java.lang.Object>(com.ol.model.entity.LoaDetail.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, null, null, "dToday", "dToday", true, true);

    /** the iDayno */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaDetail, java.lang.Float, java.lang.Object> $iDayno = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaDetail, java.lang.Float, java.lang.Object>(com.ol.model.entity.LoaDetail.class, java.lang.Float.class, org.seasar.doma.wrapper.FloatWrapper.class, null, null, "iDayno", "iDayno", true, true);

    /** the iID */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.ol.model.entity.LoaDetail, java.lang.Integer, java.lang.Object> $iID = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.ol.model.entity.LoaDetail, java.lang.Integer, java.lang.Object>(com.ol.model.entity.LoaDetail.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "iID", "iID", __idGenerator);

    /** the iLoaID */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaDetail, java.lang.Integer, java.lang.Object> $iLoaID = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaDetail, java.lang.Integer, java.lang.Object>(com.ol.model.entity.LoaDetail.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "iLoaID", "iLoaID", true, true);

    /** the iType */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaDetail, java.lang.Integer, java.lang.Object> $iType = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaDetail, java.lang.Integer, java.lang.Object>(com.ol.model.entity.LoaDetail.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "iType", "iType", true, true);

    /** the sReason */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaDetail, java.lang.String, java.lang.Object> $sReason = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaDetail, java.lang.String, java.lang.Object>(com.ol.model.entity.LoaDetail.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sReason", "sReason", true, true);

    private final org.seasar.doma.jdbc.entity.NullEntityListener<com.ol.model.entity.LoaDetail> __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaDetail, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaDetail, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaDetail, ?>> __entityPropertyTypeMap;

    private _LoaDetail() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener<com.ol.model.entity.LoaDetail>();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.SNAKE_UPPER_CASE;
        __immutable = false;
        __name = "LoaDetail";
        __catalogName = "";
        __schemaName = "";
        __tableName = "OL_LoaDetail";
        __qualifiedTableName = "OL_LoaDetail";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaDetail, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaDetail, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaDetail, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaDetail, ?>>(7);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaDetail, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaDetail, ?>>(7);
        __list.add($dFromday);
        __map.put("dFromday", $dFromday);
        __list.add($dToday);
        __map.put("dToday", $dToday);
        __list.add($iDayno);
        __map.put("iDayno", $iDayno);
        __idList.add($iID);
        __list.add($iID);
        __map.put("iID", $iID);
        __list.add($iLoaID);
        __map.put("iLoaID", $iLoaID);
        __list.add($iType);
        __map.put("iType", $iType);
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
    public void preInsert(com.ol.model.entity.LoaDetail entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.ol.model.entity.LoaDetail> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.ol.model.entity.LoaDetail entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.ol.model.entity.LoaDetail> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.ol.model.entity.LoaDetail entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.ol.model.entity.LoaDetail> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.ol.model.entity.LoaDetail entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.ol.model.entity.LoaDetail> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.ol.model.entity.LoaDetail entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.ol.model.entity.LoaDetail> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.ol.model.entity.LoaDetail entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.ol.model.entity.LoaDetail> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaDetail, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaDetail, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaDetail, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.ol.model.entity.LoaDetail, ?, ?> getGeneratedIdPropertyType() {
        return $iID;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.ol.model.entity.LoaDetail, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.ol.model.entity.LoaDetail newEntity() {
        return new com.ol.model.entity.LoaDetail();
    }

    @Override
    public com.ol.model.entity.LoaDetail newEntity(java.util.Map<String, Object> __args) {
        return new com.ol.model.entity.LoaDetail();
    }

    @Override
    public Class<com.ol.model.entity.LoaDetail> getEntityClass() {
        return com.ol.model.entity.LoaDetail.class;
    }

    @Override
    public com.ol.model.entity.LoaDetail getOriginalStates(com.ol.model.entity.LoaDetail __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.ol.model.entity.LoaDetail __entity) {
    }

    /**
     * @return the singleton
     */
    public static _LoaDetail getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _LoaDetail newInstance() {
        return new _LoaDetail();
    }

}
