package io.pi3.algotraining.knapsackproblem;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Set;

@Getter
@AllArgsConstructor
class KnapsackItems {
    private final int value;
    private final Set<Integer> itemIndices;
}
