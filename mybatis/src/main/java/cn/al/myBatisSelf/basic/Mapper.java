package cn.al.myBatisSelf.basic;

/**
 * sql执行类
 */
public class Mapper {

    /**
     * sql
     */
    private String sql;

    /**
     * class
     */
    private String resultType;

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }
}
