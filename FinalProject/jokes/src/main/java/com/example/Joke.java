package com.example;

import java.util.Collection;

public interface Joke {
    String getBody();
    long getId();
    Collection<String> getTags();
}
