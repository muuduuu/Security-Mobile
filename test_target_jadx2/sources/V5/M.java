package v5;

/* loaded from: classes2.dex */
public enum M {
    TRUE,
    FALSE,
    DEFAULT;

    public static boolean equals(Boolean bool, Boolean bool2) {
        return bool == null ? bool2 == null : bool.equals(bool2);
    }

    public static M fromBoolean(Boolean bool) {
        return bool == null ? DEFAULT : bool.booleanValue() ? TRUE : FALSE;
    }

    public Boolean asBoolean() {
        if (this == DEFAULT) {
            return null;
        }
        return this == TRUE ? Boolean.TRUE : Boolean.FALSE;
    }

    public boolean asPrimitive() {
        return this == TRUE;
    }
}
