package com.mall.enums;


public enum PageSize {
    PAGE_SIZE15(15), PAGE_SIZE20(20), PAGE_SIZE30(30), PAGE_SIZE40(40), PAGE_SIZE50(50);
    final int size;
    private PageSize(int size) {
        this.size = size;
    }
    public int getSize() {
        return size;
    }
}
