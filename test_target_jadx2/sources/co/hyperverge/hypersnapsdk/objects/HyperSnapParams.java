package co.hyperverge.hypersnapsdk.objects;

/* loaded from: classes.dex */
public class HyperSnapParams {

    public enum FaceMatchMode {
        FACE_ID,
        FACE_FACE,
        FACE_IDFACESTRING,
        FACE_ID_FACE_STRING
    }

    @Deprecated
    public enum Product {
        FACEID,
        IAM
    }

    public enum Region {
        AsiaPacific,
        UnitedStates,
        India,
        INDIA,
        ASIA_PACIFIC,
        UNITED_STATES,
        AFRICA
    }

    private HyperSnapParams() {
    }
}
