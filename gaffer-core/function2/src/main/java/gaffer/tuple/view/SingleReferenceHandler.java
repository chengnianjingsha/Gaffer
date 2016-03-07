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

package gaffer.tuple.view;

import gaffer.tuple.Tuple;

public class SingleReferenceHandler<R> implements TupleHandler<R> {
    private R reference;

    public SingleReferenceHandler(final R reference) {
        this.reference = reference;
    }

    public Object select(final Tuple<R> source) {
        return source.get(reference);
    }

    public void project(final Tuple<R> target, final Object value) {
        target.put(reference, value);
    }
}