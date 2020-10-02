package io.pi3.algotraining.knapsackproblem

import spock.lang.Specification

class KnapsackProblemSpec extends Specification {

    def 'should return max value items'() {
        when:
            def result = KnapsackProblem.getKnapsackResult(items, capacity)
        then:
            result.value == value
            result.itemIndices == indices
        where:
            items                | capacity || value | indices

            [new Item(1, 2),
             new Item(4, 3),
             new Item(5, 6),
             new Item(6, 7)]     | 10       || 10    | [1, 3] as Set

            [new Item(2, 1),
             new Item(70, 70),
             new Item(30, 30),
             new Item(69, 69),
             new Item(100, 100)] | 100      || 101   | [0, 2, 3] as Set

            [new Item(1, 2),
             new Item(70, 70),
             new Item(30, 30),
             new Item(69, 69),
             new Item(99, 100)]  | 100      || 100   | [1, 2] as Set

            [new Item(1, 2),
             new Item(70, 70),
             new Item(30, 30),
             new Item(69, 69),
             new Item(100, 100)] | 0        || 0     | [] as Set
    }
}
