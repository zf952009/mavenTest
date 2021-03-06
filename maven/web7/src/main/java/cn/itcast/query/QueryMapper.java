package cn.itcast.query;

import java.util.List;

/**
 * 查询接口
 * codening:utf-8
 *
 * @author :QueryMapper
 * @time :2019.08.26,17:29
 * @file :cn.itcast.query.QueryMapper.jave
 */

public interface QueryMapper {
    /**
     * 查询所有
     *
     * @return List
     * @author z
     */
    List findAll();

    /**
     * 查询总记录数
     *
     * @author z
     */
    Integer count();

    /**
     * id查询
     *
     * @param id
     * @return
     */
    Object findByID(Integer id);

    /**
     * name查询
     *
     * @param name
     * @return
     */
    Object findByName(String name);

    /**
     * 根据id删除
     *
     * @param id
     */
    void deleteByID(Integer id);

    /**
     * 根据对象删除
     *
     * @param object
     */
    void deleteByObject(Object object);

    /**
     * 单个对象保存
     *
     * @param object
     */
    void saveObject(Object object);

    /**
     * 批量保存
     *
     * @param list
     */
    void saveBatchObject(List<Object> list);
}
