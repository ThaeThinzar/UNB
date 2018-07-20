package com.example.khaing.unb.VO;

import java.util.List;

public class CategoryVO implements BaseVO {

    private String categoryId;
    private String title;

    private List<ProgramVO> programs;





    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<ProgramVO> getPrograms() {
        return programs;
    }

    public void setPrograms(List<ProgramVO> programs) {
        this.programs = programs;
    }
}
