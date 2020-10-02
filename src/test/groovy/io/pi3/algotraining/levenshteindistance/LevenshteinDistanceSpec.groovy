package io.pi3.algotraining.levenshteindistance

import spock.lang.Specification

class LevenshteinDistanceSpec extends Specification {
    def 'should return valid Levenshtein distance'() {
        expect:
            LevenshteinDistance.getLevenshteinDistance(str1, str2) == levenshteinDistance
        where:
            str1           | str2            || levenshteinDistance
            'abc'          | 'yabd'          || 2
            ''             | ''              || 0
            ''             | 'abc'           || 3
            'abc'          | 'abc'           || 0
            'abc'          | 'abx'           || 1
            'abc'          | 'abcx'          || 1
            'abc'          | 'yabcx'         || 2
            'algotraining' | 'algoztraining' || 1
            'abcdefghij'   | '1234567890'    || 10
            'abcdefghij'   | 'a234567890'    || 9
            'biting'       | 'mitten'        || 4
            'cereal'       | 'saturday'      || 6
            'cereal'       | 'saturdzz'      || 7
            'abbbbbbbbb'   | 'bbbbbbbbba'    || 2
            'xabc'         | 'abcx'          || 2
            'table'        | 'bal'           || 3
            'gumbo'        | 'gambol'        || 2
    }
}
