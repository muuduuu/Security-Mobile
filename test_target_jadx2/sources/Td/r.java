package Td;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.collections.AbstractC3574i;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface r {

    /* renamed from: a, reason: collision with root package name */
    public static final a f10197a = a.f10199a;

    /* renamed from: b, reason: collision with root package name */
    public static final r f10198b = new a.C0193a();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f10199a = new a();

        /* renamed from: Td.r$a$a, reason: collision with other inner class name */
        private static final class C0193a implements r {
            @Override // Td.r
            public List a(String hostname) {
                Intrinsics.checkNotNullParameter(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    Intrinsics.checkNotNullExpressionValue(allByName, "getAllByName(...)");
                    return AbstractC3574i.m0(allByName);
                } catch (NullPointerException e10) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + hostname);
                    unknownHostException.initCause(e10);
                    throw unknownHostException;
                }
            }
        }

        private a() {
        }
    }

    List a(String str);
}
