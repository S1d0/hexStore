package com.hex.store

import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class StoreApplicationTest extends Specification {
    def "Main"() {
        expect:
        1==1
    }
}
