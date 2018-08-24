package com.Observer.Pattern.case01;

public interface Observer {
    /**
     * 更新接口
     * @param state    更新的状态
     */
    public void update(String state);
}
