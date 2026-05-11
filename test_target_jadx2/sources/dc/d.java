package Dc;

import Ec.C0827f;
import Ec.L;
import Ec.o;
import Kc.Z;
import dd.C3032i;
import dd.C3043t;
import hd.e;
import hd.i;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.f;
import kotlin.reflect.g;
import lc.InterfaceC3624c;
import ud.x;
import xc.AbstractC5156i;
import xc.C5142C;

/* loaded from: classes3.dex */
public abstract class d {

    /* synthetic */ class a extends AbstractC5156i implements Function2 {

        /* renamed from: j, reason: collision with root package name */
        public static final a f1495j = new a();

        a() {
            super(2);
        }

        @Override // xc.AbstractC5150c
        public final f E() {
            return C5142C.b(x.class);
        }

        @Override // xc.AbstractC5150c
        public final String G() {
            return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public final Z invoke(x p02, C3032i p12) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            return p02.j(p12);
        }

        @Override // xc.AbstractC5150c, kotlin.reflect.c
        public final String getName() {
            return "loadFunction";
        }
    }

    public static final g a(InterfaceC3624c interfaceC3624c) {
        Intrinsics.checkNotNullParameter(interfaceC3624c, "<this>");
        Metadata metadata = (Metadata) interfaceC3624c.getClass().getAnnotation(Metadata.class);
        if (metadata == null) {
            return null;
        }
        String[] d12 = metadata.d1();
        if (d12.length == 0) {
            d12 = null;
        }
        if (d12 == null) {
            return null;
        }
        Pair j10 = i.j(d12, metadata.d2());
        hd.f fVar = (hd.f) j10.getFirst();
        C3032i c3032i = (C3032i) j10.getSecond();
        e eVar = new e(metadata.mv(), (metadata.xi() & 8) != 0);
        Class<?> cls = interfaceC3624c.getClass();
        C3043t j02 = c3032i.j0();
        Intrinsics.checkNotNullExpressionValue(j02, "getTypeTable(...)");
        return new o(C0827f.f1971d, (Z) L.h(cls, c3032i, fVar, new fd.g(j02), eVar, a.f1495j));
    }
}
