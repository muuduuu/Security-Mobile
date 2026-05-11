package com.google.firebase.remoteconfig;

import D7.AbstractC0789m;
import D7.InterfaceC0779c;
import D7.InterfaceC0786j;
import J8.s;
import J8.u;
import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.internal.f;
import com.google.firebase.remoteconfig.internal.g;
import com.google.firebase.remoteconfig.internal.m;
import com.google.firebase.remoteconfig.internal.o;
import com.google.firebase.remoteconfig.internal.p;
import com.google.firebase.remoteconfig.internal.t;
import com.google.firebase.remoteconfig.internal.v;
import j8.C3511e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import k8.C3552a;
import k8.C3554c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p8.AbstractC3851j;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: n, reason: collision with root package name */
    public static final byte[] f28267n = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    private final Context f28268a;

    /* renamed from: b, reason: collision with root package name */
    private final C3511e f28269b;

    /* renamed from: c, reason: collision with root package name */
    private final C3554c f28270c;

    /* renamed from: d, reason: collision with root package name */
    private final Executor f28271d;

    /* renamed from: e, reason: collision with root package name */
    private final f f28272e;

    /* renamed from: f, reason: collision with root package name */
    private final f f28273f;

    /* renamed from: g, reason: collision with root package name */
    private final f f28274g;

    /* renamed from: h, reason: collision with root package name */
    private final m f28275h;

    /* renamed from: i, reason: collision with root package name */
    private final o f28276i;

    /* renamed from: j, reason: collision with root package name */
    private final t f28277j;

    /* renamed from: k, reason: collision with root package name */
    private final B8.f f28278k;

    /* renamed from: l, reason: collision with root package name */
    private final p f28279l;

    /* renamed from: m, reason: collision with root package name */
    private final K8.c f28280m;

    b(Context context, C3511e c3511e, B8.f fVar, C3554c c3554c, Executor executor, f fVar2, f fVar3, f fVar4, m mVar, o oVar, t tVar, p pVar, K8.c cVar) {
        this.f28268a = context;
        this.f28269b = c3511e;
        this.f28278k = fVar;
        this.f28270c = c3554c;
        this.f28271d = executor;
        this.f28272e = fVar2;
        this.f28273f = fVar3;
        this.f28274g = fVar4;
        this.f28275h = mVar;
        this.f28276i = oVar;
        this.f28277j = tVar;
        this.f28279l = pVar;
        this.f28280m = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void A(u uVar) {
        this.f28277j.n(uVar);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void B(a aVar) {
        this.f28277j.o(aVar.f28265a);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task C(g gVar) {
        return AbstractC0789m.g(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean D(Task task) {
        if (!task.isSuccessful()) {
            return false;
        }
        this.f28272e.d();
        g gVar = (g) task.getResult();
        if (gVar == null) {
            Log.e("FirebaseRemoteConfig", "Activated configs written to disk are null.");
            return true;
        }
        N(gVar.e());
        this.f28280m.c(gVar);
        return true;
    }

    private Task K(Map map) {
        try {
            return this.f28274g.k(g.l().b(map).a()).o(AbstractC3851j.a(), new InterfaceC0786j() { // from class: J8.g
                @Override // D7.InterfaceC0786j
                public final Task a(Object obj) {
                    Task C10;
                    C10 = com.google.firebase.remoteconfig.b.C((com.google.firebase.remoteconfig.internal.g) obj);
                    return C10;
                }
            });
        } catch (JSONException e10) {
            Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e10);
            return AbstractC0789m.g(null);
        }
    }

    static List M(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public static b s(C3511e c3511e) {
        return ((d) c3511e.j(d.class)).f();
    }

    private static boolean t(g gVar, g gVar2) {
        return gVar2 == null || !gVar.h().equals(gVar2.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task u(Task task, Task task2, Task task3) {
        if (!task.isSuccessful() || task.getResult() == null) {
            return AbstractC0789m.g(Boolean.FALSE);
        }
        g gVar = (g) task.getResult();
        return (!task2.isSuccessful() || t(gVar, (g) task2.getResult())) ? this.f28273f.k(gVar).i(this.f28271d, new InterfaceC0779c() { // from class: J8.l
            @Override // D7.InterfaceC0779c
            public final Object a(Task task4) {
                boolean D10;
                D10 = com.google.firebase.remoteconfig.b.this.D(task4);
                return Boolean.valueOf(D10);
            }
        }) : AbstractC0789m.g(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ s v(Task task, Task task2) {
        return (s) task.getResult();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task w(m.a aVar) {
        return AbstractC0789m.g(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Task x(m.a aVar) {
        return AbstractC0789m.g(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Task y(Void r12) {
        return k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void z() {
        this.f28273f.d();
        this.f28272e.d();
        this.f28274g.d();
        this.f28277j.a();
        return null;
    }

    public Task E() {
        return AbstractC0789m.d(this.f28271d, new Callable() { // from class: J8.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void z10;
                z10 = com.google.firebase.remoteconfig.b.this.z();
                return z10;
            }
        });
    }

    public Task F(final u uVar) {
        return AbstractC0789m.d(this.f28271d, new Callable() { // from class: J8.o
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void A10;
                A10 = com.google.firebase.remoteconfig.b.this.A(uVar);
                return A10;
            }
        });
    }

    void G(boolean z10) {
        this.f28279l.e(z10);
    }

    public Task H(final a aVar) {
        return AbstractC0789m.d(this.f28271d, new Callable() { // from class: J8.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void B10;
                B10 = com.google.firebase.remoteconfig.b.this.B(aVar);
                return B10;
            }
        });
    }

    public Task I(int i10) {
        return K(v.a(this.f28268a, i10));
    }

    public Task J(Map map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                hashMap.put((String) entry.getKey(), new String((byte[]) value));
            } else {
                hashMap.put((String) entry.getKey(), value.toString());
            }
        }
        return K(hashMap);
    }

    void L() {
        this.f28273f.e();
        this.f28274g.e();
        this.f28272e.e();
    }

    void N(JSONArray jSONArray) {
        if (this.f28270c == null) {
            return;
        }
        try {
            this.f28270c.m(M(jSONArray));
        } catch (C3552a e10) {
            Log.w("FirebaseRemoteConfig", "Could not update ABT experiments.", e10);
        } catch (JSONException e11) {
            Log.e("FirebaseRemoteConfig", "Could not parse ABT experiments from the JSON response.", e11);
        }
    }

    public Task k() {
        final Task e10 = this.f28272e.e();
        final Task e11 = this.f28273f.e();
        return AbstractC0789m.k(e10, e11).j(this.f28271d, new InterfaceC0779c() { // from class: J8.e
            @Override // D7.InterfaceC0779c
            public final Object a(Task task) {
                Task u10;
                u10 = com.google.firebase.remoteconfig.b.this.u(e10, e11, task);
                return u10;
            }
        });
    }

    public J8.d l(J8.c cVar) {
        return this.f28279l.b(cVar);
    }

    public Task m() {
        Task e10 = this.f28273f.e();
        Task e11 = this.f28274g.e();
        Task e12 = this.f28272e.e();
        final Task d10 = AbstractC0789m.d(this.f28271d, new Callable() { // from class: J8.i
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return com.google.firebase.remoteconfig.b.this.r();
            }
        });
        return AbstractC0789m.k(e10, e11, e12, d10, this.f28278k.getId(), this.f28278k.a(false)).i(this.f28271d, new InterfaceC0779c() { // from class: J8.j
            @Override // D7.InterfaceC0779c
            public final Object a(Task task) {
                s v10;
                v10 = com.google.firebase.remoteconfig.b.v(Task.this, task);
                return v10;
            }
        });
    }

    public Task n() {
        return this.f28275h.i().o(AbstractC3851j.a(), new InterfaceC0786j() { // from class: J8.f
            @Override // D7.InterfaceC0786j
            public final Task a(Object obj) {
                Task w10;
                w10 = com.google.firebase.remoteconfig.b.w((m.a) obj);
                return w10;
            }
        });
    }

    public Task o(long j10) {
        return this.f28275h.j(j10).o(AbstractC3851j.a(), new InterfaceC0786j() { // from class: J8.m
            @Override // D7.InterfaceC0786j
            public final Task a(Object obj) {
                Task x10;
                x10 = com.google.firebase.remoteconfig.b.x((m.a) obj);
                return x10;
            }
        });
    }

    public Task p() {
        return n().o(this.f28271d, new InterfaceC0786j() { // from class: J8.k
            @Override // D7.InterfaceC0786j
            public final Task a(Object obj) {
                Task y10;
                y10 = com.google.firebase.remoteconfig.b.this.y((Void) obj);
                return y10;
            }
        });
    }

    public Map q() {
        return this.f28276i.d();
    }

    public s r() {
        return this.f28277j.e();
    }
}
