package com.entity;

public class PsCheckLostInstrumentation {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ps_check_lost_instrumentation.variable_name
     *
     * @mbg.generated
     */
    private String variable_name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ps_check_lost_instrumentation.variable_value
     *
     * @mbg.generated
     */
    private String variable_value;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ps_check_lost_instrumentation.variable_name
     *
     * @return the value of ps_check_lost_instrumentation.variable_name
     *
     * @mbg.generated
     */
    public String getVariable_name() {
        return variable_name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ps_check_lost_instrumentation.variable_name
     *
     * @param variable_name the value for ps_check_lost_instrumentation.variable_name
     *
     * @mbg.generated
     */
    public void setVariable_name(String variable_name) {
        this.variable_name = variable_name == null ? null : variable_name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ps_check_lost_instrumentation.variable_value
     *
     * @return the value of ps_check_lost_instrumentation.variable_value
     *
     * @mbg.generated
     */
    public String getVariable_value() {
        return variable_value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ps_check_lost_instrumentation.variable_value
     *
     * @param variable_value the value for ps_check_lost_instrumentation.variable_value
     *
     * @mbg.generated
     */
    public void setVariable_value(String variable_value) {
        this.variable_value = variable_value == null ? null : variable_value.trim();
    }
}