package com.duyanhan.forum.dao;

import com.duyanhan.forum.domain.Post;
import com.duyanhan.forum.domain.PostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PostMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbg.generated Sat May 12 17:14:45 CST 2018
     */
    long countByExample(PostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbg.generated Sat May 12 17:14:45 CST 2018
     */
    int deleteByExample(PostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbg.generated Sat May 12 17:14:45 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbg.generated Sat May 12 17:14:45 CST 2018
     */
    int insert(Post record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbg.generated Sat May 12 17:14:45 CST 2018
     */
    int insertSelective(Post record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbg.generated Sat May 12 17:14:45 CST 2018
     */
    List<Post> selectByExample(PostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbg.generated Sat May 12 17:14:45 CST 2018
     */
    Post selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbg.generated Sat May 12 17:14:45 CST 2018
     */
    int updateByExampleSelective(@Param("record") Post record, @Param("example") PostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbg.generated Sat May 12 17:14:45 CST 2018
     */
    int updateByExample(@Param("record") Post record, @Param("example") PostExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbg.generated Sat May 12 17:14:45 CST 2018
     */
    int updateByPrimaryKeySelective(Post record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table post
     *
     * @mbg.generated Sat May 12 17:14:45 CST 2018
     */
    int updateByPrimaryKey(Post record);
}