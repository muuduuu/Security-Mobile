package dd;

import kotlin.reflect.jvm.internal.impl.protobuf.j;

/* renamed from: dd.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC3034k implements j.a {
    FINAL(0, 0),
    OPEN(1, 1),
    ABSTRACT(2, 2),
    SEALED(3, 3);

    private static j.b internalValueMap = new j.b() { // from class: dd.k.a
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.j.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC3034k a(int i10) {
            return EnumC3034k.valueOf(i10);
        }
    };
    private final int value;

    EnumC3034k(int i10, int i11) {
        this.value = i11;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.j.a
    public final int getNumber() {
        return this.value;
    }

    public static EnumC3034k valueOf(int i10) {
        if (i10 == 0) {
            return FINAL;
        }
        if (i10 == 1) {
            return OPEN;
        }
        if (i10 == 2) {
            return ABSTRACT;
        }
        if (i10 != 3) {
            return null;
        }
        return SEALED;
    }
}
