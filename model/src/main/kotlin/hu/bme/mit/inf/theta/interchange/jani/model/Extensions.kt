/*
 * Copyright 2018 Contributors to the Theta project
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
package hu.bme.mit.inf.theta.interchange.jani.model

import com.fasterxml.jackson.annotation.JsonValue
import java.lang.annotation.Inherited

enum class ModelFeature(@get:JsonValue val featureName: String) {
    /**
     * Support for array types.
     */
    ARRAYS("arrays"),

    /**
     * Support for complex datatypes.
     */
    DATATYPES("datatypes"),

    /**
     * Support for some derived operators in expressions.
     */
    DERIVED_OPERATORS("derived-operators"),

    /**
     * Support for priorities on edges.
     */
    EDGE_PRIORITIES("edge-priorities"),

    /**
     * Support for priorities on edges.
     */
    FUNCTIONS("functions"),

    /**
     * Support for hyperbolic functions.
     */
    HYPERBOLIC_FUNCTIONS("hyperbolic-functions"),

    /**
     * Support for named subexpressions.
     */
    NAMED_EXPRESSIONS("named-expressions"),

    /**
     * Support for nondeterministic selection in expressions.
     */
    NONDET_SELECTION("nondet-selection"),

    /**
     * Support for accumulating rewards when leaving a state.
     */
    STATE_EXIT_REWARDS("state-exit-rewards"),

    /**
     * Support for multi-objective tradeoff properties.
     */
    TRADEOFF_PROPERTIES("tradeoff-properties"),

    /**
     * Support for trigonometric functions.
     */
    TRIGONOMETRIC_FUNCTIONS("trigonometric-functions")
}

@Target(AnnotationTarget.CLASS, AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER)
@Retention(AnnotationRetention.RUNTIME)
@Inherited
@MustBeDocumented
annotation class JaniExtension(val modelFeature: ModelFeature)