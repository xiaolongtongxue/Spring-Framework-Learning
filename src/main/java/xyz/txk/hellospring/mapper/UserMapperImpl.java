package xyz.txk.hellospring.mapper;

import org.mybatis.spring.SqlSessionTemplate;
import xyz.txk.hellospring.pojo.User;

import java.util.List;

public class UserMapperImpl implements UserMapper{
    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public List<User> selectusers() {
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectusers();
    }
}
