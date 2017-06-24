package com.ol.model.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2014-05-16T16:32:57.825+0700")
public final class _ProjectInformation extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.ol.model.entity.ProjectInformation> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final _ProjectInformation __singleton = new _ProjectInformation();

    /** the dStartday */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<com.ol.model.entity.Project, com.ol.model.entity.ProjectInformation, java.util.Date, java.lang.Object> $dStartday = new org.seasar.doma.jdbc.entity.BasicPropertyType<com.ol.model.entity.Project, com.ol.model.entity.ProjectInformation, java.util.Date, java.lang.Object>(com.ol.model.entity.ProjectInformation.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, com.ol.model.entity._Project.getSingletonInternal().$dStartday, null, "dStartday", "dStartday", true, true);

    /** the iID */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<com.ol.model.entity.Project, com.ol.model.entity.ProjectInformation, java.lang.Integer, java.lang.Object> $iID = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<com.ol.model.entity.Project, com.ol.model.entity.ProjectInformation, java.lang.Integer, java.lang.Object>(com.ol.model.entity.ProjectInformation.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, com.ol.model.entity._Project.getSingletonInternal().$iID, null, "iID", "iID");

    /** the iStatus */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<com.ol.model.entity.Project, com.ol.model.entity.ProjectInformation, java.lang.Integer, java.lang.Object> $iStatus = new org.seasar.doma.jdbc.entity.BasicPropertyType<com.ol.model.entity.Project, com.ol.model.entity.ProjectInformation, java.lang.Integer, java.lang.Object>(com.ol.model.entity.ProjectInformation.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, com.ol.model.entity._Project.getSingletonInternal().$iStatus, null, "iStatus", "iStatus", true, true);

    /** the sCode */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<com.ol.model.entity.Project, com.ol.model.entity.ProjectInformation, java.lang.String, java.lang.Object> $sCode = new org.seasar.doma.jdbc.entity.BasicPropertyType<com.ol.model.entity.Project, com.ol.model.entity.ProjectInformation, java.lang.String, java.lang.Object>(com.ol.model.entity.ProjectInformation.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, com.ol.model.entity._Project.getSingletonInternal().$sCode, null, "sCode", "sCode", true, true);

    /** the sFullname */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<com.ol.model.entity.Project, com.ol.model.entity.ProjectInformation, java.lang.String, java.lang.Object> $sFullname = new org.seasar.doma.jdbc.entity.BasicPropertyType<com.ol.model.entity.Project, com.ol.model.entity.ProjectInformation, java.lang.String, java.lang.Object>(com.ol.model.entity.ProjectInformation.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, com.ol.model.entity._Project.getSingletonInternal().$sFullname, null, "sFullname", "sFullname", true, true);

    /** the sPmID */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<com.ol.model.entity.Project, com.ol.model.entity.ProjectInformation, java.lang.String, java.lang.Object> $sPmID = new org.seasar.doma.jdbc.entity.BasicPropertyType<com.ol.model.entity.Project, com.ol.model.entity.ProjectInformation, java.lang.String, java.lang.Object>(com.ol.model.entity.ProjectInformation.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, com.ol.model.entity._Project.getSingletonInternal().$sPmID, null, "sPmID", "sPmID", true, true);

    /** the iMemberCount */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.ProjectInformation, java.lang.Integer, java.lang.Object> $iMemberCount = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.ProjectInformation, java.lang.Integer, java.lang.Object>(com.ol.model.entity.ProjectInformation.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "iMemberCount", "iMemberCount", true, true);

    /** the sPMName */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.ProjectInformation, java.lang.String, java.lang.Object> $sPMName = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.ProjectInformation, java.lang.String, java.lang.Object>(com.ol.model.entity.ProjectInformation.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sPMName", "sPMName", true, true);

    private final org.seasar.doma.jdbc.entity.NullEntityListener<com.ol.model.entity.ProjectInformation> __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.ProjectInformation, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.ProjectInformation, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.ProjectInformation, ?>> __entityPropertyTypeMap;

    private _ProjectInformation() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener<com.ol.model.entity.ProjectInformation>();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.SNAKE_UPPER_CASE;
        __immutable = false;
        __name = "ProjectInformation";
        __catalogName = "";
        __schemaName = "";
        __tableName = "PROJECT_INFORMATION";
        __qualifiedTableName = "PROJECT_INFORMATION";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.ProjectInformation, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.ProjectInformation, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.ProjectInformation, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.ProjectInformation, ?>>(8);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.ProjectInformation, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.ProjectInformation, ?>>(8);
        __list.add($dStartday);
        __map.put("dStartday", $dStartday);
        __idList.add($iID);
        __list.add($iID);
        __map.put("iID", $iID);
        __list.add($iStatus);
        __map.put("iStatus", $iStatus);
        __list.add($sCode);
        __map.put("sCode", $sCode);
        __list.add($sFullname);
        __map.put("sFullname", $sFullname);
        __list.add($sPmID);
        __map.put("sPmID", $sPmID);
        __list.add($iMemberCount);
        __map.put("iMemberCount", $iMemberCount);
        __list.add($sPMName);
        __map.put("sPMName", $sPMName);
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
    public void preInsert(com.ol.model.entity.ProjectInformation entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.ol.model.entity.ProjectInformation> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.ol.model.entity.ProjectInformation entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.ol.model.entity.ProjectInformation> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.ol.model.entity.ProjectInformation entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.ol.model.entity.ProjectInformation> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.ol.model.entity.ProjectInformation entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.ol.model.entity.ProjectInformation> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.ol.model.entity.ProjectInformation entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.ol.model.entity.ProjectInformation> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.ol.model.entity.ProjectInformation entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.ol.model.entity.ProjectInformation> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.ProjectInformation, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.ProjectInformation, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.ProjectInformation, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.ol.model.entity.ProjectInformation, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.ol.model.entity.ProjectInformation, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.ol.model.entity.ProjectInformation newEntity() {
        return new com.ol.model.entity.ProjectInformation();
    }

    @Override
    public com.ol.model.entity.ProjectInformation newEntity(java.util.Map<String, Object> __args) {
        return new com.ol.model.entity.ProjectInformation();
    }

    @Override
    public Class<com.ol.model.entity.ProjectInformation> getEntityClass() {
        return com.ol.model.entity.ProjectInformation.class;
    }

    @Override
    public com.ol.model.entity.ProjectInformation getOriginalStates(com.ol.model.entity.ProjectInformation __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.ol.model.entity.ProjectInformation __entity) {
    }

    /**
     * @return the singleton
     */
    public static _ProjectInformation getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _ProjectInformation newInstance() {
        return new _ProjectInformation();
    }

}
