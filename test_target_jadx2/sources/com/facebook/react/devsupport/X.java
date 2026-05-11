package com.facebook.react.devsupport;

import Td.D;
import Td.InterfaceC1229e;
import Td.InterfaceC1230f;
import c3.AbstractC1721a;
import java.io.IOException;
import java.util.Locale;

/* loaded from: classes.dex */
public class X {

    /* renamed from: a, reason: collision with root package name */
    private final Td.B f21555a;

    class a implements InterfaceC1230f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C4.g f21556a;

        a(C4.g gVar) {
            this.f21556a = gVar;
        }

        @Override // Td.InterfaceC1230f
        public void c(InterfaceC1229e interfaceC1229e, Td.F f10) {
            if (!f10.isSuccessful()) {
                AbstractC1721a.m("ReactNative", "Got non-success http code from packager when requesting status: " + f10.f());
                this.f21556a.a(false);
                return;
            }
            Td.G b10 = f10.b();
            if (b10 == null) {
                AbstractC1721a.m("ReactNative", "Got null body response from packager when requesting status");
                this.f21556a.a(false);
                return;
            }
            String l10 = b10.l();
            if ("packager-status:running".equals(l10)) {
                this.f21556a.a(true);
                return;
            }
            AbstractC1721a.m("ReactNative", "Got unexpected response from packager when requesting status: " + l10);
            this.f21556a.a(false);
        }

        @Override // Td.InterfaceC1230f
        public void d(InterfaceC1229e interfaceC1229e, IOException iOException) {
            AbstractC1721a.J("ReactNative", "The packager does not seem to be running as we got an IOException requesting its status: " + iOException.getMessage());
            this.f21556a.a(false);
        }
    }

    public X(Td.B b10) {
        this.f21555a = b10;
    }

    private static String a(String str) {
        return String.format(Locale.US, "http://%s/status", str);
    }

    public void b(String str, C4.g gVar) {
        this.f21555a.a(new D.a().x(a(str)).b()).g1(new a(gVar));
    }
}
