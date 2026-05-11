package io.sentry;

import io.sentry.A1;
import io.sentry.C3405e;
import io.sentry.C3419i1;
import io.sentry.C3474z1;
import io.sentry.I0;
import io.sentry.J0;
import io.sentry.J1;
import io.sentry.K1;
import io.sentry.L1;
import io.sentry.Z1;
import io.sentry.c2;
import io.sentry.clientreport.b;
import io.sentry.e2;
import io.sentry.g2;
import io.sentry.profilemeasurements.a;
import io.sentry.profilemeasurements.b;
import io.sentry.protocol.B;
import io.sentry.protocol.C;
import io.sentry.protocol.C3441a;
import io.sentry.protocol.C3442b;
import io.sentry.protocol.C3443c;
import io.sentry.protocol.C3444d;
import io.sentry.protocol.D;
import io.sentry.protocol.e;
import io.sentry.protocol.f;
import io.sentry.protocol.g;
import io.sentry.protocol.h;
import io.sentry.protocol.i;
import io.sentry.protocol.j;
import io.sentry.protocol.k;
import io.sentry.protocol.l;
import io.sentry.protocol.m;
import io.sentry.protocol.o;
import io.sentry.protocol.p;
import io.sentry.protocol.q;
import io.sentry.protocol.s;
import io.sentry.protocol.t;
import io.sentry.protocol.u;
import io.sentry.protocol.v;
import io.sentry.protocol.w;
import io.sentry.protocol.x;
import io.sentry.protocol.y;
import io.sentry.t2;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.sentry.k0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3424k0 implements Q {

    /* renamed from: c, reason: collision with root package name */
    private static final Charset f35179c = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    private final P1 f35180a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f35181b;

    public C3424k0(P1 p12) {
        this.f35180a = p12;
        HashMap hashMap = new HashMap();
        this.f35181b = hashMap;
        hashMap.put(C3441a.class, new C3441a.C0511a());
        hashMap.put(C3405e.class, new C3405e.a());
        hashMap.put(C3442b.class, new C3442b.a());
        hashMap.put(C3443c.class, new C3443c.a());
        hashMap.put(C3444d.class, new C3444d.a());
        hashMap.put(io.sentry.protocol.e.class, new e.a());
        hashMap.put(io.sentry.protocol.f.class, new f.a());
        hashMap.put(f.b.class, new f.b.a());
        hashMap.put(io.sentry.protocol.h.class, new h.a());
        hashMap.put(io.sentry.protocol.i.class, new i.a());
        hashMap.put(io.sentry.protocol.j.class, new j.a());
        hashMap.put(io.sentry.protocol.k.class, new k.a());
        hashMap.put(io.sentry.protocol.l.class, new l.a());
        hashMap.put(I0.class, new I0.b());
        hashMap.put(J0.class, new J0.a());
        hashMap.put(io.sentry.profilemeasurements.a.class, new a.C0510a());
        hashMap.put(io.sentry.profilemeasurements.b.class, new b.a());
        hashMap.put(io.sentry.protocol.m.class, new m.a());
        hashMap.put(io.sentry.protocol.o.class, new o.a());
        hashMap.put(io.sentry.protocol.p.class, new p.a());
        hashMap.put(C3419i1.class, new C3419i1.a());
        hashMap.put(C3474z1.class, new C3474z1.a());
        hashMap.put(A1.class, new A1.a());
        hashMap.put(io.sentry.protocol.q.class, new q.a());
        hashMap.put(J1.class, new J1.a());
        hashMap.put(K1.class, new K1.a());
        hashMap.put(L1.class, new L1.a());
        hashMap.put(io.sentry.protocol.s.class, new s.a());
        hashMap.put(io.sentry.protocol.t.class, new t.a());
        hashMap.put(io.sentry.protocol.u.class, new u.a());
        hashMap.put(io.sentry.protocol.v.class, new v.a());
        hashMap.put(io.sentry.protocol.w.class, new w.a());
        hashMap.put(io.sentry.protocol.x.class, new x.a());
        hashMap.put(io.sentry.protocol.y.class, new y.a());
        hashMap.put(Z1.class, new Z1.a());
        hashMap.put(c2.class, new c2.a());
        hashMap.put(e2.class, new e2.a());
        hashMap.put(g2.class, new g2.a());
        hashMap.put(io.sentry.protocol.B.class, new B.a());
        hashMap.put(io.sentry.protocol.g.class, new g.a());
        hashMap.put(t2.class, new t2.a());
        hashMap.put(io.sentry.clientreport.b.class, new b.a());
        hashMap.put(io.sentry.protocol.D.class, new D.a());
        hashMap.put(io.sentry.protocol.C.class, new C.a());
    }

    private boolean f(Class cls) {
        return cls.isArray() || Collection.class.isAssignableFrom(cls) || String.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls);
    }

    private String g(Object obj, boolean z10) {
        StringWriter stringWriter = new StringWriter();
        C3415h0 c3415h0 = new C3415h0(stringWriter, this.f35180a.getMaxDepth());
        if (z10) {
            c3415h0.s("\t");
        }
        c3415h0.g(this.f35180a.getLogger(), obj);
        return stringWriter.toString();
    }

    @Override // io.sentry.Q
    public void a(Object obj, Writer writer) {
        io.sentry.util.n.c(obj, "The entity is required.");
        io.sentry.util.n.c(writer, "The Writer object is required.");
        ILogger logger = this.f35180a.getLogger();
        K1 k12 = K1.DEBUG;
        if (logger.d(k12)) {
            this.f35180a.getLogger().c(k12, "Serializing object: %s", g(obj, this.f35180a.isEnablePrettySerializationOutput()));
        }
        new C3415h0(writer, this.f35180a.getMaxDepth()).g(this.f35180a.getLogger(), obj);
        writer.flush();
    }

    @Override // io.sentry.Q
    public void b(C3416h1 c3416h1, OutputStream outputStream) {
        io.sentry.util.n.c(c3416h1, "The SentryEnvelope object is required.");
        io.sentry.util.n.c(outputStream, "The Stream object is required.");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), f35179c));
        try {
            c3416h1.b().serialize(new C3415h0(bufferedWriter, this.f35180a.getMaxDepth()), this.f35180a.getLogger());
            bufferedWriter.write("\n");
            for (C3471y1 c3471y1 : c3416h1.c()) {
                try {
                    byte[] w10 = c3471y1.w();
                    c3471y1.x().serialize(new C3415h0(bufferedWriter, this.f35180a.getMaxDepth()), this.f35180a.getLogger());
                    bufferedWriter.write("\n");
                    bufferedWriter.flush();
                    outputStream.write(w10);
                    bufferedWriter.write("\n");
                } catch (Exception e10) {
                    this.f35180a.getLogger().b(K1.ERROR, "Failed to create envelope item. Dropping it.", e10);
                }
            }
        } finally {
            bufferedWriter.flush();
        }
    }

    @Override // io.sentry.Q
    public Object c(Reader reader, Class cls) {
        try {
            C3409f0 c3409f0 = new C3409f0(reader);
            Z z10 = (Z) this.f35181b.get(cls);
            if (z10 != null) {
                return cls.cast(z10.a(c3409f0, this.f35180a.getLogger()));
            }
            if (f(cls)) {
                return c3409f0.t1();
            }
            return null;
        } catch (Exception e10) {
            this.f35180a.getLogger().b(K1.ERROR, "Error when deserializing", e10);
            return null;
        }
    }

    @Override // io.sentry.Q
    public C3416h1 d(InputStream inputStream) {
        io.sentry.util.n.c(inputStream, "The InputStream object is required.");
        try {
            return this.f35180a.getEnvelopeReader().a(inputStream);
        } catch (IOException e10) {
            this.f35180a.getLogger().b(K1.ERROR, "Error deserializing envelope.", e10);
            return null;
        }
    }

    @Override // io.sentry.Q
    public Object e(Reader reader, Class cls, Z z10) {
        try {
            C3409f0 c3409f0 = new C3409f0(reader);
            return Collection.class.isAssignableFrom(cls) ? z10 == null ? c3409f0.t1() : c3409f0.l1(this.f35180a.getLogger(), z10) : c3409f0.t1();
        } catch (Throwable th) {
            this.f35180a.getLogger().b(K1.ERROR, "Error when deserializing", th);
            return null;
        }
    }
}
