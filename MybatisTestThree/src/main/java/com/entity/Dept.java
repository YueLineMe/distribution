package com.entity;

public class Dept {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.deptno
     *
     * @mbg.generated
     */
    private Short deptno;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.dname
     *
     * @mbg.generated
     */
    private String dname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept.loc
     *
     * @mbg.generated
     */
    private String loc;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.deptno
     *
     * @return the value of dept.deptno
     *
     * @mbg.generated
     */
    public Short getDeptno() {
        return deptno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.deptno
     *
     * @param deptno the value for dept.deptno
     *
     * @mbg.generated
     */
    public void setDeptno(Short deptno) {
        this.deptno = deptno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.dname
     *
     * @return the value of dept.dname
     *
     * @mbg.generated
     */
    public String getDname() {
        return dname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.dname
     *
     * @param dname the value for dept.dname
     *
     * @mbg.generated
     */
    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept.loc
     *
     * @return the value of dept.loc
     *
     * @mbg.generated
     */
    public String getLoc() {
        return loc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept.loc
     *
     * @param loc the value for dept.loc
     *
     * @mbg.generated
     */
    public void setLoc(String loc) {
        this.loc = loc == null ? null : loc.trim();
    }
}