package com.entity;

public class Countrylanguage {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column countrylanguage.CountryCode
     *
     * @mbg.generated
     */
    private String countryCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column countrylanguage.Language
     *
     * @mbg.generated
     */
    private String language;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column countrylanguage.IsOfficial
     *
     * @mbg.generated
     */
    private String isOfficial;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column countrylanguage.Percentage
     *
     * @mbg.generated
     */
    private Float percentage;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column countrylanguage.CountryCode
     *
     * @return the value of countrylanguage.CountryCode
     *
     * @mbg.generated
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column countrylanguage.CountryCode
     *
     * @param countryCode the value for countrylanguage.CountryCode
     *
     * @mbg.generated
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column countrylanguage.Language
     *
     * @return the value of countrylanguage.Language
     *
     * @mbg.generated
     */
    public String getLanguage() {
        return language;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column countrylanguage.Language
     *
     * @param language the value for countrylanguage.Language
     *
     * @mbg.generated
     */
    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column countrylanguage.IsOfficial
     *
     * @return the value of countrylanguage.IsOfficial
     *
     * @mbg.generated
     */
    public String getIsOfficial() {
        return isOfficial;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column countrylanguage.IsOfficial
     *
     * @param isOfficial the value for countrylanguage.IsOfficial
     *
     * @mbg.generated
     */
    public void setIsOfficial(String isOfficial) {
        this.isOfficial = isOfficial == null ? null : isOfficial.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column countrylanguage.Percentage
     *
     * @return the value of countrylanguage.Percentage
     *
     * @mbg.generated
     */
    public Float getPercentage() {
        return percentage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column countrylanguage.Percentage
     *
     * @param percentage the value for countrylanguage.Percentage
     *
     * @mbg.generated
     */
    public void setPercentage(Float percentage) {
        this.percentage = percentage;
    }
}