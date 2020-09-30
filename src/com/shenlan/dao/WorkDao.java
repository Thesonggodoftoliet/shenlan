package com.shenlan.dao;

import com.shenlan.entity.Works;

import java.util.List;

/**
 * 作品.
 *
 * @author Marting.Lee
 * 2020/9/30
 */
public interface WorkDao {
    Works getWorksById(String id);
    List<Works> getAllWorks();
    int addWork(Works works);
    int deleteWorkById(String id);
    int alterWork(Works work);
}
