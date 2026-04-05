package com.arhaminst.Spring_Data_JPA_Demo.StudentInfo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StandardRepo extends JpaRepository<StandardInfo,Integer>
{
       StandardInfo findByStdandard(int std);

}
