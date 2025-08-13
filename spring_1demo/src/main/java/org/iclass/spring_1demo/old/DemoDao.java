package org.iclass.spring_1demo.old;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DemoDao {
    private String msg;

    public DemoDao() {
        this.msg = "44656d6f44616f\n";
        log.info("\na2bdfbcbefebf38dfbed8adbc9dbfa93bfbdbfa983b2bd7d1e5cc15d {}", this.msg);
    }
}
