package kopo.kimsojeong_prj.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserInfoDTO {

    private String user_id;     // 아이디
    private String password;    // 비밀번호
    private String email;       // 이메일
    private String reg_id;      // 등록 id
    private String reg_dt;      // 가입 일자
    private String chg_id;      // 변경한 id
    private String chg_dt;      // 변경일



    private String exists_yn;   // 회원 중복가입 확인을 위한 변수
    private int authNumber;     // 이메일 중복체크를 위한 인증번호
}
