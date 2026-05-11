package de;

import ee.C3122a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: de.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC3046c {

    /* renamed from: de.c$a */
    public static final class a implements InterfaceC3046c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f31897a = new a();

        private a() {
        }

        @Override // de.InterfaceC3046c
        public void a(int i10, C3122a windowCounter, long j10) {
            Intrinsics.checkNotNullParameter(windowCounter, "windowCounter");
        }

        @Override // de.InterfaceC3046c
        public void b(C3122a windowCounter) {
            Intrinsics.checkNotNullParameter(windowCounter, "windowCounter");
        }
    }

    void a(int i10, C3122a c3122a, long j10);

    void b(C3122a c3122a);
}
