package com.entity;

public class EcsPlugins {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_plugins.code
     *
     * @mbg.generated
     */
    private String code;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_plugins.version
     *
     * @mbg.generated
     */
    private String version;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_plugins.library
     *
     * @mbg.generated
     */
    private String library;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_plugins.assign
     *
     * @mbg.generated
     */
    private Boolean assign;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecs_plugins.install_date
     *
     * @mbg.generated
     */
    private Integer install_date;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_plugins.code
     *
     * @return the value of ecs_plugins.code
     *
     * @mbg.generated
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_plugins.code
     *
     * @param code the value for ecs_plugins.code
     *
     * @mbg.generated
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_plugins.version
     *
     * @return the value of ecs_plugins.version
     *
     * @mbg.generated
     */
    public String getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_plugins.version
     *
     * @param version the value for ecs_plugins.version
     *
     * @mbg.generated
     */
    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_plugins.library
     *
     * @return the value of ecs_plugins.library
     *
     * @mbg.generated
     */
    public String getLibrary() {
        return library;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_plugins.library
     *
     * @param library the value for ecs_plugins.library
     *
     * @mbg.generated
     */
    public void setLibrary(String library) {
        this.library = library == null ? null : library.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_plugins.assign
     *
     * @return the value of ecs_plugins.assign
     *
     * @mbg.generated
     */
    public Boolean getAssign() {
        return assign;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_plugins.assign
     *
     * @param assign the value for ecs_plugins.assign
     *
     * @mbg.generated
     */
    public void setAssign(Boolean assign) {
        this.assign = assign;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecs_plugins.install_date
     *
     * @return the value of ecs_plugins.install_date
     *
     * @mbg.generated
     */
    public Integer getInstall_date() {
        return install_date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecs_plugins.install_date
     *
     * @param install_date the value for ecs_plugins.install_date
     *
     * @mbg.generated
     */
    public void setInstall_date(Integer install_date) {
        this.install_date = install_date;
    }
}