package com.example.khaing.unb.VO;


import java.util.List;

public class ProgramVO implements BaseVO {

    private String programId;
    private String title;
    private String image;
    private List<Integer> avgLengths;
    private String description;

    private String categoryId;
    public List<SessionVO> sessions;

    public ProgramVO(String programId) {
        this.programId = programId;
    }

    public String getProgramId() {
        return programId;
    }

    public void setProgramId(String programId) {
        this.programId = programId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public List<Integer> getAvgLengths() {
        return avgLengths;
    }

    public void setAvgLengths(List<Integer> avgLengths) {
        this.avgLengths = avgLengths;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<SessionVO> getSessions() {
        return sessions;
    }

    public void setSessions(List<SessionVO> sessions) {
        this.sessions = sessions;
    }

    public String getCategoryId() {
        return categoryId;
    }
}
