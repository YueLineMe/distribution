package com.entity;

public class ProxiesPrivKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column proxies_priv.Host
     *
     * @mbg.generated
     */
    private String host;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column proxies_priv.User
     *
     * @mbg.generated
     */
    private String user;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column proxies_priv.Proxied_host
     *
     * @mbg.generated
     */
    private String proxied_host;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column proxies_priv.Proxied_user
     *
     * @mbg.generated
     */
    private String proxied_user;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column proxies_priv.Host
     *
     * @return the value of proxies_priv.Host
     *
     * @mbg.generated
     */
    public String getHost() {
        return host;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column proxies_priv.Host
     *
     * @param host the value for proxies_priv.Host
     *
     * @mbg.generated
     */
    public void setHost(String host) {
        this.host = host == null ? null : host.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column proxies_priv.User
     *
     * @return the value of proxies_priv.User
     *
     * @mbg.generated
     */
    public String getUser() {
        return user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column proxies_priv.User
     *
     * @param user the value for proxies_priv.User
     *
     * @mbg.generated
     */
    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column proxies_priv.Proxied_host
     *
     * @return the value of proxies_priv.Proxied_host
     *
     * @mbg.generated
     */
    public String getProxied_host() {
        return proxied_host;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column proxies_priv.Proxied_host
     *
     * @param proxied_host the value for proxies_priv.Proxied_host
     *
     * @mbg.generated
     */
    public void setProxied_host(String proxied_host) {
        this.proxied_host = proxied_host == null ? null : proxied_host.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column proxies_priv.Proxied_user
     *
     * @return the value of proxies_priv.Proxied_user
     *
     * @mbg.generated
     */
    public String getProxied_user() {
        return proxied_user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column proxies_priv.Proxied_user
     *
     * @param proxied_user the value for proxies_priv.Proxied_user
     *
     * @mbg.generated
     */
    public void setProxied_user(String proxied_user) {
        this.proxied_user = proxied_user == null ? null : proxied_user.trim();
    }
}