package com.ol.model.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2014-05-16T16:32:57.825+0700")
public final class _Employee extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.ol.model.entity.Employee> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final _Employee __singleton = new _Employee();

    /** the dBirthday */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Employee, java.util.Date, java.lang.Object> $dBirthday = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Employee, java.util.Date, java.lang.Object>(com.ol.model.entity.Employee.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, null, null, "dBirthday", "dBirthday", true, true);

    /** the dStartday */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Employee, java.util.Date, java.lang.Object> $dStartday = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Employee, java.util.Date, java.lang.Object>(com.ol.model.entity.Employee.class, java.util.Date.class, org.seasar.doma.wrapper.UtilDateWrapper.class, null, null, "dStartday", "dStartday", true, true);

    /** the iMaxlday */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Employee, java.lang.Integer, java.lang.Object> $iMaxlday = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Employee, java.lang.Integer, java.lang.Object>(com.ol.model.entity.Employee.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "iMaxlday", "iMaxlday", true, true);

    /** the iPrjID */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Employee, java.lang.Integer, java.lang.Object> $iPrjID = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Employee, java.lang.Integer, java.lang.Object>(com.ol.model.entity.Employee.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "iPrjID", "iPrjID", true, true);

    /** the iStatus */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Employee, java.lang.Integer, java.lang.Object> $iStatus = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Employee, java.lang.Integer, java.lang.Object>(com.ol.model.entity.Employee.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "iStatus", "iStatus", true, true);

    /** the iType */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Employee, java.lang.Integer, java.lang.Object> $iType = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Employee, java.lang.Integer, java.lang.Object>(com.ol.model.entity.Employee.class, java.lang.Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "iType", "iType", true, true);

    /** the sEmail */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Employee, java.lang.String, java.lang.Object> $sEmail = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Employee, java.lang.String, java.lang.Object>(com.ol.model.entity.Employee.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sEmail", "sEmail", true, true);

    /** the sFullname */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Employee, java.lang.String, java.lang.Object> $sFullname = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Employee, java.lang.String, java.lang.Object>(com.ol.model.entity.Employee.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sFullname", "sFullname", true, true);

    /** the sID */
    public final org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, com.ol.model.entity.Employee, java.lang.String, java.lang.Object> $sID = new org.seasar.doma.jdbc.entity.AssignedIdPropertyType<java.lang.Object, com.ol.model.entity.Employee, java.lang.String, java.lang.Object>(com.ol.model.entity.Employee.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sID", "sID");

    /** the sPassword */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Employee, java.lang.String, java.lang.Object> $sPassword = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Employee, java.lang.String, java.lang.Object>(com.ol.model.entity.Employee.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sPassword", "sPassword", true, true);

    /** the sPrjName */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Employee, java.lang.String, java.lang.Object> $sPrjName = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Employee, java.lang.String, java.lang.Object>(com.ol.model.entity.Employee.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sPrjName", "sPrjName", true, true);

    /** the sType */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Employee, java.lang.String, java.lang.Object> $sType = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.Employee, java.lang.String, java.lang.Object>(com.ol.model.entity.Employee.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sType", "sType", true, true);

    private final org.seasar.doma.jdbc.entity.NullEntityListener<com.ol.model.entity.Employee> __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.Employee, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.Employee, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.Employee, ?>> __entityPropertyTypeMap;

    private _Employee() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener<com.ol.model.entity.Employee>();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.NONE;
        __immutable = false;
        __name = "Employee";
        __catalogName = "";
        __schemaName = "";
        __tableName = "OL_Employee";
        __qualifiedTableName = "OL_Employee";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.Employee, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.Employee, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.Employee, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.Employee, ?>>(12);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.Employee, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.Employee, ?>>(12);
        __list.add($dBirthday);
        __map.put("dBirthday", $dBirthday);
        __list.add($dStartday);
        __map.put("dStartday", $dStartday);
        __list.add($iMaxlday);
        __map.put("iMaxlday", $iMaxlday);
        __list.add($iPrjID);
        __map.put("iPrjID", $iPrjID);
        __list.add($iStatus);
        __map.put("iStatus", $iStatus);
        __list.add($iType);
        __map.put("iType", $iType);
        __list.add($sEmail);
        __map.put("sEmail", $sEmail);
        __list.add($sFullname);
        __map.put("sFullname", $sFullname);
        __idList.add($sID);
        __list.add($sID);
        __map.put("sID", $sID);
        __list.add($sPassword);
        __map.put("sPassword", $sPassword);
        __list.add($sPrjName);
        __map.put("sPrjName", $sPrjName);
        __list.add($sType);
        __map.put("sType", $sType);
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
    public void preInsert(com.ol.model.entity.Employee entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.ol.model.entity.Employee> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.ol.model.entity.Employee entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.ol.model.entity.Employee> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.ol.model.entity.Employee entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.ol.model.entity.Employee> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.ol.model.entity.Employee entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.ol.model.entity.Employee> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.ol.model.entity.Employee entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.ol.model.entity.Employee> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.ol.model.entity.Employee entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.ol.model.entity.Employee> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.Employee, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.Employee, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.Employee, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.ol.model.entity.Employee, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.ol.model.entity.Employee, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.ol.model.entity.Employee newEntity() {
        return new com.ol.model.entity.Employee();
    }

    @Override
    public com.ol.model.entity.Employee newEntity(java.util.Map<String, Object> __args) {
        return new com.ol.model.entity.Employee();
    }

    @Override
    public Class<com.ol.model.entity.Employee> getEntityClass() {
        return com.ol.model.entity.Employee.class;
    }

    @Override
    public com.ol.model.entity.Employee getOriginalStates(com.ol.model.entity.Employee __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.ol.model.entity.Employee __entity) {
    }

    /**
     * @return the singleton
     */
    public static _Employee getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _Employee newInstance() {
        return new _Employee();
    }

}
