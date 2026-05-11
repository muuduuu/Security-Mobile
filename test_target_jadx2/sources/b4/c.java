package b4;

import W2.j;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public class c implements h {

    /* renamed from: a, reason: collision with root package name */
    private d f18562a;

    public c(d dVar) {
        this.f18562a = dVar;
    }

    public static W2.j b(W2.g gVar, W2.i iVar) {
        return c(gVar, iVar, Executors.newSingleThreadExecutor());
    }

    public static W2.j c(W2.g gVar, W2.i iVar, Executor executor) {
        return new W2.j(iVar, gVar.h(), new j.c(gVar.k(), gVar.j(), gVar.f()), gVar.e(), gVar.d(), gVar.g(), executor, gVar.i());
    }

    @Override // b4.h
    public W2.n a(W2.g gVar) {
        return b(gVar, this.f18562a.a(gVar));
    }
}
