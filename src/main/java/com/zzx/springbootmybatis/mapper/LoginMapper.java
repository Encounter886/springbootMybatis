package com.zzx.springbootmybatis.mapper;

import com.zzx.springbootmybatis.bean.Login;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LoginMapper {
    @Select("select *from Login where id=#{id}")
    public Login getLoginById(Integer id);
}
