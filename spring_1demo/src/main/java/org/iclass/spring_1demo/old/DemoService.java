package org.iclass.spring_1demo.old;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DemoService {
    private DemoDao dao;

    public DemoService() {
        this.dao = new DemoDao();
        log.info("\n e2ff392dcaefa62dfe8fda8fcfa8df6c6c2fc2fa62267a9 : {}", this.dao.getClass().toString());
    }
}
