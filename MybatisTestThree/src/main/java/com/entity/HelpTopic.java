package com.entity;

public class HelpTopic {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column help_topic.help_topic_id
     *
     * @mbg.generated
     */
    private Integer help_topic_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column help_topic.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column help_topic.help_category_id
     *
     * @mbg.generated
     */
    private Short help_category_id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column help_topic.description
     *
     * @mbg.generated
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column help_topic.example
     *
     * @mbg.generated
     */
    private String example;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column help_topic.url
     *
     * @mbg.generated
     */
    private String url;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column help_topic.help_topic_id
     *
     * @return the value of help_topic.help_topic_id
     *
     * @mbg.generated
     */
    public Integer getHelp_topic_id() {
        return help_topic_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column help_topic.help_topic_id
     *
     * @param help_topic_id the value for help_topic.help_topic_id
     *
     * @mbg.generated
     */
    public void setHelp_topic_id(Integer help_topic_id) {
        this.help_topic_id = help_topic_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column help_topic.name
     *
     * @return the value of help_topic.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column help_topic.name
     *
     * @param name the value for help_topic.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column help_topic.help_category_id
     *
     * @return the value of help_topic.help_category_id
     *
     * @mbg.generated
     */
    public Short getHelp_category_id() {
        return help_category_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column help_topic.help_category_id
     *
     * @param help_category_id the value for help_topic.help_category_id
     *
     * @mbg.generated
     */
    public void setHelp_category_id(Short help_category_id) {
        this.help_category_id = help_category_id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column help_topic.description
     *
     * @return the value of help_topic.description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column help_topic.description
     *
     * @param description the value for help_topic.description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column help_topic.example
     *
     * @return the value of help_topic.example
     *
     * @mbg.generated
     */
    public String getExample() {
        return example;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column help_topic.example
     *
     * @param example the value for help_topic.example
     *
     * @mbg.generated
     */
    public void setExample(String example) {
        this.example = example == null ? null : example.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column help_topic.url
     *
     * @return the value of help_topic.url
     *
     * @mbg.generated
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column help_topic.url
     *
     * @param url the value for help_topic.url
     *
     * @mbg.generated
     */
    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}