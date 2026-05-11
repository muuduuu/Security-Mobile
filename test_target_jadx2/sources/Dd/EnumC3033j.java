package dd;

import kotlin.reflect.jvm.internal.impl.protobuf.j;

/* renamed from: dd.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC3033j implements j.a {
    DECLARATION(0, 0),
    FAKE_OVERRIDE(1, 1),
    DELEGATION(2, 2),
    SYNTHESIZED(3, 3);

    private static j.b internalValueMap = new j.b() { // from class: dd.j.a
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.j.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public EnumC3033j a(int i10) {
            return EnumC3033j.valueOf(i10);
        }
    };
    private final int value;

    EnumC3033j(int i10, int i11) {
        this.value = i11;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.j.a
    public final int getNumber() {
        return this.value;
    }

    public static EnumC3033j valueOf(int i10) {
        if (i10 == 0) {
            return DECLARATION;
        }
        if (i10 == 1) {
            return FAKE_OVERRIDE;
        }
        if (i10 == 2) {
            return DELEGATION;
        }
        if (i10 != 3) {
            return null;
        }
        return SYNTHESIZED;
    }
}
