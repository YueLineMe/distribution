package com.entity;

public class Playlist {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column playlist.PlaylistId
     *
     * @mbg.generated
     */
    private Integer playlistId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column playlist.Name
     *
     * @mbg.generated
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column playlist.PlaylistId
     *
     * @return the value of playlist.PlaylistId
     *
     * @mbg.generated
     */
    public Integer getPlaylistId() {
        return playlistId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column playlist.PlaylistId
     *
     * @param playlistId the value for playlist.PlaylistId
     *
     * @mbg.generated
     */
    public void setPlaylistId(Integer playlistId) {
        this.playlistId = playlistId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column playlist.Name
     *
     * @return the value of playlist.Name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column playlist.Name
     *
     * @param name the value for playlist.Name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}