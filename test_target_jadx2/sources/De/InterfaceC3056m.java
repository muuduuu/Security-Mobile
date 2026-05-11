package de;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC3879g;

/* renamed from: de.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC3056m {

    /* renamed from: a, reason: collision with root package name */
    public static final a f32076a = a.f32078a;

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC3056m f32077b = new a.C0464a();

    /* renamed from: de.m$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f32078a = new a();

        /* renamed from: de.m$a$a, reason: collision with other inner class name */
        private static final class C0464a implements InterfaceC3056m {
            @Override // de.InterfaceC3056m
            public boolean a(int i10, List requestHeaders) {
                Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
                return true;
            }

            @Override // de.InterfaceC3056m
            public boolean b(int i10, List responseHeaders, boolean z10) {
                Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
                return true;
            }

            @Override // de.InterfaceC3056m
            public boolean c(int i10, InterfaceC3879g source, int i11, boolean z10) {
                Intrinsics.checkNotNullParameter(source, "source");
                source.skip(i11);
                return true;
            }

            @Override // de.InterfaceC3056m
            public void d(int i10, EnumC3045b errorCode) {
                Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            }
        }

        private a() {
        }
    }

    boolean a(int i10, List list);

    boolean b(int i10, List list, boolean z10);

    boolean c(int i10, InterfaceC3879g interfaceC3879g, int i11, boolean z10);

    void d(int i10, EnumC3045b enumC3045b);
}
