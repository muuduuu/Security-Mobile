package dd;

import kotlin.reflect.jvm.internal.impl.protobuf.j;

/* loaded from: classes3.dex */
public enum x implements j.a {
    INTERNAL(0, 0),
    PRIVATE(1, 1),
    PROTECTED(2, 2),
    PUBLIC(3, 3),
    PRIVATE_TO_THIS(4, 4),
    LOCAL(5, 5);

    private static j.b internalValueMap = new j.b() { // from class: dd.x.a
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.j.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public x a(int i10) {
            return x.valueOf(i10);
        }
    };
    private final int value;

    x(int i10, int i11) {
        this.value = i11;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.j.a
    public final int getNumber() {
        return this.value;
    }

    public static x valueOf(int i10) {
        if (i10 == 0) {
            return INTERNAL;
        }
        if (i10 == 1) {
            return PRIVATE;
        }
        if (i10 == 2) {
            return PROTECTED;
        }
        if (i10 == 3) {
            return PUBLIC;
        }
        if (i10 == 4) {
            return PRIVATE_TO_THIS;
        }
        if (i10 != 5) {
            return null;
        }
        return LOCAL;
    }
}
