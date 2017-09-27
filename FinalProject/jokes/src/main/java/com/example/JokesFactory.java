package com.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import lombok.experimental.UtilityClass;

@UtilityClass
public final class JokesFactory {
    public static final Collection<String> PUNCH_LINE_TAGS = Collections.unmodifiableCollection(
            Arrays.asList("priest", "lawyer"));
    public static final Collection<String> JOKE_TAGS = Collections.unmodifiableCollection(
            Arrays.asList("grammar"));

    public static final PunchLiner punchLiner() {
        return PunchLineJoke.punchLiner().id(1L)
                .tags(PUNCH_LINE_TAGS)
                .body("What do you call a priest that becomes a lawyer?")
                .punchLine("A father in law.")
                .build();
    }

    public static final Joke joke() {
        return PunchLineJoke.punchLiner().id(2L)
                .tags(JOKE_TAGS)
                .body("The past, present and future walked into a bar... It was tense!")
                .build();

    }
}
