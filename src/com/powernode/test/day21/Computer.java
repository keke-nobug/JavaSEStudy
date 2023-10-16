package com.powernode.test.day21;

/**
 * ClassName: Computer
 * Package: com.powernode.homework.day21
 * Description:
 * Author: qzk
 * Create 2023/9/4 22:30
 * Version: 1.0
 */
public class Computer {
    private InsertDrawable insertDrawable;

    public InsertDrawable getInsertDrawable() {
        return insertDrawable;
    }

    public void setInsertDrawable(InsertDrawable insertDrawable) {
        this.insertDrawable = insertDrawable;
    }

    public Computer() {
    }

    public Computer(InsertDrawable insertDrawable) {
        this.insertDrawable = insertDrawable;
    }

    public void insert(){
        insertDrawable.usage();
    }
}
