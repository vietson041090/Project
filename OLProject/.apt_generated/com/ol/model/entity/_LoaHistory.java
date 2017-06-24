package com.ol.model.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2014-05-16T16:32:57.855+0700")
public final class _LoaHistory extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.ol.model.entity.LoaHistory> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final _LoaHistory __singleton = new _LoaHistory();

    /** the dChgDate */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaHistory, java.sql.Date, java.lang.Object> $dChgDate = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaHistory, java.sql.Date, java.lang.Object>(com.ol.model.entity.LoaHistory.class, java.sql.Date.class, org.seasar.doma.wrapper.DateWrapper.class, null, null, "dChgDate", "dChgDate", true, true);

    /** the iID */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, com.ol.model.entity.LoaHistory, java.lang.Integer, java.lang.Object> $iID = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, com.ol.model.entity.LoaHistory, java.lang.Integer, java.lang.Object>(com.ol.model.entity.LoaHistory.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "iID", "iID");

    /** the iLoaID */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaHistory, java.lang.Integer, java.lang.Object> $iLoaID = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaHistory, java.lang.Integer, java.lang.Object>(com.ol.model.entity.LoaHistory.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "iLoaID", "iLoaID", true, true);

    /** the iOldSatus */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaHistory, java.lang.Integer, java.lang.Object> $iOldSatus = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaHistory, java.lang.Integer, java.lang.Object>(com.ol.model.entity.LoaHistory.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "iOldSatus", "iOldSatus", true, true);

    /** the iStatus */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaHistory, java.lang.Integer, java.lang.Object> $iStatus = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaHistory, java.lang.Integer, java.lang.Object>(com.ol.model.entity.LoaHistory.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "iStatus", "iStatus", true, true);

    /** the sManID */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaHistory, java.lang.String, java.lang.Object> $sManID = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaHistory, java.lang.String, java.lang.Object>(com.ol.model.entity.LoaHistory.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sManID", "sManID", true, true);

    /** the sNote */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaHistory, java.lang.String, java.lang.Object> $sNote = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaHistory, java.lang.String, java.lang.Object>(com.ol.model.entity.LoaHistory.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sNote", "sNote", true, true);

    private final org.seasar.doma.jdbc.entity.NullEntityListener<com.ol.model.entity.LoaHistory> __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaHistory, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaHistory, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaHistory, ?>> __entityPropertyTypeMap;

    private _LoaHistory() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener<com.ol.model.entity.LoaHistory>();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.SNAKE_UPPER_CASE;
        __immutable = false;
        __name = "LoaHistory";
        __catalogName = "";
        __schemaName = "";
        __tableName = "OL_LoaHistory";
        __qualifiedTableName = "OL_LoaHistory";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaHistory, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaHistory, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaHistory, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaHistory, ?>>(7);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaHistory, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaHistory, ?>>(7);
        __list.add($dChgDate);
        __map.put("dChgDate", $dChgDate);
        __idList.add($iID);
        __list.add($iID);
        __map.put("iID", $iID);
        __list.add($iLoaID);
        __map.put("iLoaID", $iLoaID);
        __list.add($iOldSatus);
        __map.put("iOldSatus", $iOldSatus);
        __list.add($iStatus);
        __map.put("iStatus", $iStatus);
        __list.add($sManID);
        __map.put("sManID", $sManID);
        __list.add($sNote);
        __map.put("sNote", $sNote);
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
    public void preInsert(com.ol.model.entity.LoaHistory entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.ol.model.entity.LoaHistory> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.ol.model.entity.LoaHistory entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.ol.model.entity.LoaHistory> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.ol.model.entity.LoaHistory entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.ol.model.entity.LoaHistory> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.ol.model.entity.LoaHistory entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.ol.model.entity.LoaHistory> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.ol.model.entity.LoaHistory entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.ol.model.entity.LoaHistory> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.ol.model.entity.LoaHistory entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.ol.model.entity.LoaHistory> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaHistory, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaHistory, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaHistory, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.ol.model.entity.LoaHistory, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.ol.model.entity.LoaHistory, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.ol.model.entity.LoaHistory newEntity() {
        return new com.ol.model.entity.LoaHistory();
    }

    @Override
    public com.ol.model.entity.LoaHistory newEntity(java.util.Map<String, Object> __args) {
        return new com.ol.model.entity.LoaHistory();
    }

    @Override
    public Class<com.ol.model.entity.LoaHistory> getEntityClass() {
        return com.ol.model.entity.LoaHistory.class;
    }

    @Override
    public com.ol.model.entity.LoaHistory getOriginalStates(com.ol.model.entity.LoaHistory __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.ol.model.entity.LoaHistory __entity) {
    }

    /**
     * @return the singleton
     */
    public static _LoaHistory getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _LoaHistory newInstance() {
        return new _LoaHistory();
    }

}
