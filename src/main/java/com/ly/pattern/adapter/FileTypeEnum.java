package com.ly.pattern.adapter;

/**
 * @author ly
 * @Date: 2022/8/26 16:50
 *
 * 文件类型枚举
 */
public enum FileTypeEnum {

    /**音频*/
    MP3("MP3", ".MP3"),
    /**音视频*/
    MP4("MP4", ".MP4"),
    /**音视频*/
    VLC("VLC", ".VLC"),
    ;


    /**编码*/
    private final String code;
    /**意义*/
    private final String msg;

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    FileTypeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
