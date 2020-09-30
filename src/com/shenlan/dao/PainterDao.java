package com.shenlan.dao;

import com.shenlan.entity.Painter;

/**
 * 画师的数据库操作.
 *
 * @author Marting.Lee
 * 2020/9/30
 */
public interface PainterDao {
    int addPainter(Painter newpainter);
    int alterPainter(Painter painter);
}
