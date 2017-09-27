package com.example;

import java.util.Collection;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder(builderMethodName = "punchLiner")
@ToString
@EqualsAndHashCode(of = "id")
final class PunchLineJoke implements PunchLiner {
    private long id;
    private Collection<String> tags;
    private String body;
    private String punchLine;
}
