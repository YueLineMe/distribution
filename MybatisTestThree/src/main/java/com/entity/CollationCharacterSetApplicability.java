package com.entity;

public class CollationCharacterSetApplicability {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_NAME
     *
     * @mbg.generated
     */
    private String COLLATION_NAME;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_NAME
     *
     * @mbg.generated
     */
    private String CHARACTER_SET_NAME;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_NAME
     *
     * @return the value of COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_NAME
     *
     * @mbg.generated
     */
    public String getCOLLATION_NAME() {
        return COLLATION_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_NAME
     *
     * @param COLLATION_NAME the value for COLLATION_CHARACTER_SET_APPLICABILITY.COLLATION_NAME
     *
     * @mbg.generated
     */
    public void setCOLLATION_NAME(String COLLATION_NAME) {
        this.COLLATION_NAME = COLLATION_NAME == null ? null : COLLATION_NAME.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_NAME
     *
     * @return the value of COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_NAME
     *
     * @mbg.generated
     */
    public String getCHARACTER_SET_NAME() {
        return CHARACTER_SET_NAME;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_NAME
     *
     * @param CHARACTER_SET_NAME the value for COLLATION_CHARACTER_SET_APPLICABILITY.CHARACTER_SET_NAME
     *
     * @mbg.generated
     */
    public void setCHARACTER_SET_NAME(String CHARACTER_SET_NAME) {
        this.CHARACTER_SET_NAME = CHARACTER_SET_NAME == null ? null : CHARACTER_SET_NAME.trim();
    }
}