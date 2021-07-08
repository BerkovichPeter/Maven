package org.example;

import com.sun.deploy.util.SessionState;

import javax.annotation.Nonnull;

public class ClientImpl implements Client {


    @Nonnull
    @Override
    public Response execute(@Nonnull Request request) {
        return new Response();
    }
}
