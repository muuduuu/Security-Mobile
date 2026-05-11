package com.fasterxml.jackson.core;

/* loaded from: classes2.dex */
public abstract class i extends c {
    protected i(String str, g gVar, Throwable th) {
        super(str, th);
    }

    @Override // com.fasterxml.jackson.core.c
    public g a() {
        return null;
    }

    @Override // com.fasterxml.jackson.core.c
    public String b() {
        return super.getMessage();
    }

    protected String d() {
        return null;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        a();
        String d10 = d();
        if (d10 == null) {
            return message;
        }
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append(message);
        if (d10 != null) {
            sb2.append(d10);
        }
        return sb2.toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }

    protected i(String str) {
        super(str);
    }

    protected i(String str, g gVar) {
        this(str, gVar, null);
    }
}
