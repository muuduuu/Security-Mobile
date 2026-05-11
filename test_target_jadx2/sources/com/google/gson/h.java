package com.google.gson;

import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes2.dex */
public abstract class h {
    public int c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public g e() {
        if (m()) {
            return (g) this;
        }
        throw new IllegalStateException("Not a JSON Array: " + this);
    }

    public k h() {
        if (t()) {
            return (k) this;
        }
        throw new IllegalStateException("Not a JSON Object: " + this);
    }

    public n j() {
        if (u()) {
            return (n) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: " + this);
    }

    public long k() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean m() {
        return this instanceof g;
    }

    public boolean r() {
        return this instanceof j;
    }

    public boolean t() {
        return this instanceof k;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            S8.c cVar = new S8.c(stringWriter);
            cVar.F(r.LENIENT);
            P8.n.b(this, cVar);
            return stringWriter.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public boolean u() {
        return this instanceof n;
    }
}
