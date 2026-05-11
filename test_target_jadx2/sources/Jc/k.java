package Jc;

import Kc.G;
import Kc.J;
import Rc.c;
import bd.r;
import java.io.InputStream;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qd.InterfaceC3959a;
import ud.AbstractC4883a;
import ud.C4886d;
import ud.o;
import ud.s;
import ud.u;
import ud.w;
import vd.C5013a;
import xd.n;

/* loaded from: classes3.dex */
public final class k extends AbstractC4883a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f4959f = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(n storageManager, r finder, G moduleDescriptor, J notFoundClasses, Lc.a additionalClassPartsProvider, Lc.c platformDependentDeclarationFilter, ud.l deserializationConfiguration, kotlin.reflect.jvm.internal.impl.types.checker.l kotlinTypeChecker, InterfaceC3959a samConversionResolver) {
        super(storageManager, finder, moduleDescriptor);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        Intrinsics.checkNotNullParameter(additionalClassPartsProvider, "additionalClassPartsProvider");
        Intrinsics.checkNotNullParameter(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        Intrinsics.checkNotNullParameter(deserializationConfiguration, "deserializationConfiguration");
        Intrinsics.checkNotNullParameter(kotlinTypeChecker, "kotlinTypeChecker");
        Intrinsics.checkNotNullParameter(samConversionResolver, "samConversionResolver");
        ud.n nVar = new ud.n(this);
        C5013a c5013a = C5013a.f44220r;
        C4886d c4886d = new C4886d(moduleDescriptor, notFoundClasses, c5013a);
        w.a aVar = w.a.f43731a;
        ud.r DO_NOTHING = ud.r.f43722a;
        Intrinsics.checkNotNullExpressionValue(DO_NOTHING, "DO_NOTHING");
        i(new ud.k(storageManager, moduleDescriptor, deserializationConfiguration, nVar, c4886d, this, aVar, DO_NOTHING, c.a.f8658a, s.a.f43723a, CollectionsKt.m(new Ic.a(storageManager, moduleDescriptor), new e(storageManager, moduleDescriptor, null, 4, null)), notFoundClasses, ud.j.f43677a.a(), additionalClassPartsProvider, platformDependentDeclarationFilter, c5013a.e(), kotlinTypeChecker, samConversionResolver, null, u.f43730a, 262144, null));
    }

    @Override // ud.AbstractC4883a
    protected o d(id.c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        InputStream b10 = f().b(fqName);
        if (b10 != null) {
            return vd.c.f44222o.a(fqName, h(), g(), b10, false);
        }
        return null;
    }
}
