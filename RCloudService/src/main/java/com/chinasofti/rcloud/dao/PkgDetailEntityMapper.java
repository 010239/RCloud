package com.chinasofti.rcloud.dao;

import com.chinasofti.rcloud.common.dao.BaseDao;
import com.chinasofti.rcloud.domain.PkgDetailEntityExample;
import com.chinasofti.rcloud.domain.PkgDetailEntityKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PkgDetailEntityMapper extends BaseDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boss_pkg_detail
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    int countByExample(PkgDetailEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boss_pkg_detail
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    int deleteByExample(PkgDetailEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boss_pkg_detail
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    int deleteByPrimaryKey(PkgDetailEntityKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boss_pkg_detail
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    int insert(PkgDetailEntityKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boss_pkg_detail
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    int insertSelective(PkgDetailEntityKey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boss_pkg_detail
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    List<PkgDetailEntityKey> selectByExample(PkgDetailEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boss_pkg_detail
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    int updateByExampleSelective(@Param("record") PkgDetailEntityKey record, @Param("example") PkgDetailEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table boss_pkg_detail
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    int updateByExample(@Param("record") PkgDetailEntityKey record, @Param("example") PkgDetailEntityExample example);
}