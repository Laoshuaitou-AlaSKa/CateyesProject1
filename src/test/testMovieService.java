import com.zhbit210.model.serviceImpl.MovieServiceImpl;

import java.io.IOException;

public class testMovieService {
    public static void main(String[] args) throws IOException {
        MovieServiceImpl movieServiceImpl = new MovieServiceImpl();
        movieServiceImpl.selectMovieIntro("出远门儿");
    }
}
