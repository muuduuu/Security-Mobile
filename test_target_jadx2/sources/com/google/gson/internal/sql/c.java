package com.google.gson.internal.sql;

import com.google.gson.e;
import com.google.gson.reflect.TypeToken;
import com.google.gson.u;
import com.google.gson.v;
import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes2.dex */
class c extends u {

    /* renamed from: b, reason: collision with root package name */
    static final v f28647b = new a();

    /* renamed from: a, reason: collision with root package name */
    private final u f28648a;

    class a implements v {
        a() {
        }

        @Override // com.google.gson.v
        public u a(e eVar, TypeToken typeToken) {
            a aVar = null;
            if (typeToken.getRawType() == Timestamp.class) {
                return new c(eVar.n(Date.class), aVar);
            }
            return null;
        }
    }

    /* synthetic */ c(u uVar, a aVar) {
        this(uVar);
    }

    @Override // com.google.gson.u
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Timestamp b(S8.a aVar) {
        Date date = (Date) this.f28648a.b(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // com.google.gson.u
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public void d(S8.c cVar, Timestamp timestamp) {
        this.f28648a.d(cVar, timestamp);
    }

    private c(u uVar) {
        this.f28648a = uVar;
    }
}
