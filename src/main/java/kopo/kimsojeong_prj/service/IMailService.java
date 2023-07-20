package kopo.kimsojeong_prj.service;

import kopo.kimsojeong_prj.dto.MailDTO;

public interface IMailService {


    int doSendMail(MailDTO pDTO); // 메일 발송
}