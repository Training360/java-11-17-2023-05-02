package training.java9;

import org.mapstruct.Mapper;

@Mapper
public interface BookMapper {

    BookDto convert(Book book);
}
