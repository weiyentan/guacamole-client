package net.sourceforge.guacamole.net.auth.mysql.dao.guacamole;

import java.util.List;
import net.sourceforge.guacamole.net.auth.mysql.model.guacamole.ConnectionParameter;
import net.sourceforge.guacamole.net.auth.mysql.model.guacamole.ConnectionParameterExample;
import net.sourceforge.guacamole.net.auth.mysql.model.guacamole.ConnectionParameterKey;
import org.apache.ibatis.annotations.Param;

public interface ConnectionParameterMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guacamole..guacamole_connection_parameter
     *
     * @mbggenerated Tue Feb 05 15:45:11 PST 2013
     */
    int countByExample(ConnectionParameterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guacamole..guacamole_connection_parameter
     *
     * @mbggenerated Tue Feb 05 15:45:11 PST 2013
     */
    int deleteByExample(ConnectionParameterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guacamole..guacamole_connection_parameter
     *
     * @mbggenerated Tue Feb 05 15:45:11 PST 2013
     */
    int deleteByPrimaryKey(ConnectionParameterKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guacamole..guacamole_connection_parameter
     *
     * @mbggenerated Tue Feb 05 15:45:11 PST 2013
     */
    int insert(ConnectionParameter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guacamole..guacamole_connection_parameter
     *
     * @mbggenerated Tue Feb 05 15:45:11 PST 2013
     */
    int insertSelective(ConnectionParameter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guacamole..guacamole_connection_parameter
     *
     * @mbggenerated Tue Feb 05 15:45:11 PST 2013
     */
    List<ConnectionParameter> selectByExample(ConnectionParameterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guacamole..guacamole_connection_parameter
     *
     * @mbggenerated Tue Feb 05 15:45:11 PST 2013
     */
    ConnectionParameter selectByPrimaryKey(ConnectionParameterKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guacamole..guacamole_connection_parameter
     *
     * @mbggenerated Tue Feb 05 15:45:11 PST 2013
     */
    int updateByExampleSelective(@Param("record") ConnectionParameter record, @Param("example") ConnectionParameterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guacamole..guacamole_connection_parameter
     *
     * @mbggenerated Tue Feb 05 15:45:11 PST 2013
     */
    int updateByExample(@Param("record") ConnectionParameter record, @Param("example") ConnectionParameterExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guacamole..guacamole_connection_parameter
     *
     * @mbggenerated Tue Feb 05 15:45:11 PST 2013
     */
    int updateByPrimaryKeySelective(ConnectionParameter record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table guacamole..guacamole_connection_parameter
     *
     * @mbggenerated Tue Feb 05 15:45:11 PST 2013
     */
    int updateByPrimaryKey(ConnectionParameter record);
}