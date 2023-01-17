package com.khan.ex1028;

public class MessageVO {
    // 필드
    private String name;
    private String content;
    private String time;
    private int imgId;
    private String count;

    // 생성자 메소드
    public MessageVO(String name, String content, String time, int imgId, String count) {
        this.name = name;
        this.content = content;
        this.time = time;
        this.imgId = imgId;
        this.count = count;
    }

    // getter/setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getimgId() {
        return imgId;
    }

    public void setimgId(int imgId) {
        this.imgId = imgId;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    // toString

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MessageVO{");
        sb.append("name='").append(name).append('\'');
        sb.append(", content='").append(content).append('\'');
        sb.append(", time='").append(time).append('\'');
        sb.append(", imgId=").append(imgId);
        sb.append(", count='").append(count).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
