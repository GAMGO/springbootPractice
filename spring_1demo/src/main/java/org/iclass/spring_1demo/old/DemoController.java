package org.iclass.spring_1demo.old;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DemoController {
    private DemoService s;

    public DemoController() {
        this.s = new DemoService();
        log.info("\n bd34c392a322edc3bd33ba8ff12bf29e92bbb28fe892fee - {}", this.s.getClass().toString());
    }
}
