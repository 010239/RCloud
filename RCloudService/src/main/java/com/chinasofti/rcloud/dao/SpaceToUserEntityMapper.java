package com.chinasofti.rcloud.dao;

import com.chinasofti.rcloud.common.dao.BaseDao;
import com.chinasofti.rcloud.domain.SpaceToUserEntityExample;
import com.chinasofti.rcloud.domain.SpaceToUserEntityKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SpaceToUserEntityMapper extends BaseDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_space_to_user
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    int countByExample(SpaceToUserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_space_to_user
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    int deleteByExample(SpaceToUserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_space_to_user
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    int deleteByPrimaryKey(SpaceToUserEntityKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_space_to_user
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    int insert(SpaceToUserEntityKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_space_to_user
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    int insertSelective(SpaceToUserEntityKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_space_to_user
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    List<SpaceToUserEntityKey> selectByExample(SpaceToUserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_space_to_user
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    int updateByExampleSelective(@Param("record") SpaceToUserEntityKey record, @Param("example") SpaceToUserEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_space_to_user
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    int updateByExample(@Param("record") SpaceToUserEntityKey record, @Param("example") SpaceToUserEntityExample example);
}