package com.goodworkalan.prattle.mix;

import com.goodworkalan.mix.ProjectModule;
import com.goodworkalan.mix.builder.Builder;
import com.goodworkalan.mix.cookbook.JavaProject;

/**
 * Builds the project definition for Tuple Partial.
 *
 * @author Alan Gutierrez
 */
public class TuplePartialProject implements ProjectModule {
    /**
     * Build the project definition for Tuple Partial.
     *
     * @param builder
     *          The project builder.
     */
    public void build(Builder builder) {
        builder
            .cookbook(JavaProject.class)
                .produces("com.mallardsoft/tuple-partial/0.1.0")
                .depends()
                    .production("com.mallardsoft/tuple/+2.0")
                    .development("org.testng/testng-jdk15/5.10")
                    .development("org.mockito/mockito-core/1.6")
                    .end()
                .end()
            .end();
    }
}
