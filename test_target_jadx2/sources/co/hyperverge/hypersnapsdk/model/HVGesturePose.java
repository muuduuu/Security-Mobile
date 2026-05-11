package co.hyperverge.hypersnapsdk.model;

/* loaded from: classes.dex */
public class HVGesturePose {
    FacePose facePose;

    public enum FacePose {
        LEFT_GESTURE,
        RIGHT_GESTURE,
        STRAIGHT_GESTURE
    }

    public enum GestureState {
        NEW_GESTURE,
        AUTHENTICATED_STATE,
        VALIDATE_POSE,
        POSE_MATCHES,
        POSE_DOES_NOT_MATCH,
        CAPTURE_IN_PROGRESS,
        VERIFY_FACE_POSE,
        TIME_UP
    }

    public HVGesturePose(FacePose facePose) {
        this.facePose = facePose;
    }

    public boolean equals(Object obj) {
        return this.facePose == ((HVGesturePose) obj).getFacePose();
    }

    public FacePose getFacePose() {
        return this.facePose;
    }

    public void setFacePose(FacePose facePose) {
        this.facePose = facePose;
    }

    public String toString() {
        return "HVGesturePose(facePose=" + getFacePose() + ")";
    }
}
