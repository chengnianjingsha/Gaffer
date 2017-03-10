/*
 * Copyright 2016 Crown Copyright
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.gchq.koryphe.binaryoperator;

import uk.gov.gchq.koryphe.tuple.n.Tuple2;
import java.util.function.BinaryOperator;

public class MockMultiInputBinaryOperator implements BinaryOperator<Tuple2<Integer, Integer>> {
    @Override
    public Tuple2<Integer, Integer> apply(Tuple2<Integer, Integer> input, Tuple2<Integer, Integer> state) {
        return input;
    }
}