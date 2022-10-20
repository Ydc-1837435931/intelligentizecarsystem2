package com.ydcelad.intelligentizecarsystem.entity;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class noticeInfo {

    /** 公告ID */
    private Long noticeid;

    /** 公告标题 */
    private String noticetitle;

    /** 公告文 */
    private String noticetext;

    /** 公告类型 */
    private String noticetype;

    /** 公告发布者 */
    private String noticeroleid;

    /** 公告创建时间 */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date noticecreatetime;

    /** 公告结束时间 */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date noticeendtime;

    /** 公告可许 */
    private Long noticeisdelete;
}
