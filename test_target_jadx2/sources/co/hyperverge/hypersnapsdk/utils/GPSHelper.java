package co.hyperverge.hypersnapsdk.utils;

/* loaded from: classes.dex */
public class GPSHelper {

    /* renamed from: sb, reason: collision with root package name */
    private static StringBuilder f19802sb = new StringBuilder(20);

    public static final synchronized String convert(double d10) {
        String sb2;
        synchronized (GPSHelper.class) {
            double abs = Math.abs(d10);
            int i10 = (int) abs;
            double d11 = (abs * 60.0d) - (i10 * 60.0d);
            int i11 = (int) d11;
            f19802sb.setLength(0);
            f19802sb.append(i10);
            f19802sb.append("/1,");
            f19802sb.append(i11);
            f19802sb.append("/1,");
            f19802sb.append((int) (((d11 * 60.0d) - (i11 * 60.0d)) * 1000.0d));
            f19802sb.append("/1000");
            sb2 = f19802sb.toString();
        }
        return sb2;
    }

    public static String latitudeRef(double d10) {
        return d10 < 0.0d ? "S" : "N";
    }

    public static String longitudeRef(double d10) {
        return d10 < 0.0d ? "W" : "E";
    }
}
