package group.zerry.jiaxiao.dao;

import group.zerry.jiaxiao.entity.Coach;

public interface CoachDao {
	Coach[] selectCoachInRest(String date);

}
