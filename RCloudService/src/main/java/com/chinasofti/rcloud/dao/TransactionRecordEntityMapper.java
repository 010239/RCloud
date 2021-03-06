package com.chinasofti.rcloud.dao;

import com.chinasofti.rcloud.common.dao.BaseDao;
import com.chinasofti.rcloud.domain.TransactionRecordEntity;
import com.chinasofti.rcloud.domain.TransactionRecordEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransactionRecordEntityMapper extends BaseDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_transaction_record
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    int countByExample(TransactionRecordEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_transaction_record
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    int deleteByExample(TransactionRecordEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_transaction_record
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    int deleteByPrimaryKey(String recordId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_transaction_record
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    int insert(TransactionRecordEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_transaction_record
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    int insertSelective(TransactionRecordEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_transaction_record
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    List<TransactionRecordEntity> selectByExampleWithBLOBs(TransactionRecordEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_transaction_record
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    List<TransactionRecordEntity> selectByExample(TransactionRecordEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_transaction_record
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    TransactionRecordEntity selectByPrimaryKey(String recordId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_transaction_record
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    int updateByExampleSelective(@Param("record") TransactionRecordEntity record, @Param("example") TransactionRecordEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_transaction_record
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    int updateByExampleWithBLOBs(@Param("record") TransactionRecordEntity record, @Param("example") TransactionRecordEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_transaction_record
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    int updateByExample(@Param("record") TransactionRecordEntity record, @Param("example") TransactionRecordEntityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_transaction_record
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    int updateByPrimaryKeySelective(TransactionRecordEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_transaction_record
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    int updateByPrimaryKeyWithBLOBs(TransactionRecordEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table portal_transaction_record
     *
     * @mbggenerated Mon Jan 19 10:09:58 CST 2015
     */
    int updateByPrimaryKey(TransactionRecordEntity record);
}