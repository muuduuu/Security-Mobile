package com.google.gson;

import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class u {

    class a extends u {
        a() {
        }

        @Override // com.google.gson.u
        public Object b(S8.a aVar) {
            if (aVar.N() != S8.b.NULL) {
                return u.this.b(aVar);
            }
            aVar.F();
            return null;
        }

        @Override // com.google.gson.u
        public void d(S8.c cVar, Object obj) {
            if (obj == null) {
                cVar.r();
            } else {
                u.this.d(cVar, obj);
            }
        }
    }

    public final u a() {
        return new a();
    }

    public abstract Object b(S8.a aVar);

    public final h c(Object obj) {
        try {
            com.google.gson.internal.bind.e eVar = new com.google.gson.internal.bind.e();
            d(eVar, obj);
            return eVar.z0();
        } catch (IOException e10) {
            throw new i(e10);
        }
    }

    public abstract void d(S8.c cVar, Object obj);
}
