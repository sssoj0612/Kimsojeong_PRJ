package kopo.kimsojeong_prj.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NoticeDTO {
    private String notice_seq;  // 순번(기본키)
    private String title;       // 제목
    private String notice_yn;   // 공지 여부
    private String contents;    // 내용
    private String user_id;     // 작성자
    private String read_cnt;    // 조회수
    private String reg_id;      // 등록자
    private String reg_dt;      // 등록일
    private String chg_id;      // 수정자
    private String chg_dt;      // 수정일
}
