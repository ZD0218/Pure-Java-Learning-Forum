package com.duyanhan.forum.domain;

public class Block {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column block.id
     *
     * @mbg.generated Sat May 12 17:14:45 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column block.title
     *
     * @mbg.generated Sat May 12 17:14:45 CST 2018
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column block.content
     *
     * @mbg.generated Sat May 12 17:14:45 CST 2018
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column block.level
     *
     * @mbg.generated Sat May 12 17:14:45 CST 2018
     */
    private Integer level;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column block.id
     *
     * @return the value of block.id
     *
     * @mbg.generated Sat May 12 17:14:45 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column block.id
     *
     * @param id the value for block.id
     *
     * @mbg.generated Sat May 12 17:14:45 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column block.title
     *
     * @return the value of block.title
     *
     * @mbg.generated Sat May 12 17:14:45 CST 2018
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column block.title
     *
     * @param title the value for block.title
     *
     * @mbg.generated Sat May 12 17:14:45 CST 2018
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column block.content
     *
     * @return the value of block.content
     *
     * @mbg.generated Sat May 12 17:14:45 CST 2018
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column block.content
     *
     * @param content the value for block.content
     *
     * @mbg.generated Sat May 12 17:14:45 CST 2018
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column block.level
     *
     * @return the value of block.level
     *
     * @mbg.generated Sat May 12 17:14:45 CST 2018
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column block.level
     *
     * @param level the value for block.level
     *
     * @mbg.generated Sat May 12 17:14:45 CST 2018
     */
    public void setLevel(Integer level) {
        this.level = level;
    }
}