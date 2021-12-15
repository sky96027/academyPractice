select st_num, st_name from  course
join subject
on co_su_num = su_num
join student
on co_st_num = st_num
where su_title = '컴퓨터 개론' and su_class_num = '3';

select su_title from course
join subject
on co_su_num = su_num
where co_st_num = '2021160123';

select st_num, st_name from lecture
join professor
on le_pr_num = pr_num
join course
on le_su_num = co_su_num
join student
on co_st_num = st_num
where pr_name = '이순신';

insert into course(co_st_num, co_su_num) values(2021160001, 1);
insert into course(co_st_num, co_su_num) select 2021160015, su_num from subject where su_class_num = 3 and su_title = '컴퓨터 개론';
use university_kyg;
update course set co_score = 'A+' where co_st_num = 2021160123 and co_su_num = 1;