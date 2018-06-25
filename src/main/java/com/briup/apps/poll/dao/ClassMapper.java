package com.briup.apps.poll.dao;

import com.briup.apps.poll.bean.Class;
import com.briup.apps.poll.bean.ClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_class
     *
     * @mbg.generated Mon Jun 25 16:38:17 CST 2018
     */
    long countByExample(ClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_class
     *
     * @mbg.generated Mon Jun 25 16:38:17 CST 2018
     */
    int deleteByExample(ClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_class
     *
     * @mbg.generated Mon Jun 25 16:38:17 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_class
     *
     * @mbg.generated Mon Jun 25 16:38:17 CST 2018
     */
    int insert(Class record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_class
     *
     * @mbg.generated Mon Jun 25 16:38:17 CST 2018
     */
    int insertSelective(Class record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_class
     *
     * @mbg.generated Mon Jun 25 16:38:17 CST 2018
     */
    List<Class> selectByExampleWithBLOBs(ClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_class
     *
     * @mbg.generated Mon Jun 25 16:38:17 CST 2018
     */
    List<Class> selectByExample(ClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_class
     *
     * @mbg.generated Mon Jun 25 16:38:17 CST 2018
     */
    Class selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_class
     *
     * @mbg.generated Mon Jun 25 16:38:17 CST 2018
     */
    int updateByExampleSelective(@Param("record") Class record, @Param("example") ClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_class
     *
     * @mbg.generated Mon Jun 25 16:38:17 CST 2018
     */
    int updateByExampleWithBLOBs(@Param("record") Class record, @Param("example") ClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_class
     *
     * @mbg.generated Mon Jun 25 16:38:17 CST 2018
     */
    int updateByExample(@Param("record") Class record, @Param("example") ClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_class
     *
     * @mbg.generated Mon Jun 25 16:38:17 CST 2018
     */
    int updateByPrimaryKeySelective(Class record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_class
     *
     * @mbg.generated Mon Jun 25 16:38:17 CST 2018
     */
    int updateByPrimaryKeyWithBLOBs(Class record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_class
     *
     * @mbg.generated Mon Jun 25 16:38:17 CST 2018
     */
    int updateByPrimaryKey(Class record);
}