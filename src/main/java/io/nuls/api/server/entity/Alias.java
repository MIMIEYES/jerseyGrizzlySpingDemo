package io.nuls.api.server.entity;

import java.io.Serializable;

public class Alias implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column alias.alias
     *
     * @mbggenerated
     */
    private String alias;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column alias.address
     *
     * @mbggenerated
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column alias.STATUS
     *
     * @mbggenerated
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table alias
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column alias.alias
     *
     * @return the value of alias.alias
     *
     * @mbggenerated
     */
    public String getAlias() {
        return alias;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column alias.alias
     *
     * @param alias the value for alias.alias
     *
     * @mbggenerated
     */
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column alias.address
     *
     * @return the value of alias.address
     *
     * @mbggenerated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column alias.address
     *
     * @param address the value for alias.address
     *
     * @mbggenerated
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column alias.STATUS
     *
     * @return the value of alias.STATUS
     *
     * @mbggenerated
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column alias.STATUS
     *
     * @param status the value for alias.STATUS
     *
     * @mbggenerated
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alias
     *
     * @mbggenerated
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Alias other = (Alias) that;
        return (this.getAlias() == null ? other.getAlias() == null : this.getAlias().equals(other.getAlias()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alias
     *
     * @mbggenerated
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAlias() == null) ? 0 : getAlias().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table alias
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", alias=").append(alias);
        sb.append(", address=").append(address);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}