package com.tree.entity;

public class Course {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Course.CId
     *
     * @mbg.generated Thu Oct 22 13:57:23 CST 2020
     */
    private String cid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Course.Cname
     *
     * @mbg.generated Thu Oct 22 13:57:23 CST 2020
     */
    private String cname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Course.TId
     *
     * @mbg.generated Thu Oct 22 13:57:23 CST 2020
     */
    private String tid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Course.CId
     *
     * @return the value of Course.CId
     *
     * @mbg.generated Thu Oct 22 13:57:23 CST 2020
     */
    public String getCid() {
        return cid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Course.CId
     *
     * @param cid the value for Course.CId
     *
     * @mbg.generated Thu Oct 22 13:57:23 CST 2020
     */
    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Course.Cname
     *
     * @return the value of Course.Cname
     *
     * @mbg.generated Thu Oct 22 13:57:23 CST 2020
     */
    public String getCname() {
        return cname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Course.Cname
     *
     * @param cname the value for Course.Cname
     *
     * @mbg.generated Thu Oct 22 13:57:23 CST 2020
     */
    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Course.TId
     *
     * @return the value of Course.TId
     *
     * @mbg.generated Thu Oct 22 13:57:23 CST 2020
     */
    public String getTid() {
        return tid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Course.TId
     *
     * @param tid the value for Course.TId
     *
     * @mbg.generated Thu Oct 22 13:57:23 CST 2020
     */
    public void setTid(String tid) {
        this.tid = tid == null ? null : tid.trim();
    }
}