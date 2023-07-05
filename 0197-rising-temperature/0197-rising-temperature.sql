select w.id  as id from weather w join weather w1 on datediff(w.recorddate,w1.recorddate)=1
and w.temperature>w1.temperature;