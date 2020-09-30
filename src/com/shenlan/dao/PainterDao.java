package com.shenlan.dao;

import com.shenlan.entity.Painter;

import java.util.List;

/**
 * 画师的数据库操作.
 *
 * @author Marting.Lee
 * 2020/9/30
 */
public interface PainterDao {
    Painter getPainterByAccount(String account);
    List<Painter> getPainterByCategory(String category);
    List<Painter> getPainterByStyle(String style);
    int addPainter(Painter newpainter);
    int alterPainter(Painter painter);
}
