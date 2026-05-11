package com.facebook.imagepipeline.producers;

import java.io.InputStream;
import java.util.Map;

/* loaded from: classes.dex */
public interface X {

    public interface a {
        void a();

        void b(InputStream inputStream, int i10);

        void onFailure(Throwable th);
    }

    void a(C c10, int i10);

    boolean b(C c10);

    Map c(C c10, int i10);

    void d(C c10, a aVar);

    C e(InterfaceC1847n interfaceC1847n, e0 e0Var);
}
