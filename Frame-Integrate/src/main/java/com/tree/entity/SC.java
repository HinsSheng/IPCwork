package com.tree.entity;

import java.math.BigDecimal;

public class SC {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SC.SId
     *
     * @mbg.generated Thu Oct 22 13:57:23 CST 2020
     */
    private String sid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SC.CId
     *
     * @mbg.generated Thu Oct 22 13:57:23 CST 2020
     */
    private String cid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SC.score
     *
     * @mbg.generated Thu Oct 22 13:57:23 CST 2020
     */
    private BigDecimal score;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SC.SId
     *
     * @return the value of SC.SId
     *
     * @mbg.generated Thu Oct 22 13:57:23 CST 2020
     */
    public String getSid() {
        return sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SC.SId
     *
     * @param sid the value for SC.SId
     *
     * @mbg.generated Thu Oct 22 13:57:23 CST 2020
     */
    public void setSid(String sid) {
        this.sid = sid == null ? null : sid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SC.CId
     *
     * @return the value of SC.CId
     *
     * @mbg.generated Thu Oct 22 13:57:23 CST 2020
     */
    public String getCid() {
        return cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SC.CId
     *
     * @param cid the value for SC.CId
     *
     * @mbg.generated Thu Oct 22 13:57:23 CST 2020
     */
    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SC.score
     *
     * @return the value of SC.score
     *
     * @mbg.generated Thu Oct 22 13:57:23 CST 2020
     */
    public BigDecimal getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SC.score
     *
     * @param score the value for SC.score
     *
     * @mbg.generated Thu Oct 22 13:57:23 CST 2020
     */
    public void setScore(BigDecimal score) {
        this.score = score;
    }
}