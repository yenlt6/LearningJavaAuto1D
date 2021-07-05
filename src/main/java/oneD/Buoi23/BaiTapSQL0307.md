# 1. Thực hành với một bảng đơn giản

## 1.Hãy tìm tất cả những nam giới tuổi dưới 45

```sql
SELECT p.name,
       p.age,
       p.gender
FROM (
         SELECT name,
                gender,
                DATE_FORMAT(
                        FROM_DAYS(DATEDIFF(NOW(), birthdate)),
                        '%Y') + 0 AS age
         FROM person
     ) AS p
WHERE p.age < 45
  AND p.gender = 'Male'
```

## 1.2 Hãy tìm tất cả những nữ giới làm nghề lái xe 'driver'

```sql
select *
from person as p
where p.gender = 'Female'
  and p.job = 'driver';
```

## 1.3 Tính tỷ lệ nam/nữ lập trình viên trong tất cả tập dữ liệu

```sql
SELECT p1.gender,
       count(1)                                                                         as num,
       (count(p1.name) * 100 / (SELECT COUNT(1) FROM person as p WHERE p1.job = p.job)) as percent
FROM person as p1
WHERE p1.job = 'developer'
group by p1.gender
```

## 1.4 Hãy tìm 5 thành phố có số lượng nữ lớn nhất

```sql
select city, count(*) as numberFemale
from person p
where p.gender = 'Female'
group by city
order by numberFemale DESC limit 5
```

