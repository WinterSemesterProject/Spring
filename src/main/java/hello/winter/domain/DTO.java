package hello.winter.domain;

import com.google.gson.Gson;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DTO {
    Gson dataList; //날짜별로 가격정보 json으로 묶어서 전달
}
