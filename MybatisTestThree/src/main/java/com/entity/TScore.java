package com.entity;

public class TScore {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_score.Id
     *
     * @mbg.generated
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_score.sname
     *
     * @mbg.generated
     */
    private String sname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_score.subjects
     *
     * @mbg.generated
     */
    private String subjects;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_score.grade
     *
     * @mbg.generated
     */
    private String grade;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_score.Id
     *
     * @return the value of t_score.Id
     *
     * @mbg.generated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_score.Id
     *
     * @param id the value for t_score.Id
     *
     * @mbg.generated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_score.sname
     *
     * @return the value of t_score.sname
     *
     * @mbg.generated
     */
    public String getSname() {
        return sname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_score.sname
     *
     * @param sname the value for t_score.sname
     *
     * @mbg.generated
     */
    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_score.subjects
     *
     * @return the value of t_score.subjects
     *
     * @mbg.generated
     */
    public String getSubjects() {
        return subjects;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_score.subjects
     *
     * @param subjects the value for t_score.subjects
     *
     * @mbg.generated
     */
    public void setSubjects(String subjects) {
        this.subjects = subjects == null ? null : subjects.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_score.grade
     *
     * @return the value of t_score.grade
     *
     * @mbg.generated
     */
    public String getGrade() {
        return grade;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_score.grade
     *
     * @param grade the value for t_score.grade
     *
     * @mbg.generated
     */
    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }
}