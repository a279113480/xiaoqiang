package com.chenxianglin.util;

import java.util.List;

/**
 * 分页数据封装�??
 * 
 * @author SONG
 *
 */
public class Pager<T> {
  // easyui 约定的变量名
  private int total; // 分页数据的�?�记录数
  private List<T> rows; // 分页数据

  public int getTotal() {
    return total;
  }

  public void setTotal(int total) {
    this.total = total;
  }

  public List<T> getRows() {
    return rows;
  }

  public void setRows(List<T> rows) {
    this.rows = rows;
  }
}
