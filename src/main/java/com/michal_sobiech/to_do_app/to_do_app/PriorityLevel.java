package com.michal_sobiech.to_do_app.to_do_app;


public enum PriorityLevel {
    
    NORMAL(0),
    MEDIUM(1),
    HIGH(2);

    public int level_nr;

    private PriorityLevel(int level_nr) {
        this.level_nr = level_nr;
    }

}