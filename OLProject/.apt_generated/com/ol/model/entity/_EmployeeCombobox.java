package com.ol.model.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.36.0-SNAPSHOT" }, date = "2014-05-16T16:32:57.805+0700")
public final class _EmployeeCombobox extends org.seasar.doma.jdbc.entity.AbstractEntityType<com.ol.model.entity.EmployeeCombobox> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.36.0-SNAPSHOT");
    }

    private static final _EmployeeCombobox __singleton = new _EmployeeCombobox();

    /** the sDisplay */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.EmployeeCombobox, java.lang.String, java.lang.Object> $sDisplay = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.EmployeeCombobox, java.lang.String, java.lang.Object>(com.ol.model.entity.EmployeeCombobox.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sDisplay", "S_DISPLAY", true, true);

    /** the sFullName */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.EmployeeCombobox, java.lang.String, java.lang.Object> $sFullName = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.EmployeeCombobox, java.lang.String, java.lang.Object>(com.ol.model.entity.EmployeeCombobox.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sFullName", "sFullName", true, true);

    /** the sID */
    public final org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.EmployeeCombobox, java.lang.String, java.lang.Object> $sID = new org.seasar.doma.jdbc.entity.BasicPropertyType<java.lang.Object, com.ol.model.entity.EmployeeCombobox, java.lang.String, java.lang.Object>(com.ol.model.entity.EmployeeCombobox.class, java.lang.String.class, org.seasar.doma.wrapper.StringWrapper.class, null, null, "sID", "sID", true, true);

    private final org.seasar.doma.jdbc.entity.NullEntityListener<com.ol.model.entity.EmployeeCombobox> __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.EmployeeCombobox, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.EmployeeCombobox, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.EmployeeCombobox, ?>> __entityPropertyTypeMap;

    private _EmployeeCombobox() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener<com.ol.model.entity.EmployeeCombobox>();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.SNAKE_UPPER_CASE;
        __immutable = false;
        __name = "EmployeeCombobox";
        __catalogName = "";
        __schemaName = "";
        __tableName = "EMPLOYEE_COMBOBOX";
        __qualifiedTableName = "EMPLOYEE_COMBOBOX";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.EmployeeCombobox, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.EmployeeCombobox, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.EmployeeCombobox, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.EmployeeCombobox, ?>>(3);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.EmployeeCombobox, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.EmployeeCombobox, ?>>(3);
        __list.add($sDisplay);
        __map.put("sDisplay", $sDisplay);
        __list.add($sFullName);
        __map.put("sFullName", $sFullName);
        __list.add($sID);
        __map.put("sID", $sID);
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
    public void preInsert(com.ol.model.entity.EmployeeCombobox entity, org.seasar.doma.jdbc.entity.PreInsertContext<com.ol.model.entity.EmployeeCombobox> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(com.ol.model.entity.EmployeeCombobox entity, org.seasar.doma.jdbc.entity.PreUpdateContext<com.ol.model.entity.EmployeeCombobox> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(com.ol.model.entity.EmployeeCombobox entity, org.seasar.doma.jdbc.entity.PreDeleteContext<com.ol.model.entity.EmployeeCombobox> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(com.ol.model.entity.EmployeeCombobox entity, org.seasar.doma.jdbc.entity.PostInsertContext<com.ol.model.entity.EmployeeCombobox> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(com.ol.model.entity.EmployeeCombobox entity, org.seasar.doma.jdbc.entity.PostUpdateContext<com.ol.model.entity.EmployeeCombobox> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(com.ol.model.entity.EmployeeCombobox entity, org.seasar.doma.jdbc.entity.PostDeleteContext<com.ol.model.entity.EmployeeCombobox> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.EmployeeCombobox, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.EmployeeCombobox, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<com.ol.model.entity.EmployeeCombobox, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<java.lang.Object, com.ol.model.entity.EmployeeCombobox, ?, ?> getGeneratedIdPropertyType() {
        return null;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<java.lang.Object, com.ol.model.entity.EmployeeCombobox, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public com.ol.model.entity.EmployeeCombobox newEntity() {
        return new com.ol.model.entity.EmployeeCombobox();
    }

    @Override
    public com.ol.model.entity.EmployeeCombobox newEntity(java.util.Map<String, Object> __args) {
        return new com.ol.model.entity.EmployeeCombobox();
    }

    @Override
    public Class<com.ol.model.entity.EmployeeCombobox> getEntityClass() {
        return com.ol.model.entity.EmployeeCombobox.class;
    }

    @Override
    public com.ol.model.entity.EmployeeCombobox getOriginalStates(com.ol.model.entity.EmployeeCombobox __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(com.ol.model.entity.EmployeeCombobox __entity) {
    }

    /**
     * @return the singleton
     */
    public static _EmployeeCombobox getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _EmployeeCombobox newInstance() {
        return new _EmployeeCombobox();
    }

}
