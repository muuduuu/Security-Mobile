package Ee;

import De.f;
import Td.E;
import Td.z;
import com.google.gson.e;
import com.google.gson.u;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import pe.C3877e;

/* loaded from: classes3.dex */
final class b implements f {

    /* renamed from: c, reason: collision with root package name */
    private static final z f2156c = z.g("application/json; charset=UTF-8");

    /* renamed from: d, reason: collision with root package name */
    private static final Charset f2157d = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    private final e f2158a;

    /* renamed from: b, reason: collision with root package name */
    private final u f2159b;

    b(e eVar, u uVar) {
        this.f2158a = eVar;
        this.f2159b = uVar;
    }

    @Override // De.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public E a(Object obj) {
        C3877e c3877e = new C3877e();
        S8.c r10 = this.f2158a.r(new OutputStreamWriter(c3877e.X1(), f2157d));
        this.f2159b.d(r10, obj);
        r10.close();
        return E.create(f2156c, c3877e.K());
    }
}
