package com.zzx.springbootmybatis.mapper;

import com.zzx.springbootmybatis.bean.Person;
import org.apache.ibatis.annotations.Mapper;

@Mapper//或者mapperscan扫描装配到容器中
public interface PersonMapper {

    public Person getPersonById(Integer id);
}
