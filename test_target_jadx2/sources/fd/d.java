package fd;

import dd.C3038o;
import dd.C3039p;
import java.util.LinkedList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import lc.s;

/* loaded from: classes3.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    private final C3039p f33039a;

    /* renamed from: b, reason: collision with root package name */
    private final C3038o f33040b;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33041a;

        static {
            int[] iArr = new int[C3038o.c.EnumC0460c.values().length];
            try {
                iArr[C3038o.c.EnumC0460c.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C3038o.c.EnumC0460c.PACKAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C3038o.c.EnumC0460c.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f33041a = iArr;
        }
    }

    public d(C3039p strings, C3038o qualifiedNames) {
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(qualifiedNames, "qualifiedNames");
        this.f33039a = strings;
        this.f33040b = qualifiedNames;
    }

    private final s c(int i10) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z10 = false;
        while (i10 != -1) {
            C3038o.c s10 = this.f33040b.s(i10);
            String s11 = this.f33039a.s(s10.w());
            C3038o.c.EnumC0460c u10 = s10.u();
            Intrinsics.d(u10);
            int i11 = a.f33041a[u10.ordinal()];
            if (i11 == 1) {
                linkedList2.addFirst(s11);
            } else if (i11 == 2) {
                linkedList.addFirst(s11);
            } else if (i11 == 3) {
                linkedList2.addFirst(s11);
                z10 = true;
            }
            i10 = s10.v();
        }
        return new s(linkedList, linkedList2, Boolean.valueOf(z10));
    }

    @Override // fd.c
    public String a(int i10) {
        s c10 = c(i10);
        List list = (List) c10.a();
        String l02 = CollectionsKt.l0((List) c10.b(), ".", null, null, 0, null, null, 62, null);
        if (list.isEmpty()) {
            return l02;
        }
        return CollectionsKt.l0(list, "/", null, null, 0, null, null, 62, null) + '/' + l02;
    }

    @Override // fd.c
    public boolean b(int i10) {
        return ((Boolean) c(i10).f()).booleanValue();
    }

    @Override // fd.c
    public String getString(int i10) {
        String s10 = this.f33039a.s(i10);
        Intrinsics.checkNotNullExpressionValue(s10, "getString(...)");
        return s10;
    }
}
