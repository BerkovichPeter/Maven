package org.example;


import javax.annotation.Nonnull;

public interface Client {
    @Nonnull
    Response execute(@Nonnull Request request);
}
