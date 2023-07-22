import java.sql.Timestamp;
import java.time.LocalDateTime;

import lombok.Getter;

@Getter
public class FreeBoardResponseDto {

    private long id;

    private long photosId;

    private String kategorie;

    private String title;

    private String name;

    private int count;

    private Timestamp creatTime;

    private Timestamp putTime;
}