package com.fasterxml.jackson.core;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class c extends IOException {
    protected c(String str) {
        super(str);
    }

    public abstract g a();

    public abstract String b();

    public abstract Object c();

    protected c(String str, Throwable th) {
        super(str, th);
    }
}
