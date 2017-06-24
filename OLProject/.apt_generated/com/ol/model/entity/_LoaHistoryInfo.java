package com.ol.model.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2014-05-19T14:59:59.518+0700")
public final class _LoaHistoryInfo extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.ol.model.entity.LoaHistoryInfo> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final _LoaHistoryInfo __singleton = new _LoaHistoryInfo();

    /** the dChgDate */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<com.ol.model.entity.LoaHistory, com.ol.model.entity.LoaHistoryInfo, java.sql.Date, java.lang.Object> $dChgDate = new org.seasar.doma.jdbc.entity.BasicPropertyType<com.ol.model.entity.LoaHistory, com.ol.model.entity.LoaHistoryInfo, java.sql.Date, java.lang.Object>(com.ol.model.entity.LoaHistoryInfo.class, java.sql.Date.class, org.seasar.doma.wrapper.DateWrapper.class, com.ol.model.entity._LoaHistory.getSingletonInternal().$dChgDate, null, "dChgDate", "dChgDate", true, true);

    /** the iID */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<com.ol.model.entity.LoaHistory, com.ol.model.entity.LoaHistoryInfo, java.lang.Integer, java.lang.Object> $iID = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<com.ol.model.entity.LoaHistory, com.ol.model.entity.LoaHistoryInfo, java.lang.Integer, java.lang.Object>(com.ol.model.entity.LoaHistoryInfo.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, com.ol.model.entity._LoaHistory.getSingletonInternal().$iID, null, "iID", "iID");

    /** the iLoaID */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<com.ol.model.entity.LoaHistory, com.ol.model.entity.LoaHistoryInfo, java.lang.Integer, java.lang.Object> $iLoaID = new org.seasar.doma.jdbc.entity.BasicPropertyType<com.ol.model.entity.LoaHistory, com.ol.model.entity.LoaHistoryInfo, java.lang.Integer, java.lang.Object>(com.ol.model.entity.LoaHistoryInfo.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, com.ol.model.entity._LoaHistory.getSingletonInternal().$iLoaID, null, "iLoaID", "iLoaID", true, true);

    /** the iOldSatus */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<com.ol.model.entity.LoaHistory, com.ol.model.entity.LoaHistoryInfo, java.lang.Integer, java.lang.Object> $iOldSatus = new org.seasar.doma.jdbc.entity.BasicPropertyType<com.ol.model.entity.LoaHistory, com.ol.model.entity.LoaHistoryInfo, java.lang.Integer, java.lang.Object>(com.ol.model.entity.LoaHistoryInfo.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, com.ol.model.entity._LoaHistory.getSingletonInternal().$iOldSatus, null, "iOldSatus", "iOldSatus", true, true);

    /** the iStatus */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<com.ol.model.entity.LoaHistory, com.ol.model.entity.LoaHistoryInfo, java.lang.Integer, java.lang.Object> $iStatus = new org.seasar.doma.jdbc.entity.BasicPropertyType<com.ol.model.entity.LoaHistory, com.ol.model.entity.LoaHistoryInfo, java.lang.Integer, java.lang.Object>(com.ol.model.entity.LoaHistoryInfo.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, com.ol.model.entity._LoaHistory.getSingletonInternal().$iStatus, null, "iStatus", "iStatus", true, true);

    /** the sManID */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<com.ol.model.entity.LoaHistory, com.ol.model.entity.LoaHistoryInfo, java.lang.String, java.lang.Object> $sManID = new org.seasar.doma.jdbc.entity.BasicPropertyType<com.ol.model.entity.LoaHistory, com.ol.model.entity.LoaHistoryInfo, java.lang.String, java.lang.Object>(com.ol.model.entity.LoaHistoryInfo.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, com.ol.model.entity._LoaHistory.getSingletonInternal().$sManID, null, "sManID", "sManID", true, true);

    /** the sNote */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<com.ol.model.entity.LoaHistory, com.ol.model.entity.LoaHistoryInfo, java.lang.String, java.lang.Object> $sNote = new org.seasar.doma.jdbc.entity.BasicPropertyType<com.ol.model.entity.LoaHistory, com.ol.model.entity.LoaHistoryInfo, java.lang.String, java.lang.Object>(com.ol.model.entity.LoaHistoryInfo.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, com.ol.model.entity._LoaHistory.getSingletonInternal().$sNote, null, "sNote", "sNote", true, true);

    /** the sEmpID */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaHistoryInfo, java.lang.String, java.lang.Object> $sEmpID = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaHistoryInfo, java.lang.String, java.lang.Object>(com.ol.model.entity.LoaHistoryInfo.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sEmpID", "sEmpID", true, true);

    /** the sFullname */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaHistoryInfo, java.lang.String, java.lang.Object> $sFullname = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaHistoryInfo, java.lang.String, java.lang.Object>(com.ol.model.entity.LoaHistoryInfo.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sFullname", "sFullname", true, true);

    /** the sKetQua */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaHistoryInfo, java.lang.String, java.lang.Object> $sKetQua = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.LoaHistoryInfo, java.lang.String, java.lang.Object>(com.ol.model.entity.LoaHistoryInfo.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sKetQua", "sKetQua", true, true);

    private final org.seasar.doma.jdbc.entity.NullEntityListener<com.ol.model.entity.LoaHistoryInfo> __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaHistoryInfo, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaHistoryInfo, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaHistoryInfo, ?>> __entityPropertyTypeMap;

    private _LoaHistoryInfo() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener<com.ol.model.entity.LoaHistoryInfo>();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.SNAKE_UPPER_CASE;
        __immutable = false;
        __name = "LoaHistoryInfo";
        __catalogName = "";
        __schemaName = "";
        __tableName = "LOA_HISTORY_INFO";
        __qualifiedTableName = "LOA_HISTORY_INFO";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaHistoryInfo, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaHistoryInfo, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaHistoryInfo, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaHistoryInfo, ?>>(10);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaHistoryInfo, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaHistoryInfo, ?>>(10);
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
        __list.add($sEmpID);
        __map.put("sEmpID", $sEmpID);
        __list.add($sFullname);
        __map.put("sFullname", $sFullname);
        __list.add($sKetQua);
        __map.put("sKetQua", $sKetQua);
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
    public void preInsert(com.ol.model.entity.LoaHistoryInfo entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.ol.model.entity.LoaHistoryInfo> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.ol.model.entity.LoaHistoryInfo entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.ol.model.entity.LoaHistoryInfo> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.ol.model.entity.LoaHistoryInfo entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.ol.model.entity.LoaHistoryInfo> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.ol.model.entity.LoaHistoryInfo entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.ol.model.entity.LoaHistoryInfo> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.ol.model.entity.LoaHistoryInfo entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.ol.model.entity.LoaHistoryInfo> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.ol.model.entity.LoaHistoryInfo entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.ol.model.entity.LoaHistoryInfo> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaHistoryInfo, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaHistoryInfo, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.LoaHistoryInfo, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.ol.model.entity.LoaHistoryInfo, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.ol.model.entity.LoaHistoryInfo, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.ol.model.entity.LoaHistoryInfo newEntity() {
        return new com.ol.model.entity.LoaHistoryInfo();
    }

    @Override
    public com.ol.model.entity.LoaHistoryInfo newEntity(java.util.Map<String, Object> __args) {
        return new com.ol.model.entity.LoaHistoryInfo();
    }

    @Override
    public Class<com.ol.model.entity.LoaHistoryInfo> getEntityClass() {
        return com.ol.model.entity.LoaHistoryInfo.class;
    }

    @Override
    public com.ol.model.entity.LoaHistoryInfo getOriginalStates(com.ol.model.entity.LoaHistoryInfo __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.ol.model.entity.LoaHistoryInfo __entity) {
    }

    /**
     * @return the singleton
     */
    public static _LoaHistoryInfo getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _LoaHistoryInfo newInstance() {
        return new _LoaHistoryInfo();
    }

}
