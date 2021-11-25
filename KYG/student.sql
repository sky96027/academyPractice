select * from subject
	left join course
	on course.co_su_num = subject.su_num
    where co_st_num = 2021160123;
select * from subject
	left join course
	on co_su_num = su_num
    where co_st_num = 2021160123;
    
select su_title, su_schedule from lecture
	left join subject
    on le_su_num = su_num
    where le_pr_num = 2000160001;
    
select le_pr_num from lecture
	left join subject
    on le_su_num = su_num
    where su_title = '컴퓨터 개론';
    
select pr_name from lecture
	left join subject
    on le_su_num = su_num
     left join professor
    on le_pr_num = pr_num
    where su_title = '컴퓨터 개론';
   
    