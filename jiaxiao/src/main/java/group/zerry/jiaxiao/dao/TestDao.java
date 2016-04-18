package group.zerry.jiaxiao.dao;

import group.zerry.jiaxiao.entity.Test;

public interface TestDao {
	//public Test[] selectTestByDate(String date);
	
	public Test   selectTestById(int id);
	
	// 展示没有过期的考试
	public Test[] showTest();
}
