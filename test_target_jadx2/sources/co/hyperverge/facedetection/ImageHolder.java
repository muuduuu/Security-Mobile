package co.hyperverge.facedetection;

/* loaded from: classes.dex */
public class ImageHolder implements FileInterface {
    private String bucketName;
    private String date;

    /* renamed from: id, reason: collision with root package name */
    private String f19502id;
    private String label;
    private String pathOriginal;

    public ImageHolder(String str, String str2, String str3, String str4) {
        this.f19502id = str;
        this.pathOriginal = str2;
        this.bucketName = str3;
        this.date = str4;
        this.label = str;
    }

    @Override // co.hyperverge.facedetection.FileInterface
    public String getLabel() {
        return this.label;
    }

    @Override // co.hyperverge.facedetection.FileInterface
    public String getPathOriginal() {
        return this.pathOriginal;
    }

    public long getTimeStamp() {
        return Long.parseLong(this.date);
    }
}
