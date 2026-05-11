package com.google.firebase.messaging;

import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import u8.InterfaceC4873a;
import u8.InterfaceC4874b;
import w8.C5044a;

/* renamed from: com.google.firebase.messaging.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2836a implements InterfaceC4873a {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC4873a f28128a = new C2836a();

    /* renamed from: com.google.firebase.messaging.a$a, reason: collision with other inner class name */
    private static final class C0415a implements t8.d {

        /* renamed from: a, reason: collision with root package name */
        static final C0415a f28129a = new C0415a();

        /* renamed from: b, reason: collision with root package name */
        private static final t8.c f28130b = t8.c.a("projectNumber").b(C5044a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final t8.c f28131c = t8.c.a("messageId").b(C5044a.b().c(2).a()).a();

        /* renamed from: d, reason: collision with root package name */
        private static final t8.c f28132d = t8.c.a("instanceId").b(C5044a.b().c(3).a()).a();

        /* renamed from: e, reason: collision with root package name */
        private static final t8.c f28133e = t8.c.a("messageType").b(C5044a.b().c(4).a()).a();

        /* renamed from: f, reason: collision with root package name */
        private static final t8.c f28134f = t8.c.a("sdkPlatform").b(C5044a.b().c(5).a()).a();

        /* renamed from: g, reason: collision with root package name */
        private static final t8.c f28135g = t8.c.a("packageName").b(C5044a.b().c(6).a()).a();

        /* renamed from: h, reason: collision with root package name */
        private static final t8.c f28136h = t8.c.a("collapseKey").b(C5044a.b().c(7).a()).a();

        /* renamed from: i, reason: collision with root package name */
        private static final t8.c f28137i = t8.c.a("priority").b(C5044a.b().c(8).a()).a();

        /* renamed from: j, reason: collision with root package name */
        private static final t8.c f28138j = t8.c.a("ttl").b(C5044a.b().c(9).a()).a();

        /* renamed from: k, reason: collision with root package name */
        private static final t8.c f28139k = t8.c.a("topic").b(C5044a.b().c(10).a()).a();

        /* renamed from: l, reason: collision with root package name */
        private static final t8.c f28140l = t8.c.a("bulkId").b(C5044a.b().c(11).a()).a();

        /* renamed from: m, reason: collision with root package name */
        private static final t8.c f28141m = t8.c.a(Keys.EVENT).b(C5044a.b().c(12).a()).a();

        /* renamed from: n, reason: collision with root package name */
        private static final t8.c f28142n = t8.c.a("analyticsLabel").b(C5044a.b().c(13).a()).a();

        /* renamed from: o, reason: collision with root package name */
        private static final t8.c f28143o = t8.c.a("campaignId").b(C5044a.b().c(14).a()).a();

        /* renamed from: p, reason: collision with root package name */
        private static final t8.c f28144p = t8.c.a("composerLabel").b(C5044a.b().c(15).a()).a();

        private C0415a() {
        }

        @Override // t8.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(G8.a aVar, t8.e eVar) {
            eVar.b(f28130b, aVar.l());
            eVar.a(f28131c, aVar.h());
            eVar.a(f28132d, aVar.g());
            eVar.a(f28133e, aVar.i());
            eVar.a(f28134f, aVar.m());
            eVar.a(f28135g, aVar.j());
            eVar.a(f28136h, aVar.d());
            eVar.e(f28137i, aVar.k());
            eVar.e(f28138j, aVar.o());
            eVar.a(f28139k, aVar.n());
            eVar.b(f28140l, aVar.b());
            eVar.a(f28141m, aVar.f());
            eVar.a(f28142n, aVar.a());
            eVar.b(f28143o, aVar.c());
            eVar.a(f28144p, aVar.e());
        }
    }

    /* renamed from: com.google.firebase.messaging.a$b */
    private static final class b implements t8.d {

        /* renamed from: a, reason: collision with root package name */
        static final b f28145a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final t8.c f28146b = t8.c.a("messagingClientEvent").b(C5044a.b().c(1).a()).a();

        private b() {
        }

        @Override // t8.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(G8.b bVar, t8.e eVar) {
            eVar.a(f28146b, bVar.a());
        }
    }

    /* renamed from: com.google.firebase.messaging.a$c */
    private static final class c implements t8.d {

        /* renamed from: a, reason: collision with root package name */
        static final c f28147a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final t8.c f28148b = t8.c.d("messagingClientEventExtension");

        private c() {
        }

        @Override // t8.d
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            android.support.v4.media.session.b.a(obj);
            b(null, (t8.e) obj2);
        }

        public void b(O o10, t8.e eVar) {
            throw null;
        }
    }

    private C2836a() {
    }

    @Override // u8.InterfaceC4873a
    public void a(InterfaceC4874b interfaceC4874b) {
        interfaceC4874b.a(O.class, c.f28147a);
        interfaceC4874b.a(G8.b.class, b.f28145a);
        interfaceC4874b.a(G8.a.class, C0415a.f28129a);
    }
}
