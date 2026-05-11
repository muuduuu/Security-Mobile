package androidx.work;

import android.net.Network;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import x1.AbstractC5096C;
import x1.InterfaceC5105i;
import x1.u;

/* loaded from: classes.dex */
public final class WorkerParameters {

    /* renamed from: a, reason: collision with root package name */
    private UUID f18098a;

    /* renamed from: b, reason: collision with root package name */
    private b f18099b;

    /* renamed from: c, reason: collision with root package name */
    private Set f18100c;

    /* renamed from: d, reason: collision with root package name */
    private a f18101d;

    /* renamed from: e, reason: collision with root package name */
    private int f18102e;

    /* renamed from: f, reason: collision with root package name */
    private Executor f18103f;

    /* renamed from: g, reason: collision with root package name */
    private E1.b f18104g;

    /* renamed from: h, reason: collision with root package name */
    private AbstractC5096C f18105h;

    /* renamed from: i, reason: collision with root package name */
    private u f18106i;

    /* renamed from: j, reason: collision with root package name */
    private InterfaceC5105i f18107j;

    /* renamed from: k, reason: collision with root package name */
    private int f18108k;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public List f18109a = Collections.emptyList();

        /* renamed from: b, reason: collision with root package name */
        public List f18110b = Collections.emptyList();

        /* renamed from: c, reason: collision with root package name */
        public Network f18111c;
    }

    public WorkerParameters(UUID uuid, b bVar, Collection collection, a aVar, int i10, int i11, Executor executor, E1.b bVar2, AbstractC5096C abstractC5096C, u uVar, InterfaceC5105i interfaceC5105i) {
        this.f18098a = uuid;
        this.f18099b = bVar;
        this.f18100c = new HashSet(collection);
        this.f18101d = aVar;
        this.f18102e = i10;
        this.f18108k = i11;
        this.f18103f = executor;
        this.f18104g = bVar2;
        this.f18105h = abstractC5096C;
        this.f18106i = uVar;
        this.f18107j = interfaceC5105i;
    }

    public Executor a() {
        return this.f18103f;
    }

    public InterfaceC5105i b() {
        return this.f18107j;
    }

    public UUID c() {
        return this.f18098a;
    }

    public b d() {
        return this.f18099b;
    }

    public Set e() {
        return this.f18100c;
    }

    public E1.b f() {
        return this.f18104g;
    }

    public AbstractC5096C g() {
        return this.f18105h;
    }
}
