package com.zhbit210.model.serviceImpl;

import com.zhbit210.model.dao.MovieMapper;
import com.zhbit210.model.service.MovieService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;

public class MovieServiceImpl implements MovieService{
    private SqlSession sqlSession;
    private MovieMapper movieMapper;

    public MovieServiceImpl() throws IOException {
        this.sqlSession = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml")).openSession();
        this.movieMapper = sqlSession.getMapper(MovieMapper.class);
    }

    @Override
    public String selectMovieIntro(String movieName) {
        String intro = movieMapper.selectIntroByMoviename(movieName);
        System.out.println(intro);
        return intro;
    }
}
