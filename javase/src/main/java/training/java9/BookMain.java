package training.java9;

import org.mapstruct.factory.Mappers;

public class BookMain {

    public static void main(String[] args) {
        BookMapper mapper = Mappers.getMapper( BookMapper.class );
        BookDto dto = mapper.convert(new Book(1L, "john doe", "Java in action"));
        System.out.println(dto);

    }
}
