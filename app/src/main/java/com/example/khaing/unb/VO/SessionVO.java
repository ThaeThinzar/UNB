package com.example.khaing.unb.VO;

public class SessionVO implements BaseVO {

    private String sessionId;
    private String title;
    private String lengthInSec;
    private String filePath;

    private String programId;

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLengthInSec() {
        return lengthInSec;
    }

    public void setLengthInSec(String lengthInSec) {
        this.lengthInSec = lengthInSec;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getProgramId() {
        return programId;
    }
}
