INSERT INTO T_CODE (id,attr,code_value) VALUES (1,'gender','M');
INSERT INTO T_CODE (id,attr,code_value) VALUES (2,'gender','F');

INSERT INTO User (user_Id,user_Name,gender_id,birth_Day,reg_Dt) VALUES ('D4003500','TEST',1,'20190101',NOW());

INSERT INTO T_TODO(id,todo,check_Val,end_Date,reg_Dt,reg_Id) VALUES (1,'오늘할일','Y','20200116',NOW(),'D4003500');
INSERT INTO T_TODO(id,todo,check_Val,end_Date,reg_Dt,reg_Id) VALUES (2,'내일할일','Y','20200116',NOW(),'D4003500');



	
	

	