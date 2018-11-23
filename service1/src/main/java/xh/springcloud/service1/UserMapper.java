package xh.springcloud.service1;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserMapper {

    @Insert("insert into stu(userId,name,sourse,score)values(#{userId},#{name},#{sourse},#{score})")
    @Options(useGeneratedKeys = true,keyColumn = "userId",keyProperty ="userId")
    int insert(Map<String,Object> map);

    @Select("select * from stu")
    List<Map<String,Object>> select();

}
